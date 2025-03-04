package ast.types;

import ast.Locatable;
import errorhandler.ErrorHandler;

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
}
