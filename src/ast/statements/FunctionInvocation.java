package ast.statements;

import ast.expressions.Expression;
import ast.expressions.Variable;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation extends AbstractStatement implements Expression {
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
}
