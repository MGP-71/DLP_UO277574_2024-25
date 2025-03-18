package ast.program;

import ast.AbstractLocatable;
import ast.types.Type;

public abstract class AbstractDefinition extends AbstractLocatable implements Definition {

    private String name;
    private Type type;
    private int scope;

    public AbstractDefinition(int line, int column, String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getScope() {
        return scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope=scope;
    }
}
