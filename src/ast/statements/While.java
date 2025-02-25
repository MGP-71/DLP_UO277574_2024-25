package ast.statements;

import ast.expressions.Expression;

import java.util.ArrayList;
import java.util.List;

public class While extends AbstractStatement{
    private List<Statement> stList;
    private Expression exp;

    public While(int line, int column, Expression exp, List<Statement> stList) {
        super(line, column);
        this.exp = exp;
        this.stList = new ArrayList<Statement>(stList);
    }

    public List<Statement> getStList() {
        return new ArrayList<Statement>(stList);
    }

    public Expression getExp() {
        return exp;
    }
}
