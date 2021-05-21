// Generated from /home/ksvsc/IIITH/Monsoon20/Compilers/minic-grammar-KSVSC/antlr/Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_decl = 2, RULE_arrayDeclaration = 3, 
		RULE_method = 4, RULE_args = 5, RULE_block = 6, RULE_stmt = 7, RULE_expr = 8, 
		RULE_arrayIdentifier = 9, RULE_read_block = 10, RULE_value = 11, RULE_type = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "start", "decl", "arrayDeclaration", "method", "args", "block", 
			"stmt", "expr", "arrayIdentifier", "read_block", "value", "type"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			match(NEWLINE);
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				start();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Type_uint) | (1L << Type_int) | (1L << Type_float) | (1L << Type_char) | (1L << Type_void) | (1L << Type_bool) | (1L << Type_file))) != 0) );
			setState(33);
			match(T__1);
			setState(34);
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

	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Decl_startContext extends StartContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public Decl_startContext(StartContext ctx) { copyFrom(ctx); }
	}
	public static class Method_startContext extends StartContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public Method_startContext(StartContext ctx) { copyFrom(ctx); }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Decl_startContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				decl();
				setState(37);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new Method_startContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				method();
				setState(40);
				match(NEWLINE);
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

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclArrContext extends DeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public DeclArrContext(DeclContext ctx) { copyFrom(ctx); }
	}
	public static class DeclBasicContext extends DeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public DeclBasicContext(DeclContext ctx) { copyFrom(ctx); }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new DeclBasicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				type();
				setState(45);
				match(ID);
				}
				break;
			case 2:
				_localctx = new DeclArrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				type();
				setState(48);
				arrayDeclaration();
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public List<TerminalNode> U_INT() { return getTokens(ExprParser.U_INT); }
		public TerminalNode U_INT(int i) {
			return getToken(ExprParser.U_INT, i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				match(T__2);
				setState(54);
				match(U_INT);
				setState(55);
				match(T__3);
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
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

	public static class MethodContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode FUNC() { return getToken(ExprParser.FUNC, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			type();
			setState(61);
			match(FUNC);
			setState(62);
			match(T__4);
			setState(63);
			args();
			setState(64);
			match(T__5);
			setState(65);
			match(NEWLINE);
			setState(66);
			block();
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

	public static class ArgsContext extends ParserRuleContext {
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	 
		public ArgsContext() { }
		public void copyFrom(ArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Arg_paramContext extends ArgsContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Arg_paramContext(ArgsContext ctx) { copyFrom(ctx); }
	}
	public static class Arg_declContext extends ArgsContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public Arg_declContext(ArgsContext ctx) { copyFrom(ctx); }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		int _la;
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Arg_declContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Type_uint) | (1L << Type_int) | (1L << Type_float) | (1L << Type_char) | (1L << Type_void) | (1L << Type_bool) | (1L << Type_file))) != 0)) {
					{
					{
					setState(68);
					decl();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new Arg_paramContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & ((1L << (EOF - -1)) | (1L << (U_INT - -1)) | (1L << (INT - -1)) | (1L << (FLOAT - -1)) | (1L << (ID - -1)) | (1L << (STRING - -1)))) != 0)) {
					{
					{
					setState(74);
					value();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockstmtsContext extends BlockContext {
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BlockstmtsContext(BlockContext ctx) { copyFrom(ctx); }
	}
	public static class Block_stmtContext extends BlockContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public Block_stmtContext(BlockContext ctx) { copyFrom(ctx); }
	}
	public static class Block_declContext extends BlockContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public Block_declContext(BlockContext ctx) { copyFrom(ctx); }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new BlockstmtsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__6);
				setState(83);
				match(NEWLINE);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & ((1L << (EOF - -1)) | (1L << (T__4 - -1)) | (1L << (T__6 - -1)) | (1L << (T__9 - -1)) | (1L << (T__12 - -1)) | (1L << (T__14 - -1)) | (1L << (T__15 - -1)) | (1L << (T__21 - -1)) | (1L << (T__30 - -1)) | (1L << (T__32 - -1)) | (1L << (Type_uint - -1)) | (1L << (Type_int - -1)) | (1L << (Type_float - -1)) | (1L << (Type_char - -1)) | (1L << (Type_void - -1)) | (1L << (Type_bool - -1)) | (1L << (Type_file - -1)) | (1L << (True - -1)) | (1L << (False - -1)) | (1L << (Continue - -1)) | (1L << (Break - -1)) | (1L << (Return - -1)) | (1L << (Read - -1)) | (1L << (U_INT - -1)) | (1L << (INT - -1)) | (1L << (FLOAT - -1)) | (1L << (ID - -1)) | (1L << (STRING - -1)) | (1L << (FUNC - -1)))) != 0)) {
					{
					{
					setState(84);
					block();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(T__1);
				}
				break;
			case Type_uint:
			case Type_int:
			case Type_float:
			case Type_char:
			case Type_void:
			case Type_bool:
			case Type_file:
				_localctx = new Block_declContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				decl();
				setState(92);
				match(NEWLINE);
				}
				break;
			case EOF:
			case T__4:
			case T__9:
			case T__12:
			case T__14:
			case T__15:
			case T__21:
			case T__30:
			case T__32:
			case True:
			case False:
			case Continue:
			case Break:
			case Return:
			case Read:
			case U_INT:
			case INT:
			case FLOAT:
			case ID:
			case STRING:
			case FUNC:
				_localctx = new Block_stmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				stmt();
				setState(95);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileBlockContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileBlockContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class OutBlockContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutBlockContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ExpressionContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ForBlockContext extends StmtContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForBlockContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class BreakContext extends StmtContext {
		public TerminalNode Break() { return getToken(ExprParser.Break, 0); }
		public BreakContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class CondBlockContext extends StmtContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondBlockContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class IfBlockContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfBlockContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnValueContext extends StmtContext {
		public TerminalNode Return() { return getToken(ExprParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnValueContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnBasicContext extends StmtContext {
		public TerminalNode Return() { return getToken(ExprParser.Return, 0); }
		public ReturnBasicContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ContinueContext extends StmtContext {
		public TerminalNode Continue() { return getToken(ExprParser.Continue, 0); }
		public ContinueContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				expr(0);
				}
				break;
			case 2:
				_localctx = new CondBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(T__4);
				setState(101);
				expr(0);
				setState(102);
				match(T__5);
				setState(103);
				match(T__7);
				setState(104);
				expr(0);
				setState(105);
				match(T__8);
				setState(106);
				expr(0);
				}
				break;
			case 3:
				_localctx = new IfBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(108);
				match(T__9);
				setState(109);
				match(T__4);
				setState(110);
				expr(0);
				setState(111);
				match(T__10);
				setState(112);
				match(NEWLINE);
				setState(113);
				block();
				}
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(115);
					match(NEWLINE);
					setState(116);
					match(T__11);
					setState(117);
					match(NEWLINE);
					setState(118);
					block();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ForBlockContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(T__12);
				setState(122);
				match(T__4);
				setState(123);
				type();
				setState(124);
				expr(0);
				setState(125);
				match(T__13);
				setState(126);
				expr(0);
				setState(127);
				match(T__13);
				setState(128);
				expr(0);
				setState(129);
				match(T__10);
				setState(130);
				match(NEWLINE);
				setState(131);
				block();
				}
				break;
			case 5:
				_localctx = new WhileBlockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				match(T__14);
				setState(134);
				match(T__4);
				setState(135);
				expr(0);
				setState(136);
				match(T__10);
				setState(137);
				match(NEWLINE);
				setState(138);
				block();
				}
				break;
			case 6:
				_localctx = new OutBlockContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				match(T__15);
				setState(141);
				expr(0);
				setState(142);
				match(T__5);
				}
				break;
			case 7:
				_localctx = new ReturnBasicContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(144);
				match(Return);
				}
				break;
			case 8:
				_localctx = new ReturnValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(145);
				match(Return);
				setState(146);
				expr(0);
				}
				break;
			case 9:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(147);
				match(Break);
				}
				break;
			case 10:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(148);
				match(Continue);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulDivModExpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivModExpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OpenBlockContext extends ExprContext {
		public List<TerminalNode> STRING() { return getTokens(ExprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExprParser.STRING, i);
		}
		public OpenBlockContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ValTerminalContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValTerminalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayIdContext extends ExprContext {
		public ArrayIdentifierContext arrayIdentifier() {
			return getRuleContext(ArrayIdentifierContext.class,0);
		}
		public ArrayIdContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CondOpContext extends ExprContext {
		public Token cond_op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondOpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class TrueContext extends ExprContext {
		public TerminalNode True() { return getToken(ExprParser.True, 0); }
		public TrueContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FalseContext extends ExprContext {
		public TerminalNode False() { return getToken(ExprParser.False, 0); }
		public FalseContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ReadBlockContext extends ExprContext {
		public Read_blockContext read_block() {
			return getRuleContext(Read_blockContext.class,0);
		}
		public ReadBlockContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FuncCallContext extends ExprContext {
		public TerminalNode FUNC() { return getToken(ExprParser.FUNC, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FuncCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubExpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubExpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolOpContext extends ExprContext {
		public Token bool_op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BoolOpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AssgnOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Asgn_op() { return getToken(ExprParser.Asgn_op, 0); }
		public AssgnOpContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ReadBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(152);
				read_block();
				}
				break;
			case 2:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(T__4);
				setState(154);
				expr(0);
				setState(155);
				match(T__5);
				}
				break;
			case 3:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(T__21);
				setState(158);
				expr(10);
				}
				break;
			case 4:
				{
				_localctx = new ValTerminalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				value();
				}
				break;
			case 5:
				{
				_localctx = new OpenBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(T__30);
				setState(161);
				match(T__4);
				setState(162);
				match(STRING);
				setState(163);
				match(T__31);
				setState(164);
				match(STRING);
				setState(165);
				match(T__5);
				}
				break;
			case 6:
				{
				_localctx = new ArrayIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				arrayIdentifier();
				}
				break;
			case 7:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(True);
				}
				break;
			case 8:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(False);
				}
				break;
			case 9:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(FUNC);
				setState(170);
				match(T__4);
				setState(171);
				args();
				setState(172);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(177);
						((MulDivModExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
							((MulDivModExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(180);
						((AddSubExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((AddSubExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(181);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new AssgnOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(183);
						match(Asgn_op);
						setState(184);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new CondOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(186);
						((CondOpContext)_localctx).cond_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((CondOpContext)_localctx).cond_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(187);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new BoolOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(189);
						((BoolOpContext)_localctx).bool_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
							((BoolOpContext)_localctx).bool_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(190);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(195);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayIdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIdentifier; }
	}

	public final ArrayIdentifierContext arrayIdentifier() throws RecognitionException {
		ArrayIdentifierContext _localctx = new ArrayIdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(201); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(197);
					match(T__2);
					setState(198);
					expr(0);
					setState(199);
					match(T__3);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(203); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Read_blockContext extends ParserRuleContext {
		public Read_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_block; }
	 
		public Read_blockContext() { }
		public void copyFrom(Read_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadContext extends Read_blockContext {
		public TerminalNode Read() { return getToken(ExprParser.Read, 0); }
		public ReadContext(Read_blockContext ctx) { copyFrom(ctx); }
	}
	public static class ReadFileContext extends Read_blockContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ReadFileContext(Read_blockContext ctx) { copyFrom(ctx); }
	}

	public final Read_blockContext read_block() throws RecognitionException {
		Read_blockContext _localctx = new Read_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_read_block);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Read:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(Read);
				}
				break;
			case T__32:
				_localctx = new ReadFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(T__32);
				setState(207);
				match(ID);
				setState(208);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatContext extends ValueContext {
		public TerminalNode FLOAT() { return getToken(ExprParser.FLOAT, 0); }
		public FloatContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class ValUintContext extends ValueContext {
		public TerminalNode U_INT() { return getToken(ExprParser.U_INT, 0); }
		public ValUintContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class ValIntContext extends ValueContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public ValIntContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class IDContext extends ValueContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public IDContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class StringContext extends ValueContext {
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public StringContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class EOFContext extends ValueContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public EOFContext(ValueContext ctx) { copyFrom(ctx); }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case U_INT:
				_localctx = new ValUintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(U_INT);
				}
				break;
			case INT:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(FLOAT);
				}
				break;
			case ID:
				_localctx = new IDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				match(STRING);
				}
				break;
			case EOF:
				_localctx = new EOFContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Type_floatContext extends TypeContext {
		public TerminalNode Type_float() { return getToken(ExprParser.Type_float, 0); }
		public Type_floatContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class Type_boolContext extends TypeContext {
		public TerminalNode Type_bool() { return getToken(ExprParser.Type_bool, 0); }
		public Type_boolContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class Type_fileContext extends TypeContext {
		public TerminalNode Type_file() { return getToken(ExprParser.Type_file, 0); }
		public Type_fileContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class Type_voidContext extends TypeContext {
		public TerminalNode Type_void() { return getToken(ExprParser.Type_void, 0); }
		public Type_voidContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class Type_charContext extends TypeContext {
		public TerminalNode Type_char() { return getToken(ExprParser.Type_char, 0); }
		public Type_charContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class Type_intContext extends TypeContext {
		public TerminalNode Type_int() { return getToken(ExprParser.Type_int, 0); }
		public Type_intContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class Type_uintContext extends TypeContext {
		public TerminalNode Type_uint() { return getToken(ExprParser.Type_uint, 0); }
		public Type_uintContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type_bool:
				_localctx = new Type_boolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(Type_bool);
				}
				break;
			case Type_char:
				_localctx = new Type_charContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(Type_char);
				}
				break;
			case Type_file:
				_localctx = new Type_fileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(Type_file);
				}
				break;
			case Type_int:
				_localctx = new Type_intContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(Type_int);
				}
				break;
			case Type_uint:
				_localctx = new Type_uintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				match(Type_uint);
				}
				break;
			case Type_void:
				_localctx = new Type_voidContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				match(Type_void);
				}
				break;
			case Type_float:
				_localctx = new Type_floatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(225);
				match(Type_float);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u00e7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\6\2 \n\2\r\2\16\2!\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n\4"+
		"\3\5\3\5\3\5\3\5\6\5;\n\5\r\5\16\5<\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\7\7H\n\7\f\7\16\7K\13\7\3\7\7\7N\n\7\f\7\16\7Q\13\7\5\7S\n\7\3\b\3"+
		"\b\3\b\7\bX\n\b\f\b\16\b[\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bd\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\tz\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0098"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b1\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c2\n\n\f\n\16\n\u00c5\13\n\3\13"+
		"\3\13\3\13\3\13\3\13\6\13\u00cc\n\13\r\13\16\13\u00cd\3\f\3\f\3\f\3\f"+
		"\5\f\u00d4\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00dc\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00e5\n\16\3\16\2\3\22\17\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\2\6\3\2\23\25\3\2\26\27\3\2\31\36\3\2\37 \2\u0107\2\34\3"+
		"\2\2\2\4,\3\2\2\2\6\64\3\2\2\2\b\66\3\2\2\2\n>\3\2\2\2\fR\3\2\2\2\16c"+
		"\3\2\2\2\20\u0097\3\2\2\2\22\u00b0\3\2\2\2\24\u00c6\3\2\2\2\26\u00d3\3"+
		"\2\2\2\30\u00db\3\2\2\2\32\u00e4\3\2\2\2\34\35\7\3\2\2\35\37\79\2\2\36"+
		" \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$"+
		"\7\4\2\2$%\7\2\2\3%\3\3\2\2\2&\'\5\6\4\2\'(\79\2\2(-\3\2\2\2)*\5\n\6\2"+
		"*+\79\2\2+-\3\2\2\2,&\3\2\2\2,)\3\2\2\2-\5\3\2\2\2./\5\32\16\2/\60\7\66"+
		"\2\2\60\65\3\2\2\2\61\62\5\32\16\2\62\63\5\b\5\2\63\65\3\2\2\2\64.\3\2"+
		"\2\2\64\61\3\2\2\2\65\7\3\2\2\2\66:\7\66\2\2\678\7\5\2\289\7\63\2\29;"+
		"\7\6\2\2:\67\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\t\3\2\2\2>?\5\32\16"+
		"\2?@\78\2\2@A\7\7\2\2AB\5\f\7\2BC\7\b\2\2CD\79\2\2DE\5\16\b\2E\13\3\2"+
		"\2\2FH\5\6\4\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JS\3\2\2\2KI\3\2"+
		"\2\2LN\5\30\r\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3"+
		"\2\2\2RI\3\2\2\2RO\3\2\2\2S\r\3\2\2\2TU\7\t\2\2UY\79\2\2VX\5\16\b\2WV"+
		"\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\d\7\4\2\2"+
		"]^\5\6\4\2^_\79\2\2_d\3\2\2\2`a\5\20\t\2ab\79\2\2bd\3\2\2\2cT\3\2\2\2"+
		"c]\3\2\2\2c`\3\2\2\2d\17\3\2\2\2e\u0098\5\22\n\2fg\7\7\2\2gh\5\22\n\2"+
		"hi\7\b\2\2ij\7\n\2\2jk\5\22\n\2kl\7\13\2\2lm\5\22\n\2m\u0098\3\2\2\2n"+
		"o\7\f\2\2op\7\7\2\2pq\5\22\n\2qr\7\r\2\2rs\79\2\2st\5\16\b\2ty\3\2\2\2"+
		"uv\79\2\2vw\7\16\2\2wx\79\2\2xz\5\16\b\2yu\3\2\2\2yz\3\2\2\2z\u0098\3"+
		"\2\2\2{|\7\17\2\2|}\7\7\2\2}~\5\32\16\2~\177\5\22\n\2\177\u0080\7\20\2"+
		"\2\u0080\u0081\5\22\n\2\u0081\u0082\7\20\2\2\u0082\u0083\5\22\n\2\u0083"+
		"\u0084\7\r\2\2\u0084\u0085\79\2\2\u0085\u0086\5\16\b\2\u0086\u0098\3\2"+
		"\2\2\u0087\u0088\7\21\2\2\u0088\u0089\7\7\2\2\u0089\u008a\5\22\n\2\u008a"+
		"\u008b\7\r\2\2\u008b\u008c\79\2\2\u008c\u008d\5\16\b\2\u008d\u0098\3\2"+
		"\2\2\u008e\u008f\7\22\2\2\u008f\u0090\5\22\n\2\u0090\u0091\7\b\2\2\u0091"+
		"\u0098\3\2\2\2\u0092\u0098\7/\2\2\u0093\u0094\7/\2\2\u0094\u0098\5\22"+
		"\n\2\u0095\u0098\7.\2\2\u0096\u0098\7-\2\2\u0097e\3\2\2\2\u0097f\3\2\2"+
		"\2\u0097n\3\2\2\2\u0097{\3\2\2\2\u0097\u0087\3\2\2\2\u0097\u008e\3\2\2"+
		"\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\21\3\2\2\2\u0099\u009a\b\n\1\2\u009a\u00b1\5\26\f\2\u009b"+
		"\u009c\7\7\2\2\u009c\u009d\5\22\n\2\u009d\u009e\7\b\2\2\u009e\u00b1\3"+
		"\2\2\2\u009f\u00a0\7\30\2\2\u00a0\u00b1\5\22\n\f\u00a1\u00b1\5\30\r\2"+
		"\u00a2\u00a3\7!\2\2\u00a3\u00a4\7\7\2\2\u00a4\u00a5\7\67\2\2\u00a5\u00a6"+
		"\7\"\2\2\u00a6\u00a7\7\67\2\2\u00a7\u00b1\7\b\2\2\u00a8\u00b1\5\24\13"+
		"\2\u00a9\u00b1\7+\2\2\u00aa\u00b1\7,\2\2\u00ab\u00ac\78\2\2\u00ac\u00ad"+
		"\7\7\2\2\u00ad\u00ae\5\f\7\2\u00ae\u00af\7\b\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u0099\3\2\2\2\u00b0\u009b\3\2\2\2\u00b0\u009f\3\2\2\2\u00b0\u00a1\3\2"+
		"\2\2\u00b0\u00a2\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b0"+
		"\u00aa\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b1\u00c3\3\2\2\2\u00b2\u00b3\f\20"+
		"\2\2\u00b3\u00b4\t\2\2\2\u00b4\u00c2\5\22\n\21\u00b5\u00b6\f\17\2\2\u00b6"+
		"\u00b7\t\3\2\2\u00b7\u00c2\5\22\n\20\u00b8\u00b9\f\n\2\2\u00b9\u00ba\7"+
		"\61\2\2\u00ba\u00c2\5\22\n\13\u00bb\u00bc\f\t\2\2\u00bc\u00bd\t\4\2\2"+
		"\u00bd\u00c2\5\22\n\n\u00be\u00bf\f\b\2\2\u00bf\u00c0\t\5\2\2\u00c0\u00c2"+
		"\5\22\n\t\u00c1\u00b2\3\2\2\2\u00c1\u00b5\3\2\2\2\u00c1\u00b8\3\2\2\2"+
		"\u00c1\u00bb\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\23\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00cb\7\66\2\2\u00c7\u00c8\7\5\2\2\u00c8\u00c9\5\22\n\2\u00c9\u00ca\7"+
		"\6\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\25\3\2\2\2\u00cf\u00d4\7\60\2"+
		"\2\u00d0\u00d1\7#\2\2\u00d1\u00d2\7\66\2\2\u00d2\u00d4\7\b\2\2\u00d3\u00cf"+
		"\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\27\3\2\2\2\u00d5\u00dc\7\63\2\2\u00d6"+
		"\u00dc\7\64\2\2\u00d7\u00dc\7\65\2\2\u00d8\u00dc\7\66\2\2\u00d9\u00dc"+
		"\7\67\2\2\u00da\u00dc\7\2\2\3\u00db\u00d5\3\2\2\2\u00db\u00d6\3\2\2\2"+
		"\u00db\u00d7\3\2\2\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc\31\3\2\2\2\u00dd\u00e5\7)\2\2\u00de\u00e5\7\'\2\2\u00df"+
		"\u00e5\7*\2\2\u00e0\u00e5\7%\2\2\u00e1\u00e5\7$\2\2\u00e2\u00e5\7(\2\2"+
		"\u00e3\u00e5\7&\2\2\u00e4\u00dd\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4\u00df"+
		"\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\33\3\2\2\2\24!,\64<IORYcy\u0097\u00b0\u00c1\u00c3"+
		"\u00cd\u00d3\u00db\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}