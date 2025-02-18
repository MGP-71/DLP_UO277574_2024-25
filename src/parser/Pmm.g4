grammar Pmm;	

program: definition* main_function EOF
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

type: build_in_type
    | complex_type
    ;

build_in_type: 'int'
    | 'double'
    | 'char'
    ;

complex_type: '[' INT_CONSTANT ']' type
    | 'struct' '{' fields '}'
    ;

fields: (ID (',' ID)* ':' type ';')*
    ;

statement: 'print' expression (',' expression)* ';'
    | 'input' expression (',' expression)* ';'
    | expression '=' expression ';'
    | 'if' expression ':' block ('else' ':' block)?
    | 'while' expression ':' block
    | 'return' expression ';'
    | func_invocation ';'
    ;

func_invocation: ID '(' (expression (',' expression)*)? ')'
    ;

block: statement
    | '{' statement* '}'
    ;

expression: expression ('&&'|'||') expression
    |expression ('>'|'>='|'<'|'<='|'!='|'==') expression
    | expression ('+'|'-') expression
    | expression ('*'|'/'|'%') expression
    | '!' expression
    | '-' expression
    | '(' type ')' expression
    | expression '.' ID
    | expression '[' expression ']'
    | func_invocation
    | ID
    | INT_CONSTANT
    | REAL_CONSTANT
    | CHAR_CONSTANT
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

