package ast.statements;

import ast.expressions.Expression;

public class Read extends AbstractStatement{
    private Expression exp;

    public Read(int line, int column, Expression exp) {
        super(line, column);
        this.exp = exp;
    }

    public Expression getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return "input " + exp;
    }
}
