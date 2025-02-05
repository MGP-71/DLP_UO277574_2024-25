package ast.statements;

import ast.expressions.Expression;

public class Return extends AbstractStatement{
    Expression exp;

    public Return(int line, int column, Expression exp) {
        super(line, column);
        this.exp = exp;
    }
}
