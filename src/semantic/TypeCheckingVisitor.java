package semantic;

import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Boolean> {

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
    public Boolean visit(Assignment e, Type param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        if (!e.getExp1().getLvalue())
            new ErrorType(e, "'" + e.getExp1() + "'" + " is not l-value");
        return null;
    }

    @Override
    public Boolean visit(Read e, Type param) {
        e.getExp().accept(this, param);
        if (!e.getExp().getLvalue())
            new ErrorType(e, "'" + e.getExp() + "'" + " is not l-value");
        return null;
    }
}
