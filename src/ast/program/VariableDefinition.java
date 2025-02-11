package ast.program;

import ast.statements.Statement;
import ast.types.Type;

public class VariableDefinition extends AbstractDefinition implements Statement {
    private String name;
    private Type returnType;

    public VariableDefinition(int line, int column, String name, Type returnType) {
        super(line, column);
        this.name = name;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public Type getReturnType() {
        return returnType;
    }
}
