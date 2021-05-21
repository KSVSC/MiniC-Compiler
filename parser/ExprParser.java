// Generated from Expr.g4 by ANTLR 4.8
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
		Type_string=38, Type_void=39, Type_bool=40, Type_file=41, True=42, False=43, 
		Continue=44, Break=45, Return=46, Read=47, Asgn_op=48, MAIN=49, U_INT=50, 
		INT=51, FLOAT=52, ID=53, STRING=54, FUNC=55, NEWLINE=56, WS=57;
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
			"'float'", "'char'", "'string'", "'void'", "'bool'", "'file'", "'true'", 
			"'false'", "'continue'", "'break'", "'return'", "'read()'", "'='", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "Type_uint", 
			"Type_int", "Type_float", "Type_char", "Type_string", "Type_void", "Type_bool", 
			"Type_file", "True", "False", "Continue", "Break", "Return", "Read", 
			"Asgn_op", "MAIN", "U_INT", "INT", "FLOAT", "ID", "STRING", "FUNC", "NEWLINE", 
			"WS"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Type_uint) | (1L << Type_int) | (1L << Type_float) | (1L << Type_char) | (1L << Type_string) | (1L << Type_void) | (1L << Type_bool) | (1L << Type_file))) != 0) );
			setState(33);
			match(T__1);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDecl_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDecl_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDecl_start(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_startContext extends StartContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public Method_startContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMethod_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMethod_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMethod_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Decl_startContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				decl();
				setState(36);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new Method_startContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				method();
				setState(39);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDeclArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDeclArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDeclArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclBasicContext extends DeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public DeclBasicContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDeclBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDeclBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitDeclBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new DeclBasicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				type();
				setState(44);
				match(ID);
				}
				break;
			case 2:
				_localctx = new DeclArrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				type();
				setState(47);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ID);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				match(T__2);
				setState(53);
				match(U_INT);
				setState(54);
				match(T__3);
				}
				}
				setState(57); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			type();
			setState(60);
			match(FUNC);
			setState(61);
			match(T__4);
			setState(62);
			args();
			setState(63);
			match(T__5);
			setState(64);
			match(NEWLINE);
			setState(65);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Arg_paramContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArg_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArg_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitArg_param(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Arg_declContext extends ArgsContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public Arg_declContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArg_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArg_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitArg_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Arg_declContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Type_uint) | (1L << Type_int) | (1L << Type_float) | (1L << Type_char) | (1L << Type_string) | (1L << Type_void) | (1L << Type_bool) | (1L << Type_file))) != 0)) {
					{
					{
					setState(67);
					decl();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new Arg_paramContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__21) | (1L << T__30) | (1L << T__32) | (1L << True) | (1L << False) | (1L << Read) | (1L << U_INT) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << STRING) | (1L << FUNC))) != 0)) {
					{
					{
					setState(73);
					expr(0);
					}
					}
					setState(78);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBlockstmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBlockstmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBlockstmts(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Block_stmtContext extends BlockContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public Block_stmtContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBlock_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBlock_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBlock_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Block_declContext extends BlockContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public Block_declContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBlock_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBlock_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBlock_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new BlockstmtsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(T__6);
				setState(82);
				match(NEWLINE);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__21) | (1L << T__30) | (1L << T__32) | (1L << Type_uint) | (1L << Type_int) | (1L << Type_float) | (1L << Type_char) | (1L << Type_string) | (1L << Type_void) | (1L << Type_bool) | (1L << Type_file) | (1L << True) | (1L << False) | (1L << Continue) | (1L << Break) | (1L << Return) | (1L << Read) | (1L << U_INT) | (1L << INT) | (1L << FLOAT) | (1L << ID) | (1L << STRING) | (1L << FUNC))) != 0)) {
					{
					{
					setState(83);
					block();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(T__1);
				}
				break;
			case Type_uint:
			case Type_int:
			case Type_float:
			case Type_char:
			case Type_string:
			case Type_void:
			case Type_bool:
			case Type_file:
				_localctx = new Block_declContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				decl();
				setState(91);
				match(NEWLINE);
				}
				break;
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
				setState(93);
				stmt();
				setState(94);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutBlockContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutBlockContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOutBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOutBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOutBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForBlockContext extends StmtContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakContext extends StmtContext {
		public TerminalNode Break() { return getToken(ExprParser.Break, 0); }
		public BreakContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondBlockContext extends StmtContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondBlockContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCondBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCondBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitCondBlock(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnValueContext extends StmtContext {
		public TerminalNode Return() { return getToken(ExprParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnValueContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterReturnValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitReturnValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitReturnValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnBasicContext extends StmtContext {
		public TerminalNode Return() { return getToken(ExprParser.Return, 0); }
		public ReturnBasicContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterReturnBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitReturnBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitReturnBasic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueContext extends StmtContext {
		public TerminalNode Continue() { return getToken(ExprParser.Continue, 0); }
		public ContinueContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				expr(0);
				}
				break;
			case 2:
				_localctx = new CondBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__4);
				setState(100);
				expr(0);
				setState(101);
				match(T__5);
				setState(102);
				match(T__7);
				setState(103);
				expr(0);
				setState(104);
				match(T__8);
				setState(105);
				expr(0);
				}
				break;
			case 3:
				_localctx = new IfBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(107);
				match(T__9);
				setState(108);
				match(T__4);
				setState(109);
				expr(0);
				setState(110);
				match(T__10);
				setState(111);
				match(NEWLINE);
				setState(112);
				block();
				}
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(114);
					match(NEWLINE);
					setState(115);
					match(T__11);
					setState(116);
					match(NEWLINE);
					setState(117);
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
				setState(120);
				match(T__12);
				setState(121);
				match(T__4);
				setState(122);
				expr(0);
				setState(123);
				match(T__13);
				setState(124);
				expr(0);
				setState(125);
				match(T__13);
				setState(126);
				expr(0);
				setState(127);
				match(T__10);
				setState(128);
				match(NEWLINE);
				setState(129);
				block();
				}
				break;
			case 5:
				_localctx = new WhileBlockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				match(T__14);
				setState(132);
				match(T__4);
				setState(133);
				expr(0);
				setState(134);
				match(T__10);
				setState(135);
				match(NEWLINE);
				setState(136);
				block();
				}
				break;
			case 6:
				_localctx = new OutBlockContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(T__15);
				setState(139);
				expr(0);
				setState(140);
				match(T__5);
				}
				break;
			case 7:
				_localctx = new ReturnBasicContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				match(Return);
				}
				break;
			case 8:
				_localctx = new ReturnValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				match(Return);
				setState(144);
				expr(0);
				}
				break;
			case 9:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
				match(Break);
				}
				break;
			case 10:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(146);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMulDivModExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMulDivModExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMulDivModExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNotExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNotExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitNotExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpenBlockContext extends ExprContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public OpenBlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOpenBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOpenBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOpenBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValTerminalContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValTerminalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterValTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitValTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitValTerminal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayIdContext extends ExprContext {
		public ArrayIdentifierContext arrayIdentifier() {
			return getRuleContext(ArrayIdentifierContext.class,0);
		}
		public ArrayIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArrayId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArrayId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitArrayId(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCondOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCondOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitCondOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends ExprContext {
		public TerminalNode True() { return getToken(ExprParser.True, 0); }
		public TrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends ExprContext {
		public TerminalNode False() { return getToken(ExprParser.False, 0); }
		public FalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadBlockContext extends ExprContext {
		public Read_blockContext read_block() {
			return getRuleContext(Read_blockContext.class,0);
		}
		public ReadBlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterReadBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitReadBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitReadBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends ExprContext {
		public TerminalNode FUNC() { return getToken(ExprParser.FUNC, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FuncCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAddSubExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAddSubExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAddSubExp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBoolOp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAssgnOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAssgnOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitAssgnOp(this);
			else return visitor.visitChildren(this);
		}
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
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ReadBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(150);
				read_block();
				}
				break;
			case 2:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(T__4);
				setState(152);
				expr(0);
				setState(153);
				match(T__5);
				}
				break;
			case 3:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(T__21);
				setState(156);
				expr(10);
				}
				break;
			case 4:
				{
				_localctx = new ValTerminalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				value();
				}
				break;
			case 5:
				{
				_localctx = new OpenBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(T__30);
				setState(159);
				match(T__4);
				setState(160);
				match(ID);
				setState(161);
				match(T__31);
				setState(162);
				match(STRING);
				setState(163);
				match(T__5);
				}
				break;
			case 6:
				{
				_localctx = new ArrayIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				arrayIdentifier();
				}
				break;
			case 7:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(True);
				}
				break;
			case 8:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(False);
				}
				break;
			case 9:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(FUNC);
				setState(168);
				match(T__4);
				setState(169);
				args();
				setState(170);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(175);
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
						setState(176);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(178);
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
						setState(179);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new AssgnOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(181);
						match(Asgn_op);
						setState(182);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new CondOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(184);
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
						setState(185);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new BoolOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(187);
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
						setState(188);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(193);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArrayIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArrayIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitArrayIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIdentifierContext arrayIdentifier() throws RecognitionException {
		ArrayIdentifierContext _localctx = new ArrayIdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
			setState(199); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(195);
					match(T__2);
					setState(196);
					expr(0);
					setState(197);
					match(T__3);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(201); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadFileContext extends Read_blockContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ReadFileContext(Read_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterReadFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitReadFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitReadFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_blockContext read_block() throws RecognitionException {
		Read_blockContext _localctx = new Read_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_read_block);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Read:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(Read);
				}
				break;
			case T__32:
				_localctx = new ReadFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(T__32);
				setState(205);
				match(ID);
				setState(206);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValUintContext extends ValueContext {
		public TerminalNode U_INT() { return getToken(ExprParser.U_INT, 0); }
		public ValUintContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterValUint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitValUint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitValUint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValIntContext extends ValueContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public ValIntContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterValInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitValInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitValInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDContext extends ValueContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public IDContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ValueContext {
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public StringContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case U_INT:
				_localctx = new ValUintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(U_INT);
				}
				break;
			case INT:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(FLOAT);
				}
				break;
			case ID:
				_localctx = new IDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				match(STRING);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterType_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitType_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitType_float(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_boolContext extends TypeContext {
		public TerminalNode Type_bool() { return getToken(ExprParser.Type_bool, 0); }
		public Type_boolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterType_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitType_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitType_bool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_fileContext extends TypeContext {
		public TerminalNode Type_file() { return getToken(ExprParser.Type_file, 0); }
		public Type_fileContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterType_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitType_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitType_file(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_voidContext extends TypeContext {
		public TerminalNode Type_void() { return getToken(ExprParser.Type_void, 0); }
		public Type_voidContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterType_void(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitType_void(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitType_void(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_charContext extends TypeContext {
		public TerminalNode Type_char() { return getToken(ExprParser.Type_char, 0); }
		public Type_charContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterType_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitType_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitType_char(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_intContext extends TypeContext {
		public TerminalNode Type_int() { return getToken(ExprParser.Type_int, 0); }
		public Type_intContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterType_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitType_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitType_int(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_uintContext extends TypeContext {
		public TerminalNode Type_uint() { return getToken(ExprParser.Type_uint, 0); }
		public Type_uintContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterType_uint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitType_uint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitType_uint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_stringContext extends TypeContext {
		public TerminalNode Type_string() { return getToken(ExprParser.Type_string, 0); }
		public Type_stringContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterType_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitType_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitType_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type_bool:
				_localctx = new Type_boolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(Type_bool);
				}
				break;
			case Type_char:
				_localctx = new Type_charContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(Type_char);
				}
				break;
			case Type_string:
				_localctx = new Type_stringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(Type_string);
				}
				break;
			case Type_file:
				_localctx = new Type_fileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(Type_file);
				}
				break;
			case Type_int:
				_localctx = new Type_intContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				match(Type_int);
				}
				break;
			case Type_uint:
				_localctx = new Type_uintContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				match(Type_uint);
				}
				break;
			case Type_void:
				_localctx = new Type_voidContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				match(Type_void);
				}
				break;
			case Type_float:
				_localctx = new Type_floatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(223);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u00e5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\6\2 \n\2\r\2\16\2!\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4\3\5"+
		"\3\5\3\5\3\5\6\5:\n\5\r\5\16\5;\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\7"+
		"\7G\n\7\f\7\16\7J\13\7\3\7\7\7M\n\7\f\7\16\7P\13\7\5\7R\n\7\3\b\3\b\3"+
		"\b\7\bW\n\b\f\b\16\bZ\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bc\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\ty\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0096\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00af\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c0\n\n\f\n\16\n\u00c3\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\6\13\u00ca\n\13\r\13\16\13\u00cb\3\f\3\f\3\f\3\f\5\f\u00d2"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00d9\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00e3\n\16\3\16\2\3\22\17\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\2\6\3\2\23\25\3\2\26\27\3\2\31\36\3\2\37 \2\u0105\2\34\3\2\2\2\4+"+
		"\3\2\2\2\6\63\3\2\2\2\b\65\3\2\2\2\n=\3\2\2\2\fQ\3\2\2\2\16b\3\2\2\2\20"+
		"\u0095\3\2\2\2\22\u00ae\3\2\2\2\24\u00c4\3\2\2\2\26\u00d1\3\2\2\2\30\u00d8"+
		"\3\2\2\2\32\u00e2\3\2\2\2\34\35\7\3\2\2\35\37\7:\2\2\36 \5\4\3\2\37\36"+
		"\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7\4\2\2$\3\3\2"+
		"\2\2%&\5\6\4\2&\'\7:\2\2\',\3\2\2\2()\5\n\6\2)*\7:\2\2*,\3\2\2\2+%\3\2"+
		"\2\2+(\3\2\2\2,\5\3\2\2\2-.\5\32\16\2./\7\67\2\2/\64\3\2\2\2\60\61\5\32"+
		"\16\2\61\62\5\b\5\2\62\64\3\2\2\2\63-\3\2\2\2\63\60\3\2\2\2\64\7\3\2\2"+
		"\2\659\7\67\2\2\66\67\7\5\2\2\678\7\64\2\28:\7\6\2\29\66\3\2\2\2:;\3\2"+
		"\2\2;9\3\2\2\2;<\3\2\2\2<\t\3\2\2\2=>\5\32\16\2>?\79\2\2?@\7\7\2\2@A\5"+
		"\f\7\2AB\7\b\2\2BC\7:\2\2CD\5\16\b\2D\13\3\2\2\2EG\5\6\4\2FE\3\2\2\2G"+
		"J\3\2\2\2HF\3\2\2\2HI\3\2\2\2IR\3\2\2\2JH\3\2\2\2KM\5\22\n\2LK\3\2\2\2"+
		"MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QH\3\2\2\2QN\3\2\2\2"+
		"R\r\3\2\2\2ST\7\t\2\2TX\7:\2\2UW\5\16\b\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2"+
		"\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[c\7\4\2\2\\]\5\6\4\2]^\7:\2\2^c\3\2\2"+
		"\2_`\5\20\t\2`a\7:\2\2ac\3\2\2\2bS\3\2\2\2b\\\3\2\2\2b_\3\2\2\2c\17\3"+
		"\2\2\2d\u0096\5\22\n\2ef\7\7\2\2fg\5\22\n\2gh\7\b\2\2hi\7\n\2\2ij\5\22"+
		"\n\2jk\7\13\2\2kl\5\22\n\2l\u0096\3\2\2\2mn\7\f\2\2no\7\7\2\2op\5\22\n"+
		"\2pq\7\r\2\2qr\7:\2\2rs\5\16\b\2sx\3\2\2\2tu\7:\2\2uv\7\16\2\2vw\7:\2"+
		"\2wy\5\16\b\2xt\3\2\2\2xy\3\2\2\2y\u0096\3\2\2\2z{\7\17\2\2{|\7\7\2\2"+
		"|}\5\22\n\2}~\7\20\2\2~\177\5\22\n\2\177\u0080\7\20\2\2\u0080\u0081\5"+
		"\22\n\2\u0081\u0082\7\r\2\2\u0082\u0083\7:\2\2\u0083\u0084\5\16\b\2\u0084"+
		"\u0096\3\2\2\2\u0085\u0086\7\21\2\2\u0086\u0087\7\7\2\2\u0087\u0088\5"+
		"\22\n\2\u0088\u0089\7\r\2\2\u0089\u008a\7:\2\2\u008a\u008b\5\16\b\2\u008b"+
		"\u0096\3\2\2\2\u008c\u008d\7\22\2\2\u008d\u008e\5\22\n\2\u008e\u008f\7"+
		"\b\2\2\u008f\u0096\3\2\2\2\u0090\u0096\7\60\2\2\u0091\u0092\7\60\2\2\u0092"+
		"\u0096\5\22\n\2\u0093\u0096\7/\2\2\u0094\u0096\7.\2\2\u0095d\3\2\2\2\u0095"+
		"e\3\2\2\2\u0095m\3\2\2\2\u0095z\3\2\2\2\u0095\u0085\3\2\2\2\u0095\u008c"+
		"\3\2\2\2\u0095\u0090\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\21\3\2\2\2\u0097\u0098\b\n\1\2\u0098\u00af\5\26\f"+
		"\2\u0099\u009a\7\7\2\2\u009a\u009b\5\22\n\2\u009b\u009c\7\b\2\2\u009c"+
		"\u00af\3\2\2\2\u009d\u009e\7\30\2\2\u009e\u00af\5\22\n\f\u009f\u00af\5"+
		"\30\r\2\u00a0\u00a1\7!\2\2\u00a1\u00a2\7\7\2\2\u00a2\u00a3\7\67\2\2\u00a3"+
		"\u00a4\7\"\2\2\u00a4\u00a5\78\2\2\u00a5\u00af\7\b\2\2\u00a6\u00af\5\24"+
		"\13\2\u00a7\u00af\7,\2\2\u00a8\u00af\7-\2\2\u00a9\u00aa\79\2\2\u00aa\u00ab"+
		"\7\7\2\2\u00ab\u00ac\5\f\7\2\u00ac\u00ad\7\b\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u0097\3\2\2\2\u00ae\u0099\3\2\2\2\u00ae\u009d\3\2\2\2\u00ae\u009f\3\2"+
		"\2\2\u00ae\u00a0\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00a7\3\2\2\2\u00ae"+
		"\u00a8\3\2\2\2\u00ae\u00a9\3\2\2\2\u00af\u00c1\3\2\2\2\u00b0\u00b1\f\20"+
		"\2\2\u00b1\u00b2\t\2\2\2\u00b2\u00c0\5\22\n\21\u00b3\u00b4\f\17\2\2\u00b4"+
		"\u00b5\t\3\2\2\u00b5\u00c0\5\22\n\20\u00b6\u00b7\f\n\2\2\u00b7\u00b8\7"+
		"\62\2\2\u00b8\u00c0\5\22\n\13\u00b9\u00ba\f\t\2\2\u00ba\u00bb\t\4\2\2"+
		"\u00bb\u00c0\5\22\n\n\u00bc\u00bd\f\b\2\2\u00bd\u00be\t\5\2\2\u00be\u00c0"+
		"\5\22\n\t\u00bf\u00b0\3\2\2\2\u00bf\u00b3\3\2\2\2\u00bf\u00b6\3\2\2\2"+
		"\u00bf\u00b9\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\23\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c9\7\67\2\2\u00c5\u00c6\7\5\2\2\u00c6\u00c7\5\22\n\2\u00c7\u00c8\7"+
		"\6\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\25\3\2\2\2\u00cd\u00d2\7\61\2"+
		"\2\u00ce\u00cf\7#\2\2\u00cf\u00d0\7\67\2\2\u00d0\u00d2\7\b\2\2\u00d1\u00cd"+
		"\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\27\3\2\2\2\u00d3\u00d9\7\64\2\2\u00d4"+
		"\u00d9\7\65\2\2\u00d5\u00d9\7\66\2\2\u00d6\u00d9\7\67\2\2\u00d7\u00d9"+
		"\78\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\31\3\2\2\2\u00da\u00e3\7*\2\2"+
		"\u00db\u00e3\7\'\2\2\u00dc\u00e3\7(\2\2\u00dd\u00e3\7+\2\2\u00de\u00e3"+
		"\7%\2\2\u00df\u00e3\7$\2\2\u00e0\u00e3\7)\2\2\u00e1\u00e3\7&\2\2\u00e2"+
		"\u00da\3\2\2\2\u00e2\u00db\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00dd\3\2"+
		"\2\2\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\33\3\2\2\2\24!+\63;HNQXbx\u0095\u00ae\u00bf\u00c1"+
		"\u00cb\u00d1\u00d8\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}