package ast.types;

import ast.program.Field;
import ast.program.VariableDefinition;

import java.util.ArrayList;
import java.util.List;

public class StructType extends AbstractType{
    private List<Field> fieldList;

    public StructType(List<Field> fieldList) {
        this.fieldList = new ArrayList<Field>(fieldList);
    }

    public List<Field> getFieldList() {
        return new ArrayList<Field>(fieldList);
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();
        aux.append("struct {");
        aux.append("\n");
        for (Field f: fieldList) {
            aux.append(f.toString());
            aux.append("\n");
        }
        aux.append("}");
        return aux.toString();
    }
}
