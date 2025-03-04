grammar Pmm;

@header {
    import ast.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.program.*;
    import ast.types.*;
}

program returns [Program ast]
        locals [List<Definition> dList = new ArrayList<Definition>()]:
    (definition { $dList.addAll($definition.ast); })*
        main_function { $dList.add($main_function.ast); } EOF
        { $ast = new Program($dList); }
    ;

definition returns [List<Definition> ast  = new ArrayList<>()]:
    var_definition { $ast.addAll($var_definition.ast); }
    | func_definition { $ast.add($func_definition.ast); }
    ;

var_definition returns [List<VariableDefinition> ast  = new ArrayList<>()]
    locals [List<Variable> vList = new ArrayList<Variable>()]:
    id1=ID
        { $vList.add(new Variable($id1.getLine(), $id1.getCharPositionInLine() + 1, $id1.text)); }
        (',' id2=ID { $vList.add(new Variable($id2.getLine(), $id2.getCharPositionInLine() + 1, $id2.text)); })*
        ':' type ';'
        {
            for (Variable vb: $vList) {
                { $ast.add(new VariableDefinition(vb.getLine(), vb.getColumn(), vb.getName(), $type.ast)); }
            }
            for (int i = 0; i < $vList.size(); i++) {
                for (int j = 0; j < $vList.size(); j++) {
                    if ($vList.get(i).getName().equals($vList.get(j).getName()) && i!=j) {
                        new ErrorType($vList.get(i), "Variable repetition '" + $vList.get(i).getName() + "'");
                    }
                }
            }
        }
    ;

func_definition returns [FunctionDefinition ast]
        locals [List<Statement> stList = new ArrayList<>()]:
    d='def' id1=ID function_type '{'
        (var_definition { $stList.addAll($var_definition.ast); })*
        (statement { $stList.addAll($statement.ast); })* '}'
        { $ast = new FunctionDefinition($d.getLine(), $d.getCharPositionInLine() + 1, $id1.text, $function_type.ast,
        $stList); }
    ;

main_function returns [FunctionDefinition ast]
        locals [List<Statement> stList = new ArrayList<>()]:
    d='def' m='main' function_type '{'
        (var_definition { $stList.addAll($var_definition.ast); })*
        (statement { $stList.addAll($statement.ast); })* '}'
        { $ast = new FunctionDefinition($d.getLine(), $d.getCharPositionInLine() + 1, $m.text, $function_type.ast,
                $stList); }
    ;

type returns [Type ast]:
    build_in_type { $ast = $build_in_type.ast; }
    | complex_type { $ast = $complex_type.ast; }
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

function_type returns [FunctionType ast]
        locals [List<VariableDefinition> vdList = new ArrayList<>()]:
    d='(' (id1=ID ':' t1=type { $vdList.add(new VariableDefinition($d.getLine(),
            $d.getCharPositionInLine() + 1, $id1.text, $t1.ast)); }
            (',' id2=ID ':' t2=type { $vdList.add(new VariableDefinition($d.getLine(), $d.getCharPositionInLine() + 1,
            $id2.text, $t2.ast)); })*)? ')' '->' type_of_func ':'
            { $ast = new FunctionType($type_of_func.ast, $vdList); }
    ;

type_of_func returns [Type ast]:
    'None' { $ast = new VoidType(); }
    | build_in_type { $ast = $build_in_type.ast; }
    ;

fields returns [List<Field> ast  = new ArrayList<>()]
        locals [List<Variable> vList = new ArrayList<Variable>()]:
    (id1=ID  { $vList.add(new Variable($id1.getLine(), $id1.getCharPositionInLine() + 1, $id1.text)); }
        (',' id2=ID  { $vList.add(new Variable($id2.getLine(), $id2.getCharPositionInLine() + 1, $id2.text)); } )*
        ':' type ';')*
        {
            for (Variable vb: $vList) {
                { $ast.add(new Field(vb.getLine(), vb.getColumn(), vb.getName(), $type.ast)); }
            }
        }
    ;

statement returns [List<Statement> ast = new ArrayList<>()]
        locals [List<Statement> elseBody = new ArrayList<>()]:
    p='print' e1=expression
        { $ast.add(new Write($p.getLine(), $p.getCharPositionInLine() + 1, $e1.ast)); }
        (',' e2=expression { $ast.add(new Write($p.getLine(), $p.getCharPositionInLine() + 1, $e2.ast)); })* ';'
    | i='input' e1=expression
        { $ast.add(new Read($i.getLine(), $i.getCharPositionInLine() + 1, $e1.ast)); }
        (',' e2=expression { $ast.add(new Read($i.getLine(), $i.getCharPositionInLine() + 1, $e2.ast)); })* ';'
    | e1=expression '=' e2=expression ';'
        { $ast.add(new Assigment($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast)); }
    | i='if' expression ':' b1=block ('else' ':' b2=block { $elseBody.addAll($b2.ast); })?
        { $ast.add(new IfElse($i.getLine(), $i.getCharPositionInLine() + 1, $expression.ast, $b1.ast, $elseBody)); }
    | w='while' expression ':' block
        { $ast.add(new While($w.getLine(), $w.getCharPositionInLine() + 1, $expression.ast, $block.ast)); }
    | r='return' expression ';'
        { $ast.add(new Return($r.getLine(), $r.getCharPositionInLine() + 1, $expression.ast)); }
    | func_invocation ';'
        { $ast.add($func_invocation.ast); }
    ;

func_invocation returns [FunctionInvocation ast]
        locals [List<Expression> params = new ArrayList<>()]:
    ID '(' (expression { $params.add($expression.ast); }
        (',' expression { $params.add($expression.ast); } )*)? ')'
        { $ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine() + 1,
        new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text), $params); }
    ;

block returns [List<Statement> ast  = new ArrayList<>()]:
    statement { $ast.addAll($statement.ast); }
    | '{' (statement { $ast.addAll($statement.ast); })* '}'
    ;

expression returns [Expression ast]:
    '(' e=expression ')' { $ast = $e.ast; }
    | e1=expression '[' e2=expression ']'
        { $ast = new ArrayAccess($e1.ast.getLine(), $e2.ast.getColumn(), $e1.ast, $e2.ast); }
    | e1=expression '.' ID
        { $ast = new FieldAccess($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $ID.text); }
    | op='(' t=type ')' e1=expression
        { $ast = new Cast($op.getLine(), $op.getCharPositionInLine() + 1, $e1.ast, $t.ast); }
    | op='-' e1=expression
        { $ast = new UnaryMinus($op.getLine(), $op.getCharPositionInLine() + 1, $e1.ast); }
    | op='!' e1=expression
        { $ast = new UnaryNot($op.getLine(), $op.getCharPositionInLine() + 1, $e1.ast); }
    | e1=expression op=('*'|'/'|'%') e2=expression
        { $ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $op.text); }
    | e1=expression op=('>'|'>='|'<'|'<='|'!='|'==') e2=expression
        { $ast = new Comparison($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $op.text); }
    | e1=expression op=('&&'|'||') e2=expression
        { $ast = new Logical($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $op.text); }
    | e1=expression op=('+'|'-') e2=expression
        { $ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $op.text); }
    | func_invocation { $ast = $func_invocation.ast; }
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

