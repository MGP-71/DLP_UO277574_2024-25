package ast.types;

public class ArrayType extends AbstractType{
    int size;
    Type typeOf;

    public ArrayType(int size, Type typeOf) {
        this.size = size;
        this.typeOf = typeOf;
    }
}
