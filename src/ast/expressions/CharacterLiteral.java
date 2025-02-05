package ast.expressions;

public class CharacterLiteral extends AbstractExpression {
    char value;

    public CharacterLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }
}
