parser grammar ReceiptLineParser;

options { tokenVocab=ReceiptLineLexer; }

file 
	: BYTE_ORDER_MARK? document EOF
	;

document 
	: lines
	;

lines
	: (line NEWLINE)* line?
	;

line
	: WS? columns WS?
	;

columns
	: content
	| content PIPE
	| PIPE content
	| PIPE content PIPE
	;

content
	: column
	| column PIPE content
	;

column
	: WS? text WS?
	| WS? property WS?
	;

text
	: CHARS
	;

property
	: LEFTBRACE members RIGHTBRACE
	;

members
	: WS? MEMBER WS? (SEMICOLON members)*
	;
