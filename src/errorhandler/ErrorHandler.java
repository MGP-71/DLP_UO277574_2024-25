package errorhandler;
import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.*;

public class ErrorHandler {

    private static ErrorHandler INSTANCE;
    private List<ErrorType> errors;

    private ErrorHandler() {
        errors = new ArrayList<ErrorType>();
    }

    public static ErrorHandler getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ErrorHandler();
        return INSTANCE;
    }

    public boolean anyError() {
        return !errors.isEmpty();
    }

    public void showErrors(PrintStream err) {
        for (ErrorType e: errors)
            err.println(e.toString());
    }

    public void addError(ErrorType e) {
        errors.add(e);
    }
}
