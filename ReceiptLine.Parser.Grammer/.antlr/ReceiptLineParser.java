// Generated from c:\Users\nickv\source\repos\ReceiptLineParser\ReceiptLine.Parser.Grammer\ReceiptLineParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReceiptLineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYTE_ORDER_MARK=1, NEWLINE=2, WS=3, CHAR=4, ESCAPE=5, HEX=6, PIPE=7, LEFTBRACE=8, 
		RIGHTBRACE=9, SEMICOLON=10, COLON=11, ALPHANUMERIC=12, WORD=13;
	public static final int
		RULE_file = 0, RULE_document = 1, RULE_lines = 2, RULE_line = 3, RULE_columns = 4, 
		RULE_content = 5, RULE_column = 6, RULE_text = 7, RULE_property = 8, RULE_members = 9, 
		RULE_member = 10, RULE_key = 11, RULE_value = 12, RULE_chars = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "document", "lines", "line", "columns", "content", "column", 
			"text", "property", "members", "member", "key", "value", "chars"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u00EF\u00BB\u00BF'", null, null, null, null, null, "'|'", "'{'", 
			"'}'", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BYTE_ORDER_MARK", "NEWLINE", "WS", "CHAR", "ESCAPE", "HEX", "PIPE", 
			"LEFTBRACE", "RIGHTBRACE", "SEMICOLON", "COLON", "ALPHANUMERIC", "WORD"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ReceiptLineParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReceiptLineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ReceiptLineParser.EOF, 0); }
		public TerminalNode BYTE_ORDER_MARK() { return getToken(ReceiptLineParser.BYTE_ORDER_MARK, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BYTE_ORDER_MARK) {
				{
				setState(28);
				match(BYTE_ORDER_MARK);
				}
			}

			setState(31);
			document();
			setState(32);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocumentContext extends ParserRuleContext {
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			lines();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinesContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lines);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				line();
				setState(38);
				lines();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ReceiptLineParser.NEWLINE, 0); }
		public List<TerminalNode> WS() { return getTokens(ReceiptLineParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ReceiptLineParser.WS, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(42);
				match(WS);
				}
				break;
			}
			setState(45);
			columns();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(46);
				match(WS);
				}
			}

			setState(49);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnsContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public List<TerminalNode> PIPE() { return getTokens(ReceiptLineParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(ReceiptLineParser.PIPE, i);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_columns);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				content();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				content();
				setState(53);
				match(PIPE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(PIPE);
				setState(56);
				content();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				match(PIPE);
				setState(58);
				content();
				setState(59);
				match(PIPE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(ReceiptLineParser.PIPE, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_content);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				column();
				setState(65);
				match(PIPE);
				setState(66);
				content();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ReceiptLineParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ReceiptLineParser.WS, i);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_column);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(70);
					match(WS);
					}
					break;
				}
				setState(73);
				text();
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(74);
					match(WS);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(77);
					match(WS);
					}
				}

				setState(80);
				property();
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(81);
					match(WS);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public CharsContext chars() {
			return getRuleContext(CharsContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			chars();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode LEFTBRACE() { return getToken(ReceiptLineParser.LEFTBRACE, 0); }
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public TerminalNode RIGHTBRACE() { return getToken(ReceiptLineParser.RIGHTBRACE, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(LEFTBRACE);
			setState(89);
			members();
			setState(90);
			match(RIGHTBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MembersContext extends ParserRuleContext {
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ReceiptLineParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ReceiptLineParser.WS, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ReceiptLineParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ReceiptLineParser.SEMICOLON, i);
		}
		public List<MembersContext> members() {
			return getRuleContexts(MembersContext.class);
		}
		public MembersContext members(int i) {
			return getRuleContext(MembersContext.class,i);
		}
		public MembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_members; }
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_members);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(92);
				match(WS);
				}
				break;
			}
			setState(95);
			member();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(96);
				match(WS);
				}
			}

			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					match(SEMICOLON);
					setState(100);
					members();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(ReceiptLineParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ReceiptLineParser.WS, i);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ReceiptLineParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_member);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(WS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(107);
					match(WS);
					}
				}

				setState(110);
				key();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(111);
					match(WS);
					}
				}

				setState(114);
				match(COLON);
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(115);
					match(WS);
					}
					break;
				}
				setState(118);
				value();
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(119);
					match(WS);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ReceiptLineParser.WORD, 0); }
		public TerminalNode ALPHANUMERIC() { return getToken(ReceiptLineParser.ALPHANUMERIC, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_key);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(WORD);
				setState(126);
				match(ALPHANUMERIC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public CharsContext chars() {
			return getRuleContext(CharsContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			chars();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharsContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(ReceiptLineParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(ReceiptLineParser.CHAR, i);
		}
		public CharsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chars; }
	}

	public final CharsContext chars() throws RecognitionException {
		CharsContext _localctx = new CharsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_chars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAR) {
				{
				{
				setState(131);
				match(CHAR);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\u008c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\5\4+\n\4\3\5\5\5.\n\5\3\5\3\5\5\5\62\n\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\5\7G\n\7\3\b\5\bJ\n\b\3\b\3\b\5\bN\n\b\3\b\5\bQ\n\b\3\b\3\b\5\bU\n\b"+
		"\5\bW\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\5\13`\n\13\3\13\3\13\5\13d\n\13"+
		"\3\13\3\13\7\13h\n\13\f\13\16\13k\13\13\3\f\3\f\5\fo\n\f\3\f\3\f\5\fs"+
		"\n\f\3\f\3\f\5\fw\n\f\3\f\3\f\5\f{\n\f\5\f}\n\f\3\r\3\r\3\r\5\r\u0082"+
		"\n\r\3\16\3\16\3\17\7\17\u0087\n\17\f\17\16\17\u008a\13\17\3\17\2\2\20"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u0094\2\37\3\2\2\2\4$\3\2\2"+
		"\2\6*\3\2\2\2\b-\3\2\2\2\n?\3\2\2\2\fF\3\2\2\2\16V\3\2\2\2\20X\3\2\2\2"+
		"\22Z\3\2\2\2\24_\3\2\2\2\26|\3\2\2\2\30\u0081\3\2\2\2\32\u0083\3\2\2\2"+
		"\34\u0088\3\2\2\2\36 \7\3\2\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\5"+
		"\4\3\2\"#\7\2\2\3#\3\3\2\2\2$%\5\6\4\2%\5\3\2\2\2&+\5\b\5\2\'(\5\b\5\2"+
		"()\5\6\4\2)+\3\2\2\2*&\3\2\2\2*\'\3\2\2\2+\7\3\2\2\2,.\7\5\2\2-,\3\2\2"+
		"\2-.\3\2\2\2./\3\2\2\2/\61\5\n\6\2\60\62\7\5\2\2\61\60\3\2\2\2\61\62\3"+
		"\2\2\2\62\63\3\2\2\2\63\64\7\4\2\2\64\t\3\2\2\2\65@\5\f\7\2\66\67\5\f"+
		"\7\2\678\7\t\2\28@\3\2\2\29:\7\t\2\2:@\5\f\7\2;<\7\t\2\2<=\5\f\7\2=>\7"+
		"\t\2\2>@\3\2\2\2?\65\3\2\2\2?\66\3\2\2\2?9\3\2\2\2?;\3\2\2\2@\13\3\2\2"+
		"\2AG\5\16\b\2BC\5\16\b\2CD\7\t\2\2DE\5\f\7\2EG\3\2\2\2FA\3\2\2\2FB\3\2"+
		"\2\2G\r\3\2\2\2HJ\7\5\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KM\5\20\t\2LN\7"+
		"\5\2\2ML\3\2\2\2MN\3\2\2\2NW\3\2\2\2OQ\7\5\2\2PO\3\2\2\2PQ\3\2\2\2QR\3"+
		"\2\2\2RT\5\22\n\2SU\7\5\2\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VI\3\2\2\2VP"+
		"\3\2\2\2W\17\3\2\2\2XY\5\34\17\2Y\21\3\2\2\2Z[\7\n\2\2[\\\5\24\13\2\\"+
		"]\7\13\2\2]\23\3\2\2\2^`\7\5\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\5\26"+
		"\f\2bd\7\5\2\2cb\3\2\2\2cd\3\2\2\2di\3\2\2\2ef\7\f\2\2fh\5\24\13\2ge\3"+
		"\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\25\3\2\2\2ki\3\2\2\2l}\7\5\2\2m"+
		"o\7\5\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pr\5\30\r\2qs\7\5\2\2rq\3\2\2\2"+
		"rs\3\2\2\2st\3\2\2\2tv\7\r\2\2uw\7\5\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2"+
		"xz\5\32\16\2y{\7\5\2\2zy\3\2\2\2z{\3\2\2\2{}\3\2\2\2|l\3\2\2\2|n\3\2\2"+
		"\2}\27\3\2\2\2~\u0082\7\17\2\2\177\u0080\7\17\2\2\u0080\u0082\7\16\2\2"+
		"\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0082\31\3\2\2\2\u0083\u0084\5\34\17"+
		"\2\u0084\33\3\2\2\2\u0085\u0087\7\6\2\2\u0086\u0085\3\2\2\2\u0087\u008a"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\35\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\27\37*-\61?FIMPTV_cinrvz|\u0081\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}