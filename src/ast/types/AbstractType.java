package ast.types;

import ast.AbstractASTNode;
import ast.Locatable;
import codegenerator.CodeGenerator;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type {
    @Override
    public Type arithmetic(Type type, Locatable l) {
        if (type instanceof ErrorType)
            return type;
        return new ErrorType(l,"The two types for the arithmetic operation " +
                this + " and " + type.toString() + " are not compatible");
    }

    @Override
    public Type arithmetic(Locatable l) {
        return new ErrorType(l,"The type for the arithmetic operation " +
                this + "is not compatible");
    }

    @Override
    public Type comparison(Type type, Locatable l) {
        if (type instanceof ErrorType)
            return type;
        return new ErrorType(l, "The two types for the comparison operation " +
                this + " and " + type.toString() + " are not compatible");
    }

    @Override
    public Type logic(Type t, Locatable l) {
        if (t instanceof ErrorType)
            return t;
        return new ErrorType(l, "The two types for the logical operation " +
                this + " and " + t.toString() + " are not compatible");
    }

    @Override
    public Type logic(Locatable l) {
        return new ErrorType(l, "The type for the logical operation " +
                this + " is not compatible");
    }

    @Override
    public void mustPromotesTo(Type t, Locatable l) {
        if (t instanceof ErrorType)
            return;
        new ErrorType(l, "The types for the type " + this + " cannot be promoted to " +
                t.toString());
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        new ErrorType(l, "The type " + this + " is not built-in");
    }

    @Override
    public void mustBeLogical(Locatable l) {
        new ErrorType(l, "The type " + this + " is not logical");
    }

    @Override
    public Type canBeCastTo(Type t, Locatable l) {
        if (t instanceof ErrorType)
            return t;
        return new ErrorType(l, "The type " + this + " cannot be casted to " + t.toString());
    }

    @Override
    public Type squareBrackets(Type t, Locatable l) {
        if (t instanceof ErrorType)
            return t;
        return new ErrorType(l, "The type " + this + " cannot be applied brackets");
    }

    @Override
    public Type dot(String name, Locatable l) {
        return new ErrorType(l, "The type " + this + " cannot be applied a dot");
    }

    @Override
    public Type parenthesis(List<Type> list, Locatable l) {
        return new ErrorType(l, "The type " + this + " cannot be applied a parenthesis");
    }

    @Override
    public int numberOfBytes() {
        throw new IllegalStateException();
    }

    @Override
    public char suffix() {
        throw new IllegalStateException();
    }

    @Override
    public void convertTo(CodeGenerator cg, Type type){
        throw new IllegalStateException();
    }
}
