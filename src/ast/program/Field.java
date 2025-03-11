package ast.program;

import ast.AbstractLocatable;
import ast.types.Type;
import visitor.Visitor;

public class Field extends AbstractLocatable {
    private String name;
    private Type fieldType;

    public Field(int line, int column, String name, Type fieldType) {
        super(line, column);
        this.name = name;
        this.fieldType = fieldType;
    }

    public String getName() {
        return name;
    }

    public Type getFieldType() {
        return fieldType;
    }

    @Override
    public String toString() {
        return fieldType + ": " + name;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
