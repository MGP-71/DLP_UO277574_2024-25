package semantic;

import ast.expressions.*;
import ast.program.*;
import ast.statements.*;
import ast.types.*;
import visitor.Visitor;

public class TypeCheckingVisitor implements Visitor<Type, Boolean> {

    @Override
    public Boolean visit(Arithmetic e, Type param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(ArrayAccess e, Type param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        e.setLValue(true);
        return null;
    }

    @Override
    public Boolean visit(Cast e, Type param) {
        e.getExp().accept(this, param);
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(CharacterLiteral e, Type param) {
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(Comparison e, Type param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(DoubleLiteral e, Type param) {
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(FieldAccess e, Type param) {
        e.getExp().accept(this, param);
        e.setLValue(true);
        return null;
    }

    @Override
    public Boolean visit(IntegerLiteral e, Type param) {
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(Logical e, Type param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(UnaryMinus e, Type param) {
        e.getExp().accept(this, param);
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(UnaryNot e, Type param) {
        e.getExp().accept(this, param);
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(Variable e, Type param) {
        e.setLValue(true);
        return null;
    }

    @Override
    public Boolean visit(Field e, Type param) {
        return null;
    }

    @Override
    public Boolean visit(FunctionDefinition e, Type param) {
        return null;
    }

    @Override
    public Boolean visit(Program e, Type param) {
        return null;
    }

    @Override
    public Boolean visit(VariableDefinition e, Type param) {
        return null;
    }

    @Override
    public Boolean visit(Assignment e, Type param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        if (!e.getExp1().getLvalue())
            new ErrorType(e, "'" + e.getExp1() + "'" + " is not l-value");
        return null;
    }

    @Override
    public Boolean visit(FunctionInvocation e, Type param) {
        for(Expression exp: e.getListExp()) {
            exp.accept(this, param);
        }
        return null;
    }

    @Override
    public Boolean visit(IfElse e, Type param) {
        e.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Boolean visit(Read e, Type param) {
        e.getExp().accept(this, param);
        if (!e.getExp().getLvalue())
            new ErrorType(e, "'" + e.getExp() + "'" + " is not l-value");
        return null;
    }

    @Override
    public Boolean visit(Return e, Type param) {
        e.getExp().accept(this, param);
        return null;
    }

    @Override
    public Boolean visit(While e, Type param) {
        return null;
    }

    @Override
    public Boolean visit(Write e, Type param) {
        e.getExp().accept(this, param);
        return null;
    }

    @Override
    public Boolean visit(ArrayType e, Type param) {
        return null;
    }

    @Override
    public Boolean visit(CharacterType e, Type param) {
        return null;
    }

    @Override
    public Boolean visit(DoubleType e, Type param) {
        return null;
    }

    @Override
    public Boolean visit(ErrorType e, Type param) {
        return null;
    }

    @Override
    public Boolean visit(FunctionType e, Type param) {
        return null;
    }

    @Override
    public Boolean visit(IntegerType e, Type param) {
        return null;
    }

    @Override
    public Boolean visit(StructType e, Type param) {
        return null;
    }

    @Override
    public Boolean visit(VoidType e, Type param) {
        return null;
    }
}
