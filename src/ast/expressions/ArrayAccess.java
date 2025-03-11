package ast.expressions;

import visitor.Visitor;

public class ArrayAccess extends AbstractExpression{
    private Expression exp1;
    private Expression exp2;

    public ArrayAccess(int line, int column, Expression exp1, Expression exp2) {
        super(line, column);
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public Expression getExp1() {
        return exp1;
    }

    public Expression getExp2() {
        return exp2;
    }

    @Override
    public String toString() {
        return exp1 + "[" + exp2 + "]";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
