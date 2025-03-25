package ast.expressions;

import ast.program.Definition;
import visitor.Visitor;

public class Variable extends AbstractExpression{
    private String name;
    private Definition linkedDef;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public Definition getLinkedDef() {
        return linkedDef;
    }

    public void setLinkedDef(Definition linkedDef) {
        this.linkedDef = linkedDef;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
