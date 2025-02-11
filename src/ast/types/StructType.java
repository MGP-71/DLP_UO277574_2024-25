package ast.types;

import ast.program.Field;

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
}
