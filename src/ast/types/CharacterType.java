package ast.types;

import ast.Locatable;
import codegenerator.CodeGenerator;
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

    @Override
    public Type arithmetic(Type type, Locatable l) {
        if (type instanceof CharacterType || type instanceof ErrorType)
            return new IntegerType();
        return new ErrorType(l, "Cannot do arithmetic operation with types character and " + type);
    }

    @Override
    public Type arithmetic(Locatable l) {
        return new IntegerType();
    }

    @Override
    public Type comparison(Type type, Locatable l) {
        if (type instanceof CharacterType || type instanceof ErrorType)
            return this;
        return new ErrorType(l, "Cannot do comparison operation with types character and " + type);
    }

    @Override
    public void mustPromotesTo(Type t, Locatable l) {
        if (t instanceof CharacterType || t instanceof ErrorType)
            return;
        new ErrorType(l, "Cannot promote to with types character and " + t);
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        return;
    }

    @Override
    public Type canBeCastTo(Type t, Locatable l) {
        return this;
    }

    @Override
    public int numberOfBytes() {
        return 1;
    }

    @Override
    public char suffix() {
        return 'b';
    }

    @Override
    public void convertTo(CodeGenerator codeGenerator, Type type){
        if(type instanceof DoubleType) {
            codeGenerator.b2i();
            codeGenerator.i2f();
        }
        else if(type instanceof IntegerType)
            codeGenerator.b2i();
    }
}