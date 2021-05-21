// Generated from Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decl_start}
	 * labeled alternative in {@link ExprParser#start}.
	 * @param ctx the parse tree
	 */
	void enterDecl_start(ExprParser.Decl_startContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decl_start}
	 * labeled alternative in {@link ExprParser#start}.
	 * @param ctx the parse tree
	 */
	void exitDecl_start(ExprParser.Decl_startContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_start}
	 * labeled alternative in {@link ExprParser#start}.
	 * @param ctx the parse tree
	 */
	void enterMethod_start(ExprParser.Method_startContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_start}
	 * labeled alternative in {@link ExprParser#start}.
	 * @param ctx the parse tree
	 */
	void exitMethod_start(ExprParser.Method_startContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclBasic}
	 * labeled alternative in {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclBasic(ExprParser.DeclBasicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclBasic}
	 * labeled alternative in {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclBasic(ExprParser.DeclBasicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclArr}
	 * labeled alternative in {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclArr(ExprParser.DeclArrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclArr}
	 * labeled alternative in {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclArr(ExprParser.DeclArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(ExprParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(ExprParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(ExprParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(ExprParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arg_decl}
	 * labeled alternative in {@link ExprParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArg_decl(ExprParser.Arg_declContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arg_decl}
	 * labeled alternative in {@link ExprParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArg_decl(ExprParser.Arg_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arg_param}
	 * labeled alternative in {@link ExprParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArg_param(ExprParser.Arg_paramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arg_param}
	 * labeled alternative in {@link ExprParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArg_param(ExprParser.Arg_paramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Blockstmts}
	 * labeled alternative in {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockstmts(ExprParser.BlockstmtsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Blockstmts}
	 * labeled alternative in {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockstmts(ExprParser.BlockstmtsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block_decl}
	 * labeled alternative in {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock_decl(ExprParser.Block_declContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block_decl}
	 * labeled alternative in {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock_decl(ExprParser.Block_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block_stmt}
	 * labeled alternative in {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock_stmt(ExprParser.Block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block_stmt}
	 * labeled alternative in {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock_stmt(ExprParser.Block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCondBlock(ExprParser.CondBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCondBlock(ExprParser.CondBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(ExprParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(ExprParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(ExprParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(ExprParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(ExprParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(ExprParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterOutBlock(ExprParser.OutBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitOutBlock(ExprParser.OutBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnBasic}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnBasic(ExprParser.ReturnBasicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnBasic}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnBasic(ExprParser.ReturnBasicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnValue}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnValue(ExprParser.ReturnValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnValue}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnValue(ExprParser.ReturnValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Break}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak(ExprParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak(ExprParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue(ExprParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue(ExprParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivModExp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivModExp(ExprParser.MulDivModExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivModExp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivModExp(ExprParser.MulDivModExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(ExprParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(ExprParser.NotExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpenBlock}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpenBlock(ExprParser.OpenBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenBlock}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpenBlock(ExprParser.OpenBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValTerminal}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValTerminal(ExprParser.ValTerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValTerminal}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValTerminal(ExprParser.ValTerminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayId}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayId(ExprParser.ArrayIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayId}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayId(ExprParser.ArrayIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondOp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCondOp(ExprParser.CondOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondOp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCondOp(ExprParser.CondOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrue(ExprParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrue(ExprParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalse(ExprParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalse(ExprParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadBlock}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReadBlock(ExprParser.ReadBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadBlock}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReadBlock(ExprParser.ReadBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(ExprParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(ExprParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(ExprParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(ExprParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExp(ExprParser.AddSubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExp(ExprParser.AddSubExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolOp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(ExprParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolOp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(ExprParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssgnOp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssgnOp(ExprParser.AssgnOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssgnOp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssgnOp(ExprParser.AssgnOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#arrayIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterArrayIdentifier(ExprParser.ArrayIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#arrayIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitArrayIdentifier(ExprParser.ArrayIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Read}
	 * labeled alternative in {@link ExprParser#read_block}.
	 * @param ctx the parse tree
	 */
	void enterRead(ExprParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Read}
	 * labeled alternative in {@link ExprParser#read_block}.
	 * @param ctx the parse tree
	 */
	void exitRead(ExprParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadFile}
	 * labeled alternative in {@link ExprParser#read_block}.
	 * @param ctx the parse tree
	 */
	void enterReadFile(ExprParser.ReadFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadFile}
	 * labeled alternative in {@link ExprParser#read_block}.
	 * @param ctx the parse tree
	 */
	void exitReadFile(ExprParser.ReadFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValUint}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValUint(ExprParser.ValUintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValUint}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValUint(ExprParser.ValUintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValInt(ExprParser.ValIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValInt(ExprParser.ValIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFloat(ExprParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFloat(ExprParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterID(ExprParser.IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitID(ExprParser.IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterString(ExprParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitString(ExprParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_bool}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_bool(ExprParser.Type_boolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_bool}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_bool(ExprParser.Type_boolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_char}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_char(ExprParser.Type_charContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_char}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_char(ExprParser.Type_charContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_string}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_string(ExprParser.Type_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_string}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_string(ExprParser.Type_stringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_file}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_file(ExprParser.Type_fileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_file}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_file(ExprParser.Type_fileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_int}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_int(ExprParser.Type_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_int}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_int(ExprParser.Type_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_uint}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_uint(ExprParser.Type_uintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_uint}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_uint(ExprParser.Type_uintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_void}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_void(ExprParser.Type_voidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_void}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_void(ExprParser.Type_voidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type_float}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_float(ExprParser.Type_floatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type_float}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_float(ExprParser.Type_floatContext ctx);
}