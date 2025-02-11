package ast.types;

import ast.program.VariableDefinition;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType{
    private Type returnType;
    private List<VariableDefinition> variableDefinitions;

    public FunctionType(Type returnType, List<VariableDefinition> variableDefinitions) {
        this.returnType = returnType;
        this.variableDefinitions = new ArrayList<VariableDefinition>(variableDefinitions);
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<VariableDefinition> getVariableDefinitions() {
        return new ArrayList<VariableDefinition>(variableDefinitions);
    }
}
