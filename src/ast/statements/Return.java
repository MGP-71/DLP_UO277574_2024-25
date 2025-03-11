package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

public class Return extends AbstractStatement{
    private Expression exp;

    public Return(int line, int column, Expression exp) {
        super(line, column);
        this.exp = exp;
    }

    public Expression getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return "return " + exp;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
