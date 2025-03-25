package ast.expressions;

import ast.AbstractLocatable;
import ast.types.Type;

public abstract class AbstractExpression extends AbstractLocatable implements Expression{
    private boolean lValue;
    private Type type;

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

    @Override
    public void setType(Type t) {
        this.type = t;
    }

    @Override
    public Type getType() {
        return type;
    }
}
