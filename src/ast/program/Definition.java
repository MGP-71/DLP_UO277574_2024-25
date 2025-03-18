package ast.program;

import ast.Locatable;
import ast.types.Type;

public interface Definition extends Locatable {
    Type getType();
    String getName();
    int getScope();
    void setScope(int scope);
}
