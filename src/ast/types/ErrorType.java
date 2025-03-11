package ast.types;

import ast.Locatable;
import errorhandler.ErrorHandler;
import visitor.Visitor;

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
}
