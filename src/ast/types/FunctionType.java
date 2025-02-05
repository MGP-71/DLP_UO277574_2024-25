package ast.types;

import ast.program.VariableDefinition;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType{
    Type returnType;
    List<VariableDefinition> variableDefinitions;

    public FunctionType(Type returnType, List<VariableDefinition> variableDefinitions) {
        this.returnType = returnType;
        this.variableDefinitions = new ArrayList<VariableDefinition>(variableDefinitions);
    }
}
