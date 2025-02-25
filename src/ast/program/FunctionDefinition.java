package ast.program;

import ast.statements.Statement;
import ast.types.Type;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition{
    private List<Statement> stList;

    public FunctionDefinition(int line, int column, String name, Type type, List<Statement> stList) {
        super(line, column, name, type);
        this.stList = new ArrayList<Statement>(stList);
    }

    public List<Statement> getStList() {
        return new ArrayList<Statement>(stList);
    }
}
