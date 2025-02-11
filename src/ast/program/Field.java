package ast.program;

import ast.AbstractLocatable;
import ast.types.Type;

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
}
