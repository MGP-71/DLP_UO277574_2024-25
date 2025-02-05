package ast.program;

import ast.statements.Statement;
import ast.types.Type;

public class VariableDefinition extends AbstractDefinition implements Statement {
    String name;
    Type returnType;

    public VariableDefinition(int line, int column, String name, Type returnType) {
        super(line, column);
        this.name = name;
        this.returnType = returnType;
    }
}
