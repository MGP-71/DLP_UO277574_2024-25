package ast.types;

public class FieldType extends AbstractType{
    String name;
    Type fieldType;

    public FieldType(String name, Type fieldType) {
        this.name = name;
        this.fieldType = fieldType;
    }
}
