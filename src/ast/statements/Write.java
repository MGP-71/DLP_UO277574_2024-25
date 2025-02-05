package ast.statements;

import ast.expressions.Expression;

public class Write extends AbstractStatement{
    Expression exp;

    public Write(int line, int column, Expression exp) {
        super(line, column);
        this.exp = exp;
    }
}
