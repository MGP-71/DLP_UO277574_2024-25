package ast.types;

import ast.Locatable;
import visitor.Visitor;

public class DoubleType extends AbstractType{

    public DoubleType() {
    }

    @Override
    public String toString() {
        return "double";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }

    @Override
    public Type arithmetic(Type type, Locatable l) {
        if (type instanceof DoubleType)
            return new DoubleType();
        return new ErrorType(l, "Cannot do arithmetic operation with types double and " + type);
    }

    @Override
    public Type arithmetic(Locatable l) {
        return new DoubleType();
    }
    @Override
    public Type comparison(Type type, Locatable l) {
        if (type instanceof DoubleType)
            return this;
        return new ErrorType(l, "Cannot do comparison operation with types character and " + type);
    }

    @Override
    public void mustPromotesTo(Type t, Locatable l) {
        if (t instanceof DoubleType)
            return;
        new ErrorType(l, "Cannot promote to with types double and " + t);
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        return;
    }

    @Override
    public void mustBeBuiltInOrVoid(Locatable l) {
        return;
    }

    @Override
    public Type canBeCastTo(Type t, Locatable l) {
        return this;
    }
}
