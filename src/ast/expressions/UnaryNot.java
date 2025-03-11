package ast.expressions;

import visitor.Visitor;

public class UnaryNot extends AbstractExpression{
    private Expression exp;

    public UnaryNot(int line, int column, Expression exp) {
        super(line, column);
        this.exp = exp;
    }

    public Expression getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return "!" + exp;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
