package visitor;

import ast.expressions.*;
import ast.program.Field;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statements.*;
import ast.types.*;

public interface Visitor<TP, TR> {
    public TR visit(Arithmetic e, TP param);
    public TR visit(ArrayAccess e, TP param);
    public TR visit(Cast e, TP param);
    public TR visit(CharacterLiteral e, TP param);
    public TR visit(Comparison e, TP param);
    public TR visit(DoubleLiteral e, TP param);
    public TR visit(FieldAccess e, TP param);
    public TR visit(IntegerLiteral e, TP param);
    public TR visit(Logical e, TP param);
    public TR visit(UnaryMinus e, TP param);
    public TR visit(UnaryNot e, TP param);
    public TR visit(Variable e, TP param);
    public TR visit(Field e, TP param);
    public TR visit(FunctionDefinition e, TP param);
    public TR visit(Program e, TP param);
    public TR visit(VariableDefinition e, TP param);
    public TR visit(Assignment e, TP param);
    public TR visit(FunctionInvocation e, TP param);
    public TR visit(IfElse e, TP param);
    public TR visit(Read e, TP param);
    public TR visit(Return e, TP param);
    public TR visit(While e, TP param);
    public TR visit(Write e, TP param);
    public TR visit(ArrayType e, TP param);
    public TR visit(CharacterType e, TP param);
    public TR visit(DoubleType e, TP param);
    public TR visit(ErrorType e, TP param);
    public TR visit(FunctionType e, TP param);
    public TR visit(IntegerType e, TP param);
    public TR visit(StructType e, TP param);
    public TR visit(VoidType e, TP param);
}
