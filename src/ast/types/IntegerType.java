package ast.types;

import ast.Locatable;
import codegenerator.CodeGenerator;
import visitor.Visitor;

public class IntegerType extends AbstractType{
    public IntegerType() {
    }

    @Override
    public String toString() {
        return "int";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }

    @Override
    public Type arithmetic(Type type, Locatable l) {
        if (type instanceof IntegerType || type instanceof ErrorType)
            return new IntegerType();
        return new ErrorType(l, "Cannot do arithmetic operation with types double and " + type);
    }

    @Override
    public Type arithmetic(Locatable l) {
        return new IntegerType();
    }

    @Override
    public Type comparison(Type type, Locatable l) {
        if (type instanceof IntegerType || type instanceof ErrorType)
            return this;
        return new ErrorType(l, "Cannot do comparison operation with types character and " + type);
    }

    @Override
    public Type logic(Type t, Locatable l) {
        if (t instanceof IntegerType || t instanceof ErrorType) {
            return this;
        }
        return new ErrorType(l, "Cannot do logical operation with types character and " + t);
    }

    @Override
    public Type logic(Locatable l) {
        return this;
    }

    @Override
    public void mustPromotesTo(Type t, Locatable l) {
        if (t instanceof IntegerType || t instanceof ErrorType)
            return;
        new ErrorType(l, "Cannot promote to with types integer and " + t);
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        return;
    }

    @Override
    public void mustBeLogical(Locatable l) {
        return;
    }

    @Override
    public Type canBeCastTo(Type t, Locatable l) {
        return this;
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public char suffix() {
        return 'i';
    }

}
