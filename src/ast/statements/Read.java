package ast.statements;

import ast.expressions.Expression;

public class Read extends AbstractStatement{
    Expression exp;

    public Read(int line, int column, Expression exp) {
        super(line, column);
        this.exp = exp;
    }
}
