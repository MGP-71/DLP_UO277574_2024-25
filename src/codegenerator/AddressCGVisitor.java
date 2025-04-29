package codegenerator;

import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import ast.program.VariableDefinition;
import ast.types.IntegerType;
import ast.types.StructType;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {
    private ValueCGVisitor valueVisitor;

    public AddressCGVisitor(CodeGenerator cg) {
        super(cg);
    }

    /*
     address[[ArrayAccess: exp1 -> exp2 exp3]] =
        address[[exp2]]
        value[[exp3]]
        <pushi > exp1.type.numberOfBytes()
        <muli>
        <addi>
     */
    @Override
    public Void visit(ArrayAccess e, Void param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(valueVisitor, param);

        cg.push(e.getType().numberOfBytes());
        cg.muli();
        cg.addi();

        return null;
    }

    /*
     address[[FieldAccess: exp1 -> exp2 ID]] =
        address[[exp2]]
        <pushi > expression2.type.getField(ID).offset
        <addi>
     */
    @Override
    public Void visit(FieldAccess e, Void param) {
        e.getExp().accept(this, param);
        cg.push(((StructType)e.getExp().getType()).getField(e.getField()).getOffset());
        cg.addi();

        return null;
    }

    /*
    address[[Variable: exp -> ID]] =
    if(exp.def.scope == 0)
        <pusha > exp.definition.offset
        else {
            <pusha > BP
            <pusha > exp.def.offset
            <addi >
        }
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
