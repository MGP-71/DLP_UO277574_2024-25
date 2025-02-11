package ast.program;

import ast.statements.Statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition{
    private List<Statement> stList;

    public FunctionDefinition(int line, int column, List<Statement> stList) {
        super(line, column);
        this.stList = new ArrayList<Statement>(stList);
    }

    public List<Statement> getStList() {
        return new ArrayList<Statement>(stList);
    }
}
