package ast.types;

import visitor.Visitor;

public class CharacterType extends AbstractType{

    public CharacterType() {
    }

    @Override
    public String toString() {
        return "char";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
