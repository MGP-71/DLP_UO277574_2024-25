package codegenerator;

import ast.expressions.*;
import ast.program.Field;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statements.*;
import ast.types.*;
import visitor.Visitor;

public class AbstractCGVisitor <TP, TR> implements Visitor<TP, TR> {

    CodeGenerator cg;

    public AbstractCGVisitor(CodeGenerator cg){
        this.cg = cg;
    }

    public CodeGenerator getCodeGenerator(){
        return cg;
    }
    @Override
    public TR visit(Arithmetic e, TP param) {
        return null;
    }

    @Override
    public TR visit(ArrayAccess e, TP param) {
        return null;
    }

    @Override
    public TR visit(Cast e, TP param) {
        return null;
    }

    @Override
    public TR visit(CharacterLiteral e, TP param) {
        return null;
    }

    @Override
    public TR visit(Comparison e, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleLiteral e, TP param) {
        return null;
    }

    @Override
    public TR visit(FieldAccess e, TP param) {
        return null;
    }

    @Override
    public TR visit(IntegerLiteral e, TP param) {
        return null;
    }

    @Override
    public TR visit(Logical e, TP param) {
        return null;
    }

    @Override
    public TR visit(UnaryMinus e, TP param) {
        return null;
    }

    @Override
    public TR visit(UnaryNot e, TP param) {
        return null;
    }

    @Override
    public TR visit(Variable e, TP param) {
        return null;
    }

    @Override
    public TR visit(Field e, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionDefinition e, TP param) {
        return null;
    }

    @Override
    public TR visit(Program e, TP param) {
        return null;
    }

    @Override
    public TR visit(VariableDefinition e, TP param) {
        return null;
    }

    @Override
    public TR visit(Assignment e, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionInvocation e, TP param) {
        return null;
    }

    @Override
    public TR visit(IfElse e, TP param) {
        return null;
    }

    @Override
    public TR visit(Read e, TP param) {
        return null;
    }

    @Override
    public TR visit(Return e, TP param) {
        return null;
    }

    @Override
    public TR visit(While e, TP param) {
        return null;
    }

    @Override
    public TR visit(Write e, TP param) {
        return null;
    }

    @Override
    public TR visit(ArrayType e, TP param) {
        return null;
    }

    @Override
    public TR visit(CharacterType e, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleType e, TP param) {
        return null;
    }

    @Override
    public TR visit(ErrorType e, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionType e, TP param) {
        return null;
    }

    @Override
    public TR visit(IntegerType e, TP param) {
        return null;
    }

    @Override
    public TR visit(StructType e, TP param) {
        return null;
    }

    @Override
    public TR visit(VoidType e, TP param) {
        return null;
    }
}
