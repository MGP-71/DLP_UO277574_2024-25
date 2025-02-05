package ast.Expressions;

import com.sun.jdi.Location;

public class Arithmetic extends AbstractExpression {
    Expression exp1;
    Expression exp2;
    String operator;

    public Arithmetic(int line, int column, Expression exp1, Expression exp2, String operator) {
        super(line, column);
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.operator = operator;
    }

}
