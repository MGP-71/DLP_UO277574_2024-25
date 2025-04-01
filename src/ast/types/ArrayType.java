package ast.types;

import ast.Locatable;
import visitor.Visitor;

public class ArrayType extends AbstractType{
    private int size;
    private Type typeOf;

    public ArrayType(int size, Type typeOf) {
        this.size = size;
        this.typeOf = typeOf;
    }

    public int getSize() {
        return size;
    }

    public Type getTypeOf() {
        return typeOf;
    }

    @Override
    public String toString() {
        return "[" + size + "]" + typeOf;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }

    @Override
    public Type squareBrackets(Type t, Locatable l) {
        if (t instanceof IntegerType)
            return this.getTypeOf();
        return new ErrorType(l, "The type " + t + "is not a valid type to follow an array");
    }
}
