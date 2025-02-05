package ast.expressions;

public class UnaryMinus extends AbstractExpression{
    Expression exp;

    public UnaryMinus(int line, int column, Expression exp) {
        super(line, column);
        this.exp = exp;
    }
}
