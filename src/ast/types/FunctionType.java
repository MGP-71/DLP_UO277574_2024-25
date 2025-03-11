package ast.types;

import ast.program.VariableDefinition;
import ast.statements.Statement;
import visitor.Visitor;

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

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();
        aux.append("(");
        int cnt= 0;
        for (VariableDefinition vd: variableDefinitions) {
            aux.append(vd.toString());
            aux.append(", ");
            cnt++;
        }
        if (cnt>0) {
            aux.deleteCharAt(aux.length()-1);
            aux.deleteCharAt(aux.length()-1);
        }
        aux.append(") -> ").append(returnType).append(": ");
        return aux.toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
