grammar SimpleLang;
//Lexer Rules

BOOL: ('true' | 'false'); // character declaration needs to come first
ID: [a-zA-Z] [a-zA-Z0-9_]*;
NUM: [0-9] [0-9]*;
CHAR: '\'' [ -~] '\'';
COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines 
OTHER: . {
    System.out.println("LEXER ERROR");
};

// //Parser Rules 
project: 'project' ID (constDecl | varDecl | classDecl | enumDecl | interfaceDecl)* '{' methodDecl* '}' EOF;
constDecl: 'const' type ID '=' (NUM | CHAR | BOOL) (',' ID '=' (NUM | CHAR | BOOL))* ';';
enumDecl: 'enum' ID '{' ID ('=' NUM)? (',' ID ('=' NUM)?)* '}';
varDecl: type ID ('[' ']')? (',' ID ('[' ']')?)* ';';
classDecl: 'class' ID  ('extends' type)? ('implements' type (',' type)*)? '{'(varDecl)* ('{' methodDecl* '}')? '}';
interfaceDecl: 'interface' ID '{' interfaceMethodDecl* '}';
interfaceMethodDecl: ('static')? (type|'void') ID '(' formPars? ')' ';';
methodDecl: ('static')? (type|'void') ID '(' formPars? ')' varDecl* '{' statement* '}';
formPars: type ID ('[' ']')? (',' type ID ('[' ']')?)*;
type: ID;


statement: designatorStatement ';'
| 'if' '(' condition ')' statement ('else' statement)? 
| 'for' '(' designatorStatement? ';' condition? ';' designatorStatement? ')' statement
| 'break' ';'
| 'continue' ';'
| 'return' expr? ';'
| 'read' '(' designator ')' ';' 
| 'print' '(' expr (',' NUM)? ')' ';'
| '{' statement* '}';


designatorStatement: designator (assignOp expr | '(' actPars? ')' | '++' | '--');
actPars: expr (',' expr)*;
condition: condTerm ('||' condTerm)*;
condTerm: condFact ('&&' condFact)*;
condFact: expr (relOp expr)?;
expr: ('-')? term (addOp term)*;
term: factor (mulOp factor)*;
factor: designator ('(' actPars? ')')? | NUM | CHAR | BOOL | 'new' type ('[' expr ']')? | '(' expr ')';
designator: ID ('.' ID | '[' expr ']')*;
assignOp: '=';
relOp: '=='|'!='|'>'|'>='|'<'|'<=';
addOp: '+' |'-';
mulOp: '*' | '/' | '%';
