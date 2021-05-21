grammar Expr;

/** The start rule; begin parsing here. */
prog: 'program {' NEWLINE start+ '}'
    ;

start: decl NEWLINE                                             #Decl_start
     | method NEWLINE                                           #method_start
      ;
// start: expr NEWLINE;

decl : type ID                                                  #DeclBasic
	 | type arrayDeclaration                                    #DeclArr
     ;

arrayDeclaration: ID ('[' U_INT ']')+;

method : type FUNC '(' args ')' NEWLINE block;

args : decl*                                                    #Arg_decl
	 | expr*                                                   #Arg_param
     ;

block:'{' NEWLINE block* '}'                                    #Blockstmts
| decl NEWLINE                                                  #block_decl
| stmt NEWLINE                                                  #block_stmt
    ;

stmt : expr                                                     #Expression
	| '(' expr ')' '?' expr ':' expr                            #CondBlock
	| ('if' '(' expr ') :' NEWLINE block) (NEWLINE 'else :' NEWLINE block)?     #IfBlock
	| 'for' '(' expr ';' expr ';' expr ') :' NEWLINE block #ForBlock
    | 'while' '(' expr ') :' NEWLINE block                      #WhileBlock
    | 'out(' expr ')'                                           #OutBlock
    | Return                                                    #ReturnBasic
    | Return expr                                               #ReturnValue
    | Break                                                     #Break
    | Continue                                                  #Continue
    ; 


expr: expr op =('/' | '*' | '%') expr                           #MulDivModExp
	| expr op =('+' | '-') expr                                 #AddSubExp
	| read_block                                                #ReadBlock 
    | '(' expr ')'                                              #Parenthesis
    | '!' expr                                                  #NotExp
	| value                                                     #ValTerminal
	| expr Asgn_op expr                                         #AssgnOp
	| expr cond_op = ('<'|'>'|'>='|'<='|'=='|'!=') expr         #CondOp
	| expr bool_op = ('&'|'|') expr                             #BoolOp
	| 'open' '(' ID ',' STRING ')'                              #OpenBlock
	| arrayIdentifier	                                        #ArrayId
	| True				                                        #True
	| False				                                        #False 
    | FUNC '(' args ')'                                         #FuncCall
	;

arrayIdentifier: ID ('[' expr ']')+;

read_block: Read                                                #Read
          | 'read('ID')'                                        #ReadFile
          ;

value: U_INT                                                    #ValUint
     | INT                                                      #ValInt
     | FLOAT                                                    #Float
     | ID                                                       #ID
     | STRING                                                   #String
     ;
// value: | 'EOF' # EOF

type: Type_bool                                                 #Type_bool 
    | Type_char                                                 #Type_char
    | Type_string                                               #Type_string
    | Type_file                                                 #Type_file
    | Type_int                                                  #Type_int
    | Type_uint                                                 #Type_uint
    | Type_void                                                 #Type_void
    | Type_float                                                #Type_float
	;
    
Type_uint : 'uint';
Type_int : 'int';
Type_float : 'float';
Type_char : 'char';
Type_string: 'string';
Type_void : 'void';
Type_bool : 'bool';
Type_file : 'file';

True : 'true';
False : 'false';
Continue: 'continue';
Break : 'break';
Return : 'return';
Read: 'read()';
Asgn_op: '=';
MAIN: 'main';
U_INT: [0-9]+;
INT: [+-]? [0-9]+;
FLOAT: [+-]? ([0-9]* [.])? [0-9]+;
ID: [a-z][a-zA-Z0-9]*;
STRING: '"' .*? '"';
FUNC: [A-Z][a-zA-Z0-9_]*;
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace

