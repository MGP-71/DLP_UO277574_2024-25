package ast.program;

import ast.statements.Statement;
import ast.types.Type;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition{
    private List<Statement> stList;

    public FunctionDefinition(int line, int column, String name, Type type, List<Statement> stList) {
        super(line, column, name, type);
        this.stList = new ArrayList<Statement>(stList);
    }

    public List<Statement> getStList() {
        return new ArrayList<Statement>(stList);
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();
        aux.append("def ").append(getName()).append(getType()).append(" {");
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
