package ast.types;

import ast.Locatable;
import codegenerator.CodeGenerator;
import com.sun.jdi.CharType;
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

    @Override
    public Type arithmetic(Type type, Locatable l) {
        if (type instanceof DoubleType || type instanceof ErrorType)
            return new DoubleType();
        return new ErrorType(l, "Cannot do arithmetic operation with types double and " + type);
    }

    @Override
    public Type arithmetic(Locatable l) {
        return new DoubleType();
    }
    @Override
    public Type comparison(Type type, Locatable l) {
        if (type instanceof DoubleType || type instanceof ErrorType)
            return this;
        return new ErrorType(l, "Cannot do comparison operation with types character and " + type);
    }

    @Override
    public void mustPromotesTo(Type t, Locatable l) {
        if (t instanceof DoubleType || t instanceof ErrorType)
            return;
        new ErrorType(l, "Cannot promote to with types double and " + t);
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
        return 4;
    }

    @Override
    public char suffix() {
        return 'f';
    }

    @Override
    public void convertTo(CodeGenerator codeGenerator, Type type){
        if(type instanceof CharType) {
            codeGenerator.f2i();
            codeGenerator.i2b();
        }
        else if(type instanceof IntegerType){
            codeGenerator.f2i();
        }
    }
}
