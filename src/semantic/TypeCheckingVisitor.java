package semantic;

import ast.expressions.*;
import ast.program.FunctionDefinition;
import ast.program.VariableDefinition;
import ast.statements.*;
import ast.types.*;

import java.util.stream.Collectors;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Boolean> {

    @Override
    public Boolean visit(Arithmetic e, Type param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        e.setType(e.getExp1().getType().arithmetic(e.getExp2().getType(), e));
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(ArrayAccess e, Type param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        e.setType(e.getExp1().getType().squareBrackets(e.getExp2().getType(), e));
        e.setLValue(true);
        return null;
    }

    @Override
    public Boolean visit(Cast e, Type param) {
        e.getExp().accept(this, param);
        e.setType(e.getExp().getType().canBeCastTo(e.getType(), e));
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(CharacterLiteral e, Type param) {
        e.setLValue(false);
        e.setType(new CharacterType());
        return null;
    }

    @Override
    public Boolean visit(Comparison e, Type param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        e.setType(e.getExp1().getType().comparison(e.getExp2().getType(), e));
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(DoubleLiteral e, Type param) {
        e.setLValue(false);
        e.setType(new DoubleType());
        return null;
    }

    @Override
    public Boolean visit(FieldAccess e, Type param) {
        e.getExp().accept(this, param);
        e.setType(e.getExp().getType().dot(e.getField(), e));
        e.setLValue(true);
        return null;
    }

    @Override
    public Boolean visit(IntegerLiteral e, Type param) {
        e.setLValue(false);
        e.setType(new IntegerType());
        return null;
    }

    @Override
    public Boolean visit(Logical e, Type param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        e.setType(e.getExp1().getType().logic(e.getExp2().getType(), e));
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(UnaryMinus e, Type param) {
        e.getExp().accept(this, param);
        e.setType(e.getExp().getType().arithmetic(e));
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(UnaryNot e, Type param) {
        e.getExp().accept(this, param);
        e.setType(e.getExp().getType().logic(e));
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(Variable e, Type param) {
        e.setLValue(true);
        if (e.getLinkedDef() == null) {
            new ErrorType(e, "The variable " + e.getName() + " is not defined");
            return null;
        }
        e.setType(e.getLinkedDef().getType());
        return null;
    }

    @Override
    public Boolean visit(FunctionDefinition e, Type param) {
        Type returnType = ((FunctionType)e.getType()).getReturnType();
        if(!(returnType instanceof VoidType))
            returnType.mustBeBuiltIn(e);
        for(Statement st: e.getStList()) {
            st.accept(this, returnType);
        }
        e.getType().accept(this, param);
        return null;
    }

    @Override
    public Boolean visit(Assignment e, Type param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        if (!e.getExp1().getLvalue())
            new ErrorType(e, "'" + e.getExp1() + "'" + " is not l-value");
        e.getExp1().getType().mustPromotesTo(e.getExp2().getType(), e);
        return null;
    }

    @Override
    public Boolean visit(FunctionInvocation e, Type param) {
        for (Expression exp : e.getListExp()) {
            exp.accept(this, param);
        }
        e.getVariableName().accept(this, param);
        e.setType(e.getVariableName().getType().parenthesis(
                e.getListExp().stream().map(Expression::getType).collect(Collectors.toList()), e));
        e.setLValue(false);
        return null;
    }

    @Override
    public Boolean visit(IfElse e, Type param) {
        e.getExpression().accept(this, param);
        for(Statement st : e.getIfSt()) {
            st.accept(this, param);
        }
        if (!e.getElseIf().isEmpty()) {
            for(Statement st : e.getElseIf()) {
                st.accept(this, param);
            }
        }
        e.getExpression().getType().mustBeLogical(e);
        return null;
    }

    @Override
    public Boolean visit(Read e, Type param) {
        e.getExp().accept(this, param);
        if (!e.getExp().getLvalue())
            new ErrorType(e, "'" + e.getExp() + "'" + " is not l-value");
        e.getExp().getType().mustBeBuiltIn(e);
        return null;
    }

    @Override
    public Boolean visit(Return e, Type param) {
        e.getExp().accept(this, param);
        e.getExp().getType().mustPromotesTo(param, e);
        return null;
    }

    @Override
    public Boolean visit(While e, Type param) {
        e.getExp().accept(this, param);
        for(Statement st : e.getStList()) {
            st.accept(this, param);
        }
        e.getExp().getType().mustBeLogical(e);
        return null;
    }

    @Override
    public Boolean visit(Write e, Type param) {
        e.getExp().accept(this, param);
        e.getExp().getType().mustBeBuiltIn(e);
        return null;
    }

    @Override
    public Boolean visit(FunctionType e, Type param) {
        for(VariableDefinition vd : e.getVariableDefinitions()) {
            vd.accept(this, param);
            vd.getType().mustBeBuiltIn(vd);
        }
        return null;
    }
}
