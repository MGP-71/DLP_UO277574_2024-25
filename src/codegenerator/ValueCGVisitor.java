package codegenerator;

import ast.expressions.*;
import ast.statements.FunctionInvocation;
import ast.types.Type;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void>{
    private AddressCGVisitor addressVisitor;

    public ValueCGVisitor(CodeGenerator cg) {
        super(cg);
    }

    /*
    value[[Arithmetic: expression1 ⟶ expression2 (+|-|*|/) expression3]] =
        value[[expression2]]
        expression2.type.convertTo(expression1)
        value[[expression3]]
        expression3.type.convertTo(expression1)
        switch (expression1.operator) {
            case "+": <add> expression1.suffix
                break;
            case "-": <sub> expression1.suffix
                break;
            case "*": <mul> expression1.suffix
                break;
            case "/": <div> expression1.suffix
                break;
            default: assert false;
        }
     */
    @Override
    public Void visit(Arithmetic e, Void param) {
        e.getExp1().accept(this, null);
        e.getExp1().getType().convertTo(cg, e.getType());
        e.getExp2().accept(this, null);
        e.getExp2().getType().convertTo(cg, e.getType());

        switch (e.getOperator()){
            case "+":
                cg.add(e.getType()); break;
            case "-":
                cg.sub(e.getType()); break;
            case "*":
                cg.mul(e.getType()); break;
            case "/":
                cg.div(e.getType()); break;
        }

        return null;
    }

    @Override
    public Void visit(ArrayAccess e, Void param) {
        return null;
    }

    /*
    value[[Cast: exp1 ⟶ type exp2]]
        value[[exp2]]
        exp2.type.convertTo(exp1.type)
     */
    @Override
    public Void visit(Cast e, Void param) {
        e.getExp().accept(this, null);
        e.getExp().getType().convertTo(cg, e.getType());

        return null;
    }

    /*
    value[[CharacterLiteral: exp ⟶ CharacterType]]:
        <pushb > (Integer) exp.value
     */
    @Override
    public Void visit(CharacterLiteral e, Void param) {
        cg.pushb(e.getValue());

        return null;
    }

    /*
    value[[Comparison: expression1 ⟶ expression2 ( > | < | >= | <= | == | != ) expression3]] =
        Type highestType = expression2.type.highestType(expression3.type)
        value[[expression2]]
        expression2.type.convertTo(highestType)
        value[[expression3]]
        expression3.type.convertTo(highestType)
        switch (operator) {
            case ">": <gt> highestType.suffix
                break;
            case "<": <lt> highestType.suffix
                break;
            case ">=": <ge> highestType.suffix
                break;
            case "<=": <le> highestType.suffix
                break;
            case "==": <eq> highestType.suffix
                break;
            case "!=": <ne> highestType.suffix
                break;
        }
     */
    @Override
    public Void visit(Comparison e, Void param) {
        Type highestType = e.getExp1().getType().highestType(e.getExp2().getType());
        e.getExp1().accept(this, null);
        e.getExp1().getType().convertTo(cg, highestType);
        e.getExp2().accept(this, null);
        e.getExp2().getType().convertTo(cg, highestType);


        switch (e.getOperator()) {
            case ">": cg.gt(highestType.suffix());
                break;
            case "<": cg.lt(highestType.suffix());
                break;
            case ">=": cg.ge(highestType.suffix());
                break;
            case "<=": cg.le(highestType.suffix());
                break;
            case "==": cg.eq(highestType.suffix());
                break;
            case "!=": cg.ne(highestType.suffix());
                break;

        }

        return null;
    }

    /*
    value[[DoubleLiteral: exp ⟶ DoubleType]]:
        <pushf > exp.value
     */
    @Override
    public Void visit(DoubleLiteral e, Void param) {
        cg.pushf(e.getValue());

        return null;
    }

    @Override
    public Void visit(FieldAccess e, Void param) {
        return super.visit(e, param);
    }

    /*
    value[[IntegerLiteral: exp ⟶ IntegerType]]:
        <pushi > exp.value
     */
    @Override
    public Void visit(IntegerLiteral e, Void param) {
        cg.push(e.getValue());

        return null;
    }

    /*
    value[[Logical: expression1 ⟶ expression2 (&& | ||) expression3]] =
        value[[expression2]]
        value[[expression3]]
        switch (expression1.operator){
            case "&&": <and>
                break;
            case "||": <or>
                break;
            default: assert false;
        }
     */
    @Override
    public Void visit(Logical e, Void param) {
        e.getExp1().accept(this, null);
        e.getExp2().accept(this, null);
        switch(e.getOperator()){
            case "&&":
                cg.and(); break;
            case "||":
                cg.or(); break;
        }

        return null;
    }

    @Override
    public Void visit(UnaryMinus e, Void param) {
        return super.visit(e, param);
    }

    /*
    value[[UnaryNot: exp1 ⟶ exp2]] =
        value[[exp1]]
        <not>
    */
    @Override
    public Void visit(UnaryNot e, Void param) {
        return super.visit(e, param);
    }

    /*
    value[[Variable: exp ⟶ ID]] =
        address[[exp]]
        load suffix
     */
    @Override
    public Void visit(Variable e, Void param) {
        e.accept(addressVisitor, null);
        cg.load(e.getLinkedDef().getType());

        return null;
    }

    @Override
    public Void visit(FunctionInvocation e, Void param) {
        return super.visit(e, param);
    }

    public AddressCGVisitor getAddressVisitor() {
        return addressVisitor;
    }

    public void setAddressVisitor(AddressCGVisitor addressVisitor) {
        this.addressVisitor = addressVisitor;
    }
}
