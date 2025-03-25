package ast.expressions;


import ast.Locatable;
import ast.types.Type;

public interface Expression extends Locatable {
    boolean getLvalue();
    void setLValue(boolean b);
    Type getType();
    void setType(Type t);
}
