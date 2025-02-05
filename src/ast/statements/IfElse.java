package ast.statements;

import ast.expressions.Expression;

import java.util.ArrayList;
import java.util.List;

public class IfElse extends AbstractStatement{
    Expression expression;
    List<Statement> ifSt;
    List<Statement> elseIf;

    public IfElse(int line, int column, Expression expression, List<Statement> ifSt, List<Statement> elseIf) {
        super(line, column);
        this.expression = expression;
        this.ifSt = new ArrayList<Statement>(ifSt);
        this.elseIf = new ArrayList<Statement>(elseIf);
    }
}
