package ast.expressions;

public class UnaryNot extends AbstractExpression{
    Expression exp;

    public UnaryNot(int line, int column, Expression exp) {
        super(line, column);
        this.exp = exp;
    }
}
