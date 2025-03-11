package ast.program;

import ast.AbstractASTNode;
import ast.statements.Statement;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractASTNode {
    private List<Definition> defList;

    public Program(List<Definition> defList) {
        this.defList = new ArrayList<Definition>(defList);
    }

    public List<Definition> getDefList() {
        return new ArrayList<Definition>(defList);
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();
        for (Definition dn: defList) {
            aux.append(dn.toString());
            aux.append("\n");
        }
        return aux.toString();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
