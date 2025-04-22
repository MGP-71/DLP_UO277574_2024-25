package ast.types;

import ast.ASTNode;
import ast.Locatable;
import codegenerator.CodeGenerator;

import java.util.List;

public interface Type extends ASTNode {
    Type arithmetic(Type type, Locatable l);
    Type arithmetic(Locatable l); //UnaryMinus
    Type comparison(Type type, Locatable l);
    Type logic(Type t, Locatable l);
    Type logic(Locatable l); //UnaryNot
    void mustPromotesTo(Type t, Locatable l);
    void mustBeBuiltIn(Locatable l); // Function Parameters and Return Type
    void mustBeLogical(Locatable l); // If and While
    Type canBeCastTo(Type t, Locatable l);
    Type squareBrackets(Type t, Locatable l); //Indexing
    Type dot(String name, Locatable l); //FieldAccess
    Type parenthesis(List<Type> list, Locatable l); //FuncInvocation

    int numberOfBytes();
    char suffix();
}
