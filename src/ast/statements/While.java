package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class While extends AbstractStatement{
    private List<Statement> stList;
    private Expression exp;

    public While(int line, int column, Expression exp, List<Statement> stList) {
        super(line, column);
        this.exp = exp;
        this.stList = new ArrayList<Statement>(stList);
    }

    public List<Statement> getStList() {
        return new ArrayList<Statement>(stList);
    }

    public Expression getExp() {
        return exp;
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();
        aux.append("while ").append(exp).append(" : {");
        aux.append("\n");
        for (Statement st: stList) {
            aux.append(st.toString());
            aux.append("\n");
        }
        aux.append("}");
        return aux.toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
