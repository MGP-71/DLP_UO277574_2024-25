package ast.types;

import visitor.Visitor;

public class DoubleType extends AbstractType{

    public DoubleType() {
    }

    @Override
    public String toString() {
        return "double";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
