package codegenerator;

import ast.program.Field;
import ast.program.FunctionDefinition;
import ast.program.VariableDefinition;
import ast.statements.Statement;
import ast.types.FunctionType;
import ast.types.StructType;
import semantic.AbstractVisitor;

public class OffSetVisitor extends AbstractVisitor<Void, Void> {

    private int globalByteSum;

    public OffSetVisitor() {
        this.globalByteSum = 0;
    }

    @Override
    public Void visit(FunctionDefinition e, Void param) {
        e.getType().accept(this, param);
        int localsByteSum = 0;
        for (Statement st: e.getStList()) {
            st.accept(this, param);
            if (st instanceof VariableDefinition) {
                localsByteSum += ((VariableDefinition) st).getType().numberOfBytes();
                ((VariableDefinition) st).setOffset(-1*localsByteSum);
            }
        }
        return null;
    }

    @Override
    public Void visit(VariableDefinition e, Void param) {
        e.getType().accept(this, param);
        if (e.getScope() == 0) {
            e.setOffset(globalByteSum);
            globalByteSum += e.getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(FunctionType e, Void param) {
        int paramsByteSum = 0;
        for (int i = e.getVariableDefinitions().size() - 1; i >= 0; i--) {
            e.getVariableDefinitions().get(i).accept(this, param);
            e.getVariableDefinitions().get(i).setOffset(4+paramsByteSum);
            paramsByteSum += e.getVariableDefinitions().get(i).getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(StructType e, Void param) {
        int fieldsByteSum = 0;
        for (Field f: e.getFieldList()) {
            f.accept(this, param);
            f.setOffset(fieldsByteSum);
            fieldsByteSum += f.getFieldType().numberOfBytes();
        }
        return null;
    }
}
