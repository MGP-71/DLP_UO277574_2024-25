package ast.statements;

import ast.expressions.Expression;

public class Assigment extends AbstractStatement{
    Expression exp1;
    Expression exp2;

    public Assigment(int line, int column, Expression exp1, Expression exp2) {
        super(line, column);
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
