package ast.statements;

import ast.expressions.Expression;

import java.util.ArrayList;
import java.util.List;

public class IfElse extends AbstractStatement{
    private Expression expression;
    private List<Statement> ifSt;
    private List<Statement> elseIf;

    public IfElse(int line, int column, Expression expression, List<Statement> ifSt, List<Statement> elseIf) {
        super(line, column);
        this.expression = expression;
        this.ifSt = new ArrayList<Statement>(ifSt);
        this.elseIf = new ArrayList<Statement>(elseIf);
    }

    public Expression getExpression() {
        return expression;
    }

    public List<Statement> getIfSt() {
        return new ArrayList<Statement>(ifSt);
    }

    public List<Statement> getElseIf() {
        return new ArrayList<Statement>(elseIf);
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();
        aux.append("if ").append(expression).append(" : {");
        aux.append("\n");
        for (Statement st: ifSt) {
            aux.append(st.toString());
            aux.append("\n");
        }
        aux.append("}");
        if (!elseIf.isEmpty()) {
            aux.append("\n" + "else {" + "\n");
            for (Statement st: elseIf) {
                aux.append(st.toString());
                aux.append("\n");
            }
            aux.append("}");
        }
        return aux.toString();
    }
}
