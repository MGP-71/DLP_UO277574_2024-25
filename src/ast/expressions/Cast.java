package ast.expressions;

import ast.types.Type;

public class Cast extends AbstractExpression{
    Expression exp;
    Type type;
    public Cast(int line, int column, Expression exp, Type type) {
        super(line, column);
        this.exp = exp;
        this.type = type;
    }
}
