// Generated from /home/ksvsc/IIITH/Monsoon20/Compilers/minic-grammar-KSVSC/antlr/Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, Type_uint=34, Type_int=35, Type_float=36, Type_char=37, 
		Type_void=38, Type_bool=39, Type_file=40, True=41, False=42, Continue=43, 
		Break=44, Return=45, Read=46, Asgn_op=47, MAIN=48, U_INT=49, INT=50, FLOAT=51, 
		ID=52, STRING=53, FUNC=54, NEWLINE=55, WS=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"Type_uint", "Type_int", "Type_float", "Type_char", "Type_void", "Type_bool", 
			"Type_file", "True", "False", "Continue", "Break", "Return", "Read", 
			"Asgn_op", "MAIN", "U_INT", "INT", "FLOAT", "ID", "STRING", "FUNC", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program {'", "'}'", "'['", "']'", "'('", "')'", "'{'", "'?'", 
			"':'", "'if'", "') :'", "'else :'", "'for'", "';'", "'while'", "'out('", 
			"'/'", "'*'", "'%'", "'+'", "'-'", "'!'", "'<'", "'>'", "'>='", "'<='", 
			"'=='", "'!='", "'&'", "'|'", "'open'", "','", "'read('", "'uint'", "'int'", 
			"'float'", "'char'", "'void'", "'bool'", "'file'", "'true'", "'false'", 
			"'continue'", "'break'", "'return'", "'read()'", "'='", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "Type_uint", 
			"Type_int", "Type_float", "Type_char", "Type_void", "Type_bool", "Type_file", 
			"True", "False", "Continue", "Break", "Return", "Read", "Asgn_op", "MAIN", 
			"U_INT", "INT", "FLOAT", "ID", "STRING", "FUNC", "NEWLINE", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u016c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3."+
		"\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\6\62\u012d\n\62\r\62\16\62\u012e\3\63\5\63\u0132\n\63\3\63\6\63\u0135"+
		"\n\63\r\63\16\63\u0136\3\64\5\64\u013a\n\64\3\64\7\64\u013d\n\64\f\64"+
		"\16\64\u0140\13\64\3\64\5\64\u0143\n\64\3\64\6\64\u0146\n\64\r\64\16\64"+
		"\u0147\3\65\3\65\7\65\u014c\n\65\f\65\16\65\u014f\13\65\3\66\3\66\7\66"+
		"\u0153\n\66\f\66\16\66\u0156\13\66\3\66\3\66\3\67\3\67\7\67\u015c\n\67"+
		"\f\67\16\67\u015f\13\67\38\58\u0162\n8\38\38\39\69\u0167\n9\r9\169\u0168"+
		"\39\39\3\u0154\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:\3\2\n\3\2\62;\4\2--//\3\2\60\60\3\2c|\5\2\62;C\\c|"+
		"\3\2C\\\6\2\62;C\\aac|\4\2\13\13\"\"\2\u0177\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3"+
		"s\3\2\2\2\5}\3\2\2\2\7\177\3\2\2\2\t\u0081\3\2\2\2\13\u0083\3\2\2\2\r"+
		"\u0085\3\2\2\2\17\u0087\3\2\2\2\21\u0089\3\2\2\2\23\u008b\3\2\2\2\25\u008d"+
		"\3\2\2\2\27\u0090\3\2\2\2\31\u0094\3\2\2\2\33\u009b\3\2\2\2\35\u009f\3"+
		"\2\2\2\37\u00a1\3\2\2\2!\u00a7\3\2\2\2#\u00ac\3\2\2\2%\u00ae\3\2\2\2\'"+
		"\u00b0\3\2\2\2)\u00b2\3\2\2\2+\u00b4\3\2\2\2-\u00b6\3\2\2\2/\u00b8\3\2"+
		"\2\2\61\u00ba\3\2\2\2\63\u00bc\3\2\2\2\65\u00bf\3\2\2\2\67\u00c2\3\2\2"+
		"\29\u00c5\3\2\2\2;\u00c8\3\2\2\2=\u00ca\3\2\2\2?\u00cc\3\2\2\2A\u00d1"+
		"\3\2\2\2C\u00d3\3\2\2\2E\u00d9\3\2\2\2G\u00de\3\2\2\2I\u00e2\3\2\2\2K"+
		"\u00e8\3\2\2\2M\u00ed\3\2\2\2O\u00f2\3\2\2\2Q\u00f7\3\2\2\2S\u00fc\3\2"+
		"\2\2U\u0101\3\2\2\2W\u0107\3\2\2\2Y\u0110\3\2\2\2[\u0116\3\2\2\2]\u011d"+
		"\3\2\2\2_\u0124\3\2\2\2a\u0126\3\2\2\2c\u012c\3\2\2\2e\u0131\3\2\2\2g"+
		"\u0139\3\2\2\2i\u0149\3\2\2\2k\u0150\3\2\2\2m\u0159\3\2\2\2o\u0161\3\2"+
		"\2\2q\u0166\3\2\2\2st\7r\2\2tu\7t\2\2uv\7q\2\2vw\7i\2\2wx\7t\2\2xy\7c"+
		"\2\2yz\7o\2\2z{\7\"\2\2{|\7}\2\2|\4\3\2\2\2}~\7\177\2\2~\6\3\2\2\2\177"+
		"\u0080\7]\2\2\u0080\b\3\2\2\2\u0081\u0082\7_\2\2\u0082\n\3\2\2\2\u0083"+
		"\u0084\7*\2\2\u0084\f\3\2\2\2\u0085\u0086\7+\2\2\u0086\16\3\2\2\2\u0087"+
		"\u0088\7}\2\2\u0088\20\3\2\2\2\u0089\u008a\7A\2\2\u008a\22\3\2\2\2\u008b"+
		"\u008c\7<\2\2\u008c\24\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7h\2\2\u008f"+
		"\26\3\2\2\2\u0090\u0091\7+\2\2\u0091\u0092\7\"\2\2\u0092\u0093\7<\2\2"+
		"\u0093\30\3\2\2\2\u0094\u0095\7g\2\2\u0095\u0096\7n\2\2\u0096\u0097\7"+
		"u\2\2\u0097\u0098\7g\2\2\u0098\u0099\7\"\2\2\u0099\u009a\7<\2\2\u009a"+
		"\32\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7q\2\2\u009d\u009e\7t\2\2\u009e"+
		"\34\3\2\2\2\u009f\u00a0\7=\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7y\2\2\u00a2"+
		"\u00a3\7j\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7g\2\2"+
		"\u00a6 \3\2\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7v\2"+
		"\2\u00aa\u00ab\7*\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad$\3\2"+
		"\2\2\u00ae\u00af\7,\2\2\u00af&\3\2\2\2\u00b0\u00b1\7\'\2\2\u00b1(\3\2"+
		"\2\2\u00b2\u00b3\7-\2\2\u00b3*\3\2\2\2\u00b4\u00b5\7/\2\2\u00b5,\3\2\2"+
		"\2\u00b6\u00b7\7#\2\2\u00b7.\3\2\2\2\u00b8\u00b9\7>\2\2\u00b9\60\3\2\2"+
		"\2\u00ba\u00bb\7@\2\2\u00bb\62\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd\u00be"+
		"\7?\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7>\2\2\u00c0\u00c1\7?\2\2\u00c1\66"+
		"\3\2\2\2\u00c2\u00c3\7?\2\2\u00c3\u00c4\7?\2\2\u00c48\3\2\2\2\u00c5\u00c6"+
		"\7#\2\2\u00c6\u00c7\7?\2\2\u00c7:\3\2\2\2\u00c8\u00c9\7(\2\2\u00c9<\3"+
		"\2\2\2\u00ca\u00cb\7~\2\2\u00cb>\3\2\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce"+
		"\7r\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7p\2\2\u00d0@\3\2\2\2\u00d1\u00d2"+
		"\7.\2\2\u00d2B\3\2\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6"+
		"\7c\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8\7*\2\2\u00d8D\3\2\2\2\u00d9\u00da"+
		"\7w\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7v\2\2\u00dd"+
		"F\3\2\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7v\2\2\u00e1"+
		"H\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7q\2\2\u00e5"+
		"\u00e6\7c\2\2\u00e6\u00e7\7v\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7e\2\2\u00e9"+
		"\u00ea\7j\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7t\2\2\u00ecL\3\2\2\2\u00ed"+
		"\u00ee\7x\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7f\2\2"+
		"\u00f1N\3\2\2\2\u00f2\u00f3\7d\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7q\2"+
		"\2\u00f5\u00f6\7n\2\2\u00f6P\3\2\2\2\u00f7\u00f8\7h\2\2\u00f8\u00f9\7"+
		"k\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7g\2\2\u00fbR\3\2\2\2\u00fc\u00fd"+
		"\7v\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100\7g\2\2\u0100"+
		"T\3\2\2\2\u0101\u0102\7h\2\2\u0102\u0103\7c\2\2\u0103\u0104\7n\2\2\u0104"+
		"\u0105\7u\2\2\u0105\u0106\7g\2\2\u0106V\3\2\2\2\u0107\u0108\7e\2\2\u0108"+
		"\u0109\7q\2\2\u0109\u010a\7p\2\2\u010a\u010b\7v\2\2\u010b\u010c\7k\2\2"+
		"\u010c\u010d\7p\2\2\u010d\u010e\7w\2\2\u010e\u010f\7g\2\2\u010fX\3\2\2"+
		"\2\u0110\u0111\7d\2\2\u0111\u0112\7t\2\2\u0112\u0113\7g\2\2\u0113\u0114"+
		"\7c\2\2\u0114\u0115\7m\2\2\u0115Z\3\2\2\2\u0116\u0117\7t\2\2\u0117\u0118"+
		"\7g\2\2\u0118\u0119\7v\2\2\u0119\u011a\7w\2\2\u011a\u011b\7t\2\2\u011b"+
		"\u011c\7p\2\2\u011c\\\3\2\2\2\u011d\u011e\7t\2\2\u011e\u011f\7g\2\2\u011f"+
		"\u0120\7c\2\2\u0120\u0121\7f\2\2\u0121\u0122\7*\2\2\u0122\u0123\7+\2\2"+
		"\u0123^\3\2\2\2\u0124\u0125\7?\2\2\u0125`\3\2\2\2\u0126\u0127\7o\2\2\u0127"+
		"\u0128\7c\2\2\u0128\u0129\7k\2\2\u0129\u012a\7p\2\2\u012ab\3\2\2\2\u012b"+
		"\u012d\t\2\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012fd\3\2\2\2\u0130\u0132\t\3\2\2\u0131\u0130"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0135\t\2\2\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137f\3\2\2\2\u0138\u013a\t\3\2\2\u0139\u0138\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u0142\3\2\2\2\u013b\u013d\t\2\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0141\u0143\t\4\2\2\u0142\u013e\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0146\t\2\2\2\u0145\u0144\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"h\3\2\2\2\u0149\u014d\t\5\2\2\u014a\u014c\t\6\2\2\u014b\u014a\3\2\2\2"+
		"\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014ej\3"+
		"\2\2\2\u014f\u014d\3\2\2\2\u0150\u0154\7$\2\2\u0151\u0153\13\2\2\2\u0152"+
		"\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0155\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7$\2\2\u0158"+
		"l\3\2\2\2\u0159\u015d\t\7\2\2\u015a\u015c\t\b\2\2\u015b\u015a\3\2\2\2"+
		"\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015en\3"+
		"\2\2\2\u015f\u015d\3\2\2\2\u0160\u0162\7\17\2\2\u0161\u0160\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7\f\2\2\u0164p\3\2\2\2"+
		"\u0165\u0167\t\t\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\b9\2\2\u016b"+
		"r\3\2\2\2\17\2\u012e\u0131\u0136\u0139\u013e\u0142\u0147\u014d\u0154\u015d"+
		"\u0161\u0168\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}