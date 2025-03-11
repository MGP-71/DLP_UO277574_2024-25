package ast.expressions;

import visitor.Visitor;

public class Logical extends AbstractExpression{
    private Expression exp1;
    private Expression exp2;
    private String operator;

    public Logical(int line, int column, Expression exp1, Expression exp2, String operator) {
        super(line, column);
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.operator = operator;
    }

    public Expression getExp1() {
        return exp1;
    }

    public Expression getExp2() {
        return exp2;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return exp1 + " " + operator + " " + exp2;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
