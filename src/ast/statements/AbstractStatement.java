package ast.statements;

import ast.AbstractLocatable;

public class AbstractStatement extends AbstractLocatable implements Statement {
    public AbstractStatement(int line, int column) {
        super(line, column);
    }
}
