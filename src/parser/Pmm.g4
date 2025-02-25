grammar Pmm;

@header {
    import ast.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.program.*;
    import ast.types.*;
}

program returns [Program ast]: definition* main_function EOF
    ;

definition: var_definition
    | func_definition
    ;

var_definition: ID (',' ID)* ':' type ';'
    ;

func_definition: 'def' ID '(' args ')' '->' (build_in_type|'None') ':' '{' var_definition* statement* '}'
    ;

main_function: 'def' 'main' '(' ')' '->' 'None' ':' '{' var_definition* statement* '}'
    ;

args: (ID ':' type (',' ID ':' type)*)?
    ;

type returns [Type ast]: build_in_type
    | complex_type
    ;

build_in_type returns [Type ast]:
    'int' { $ast = new IntegerType(); }
    | 'double' { $ast = new DoubleType(); }
    | 'char' { $ast = new CharacterType(); }
    ;

complex_type returns [Type ast]:
    '[' INT_CONSTANT ']' type { $ast = new ArrayType(LexerHelper.lexemeToInt($INT_CONSTANT.text), $type.ast); }
    | 'struct' '{' fields '}' { $ast = new StructType($fields.ast); }
    ;

fields returns [List<Field> ast  = new ArrayList<>()]:
    (id1=ID { $ast.add( new Field($id1.getLine(), $id1.getCharPositionInLine() + 1, $id1.text, $type.ast)); }
        (',' id2=ID {$ast.add( new Field($id2.getLine(), $id2.getCharPositionInLine() + 1, $id2.text, $type.ast));} )*
        ':' type ';')*
    ;

statement: 'print' expression (',' expression)* ';'
    | 'input' expression (',' expression)* ';'
    | expression '=' expression ';'
    | 'if' expression ':' block ('else' ':' block)?
    | 'while' expression ':' block
    | 'return' expression ';'
    | func_invocation ';'
    ;

func_invocation :
    ID '(' (expression (',' expression)*)? ')'
    ;

block: statement
    | '{' statement* '}'
    ;

expression returns [Expression ast]:
    e1=expression op=('&&'|'||') e2=expression
        { $ast = new Logical($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $op.text); }
    | e1=expression op=('>'|'>='|'<'|'<='|'!='|'==') e2=expression
        { $ast = new Comparison($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $op.text); }
    | e1=expression op=('*'|'/'|'%') e2=expression
        { $ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $op.text); }
    | e1=expression op=('+'|'-') e2=expression
        { $ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $op.text); }
    | op='!' expression
        { $ast = new UnaryNot($op.getLine(), $op.getCharPositionInLine() + 1, $expression.ast); }
    | op='-' expression
        { $ast = new UnaryMinus($op.getLine(), $op.getCharPositionInLine() + 1, $expression.ast); }
    | op='(' type ')' expression
        { $ast = new Cast($op.getLine(), $op.getCharPositionInLine() + 1, $expression.ast, $type.ast); }
    | expression '.' ID
        { $ast = new FieldAccess($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast, $ID.text); }
    | e1=expression '[' e2=expression ']'
        { $ast = new ArrayAccess($e1.ast.getLine(), $e2.ast.getColumn(), $e1.ast, $e2.ast); }
    | func_invocation
    | ID { $ast = new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text); }
    | INT_CONSTANT { $ast = new IntegerLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine() + 1,
        LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
    | REAL_CONSTANT { $ast = new DoubleLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine() + 1,
        LexerHelper.lexemeToReal($REAL_CONSTANT.text)); }
    | CHAR_CONSTANT { $ast = new CharacterLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine() + 1,
        LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }
    ;

//----------------------------------------------------------------------------------------------------------------------

WHITE_SPACE: [ \t\n\r]+ -> skip
    ;

ONE_LINE_COMMENT: '#' .*? ('\n' | EOF) -> skip
    ;

MULTIPLE_LINE_COMMENT: '"""' .*? '"""' -> skip
    ;

ID: [_a-zA-Z] [_a-zA-Z0-9]*
    ;

INT_CONSTANT: [1-9][0-9]*
    | '0'
    ;

REAL_CONSTANT: REAL_CONSTANT_FLOATING_POINT | REAL_CONSTANT_MANTISSA_EXPONENT
    ;

fragment
REAL_CONSTANT_FLOATING_POINT: INT_CONSTANT? '.' INT_CONSTANT
    |  INT_CONSTANT '.' INT_CONSTANT?
    ;

fragment
REAL_CONSTANT_MANTISSA_EXPONENT: (REAL_CONSTANT_FLOATING_POINT | INT_CONSTANT) [eE] [+-]? INT_CONSTANT
    ;

CHAR_CONSTANT: '\'' CHAR '\''
    ;

fragment
CHAR: .
    | '\\' INT_CONSTANT
    | '\\' [nt]
    ;

