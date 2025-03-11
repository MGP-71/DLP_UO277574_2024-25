package ast.statements;

import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.expressions.Variable;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {
    private Variable name;
    private List<Expression> listExp;

    public FunctionInvocation(int line, int column, Variable name, List<Expression> listExp) {
        super(line, column);
        this.name = name;
        this.listExp = new ArrayList<Expression>(listExp);
    }

    public Variable getName() {
        return name;
    }

    public List<Expression> getListExp() {
        return new ArrayList<Expression>(listExp);
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();
        aux.append(getName()).append(" (");
        int cnt = 0;
        for (Expression lxp: listExp) {
            aux.append(lxp.toString());
            aux.append(", ");
            cnt++;
        }
        if (cnt>0) {
            aux.deleteCharAt(aux.length()-1);
            aux.deleteCharAt(aux.length()-1);
        }
        aux.append(")");
        return aux.toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
