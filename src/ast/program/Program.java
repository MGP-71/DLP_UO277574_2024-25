package ast.program;

import ast.AbstractASTNode;

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
}
