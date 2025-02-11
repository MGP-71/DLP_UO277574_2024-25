package ast.expressions;

public class FieldAccess extends AbstractExpression{
    private Expression exp;
    private String field;

    public FieldAccess(int line, int column, Expression exp, String field) {
        super(line, column);
        this.exp = exp;
        this.field = field;
    }

    public Expression getExp() {
        return exp;
    }

    public String getField() {
        return field;
    }
}
