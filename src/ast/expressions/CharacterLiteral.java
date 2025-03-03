package ast.expressions;

public class CharacterLiteral extends AbstractExpression {
    private char value;

    public CharacterLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "'" + String.valueOf(value) + "'";
    }
}
