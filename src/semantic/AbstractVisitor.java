package semantic;

import ast.expressions.*;
import ast.program.*;
import ast.statements.*;
import ast.types.*;
import visitor.Visitor;

public class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {
    @Override
    public TR visit(Arithmetic e, TP param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        return null;
    }

    @Override
    public TR visit(ArrayAccess e, TP param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Cast e, TP param) {
        e.getExp().accept(this, param);
        return null;
    }

    @Override
    public TR visit(CharacterLiteral e, TP param) {
        return null;
    }

    @Override
    public TR visit(Comparison e, TP param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        return null;
    }

    @Override
    public TR visit(DoubleLiteral e, TP param) {
        return null;
    }

    @Override
    public TR visit(FieldAccess e, TP param) {
        e.getExp().accept(this, param);
        return null;
    }

    @Override
    public TR visit(IntegerLiteral e, TP param) {
        return null;
    }

    @Override
    public TR visit(Logical e, TP param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        return null;
    }

    @Override
    public TR visit(UnaryMinus e, TP param) {
        e.getExp().accept(this, param);
        return null;
    }

    @Override
    public TR visit(UnaryNot e, TP param) {
        e.getExp().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Variable e, TP param) {
        return null;
    }

    @Override
    public TR visit(Field e, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionDefinition e, TP param) {
        for(Statement st: e.getStList()) {
            st.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(Program e, TP param) {
        for(Definition def : e.getDefList()) {
            def.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(VariableDefinition e, TP param) {
        return null;
    }

    @Override
    public TR visit(Assignment e, TP param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation e, TP param) {
        for(Expression exp: e.getListExp()) {
            exp.accept(this, param);
        }
        e.getName().accept(this, param);
        return null;
    }

    @Override
    public TR visit(IfElse e, TP param) {
        e.getExpression().accept(this, param);
        for(Statement st : e.getIfSt()) {
            st.accept(this, param);
        }
        if (!e.getElseIf().isEmpty()) {
            for(Statement st : e.getElseIf()) {
                st.accept(this, param);
            }
        }
        return null;
    }

    @Override
    public TR visit(Read e, TP param) {
        e.getExp().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Return e, TP param) {
        e.getExp().accept(this, param);
        return null;
    }

    @Override
    public TR visit(While e, TP param) {
        e.getExp().accept(this, param);
        for(Statement st : e.getStList()) {
            st.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(Write e, TP param) {
        e.getExp().accept(this, param);
        return null;
    }

    @Override
    public TR visit(ArrayType e, TP param) {
        return null;
    }

    @Override
    public TR visit(CharacterType e, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleType e, TP param) {
        return null;
    }

    @Override
    public TR visit(ErrorType e, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionType e, TP param) {
        for(VariableDefinition vd : e.getVariableDefinitions()) {
            vd.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(IntegerType e, TP param) {
        return null;
    }

    @Override
    public TR visit(StructType e, TP param) {
        for(Field f : e.getFieldList()) {
            f.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(VoidType e, TP param) {
        return null;
    }
}
