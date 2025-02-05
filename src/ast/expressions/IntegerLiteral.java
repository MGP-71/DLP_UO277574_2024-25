package ast.expressions;

public class IntegerLiteral extends AbstractExpression{
    int value;

    public IntegerLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }
}
