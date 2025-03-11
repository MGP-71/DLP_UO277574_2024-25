package ast.types;

import visitor.Visitor;

public class IntegerType extends AbstractType{
    public IntegerType() {
    }

    @Override
    public String toString() {
        return "int";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
