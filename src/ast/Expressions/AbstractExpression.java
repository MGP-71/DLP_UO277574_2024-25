package ast.Expressions;

import ast.AbstractLocatable;

public abstract class AbstractExpression extends AbstractLocatable implements Expression{

    public AbstractExpression(int line, int column) {
        super(line, column);
    }
}
