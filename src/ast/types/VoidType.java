package ast.types;

import ast.Locatable;
import visitor.Visitor;

public class VoidType extends AbstractType{
    public VoidType() {
    }
    @Override
    public String toString() {
        return "None";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }

    @Override
    public void mustBeBuiltInOrVoid(Locatable l) {
        return;
    }
}
