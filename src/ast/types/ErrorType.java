package ast.types;

import ast.Locatable;
import errorhandler.ErrorHandler;
import visitor.Visitor;

import java.util.List;

public class ErrorType extends AbstractType {

    private Locatable node;
    private String message;

    public ErrorType(Locatable node, String message) {
        this.node = node;
        this.message = message;
        ErrorHandler.getInstance().addError(this);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ERROR--> Line:" + node.getLine() + " Column:" + node.getColumn() + " Message: " + "\"" + message + "\"";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }

    @Override
    public Type arithmetic(Type type, Locatable l) {
        return this;
    }

    @Override
    public Type arithmetic(Locatable l) {
        return this;
    }

    @Override
    public Type comparison(Type type, Locatable l) {
        return this;
    }

    @Override
    public Type logic(Type t, Locatable l) {
        return this;
    }

    @Override
    public Type logic(Locatable l) {
        return this;
    }

    @Override
    public void mustPromotesTo(Type t, Locatable l) {
        return;
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
    public Type squareBrackets(Type t, Locatable l) {
        return this;
    }

    @Override
    public Type dot(String name, Locatable l) {
        return this;
    }

    @Override
    public Type parenthesis(List<Type> list, Locatable l) {
        return this;
    }
}
