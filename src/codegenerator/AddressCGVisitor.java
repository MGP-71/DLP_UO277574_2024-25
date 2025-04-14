package codegenerator;

import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import ast.program.VariableDefinition;
import ast.types.IntegerType;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {
    private ValueCGVisitor valueVisitor;

    public AddressCGVisitor(CodeGenerator cg) {
        super(cg);
    }

    @Override
    public Void visit(ArrayAccess e, Void param) {
        return super.visit(e, param);
    }

    @Override
    public Void visit(FieldAccess e, Void param) {
        return super.visit(e, param);
    }

    /*
    address[[Variable: exp ⟶ ID]] =
    if(exp.def.scope == 0)
        <pusha > exp.definition.offset
        else {
            <pusha > BP
            <pusha > exp.def.offset
            <addi >
        }
        push exp.suffix + exp.definition.offset
     */
    @Override
    public Void visit(Variable e, Void param) {
        VariableDefinition vd = (VariableDefinition) e.getLinkedDef();
        if(vd.getScope() == 0)
            cg.pusha(vd.getOffset());
        else {
            cg.pushBP();
            cg.push(vd.getOffset());
            cg.add(new IntegerType());
        }
        return null;
    }

    public ValueCGVisitor getValueVisitor() {
        return valueVisitor;
    }

    public void setValueVisitor(ValueCGVisitor valueVisitor) {
        this.valueVisitor = valueVisitor;
    }
}
