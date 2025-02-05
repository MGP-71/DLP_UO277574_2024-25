package ast.program;

import ast.AbstractLocatable;

public class AbstractDefinition extends AbstractLocatable implements Definition {
    public AbstractDefinition(int line, int column) {
        super(line, column);
    }
}
