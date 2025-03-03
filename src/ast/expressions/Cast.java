package ast.expressions;

import ast.types.Type;

public class Cast extends AbstractExpression{
    private  Expression exp;
    private Type type;
    public Cast(int line, int column, Expression exp, Type type) {
        super(line, column);
        this.exp = exp;
        this.type = type;
    }

    public Expression getExp() {
        return exp;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "(" + type + ") " + exp;
    }
}
