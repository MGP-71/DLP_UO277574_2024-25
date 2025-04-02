package ast.types;

import ast.AbstractLocatable;
import ast.Locatable;
import ast.program.Field;
import ast.program.VariableDefinition;
import errorhandler.ErrorHandler;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class StructType extends AbstractType{
    private List<Field> fieldList;

    public StructType(List<Field> fieldList) {
        this.fieldList = new ArrayList<Field>(fieldList);
        checkForRepetitions();
    }

    public List<Field> getFieldList() {
        return new ArrayList<Field>(fieldList);
    }

    private void checkForRepetitions() {
        List<String> caught = new ArrayList<String>();
        for (int i = 0; i < fieldList.size(); i++) {
            for (int j = 0; j < fieldList.size(); j++) {
                if (!caught.contains(fieldList.get(i).getName())) {
                    if (fieldList.get(i).getName().equals(fieldList.get(j).getName()) && i!=j) {
                        caught.add(fieldList.get(i).getName());
                        new ErrorType(fieldList.get(i), "Field repetition '" + fieldList.get(i).getName() + "'");
                    }
                }
            }
        }
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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }

    @Override
    public Type dot(String name, Locatable l) {
        for (Field f: fieldList) {
            if (f.getName().equals(name))
                return f.getFieldType();
        }
        return new ErrorType(l, "The field " + name + " is not in the struct");
    }

    @Override
    public int numberOfBytes() {
        int total = 0;
        for(Field f: fieldList) {
            total += f.getFieldType().numberOfBytes();
        }
        return total;
    }
}
