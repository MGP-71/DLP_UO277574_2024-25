package ast.expressions;

public class Comparison extends AbstractExpression{
    Expression exp1;
    Expression exp2;
    String operator;

    public Comparison(int line, int column, Expression exp1, Expression exp2, String operator) {
        super(line, column);
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.operator = operator;
    }
}
