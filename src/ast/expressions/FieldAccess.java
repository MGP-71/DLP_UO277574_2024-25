package ast.expressions;

import visitor.Visitor;

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

    @Override
    public String toString() {
        return exp + "." + field;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
