package ast.statements;

import java.util.ArrayList;
import java.util.List;

public class While extends AbstractStatement{
    private List<Statement> stList;

    public While(int line, int column, List<Statement> stList) {
        super(line, column);
        this.stList = new ArrayList<Statement>(stList);
    }

    public List<Statement> getStList() {
        return new ArrayList<Statement>(stList);
    }
}
