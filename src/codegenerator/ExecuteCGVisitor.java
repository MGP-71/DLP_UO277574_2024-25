package codegenerator;

import ast.expressions.Expression;
import ast.program.Definition;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statements.*;
import ast.types.FunctionType;
import ast.types.VoidType;

public class ExecuteCGVisitor extends AbstractCGVisitor<FunctionDefinition, Void> {
    private ValueCGVisitor valueVisitor;
    private AddressCGVisitor addressVisitor;

    public ExecuteCGVisitor(CodeGenerator cg) {
        super(cg);
        this.valueVisitor = new ValueCGVisitor(cg);
        this.addressVisitor = new AddressCGVisitor(cg);
        this.valueVisitor.setAddressVisitor(this.addressVisitor);
        this.addressVisitor.setValueVisitor(this.valueVisitor);
    }

    /*
    execute[[FunctionDefinition: definition -> type ID varDefinition*]] =
        <ID: >
        execute[[funcType]]
        <Local variables>
        for(VarDefinition var : varDefinition*)
            execute[[var]]
        <enter > type.localVarSize
        for(Statement smt : smt*)
            execute[[smt]]
        <ret funcDef.returnTypeSize, funcDef.localVarsSize, funcDef.paramsSize)
     */
    @Override
    public Void visit(FunctionDefinition e, FunctionDefinition param) {
        cg.line(e.getLine());
        cg.write("\n " + e.getName() + ": ");
        e.getType().accept(this, param);
        cg.addComment("Local variables");

        for (Statement st: e.getStList())
            if (st instanceof VariableDefinition)
                st.accept(this, param);

        cg.enter(e.getLocalsSize());

        for(Statement st : e.getStList())
            if (!(st instanceof VariableDefinition))
                st.accept(this, e);

        int bytesReturn = ((FunctionType) e.getType()).getReturnType().numberOfBytes();

        if (bytesReturn == 0)
            cg.ret(bytesReturn, e.getLocalsSize(), ((FunctionType) e.getType()).getParamsSize());

        return null;
    }

    /*
    execute[[Program: definition*]] =
    <' Invocation to the main function>
    for(Definition def : definition*)
        if(def instanceof VarDefinition)
            execute[[def]]
    <call main>
    <halt>
    for(Definition def : definition*)
        if(def instanceof FunctionDefinition)
            execute[[def]]
     */
    @Override
    public Void visit(Program e, FunctionDefinition param) {
        cg.addComment("Global variables:");

        for(Definition def : e.getDefList())
            if(def instanceof VariableDefinition)
                def.accept(this, param);
        cg.write("\n' Invocation to the main function");
        cg.write("call main");
        cg.write("halt");

        for(Definition def : e.getDefList())
            if(def instanceof FunctionDefinition)
                def.accept(this, param);

        return null;
    }

    /*
    execute[[VariableDefinition: definition -> type ID]] =
        <'* > type ID <(offset > definition.offset <)>
     */
    @Override
    public Void visit(VariableDefinition e, FunctionDefinition param) {
        cg.addComment(e.getType() + " " + e.getName() + " (offset " + e.getOffset() + ")");

        return null;
    }

    /*
    execute[[Assignment: statement -> exp1 exp2]] =
        address[[exp1]]
        value[[exp2]]
        store exp1.suffix
     */
    @Override
    public Void visit(Assignment e, FunctionDefinition param) {
        cg.line(e.getLine());
        cg.addComment("Assignment");
        e.getExp1().accept(addressVisitor, null);
        e.getExp2().accept(valueVisitor, null);
        cg.store(e.getExp1().getType().suffix());
        
        return null;
    }

    /*
    execute[[FunctionInvocation: statement -> exp1 exp2*]] =
	    exp2*.forEach(e -> value[[e]])
		<call > exp1.name
		if (!(exp1.type.returnType instanceOf VoidType))
		    <pop> exp1.type.returnType.suffix()
     */
    @Override
    public Void visit(FunctionInvocation e, FunctionDefinition param) {
        cg.line(e.getLine());
        for(Expression exp: e.getListExp())
            exp.accept(valueVisitor, null);
        cg.call(e.getVariableName().getName());

        if (!(((FunctionType)e.getVariableName().getType()).getReturnType() instanceof VoidType))
            cg.pop(((FunctionType)e.getVariableName().getType()).getReturnType());

        return null;
    }

    /*
    execute[[IfElse: statement1 -> expression statement2* statement3*]] =
        value[[expression]]
        String else = codeGenerator.nextLabel();
        String end = codeGenerator.nextLabel();
        <jz > else
        statement2*.forEach(stmt -> execute[[stmt]])
        <jmp > end
        else <:>
        statement3*.forEach(stmt -> execute[[stmt]])
        end <:>
     */
    @Override
    public Void visit(IfElse e, FunctionDefinition param) {
        cg.addComment("If");
        cg.line(e.getLine());
        e.getExpression().accept(valueVisitor, null);

        String elseBody = cg.nextLabel();
        String end = cg.nextLabel();

        cg.jz(elseBody);

        cg.addComment("If body");
        for(Statement statement : e.getIfSt())
            statement.accept(this, param);

        cg.jmp(end);

        cg.write(" " + elseBody + ":");
        cg.addComment("else body");
        for(Statement statement : e.getElseIf())
            statement.accept(this, param);

        cg.write(" " + end + ":");

        return null;
    }

    /*
    execute[[Read: statement -> expression]]
        address[[expression]
        <in> expression.suffix
        <store> expression.suffix
     */
    @Override
    public Void visit(Read e, FunctionDefinition param) {
        cg.line(e.getLine());
        cg.addComment("Read");
        e.getExp().accept(addressVisitor, null);
        cg.in(e.getExp().getType().suffix());
        cg.store(e.getExp().getType().suffix());

        return null;
    }

    /*
    execute[[Return: statement -> exp]] =
        value[[exp]]
        <ret > bytesReturn, bytesLocals, bytesArgs
     */
    @Override
    public Void visit(Return e, FunctionDefinition param) {
        cg.line(e.getLine());
        cg.addComment("Return");
        e.getExp().accept(valueVisitor, null);
        int bytesReturn = ((FunctionType) param.getType()).getReturnType().numberOfBytes();
        int bytesLocals = param.getLocalsSize();
        int bytesArgs = ((FunctionType) param.getType()).getParamsSize();
        cg.ret(bytesReturn, bytesLocals, bytesArgs);

        return null;
    }

    /*
    execute[[WhileStmt: statement -> expression statement*]] =
        String condition = cg.nextLabel();
        String end = cg.nextLabel();
        condition<:>
        value[[expression]]
        <jz > end
        statement*.forEach(stmt -> execute[[stmt]])
        <jmp > condition
        end<:>
     */
    @Override
    public Void visit(While e, FunctionDefinition param) {
        cg.addComment("While");
        cg.line(e.getLine());

        String condition = cg.nextLabel();
        String end = cg.nextLabel();

        cg.write(" " + condition + ":");
        e.getExp().accept(valueVisitor, null);
        cg.jz(end);

        cg.addComment("While body");
        for(Statement statement : e.getStList())
            statement.accept(this, param);

        cg.jmp(condition);

        cg.write(" " + end + ":");

        return null;
    }

    /*
    execute[[Write: statement -> expression]]
        value[[expression]
        <out> expression.suffix
     */
    @Override
    public Void visit(Write e, FunctionDefinition param) {
        cg.line(e.getLine());
        cg.addComment("Write");
        e.getExp().accept(valueVisitor, null);
        cg.out(e.getExp().getType().suffix());

        return null;
    }

    /*
    execute [[FunctionType : FunctionType -> type ID varDefinition+]] =
        <' * Parameters>
        for(VarDefinition var : varDefinition*)
            execute[[var]]
     */
    @Override
    public Void visit(FunctionType e, FunctionDefinition param) {
        cg.addComment("Parameters");
        for(VariableDefinition var : e.getVariableDefinitions())
            var.accept(this, param);

        return null;
    }
}
