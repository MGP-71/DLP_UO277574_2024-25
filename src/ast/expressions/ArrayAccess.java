package ast.expressions;

public class ArrayAccess extends AbstractExpression{
    Expression exp1;
    Expression exp2;

    public ArrayAccess(int line, int column, Expression exp1, Expression exp2) {
        super(line, column);
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
