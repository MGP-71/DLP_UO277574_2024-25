package ast.expressions;

public class FieldAccess extends AbstractExpression{
    Expression exp;
    String field;

    public FieldAccess(int line, int column, Expression exp, String field) {
        super(line, column);
        this.exp = exp;
        this.field = field;
    }
}
