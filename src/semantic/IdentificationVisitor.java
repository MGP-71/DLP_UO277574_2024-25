package semantic;

import ast.expressions.Variable;
import ast.program.FunctionDefinition;
import ast.program.VariableDefinition;
import ast.types.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

    private SymbolTable st = new SymbolTable();

    @Override
    public Void visit(Variable e, Void param) {
        if (st.find(e.getName()) == null)
            new ErrorType(e, "Variable '" + e.getName() + "' not defined");
        else
            e.setLinkedDef(st.find(e.getName()));
        return null;
    }

    @Override
    public Void visit(FunctionDefinition e, Void param) {
        if (!st.insert(e))
            new ErrorType(e, "Function '" + e.getName() + "' already defined");
        else {
            st.set();
            e.getType().accept(this, param);
            for (int i = 0; i < e.getStList().size(); i++) {
                e.getStList().get(i).accept(this, param);
            }
            st.reset();
        }
        return null;
    }

    @Override
    public Void visit(VariableDefinition e, Void param) {
        if (!st.insert(e))
            new ErrorType(e, "Variable '" + e.getName() + "' already defined");
        return null;
    }
}