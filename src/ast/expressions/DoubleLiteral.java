package ast.expressions;

public class DoubleLiteral extends AbstractExpression{
    double value;

    public DoubleLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }
}
