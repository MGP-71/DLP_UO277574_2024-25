package ast.statements;

import ast.expressions.Expression;
import ast.types.ErrorType;
import visitor.Visitor;

public class Read extends AbstractStatement{
    private Expression exp;

    public Read(int line, int column, Expression exp) {
        super(line, column);
        this.exp = exp;
    }

    public Expression getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return "input " + exp;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
