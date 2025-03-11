package ast.expressions;


import ast.Locatable;

public interface Expression extends Locatable {
    boolean getLvalue();
    void setLValue(boolean b);
}
