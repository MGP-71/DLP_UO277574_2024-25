package codegenerator;

import ast.program.Definition;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statements.*;
import ast.types.FunctionType;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {
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
        <enter > type.sumBytes
        for(Statement smt : smt*)
            execute[[smt]]
        <ret 0, funcDef.sumBytes, param.type.numOfBytes)
     */
    @Override
    public Void visit(FunctionDefinition e, Void param) {
        return super.visit(e, param);
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
    public Void visit(Program e, Void param) {
        cg.addComment("Global variables:");

        for(Definition def : e.getDefList())
            if(def instanceof VariableDefinition)
                def.accept(this, null);
        cg.write("\n' Invocation to the main function");
        cg.write("call main");
        cg.write("halt");

        for(Definition def : e.getDefList())
            if(def instanceof FunctionDefinition)
                def.accept(this, param);

        return null;
    }

    /*
    execute[[VariableDefinition: definition ⟶ type ID]] =
        <'* > type ID <(offset > definition.offset <)>
     */
    @Override
    public Void visit(VariableDefinition e, Void param) {
        cg.addComment(e.getType() + " " + e.getName() + " (offset " + e.getOffset() + ")");

        return null;
    }

    /*
    execute[[Assignment: statement ⟶ exp1 exp2]] =
        address[[exp1]]
        value[[exp2]]
        store exp1.suffix
     */
    @Override
    public Void visit(Assignment e, Void param) {
        e.getExp1().accept(addressVisitor, null);
        e.getExp2().accept(valueVisitor, null);
        cg.store(e.getExp1().getType().suffix());
        return null;
    }

    @Override
    public Void visit(FunctionInvocation e, Void param) {
        return super.visit(e, param);
    }

    @Override
    public Void visit(IfElse e, Void param) {
        return super.visit(e, param);
    }

    /*
    execute[[Read: statement ⟶ expression]]
        address[[expression]
        <in> expression.suffix
        <store> expression.suffix
     */
    @Override
    public Void visit(Read e, Void param) {
        cg.line(e.getLine());
        cg.addComment("Read");
        e.getExp().accept(addressVisitor, null);
        cg.in(e.getExp().getType().suffix());
        cg.store(e.getExp().getType().suffix());

        return null;
    }

    @Override
    public Void visit(Return e, Void param) {
        return super.visit(e, param);
    }

    @Override
    public Void visit(While e, Void param) {
        return super.visit(e, param);
    }

    /*
    execute[[Write: statement ⟶ expression]]
        value[[expression]
        <out> expression.suffix
     */
    @Override
    public Void visit(Write e, Void param) {
        cg.line(e.getLine());
        cg.addComment("Write");
        e.getExp().accept(valueVisitor, null);
        cg.out(e.getExp().getType().suffix());
    }

    /*
    execute [[FunctionType : FunctionType -> type ID varDefinition+]] =
        <' * Parameters>
        for(VarDefinition var : varDefinition*)
            execute[[var]]
     */
    @Override
    public Void visit(FunctionType e, Void param) {
        cg.addComment("Parameters");
        for(VariableDefinition var : e.getVariableDefinitions())
            var.accept(this, null);

        return null;
    }
}
