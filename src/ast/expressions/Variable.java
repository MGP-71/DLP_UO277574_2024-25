package ast.expressions;

public class Variable extends AbstractExpression{
    String name;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }
}
