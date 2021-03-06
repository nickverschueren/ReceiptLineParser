//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from C:\Users\nickv\source\repos\ReceiptLineParser\ReceiptLine.Parser.Grammer\ReceiptLineLexer.g4 by ANTLR 4.9.2

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

namespace ReceiptLine.Parser {
using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.2")]
[System.CLSCompliant(false)]
public partial class ReceiptLineLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		BYTE_ORDER_MARK=1, NEWLINE=2, WS=3, HEX=4, PIPE=5, LEFTBRACE=6, RIGHTBRACE=7, 
		SEMICOLON=8, COLON=9, MEMBER=10, CHARS=11, CUTPAPER=12, HORIZONTALRULE=13;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"BYTE_ORDER_MARK", "NEWLINE", "WS", "HEX", "PIPE", "LEFTBRACE", "RIGHTBRACE", 
		"SEMICOLON", "COLON", "MEMBER", "CHARS", "CUTPAPER", "HORIZONTALRULE", 
		"MINUS", "EQUAL", "KEY", "ESCAPE", "VALUE", "ALPHANUMERIC", "WORD", "CHAR"
	};


	public ReceiptLineLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public ReceiptLineLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'\u00EF\u00BB\u00BF'", null, null, null, "'|'", "'{'", "'}'", "';'", 
		"':'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "BYTE_ORDER_MARK", "NEWLINE", "WS", "HEX", "PIPE", "LEFTBRACE", 
		"RIGHTBRACE", "SEMICOLON", "COLON", "MEMBER", "CHARS", "CUTPAPER", "HORIZONTALRULE"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "ReceiptLineLexer.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static ReceiptLineLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '\xF', '\x9A', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x3', '\x2', '\x3', '\x2', '\x3', '\x2', '\x3', 
		'\x2', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x5', '\x3', '\x35', 
		'\n', '\x3', '\x3', '\x4', '\x3', '\x4', '\x5', '\x4', '\x39', '\n', '\x4', 
		'\x3', '\x4', '\x3', '\x4', '\x5', '\x4', '=', '\n', '\x4', '\x5', '\x4', 
		'?', '\n', '\x4', '\x3', '\x5', '\x5', '\x5', '\x42', '\n', '\x5', '\x3', 
		'\x6', '\x3', '\x6', '\x3', '\a', '\x3', '\a', '\x3', '\b', '\x3', '\b', 
		'\x3', '\t', '\x3', '\t', '\x3', '\n', '\x3', '\n', '\x3', '\v', '\x3', 
		'\v', '\x5', '\v', 'P', '\n', '\v', '\x3', '\v', '\x3', '\v', '\x5', '\v', 
		'T', '\n', '\v', '\x3', '\v', '\x3', '\v', '\x5', '\v', 'X', '\n', '\v', 
		'\x3', '\v', '\x3', '\v', '\x5', '\v', '\\', '\n', '\v', '\x5', '\v', 
		'^', '\n', '\v', '\x3', '\f', '\x6', '\f', '\x61', '\n', '\f', '\r', '\f', 
		'\xE', '\f', '\x62', '\x3', '\r', '\x5', '\r', '\x66', '\n', '\r', '\x3', 
		'\r', '\x6', '\r', 'i', '\n', '\r', '\r', '\r', '\xE', '\r', 'j', '\x3', 
		'\r', '\x5', '\r', 'n', '\n', '\r', '\x3', '\xE', '\x5', '\xE', 'q', '\n', 
		'\xE', '\x3', '\xE', '\x6', '\xE', 't', '\n', '\xE', '\r', '\xE', '\xE', 
		'\xE', 'u', '\x3', '\xE', '\x5', '\xE', 'y', '\n', '\xE', '\x3', '\xF', 
		'\x3', '\xF', '\x3', '\x10', '\x3', '\x10', '\x3', '\x11', '\x3', '\x11', 
		'\x3', '\x11', '\x3', '\x11', '\x5', '\x11', '\x83', '\n', '\x11', '\x3', 
		'\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x5', 
		'\x12', '\x8A', '\n', '\x12', '\x3', '\x13', '\x3', '\x13', '\x3', '\x14', 
		'\x3', '\x14', '\x5', '\x14', '\x90', '\n', '\x14', '\x3', '\x15', '\x5', 
		'\x15', '\x93', '\n', '\x15', '\x3', '\x16', '\x3', '\x16', '\x3', '\x16', 
		'\x3', '\x16', '\x5', '\x16', '\x99', '\n', '\x16', '\x2', '\x2', '\x17', 
		'\x3', '\x3', '\x5', '\x4', '\a', '\x5', '\t', '\x6', '\v', '\a', '\r', 
		'\b', '\xF', '\t', '\x11', '\n', '\x13', '\v', '\x15', '\f', '\x17', '\r', 
		'\x19', '\xE', '\x1B', '\xF', '\x1D', '\x2', '\x1F', '\x2', '!', '\x2', 
		'#', '\x2', '%', '\x2', '\'', '\x2', ')', '\x2', '+', '\x2', '\x3', '\x2', 
		'\b', '\x4', '\x2', '\f', '\f', '\xF', '\xF', '\x5', '\x2', '\x32', ';', 
		'\x43', 'H', '\x63', 'h', '\x4', '\x2', '\x2', '\"', 'z', 'z', '\x3', 
		'\x2', '\x32', ';', '\x5', '\x2', '\x43', '\\', '\x61', '\x61', '\x63', 
		'|', '\x4', '\x2', '\x2', '\"', '^', '^', '\x2', '\xA6', '\x2', '\x3', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x5', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\a', '\x3', '\x2', '\x2', '\x2', '\x2', '\t', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\v', '\x3', '\x2', '\x2', '\x2', '\x2', '\r', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\xF', '\x3', '\x2', '\x2', '\x2', '\x2', '\x11', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x13', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x15', '\x3', '\x2', '\x2', '\x2', '\x2', '\x17', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x19', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1B', 
		'\x3', '\x2', '\x2', '\x2', '\x3', '-', '\x3', '\x2', '\x2', '\x2', '\x5', 
		'\x34', '\x3', '\x2', '\x2', '\x2', '\a', '>', '\x3', '\x2', '\x2', '\x2', 
		'\t', '\x41', '\x3', '\x2', '\x2', '\x2', '\v', '\x43', '\x3', '\x2', 
		'\x2', '\x2', '\r', '\x45', '\x3', '\x2', '\x2', '\x2', '\xF', 'G', '\x3', 
		'\x2', '\x2', '\x2', '\x11', 'I', '\x3', '\x2', '\x2', '\x2', '\x13', 
		'K', '\x3', '\x2', '\x2', '\x2', '\x15', ']', '\x3', '\x2', '\x2', '\x2', 
		'\x17', '`', '\x3', '\x2', '\x2', '\x2', '\x19', '\x65', '\x3', '\x2', 
		'\x2', '\x2', '\x1B', 'p', '\x3', '\x2', '\x2', '\x2', '\x1D', 'z', '\x3', 
		'\x2', '\x2', '\x2', '\x1F', '|', '\x3', '\x2', '\x2', '\x2', '!', '\x82', 
		'\x3', '\x2', '\x2', '\x2', '#', '\x89', '\x3', '\x2', '\x2', '\x2', '%', 
		'\x8B', '\x3', '\x2', '\x2', '\x2', '\'', '\x8F', '\x3', '\x2', '\x2', 
		'\x2', ')', '\x92', '\x3', '\x2', '\x2', '\x2', '+', '\x98', '\x3', '\x2', 
		'\x2', '\x2', '-', '.', '\a', '\xF1', '\x2', '\x2', '.', '/', '\a', '\xBD', 
		'\x2', '\x2', '/', '\x30', '\a', '\xC1', '\x2', '\x2', '\x30', '\x4', 
		'\x3', '\x2', '\x2', '\x2', '\x31', '\x32', '\a', '\xF', '\x2', '\x2', 
		'\x32', '\x35', '\a', '\f', '\x2', '\x2', '\x33', '\x35', '\t', '\x2', 
		'\x2', '\x2', '\x34', '\x31', '\x3', '\x2', '\x2', '\x2', '\x34', '\x33', 
		'\x3', '\x2', '\x2', '\x2', '\x35', '\x6', '\x3', '\x2', '\x2', '\x2', 
		'\x36', '\x38', '\a', '\v', '\x2', '\x2', '\x37', '\x39', '\x5', '\a', 
		'\x4', '\x2', '\x38', '\x37', '\x3', '\x2', '\x2', '\x2', '\x38', '\x39', 
		'\x3', '\x2', '\x2', '\x2', '\x39', '?', '\x3', '\x2', '\x2', '\x2', ':', 
		'<', '\a', '\"', '\x2', '\x2', ';', '=', '\x5', '\a', '\x4', '\x2', '<', 
		';', '\x3', '\x2', '\x2', '\x2', '<', '=', '\x3', '\x2', '\x2', '\x2', 
		'=', '?', '\x3', '\x2', '\x2', '\x2', '>', '\x36', '\x3', '\x2', '\x2', 
		'\x2', '>', ':', '\x3', '\x2', '\x2', '\x2', '?', '\b', '\x3', '\x2', 
		'\x2', '\x2', '@', '\x42', '\t', '\x3', '\x2', '\x2', '\x41', '@', '\x3', 
		'\x2', '\x2', '\x2', '\x42', '\n', '\x3', '\x2', '\x2', '\x2', '\x43', 
		'\x44', '\a', '~', '\x2', '\x2', '\x44', '\f', '\x3', '\x2', '\x2', '\x2', 
		'\x45', '\x46', '\a', '}', '\x2', '\x2', '\x46', '\xE', '\x3', '\x2', 
		'\x2', '\x2', 'G', 'H', '\a', '\x7F', '\x2', '\x2', 'H', '\x10', '\x3', 
		'\x2', '\x2', '\x2', 'I', 'J', '\a', '=', '\x2', '\x2', 'J', '\x12', '\x3', 
		'\x2', '\x2', '\x2', 'K', 'L', '\a', '<', '\x2', '\x2', 'L', '\x14', '\x3', 
		'\x2', '\x2', '\x2', 'M', '^', '\x5', '\a', '\x4', '\x2', 'N', 'P', '\x5', 
		'\a', '\x4', '\x2', 'O', 'N', '\x3', '\x2', '\x2', '\x2', 'O', 'P', '\x3', 
		'\x2', '\x2', '\x2', 'P', 'Q', '\x3', '\x2', '\x2', '\x2', 'Q', 'S', '\x5', 
		'!', '\x11', '\x2', 'R', 'T', '\x5', '\a', '\x4', '\x2', 'S', 'R', '\x3', 
		'\x2', '\x2', '\x2', 'S', 'T', '\x3', '\x2', '\x2', '\x2', 'T', 'U', '\x3', 
		'\x2', '\x2', '\x2', 'U', 'W', '\x5', '\x13', '\n', '\x2', 'V', 'X', '\x5', 
		'\a', '\x4', '\x2', 'W', 'V', '\x3', '\x2', '\x2', '\x2', 'W', 'X', '\x3', 
		'\x2', '\x2', '\x2', 'X', 'Y', '\x3', '\x2', '\x2', '\x2', 'Y', '[', '\x5', 
		'%', '\x13', '\x2', 'Z', '\\', '\x5', '\a', '\x4', '\x2', '[', 'Z', '\x3', 
		'\x2', '\x2', '\x2', '[', '\\', '\x3', '\x2', '\x2', '\x2', '\\', '^', 
		'\x3', '\x2', '\x2', '\x2', ']', 'M', '\x3', '\x2', '\x2', '\x2', ']', 
		'O', '\x3', '\x2', '\x2', '\x2', '^', '\x16', '\x3', '\x2', '\x2', '\x2', 
		'_', '\x61', '\x5', '+', '\x16', '\x2', '`', '_', '\x3', '\x2', '\x2', 
		'\x2', '\x61', '\x62', '\x3', '\x2', '\x2', '\x2', '\x62', '`', '\x3', 
		'\x2', '\x2', '\x2', '\x62', '\x63', '\x3', '\x2', '\x2', '\x2', '\x63', 
		'\x18', '\x3', '\x2', '\x2', '\x2', '\x64', '\x66', '\x5', '\a', '\x4', 
		'\x2', '\x65', '\x64', '\x3', '\x2', '\x2', '\x2', '\x65', '\x66', '\x3', 
		'\x2', '\x2', '\x2', '\x66', 'h', '\x3', '\x2', '\x2', '\x2', 'g', 'i', 
		'\x5', '\x1F', '\x10', '\x2', 'h', 'g', '\x3', '\x2', '\x2', '\x2', 'i', 
		'j', '\x3', '\x2', '\x2', '\x2', 'j', 'h', '\x3', '\x2', '\x2', '\x2', 
		'j', 'k', '\x3', '\x2', '\x2', '\x2', 'k', 'm', '\x3', '\x2', '\x2', '\x2', 
		'l', 'n', '\x5', '\a', '\x4', '\x2', 'm', 'l', '\x3', '\x2', '\x2', '\x2', 
		'm', 'n', '\x3', '\x2', '\x2', '\x2', 'n', '\x1A', '\x3', '\x2', '\x2', 
		'\x2', 'o', 'q', '\x5', '\a', '\x4', '\x2', 'p', 'o', '\x3', '\x2', '\x2', 
		'\x2', 'p', 'q', '\x3', '\x2', '\x2', '\x2', 'q', 's', '\x3', '\x2', '\x2', 
		'\x2', 'r', 't', '\x5', '\x1D', '\xF', '\x2', 's', 'r', '\x3', '\x2', 
		'\x2', '\x2', 't', 'u', '\x3', '\x2', '\x2', '\x2', 'u', 's', '\x3', '\x2', 
		'\x2', '\x2', 'u', 'v', '\x3', '\x2', '\x2', '\x2', 'v', 'x', '\x3', '\x2', 
		'\x2', '\x2', 'w', 'y', '\x5', '\a', '\x4', '\x2', 'x', 'w', '\x3', '\x2', 
		'\x2', '\x2', 'x', 'y', '\x3', '\x2', '\x2', '\x2', 'y', '\x1C', '\x3', 
		'\x2', '\x2', '\x2', 'z', '{', '\a', '/', '\x2', '\x2', '{', '\x1E', '\x3', 
		'\x2', '\x2', '\x2', '|', '}', '\a', '?', '\x2', '\x2', '}', ' ', '\x3', 
		'\x2', '\x2', '\x2', '~', '\x83', '\x5', ')', '\x15', '\x2', '\x7F', '\x80', 
		'\x5', ')', '\x15', '\x2', '\x80', '\x81', '\x5', '\'', '\x14', '\x2', 
		'\x81', '\x83', '\x3', '\x2', '\x2', '\x2', '\x82', '~', '\x3', '\x2', 
		'\x2', '\x2', '\x82', '\x7F', '\x3', '\x2', '\x2', '\x2', '\x83', '\"', 
		'\x3', '\x2', '\x2', '\x2', '\x84', '\x8A', '\n', '\x4', '\x2', '\x2', 
		'\x85', '\x86', '\a', 'z', '\x2', '\x2', '\x86', '\x87', '\x5', '\t', 
		'\x5', '\x2', '\x87', '\x88', '\x5', '\t', '\x5', '\x2', '\x88', '\x8A', 
		'\x3', '\x2', '\x2', '\x2', '\x89', '\x84', '\x3', '\x2', '\x2', '\x2', 
		'\x89', '\x85', '\x3', '\x2', '\x2', '\x2', '\x8A', '$', '\x3', '\x2', 
		'\x2', '\x2', '\x8B', '\x8C', '\x5', '\x17', '\f', '\x2', '\x8C', '&', 
		'\x3', '\x2', '\x2', '\x2', '\x8D', '\x90', '\t', '\x5', '\x2', '\x2', 
		'\x8E', '\x90', '\x5', ')', '\x15', '\x2', '\x8F', '\x8D', '\x3', '\x2', 
		'\x2', '\x2', '\x8F', '\x8E', '\x3', '\x2', '\x2', '\x2', '\x90', '(', 
		'\x3', '\x2', '\x2', '\x2', '\x91', '\x93', '\t', '\x6', '\x2', '\x2', 
		'\x92', '\x91', '\x3', '\x2', '\x2', '\x2', '\x93', '*', '\x3', '\x2', 
		'\x2', '\x2', '\x94', '\x99', '\n', '\a', '\x2', '\x2', '\x95', '\x96', 
		'\a', '^', '\x2', '\x2', '\x96', '\x99', '\x5', '#', '\x12', '\x2', '\x97', 
		'\x99', '\x5', '\a', '\x4', '\x2', '\x98', '\x94', '\x3', '\x2', '\x2', 
		'\x2', '\x98', '\x95', '\x3', '\x2', '\x2', '\x2', '\x98', '\x97', '\x3', 
		'\x2', '\x2', '\x2', '\x99', ',', '\x3', '\x2', '\x2', '\x2', '\x19', 
		'\x2', '\x34', '\x38', '<', '>', '\x41', 'O', 'S', 'W', '[', ']', '\x62', 
		'\x65', 'j', 'm', 'p', 'u', 'x', '\x82', '\x89', '\x8F', '\x92', '\x98', 
		'\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
} // namespace ReceiptLine.Parser
