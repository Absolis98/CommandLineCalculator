// Generated from Calculator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SIN=4, COS=5, TAN=6, ASIN=7, ACOS=8, ATAN=9, LN=10, 
		LOG=11, SQRT=12, GT=13, LT=14, EQ=15, ID=16, INT=17, NEWLINE=18, WS=19, 
		ADD=20, SUB=21, MUL=22, DIV=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "SIN", "COS", "TAN", "ASIN", "ACOS", "ATAN", 
			"LN", "LOG", "SQRT", "GT", "LT", "EQ", "ID", "INT", "NEWLINE", "WS", 
			"ADD", "SUB", "MUL", "DIV"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'sin'", "'cos'", "'tan'", "'asin'", "'acos'", 
			"'atan'", "'ln'", "'log'", "'sqrt'", "'>'", "'<'", "'=='", null, null, 
			null, null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "SIN", "COS", "TAN", "ASIN", "ACOS", "ATAN", 
			"LN", "LOG", "SQRT", "GT", "LT", "EQ", "ID", "INT", "NEWLINE", "WS", 
			"ADD", "SUB", "MUL", "DIV"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\6\21g\n\21\r\21\16\21h\3\22\6\22l\n\22\r\22\16\22m\3\23\5\23"+
		"q\n\23\3\23\3\23\3\24\6\24v\n\24\r\24\16\24w\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\3\2\5\4\2C\\c|\3\2\62;\4\2\f\f\"\"\2\u0086\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2"+
		"\2\7\65\3\2\2\2\t\67\3\2\2\2\13;\3\2\2\2\r?\3\2\2\2\17C\3\2\2\2\21H\3"+
		"\2\2\2\23M\3\2\2\2\25R\3\2\2\2\27U\3\2\2\2\31Y\3\2\2\2\33^\3\2\2\2\35"+
		"`\3\2\2\2\37b\3\2\2\2!f\3\2\2\2#k\3\2\2\2%p\3\2\2\2\'u\3\2\2\2){\3\2\2"+
		"\2+}\3\2\2\2-\177\3\2\2\2/\u0081\3\2\2\2\61\62\7?\2\2\62\4\3\2\2\2\63"+
		"\64\7*\2\2\64\6\3\2\2\2\65\66\7+\2\2\66\b\3\2\2\2\678\7u\2\289\7k\2\2"+
		"9:\7p\2\2:\n\3\2\2\2;<\7e\2\2<=\7q\2\2=>\7u\2\2>\f\3\2\2\2?@\7v\2\2@A"+
		"\7c\2\2AB\7p\2\2B\16\3\2\2\2CD\7c\2\2DE\7u\2\2EF\7k\2\2FG\7p\2\2G\20\3"+
		"\2\2\2HI\7c\2\2IJ\7e\2\2JK\7q\2\2KL\7u\2\2L\22\3\2\2\2MN\7c\2\2NO\7v\2"+
		"\2OP\7c\2\2PQ\7p\2\2Q\24\3\2\2\2RS\7n\2\2ST\7p\2\2T\26\3\2\2\2UV\7n\2"+
		"\2VW\7q\2\2WX\7i\2\2X\30\3\2\2\2YZ\7u\2\2Z[\7s\2\2[\\\7t\2\2\\]\7v\2\2"+
		"]\32\3\2\2\2^_\7@\2\2_\34\3\2\2\2`a\7>\2\2a\36\3\2\2\2bc\7?\2\2cd\7?\2"+
		"\2d \3\2\2\2eg\t\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\"\3\2"+
		"\2\2jl\t\3\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n$\3\2\2\2oq\7\17"+
		"\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\f\2\2s&\3\2\2\2tv\t\4\2\2ut\3\2"+
		"\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\24\2\2z(\3\2\2\2{|\7"+
		"-\2\2|*\3\2\2\2}~\7/\2\2~,\3\2\2\2\177\u0080\7,\2\2\u0080.\3\2\2\2\u0081"+
		"\u0082\7\61\2\2\u0082\60\3\2\2\2\7\2hmpw\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}