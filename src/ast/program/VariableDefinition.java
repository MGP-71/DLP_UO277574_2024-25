package ast.program;

import ast.statements.Statement;
import ast.types.Type;
import visitor.Visitor;

public class VariableDefinition extends AbstractDefinition implements Statement {

    private int offset;

    public VariableDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
        offset = 0;
    }

    @Override
    public String toString() {
        return getName() + ": " + getType();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
