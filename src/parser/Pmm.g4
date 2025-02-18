grammar Pmm;	

program:
    ;

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

