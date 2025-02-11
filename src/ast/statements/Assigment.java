package ast.statements;

import ast.expressions.Expression;

public class Assigment extends AbstractStatement{
    private Expression exp1;
    private Expression exp2;

    public Assigment(int line, int column, Expression exp1, Expression exp2) {
        super(line, column);
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public Expression getExp1() {
        return exp1;
    }

    public Expression getExp2() {
        return exp2;
    }
}
