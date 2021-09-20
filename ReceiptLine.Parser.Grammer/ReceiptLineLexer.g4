lexer grammar ReceiptLineLexer;

BYTE_ORDER_MARK: '\u00EF\u00BB\u00BF';

NEWLINE 
	: '\u000d\u000a' 
	| '\u000d' 
	| '\u000a'
	;

WS
	: '\u0009' WS?
	| '\u0020' WS?
	;

HEX
	: [0-9]
	| [A-F] 
	| [a-f]
	;

PIPE
	: '|'
	;

LEFTBRACE
	: '{'
	;

RIGHTBRACE
	: '}'
	;

SEMICOLON
	: ';'
	;

COLON
	: ':'
	;

MEMBER
	: WS
	| WS? KEY WS? COLON WS? VALUE WS?
	;

CHARS
	: CHAR+
	;

CUTPAPER
	: WS? EQUAL+ WS?
	;

HORIZONTALRULE
	: WS? MINUS+ WS?
	;

fragment MINUS
	: '-'
	;

fragment EQUAL
	: '='
	;

fragment KEY
	: WORD
	| WORD ALPHANUMERIC
	;

fragment ESCAPE
	: ~( '\u0000'..'\u0020' | 'x' )
	| 'x' HEX HEX
	;

fragment VALUE
	: CHARS
	;

fragment ALPHANUMERIC
	: [0-9]
	| WORD
	;

fragment WORD
	: [A-Z]
	| [a-z]
	| '_'
	;

fragment CHAR
	: ~( '\u0000'..'\u0020' | '\\' )
	| '\\' ESCAPE
	| WS
	;
