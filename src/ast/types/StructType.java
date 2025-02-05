package ast.types;

import java.util.ArrayList;
import java.util.List;

public class StructType extends AbstractType{
    List<FieldType> fieldTypeList;

    public StructType(List<FieldType> fieldTypeList) {
        this.fieldTypeList = new ArrayList<FieldType>(fieldTypeList);
    }
}
