package ast.expressions;

import ast.AbstractLocatable;

public abstract class AbstractExpression extends AbstractLocatable implements Expression{
    private boolean lValue;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean getLvalue() {
        return lValue;
    }

    @Override
    public void setLValue(boolean b) {
        lValue = b;
    }
}
