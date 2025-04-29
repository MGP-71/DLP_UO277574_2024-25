package codegenerator;

import ast.expressions.*;
import ast.statements.FunctionInvocation;
import ast.types.DoubleType;
import ast.types.FunctionType;
import ast.types.IntegerType;
import ast.types.Type;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void>{
    private AddressCGVisitor addressVisitor;

    public ValueCGVisitor(CodeGenerator cg) {
        super(cg);
    }

    /*
    value[[Arithmetic: expression1 -> expression2 (+|-|*|/) expression3]] =
        value[[expression2]]
        value[[expression3]]
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
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);

        switch (e.getOperator()){
            case "+":
                cg.add(e.getType()); break;
            case "-":
                cg.sub(e.getType()); break;
            case "*":
                cg.mul(e.getType()); break;
            case "/":
                cg.div(e.getType()); break;
            case "%":
                cg.mod(e.getType()); break;
            default:
                throw new IllegalStateException("Operator not allowed: " + e.getOperator());
        }

        return null;
    }


    /*
    value[[ArrayAccess: exp1 -> exp2 exp3]] =
        address[[exp1]]
        <load > exp1.type.suffix()
     */
    @Override
    public Void visit(ArrayAccess e, Void param) {
        e.accept(addressVisitor, param);
        cg.load(e.getType());

        return null;
    }

    /*
    value[[Cast: exp1 -> type exp2]]
        value[[exp2]]
        --the next instructions can be encapsulated in a method convertTo in CodeGeneration--
        if (exp2.type.suffix == 'f')
            if (type.suffix == 'b')
                f2i
                i2b
            else if (type.suffix == 'i')
                f2i
        else if (exp2.type.suffix == 'b')
            if (type.suffix == 'f')
                b2i
                i2f
            else if (type.suffix == 'i')
                b2i
        else if (exp2.type.suffix == 'i')
            if (type.suffix == 'f')
                i2f
            else if (type.suffix == 'b')
                i2b
     */
    @Override
    public Void visit(Cast e, Void param) {
        e.getExp().accept(this, param);
        cg.convertTo(e.getExp().getType(), e.getType());

        return null;
    }

    /*
    value[[CharacterLiteral: exp -> CharacterType]]:
        <pushb > (Integer) exp.value
     */
    @Override
    public Void visit(CharacterLiteral e, Void param) {
        cg.pushb(e.getValue());

        return null;
    }

    /*
    value[[Comparison: expression1 -> expression2 ( > | < | >= | <= | == | != ) expression3]] =
        value[[expression2]]
        value[[expression3]]
        switch (operator) {
            case ">": <gt> expression1.suffix
                break;
            case "<": <lt> expression1.suffix
                break;
            case ">=": <ge> expression1.suffix
                break;
            case "<=": <le> expression1.suffix
                break;
            case "==": <eq> expression1.suffix
                break;
            case "!=": <ne> expression1.suffix
                break;
        }
     */
    @Override
    public Void visit(Comparison e, Void param) {
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);

        switch (e.getOperator()) {
            case ">": cg.gt(e.getType().suffix());
                break;
            case "<": cg.lt(e.getType().suffix());
                break;
            case ">=": cg.ge(e.getType().suffix());
                break;
            case "<=": cg.le(e.getType().suffix());
                break;
            case "==": cg.eq(e.getType().suffix());
                break;
            case "!=": cg.ne(e.getType().suffix());
                break;

        }

        return null;
    }

    /*
    value[[DoubleLiteral: exp -> DoubleType]]:
        <pushf > exp.value
     */
    @Override
    public Void visit(DoubleLiteral e, Void param) {
        cg.pushf(e.getValue());

        return null;
    }

    /*
    value[[FieldAccess: exp1 -> exp2 ID]] =
        address[[exp1]];
        <load > exp1.type.suffix()
     */
    @Override
    public Void visit(FieldAccess e, Void param) {
        e.accept(addressVisitor, param);
        cg.load(e.getType());

        return null;
    }

    /*
    value[[IntegerLiteral: exp -> IntegerType]]:
        <pushi > exp.value
     */
    @Override
    public Void visit(IntegerLiteral e, Void param) {
        cg.push(e.getValue());

        return null;
    }

    /*
    value[[Logical: expression1 -> expression2 (&& | ||) expression3]] =
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
        e.getExp1().accept(this, param);
        e.getExp2().accept(this, param);
        switch(e.getOperator()){
            case "&&":
                cg.and(); break;
            case "||":
                cg.or(); break;
            default:
                throw new IllegalStateException("Operator not allowed: " + e.getOperator());
        }

        return null;
    }

    /*
    value[[UnaryMinus: exp1 -> exp2]] =
        value[[exp1]]
        <push> exp1.type.suffix -1
        <mul> expression1.suffix
    */
    @Override
    public Void visit(UnaryMinus e, Void param) {
        e.getExp().accept(this, param);
        if (e.getType() instanceof IntegerType) {
            cg.push(-1);
        } else if (e.getType() instanceof DoubleType) {
            cg.pushf(-1);
        }
        cg.mul(e.getType());

        return null;
    }

    /*
    value[[UnaryNot: exp1 -> exp2]] =
        value[[exp1]]
        <not>
    */
    @Override
    public Void visit(UnaryNot e, Void param) {
        e.getExp().accept(this, param);
        cg.not();

        return null;
    }

    /*
    value[[Variable: exp -> ID]] =
        address[[exp]]
        load suffix
     */
    @Override
    public Void visit(Variable e, Void param) {
        e.accept(addressVisitor, param);
        cg.load(e.getLinkedDef().getType());

        return null;
    }

    /*
    value[[[[FunctionInvocation: exp -> exp exp*]]
	    exp*.forEach(e -> value[[e]])
	    <call > exp.name
     */
    @Override
    public Void visit(FunctionInvocation e, Void param) {
        cg.line(e.getLine());
        for(Expression exp: e.getListExp())
            exp.accept(this, param);
        cg.call(e.getVariableName().getName());

        return null;
    }

    public AddressCGVisitor getAddressVisitor() {
        return addressVisitor;
    }

    public void setAddressVisitor(AddressCGVisitor addressVisitor) {
        this.addressVisitor = addressVisitor;
    }
}
