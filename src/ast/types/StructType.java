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
        for (int i = 0; i < fieldList.size(); i++) {
            for (int j = 0; j < fieldList.size(); j++) {
                if (fieldList.get(i).getName().equals(fieldList.get(j).getName()) && i!=j) {
                    new ErrorType(fieldList.get(i), "Field repetition '" + fieldList.get(i).getName() + "'");
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
}
