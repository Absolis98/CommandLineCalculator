grammar Calculator;
program : statement+ ;
statement : expression NEWLINE						# printExpr
| ID '=' expression NEWLINE							# assign
| NEWLINE											# blank
;
expression : 
  	expression op=(ADD|SUB) expression			# AddSub
| expression op=(MUL|DIV) expression				# MulDiv
| op=(SIN|COS|TAN|ASIN|ACOS|ATAN) '(' expression ')'		# Trig
| op=(LN|LOG) '(' expression ')'					# Log
| op=SQRT '(' expression ')'						# Sqrt
| expression op=(GT|LT|EQ) expression				# Logic
| INT												# int
| ID												# id
| '(' expression ')'								# parens
;
SIN : 'sin';
COS : 'cos';
TAN : 'tan';
ASIN : 'asin';
ACOS : 'acos';
ATAN : 'atan';
LN : 'ln';
LOG : 'log';
SQRT : 'sqrt';
GT : '>';
LT : '<';
EQ : '==';
ID : [a-zA-Z]+ ; // match identifiers
INT : [0-9]+ ;
NEWLINE : '\r'?'\n' ; // return newlines to parser
WS : [ \n]+ -> skip ; // toss out whitespace
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';

