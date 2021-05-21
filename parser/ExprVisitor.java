// Generated from Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decl_start}
	 * labeled alternative in {@link ExprParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_start(ExprParser.Decl_startContext ctx);
	/**
	 * Visit a parse tree produced by the {@code method_start}
	 * labeled alternative in {@link ExprParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_start(ExprParser.Method_startContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclBasic}
	 * labeled alternative in {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclBasic(ExprParser.DeclBasicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclArr}
	 * labeled alternative in {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclArr(ExprParser.DeclArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(ExprParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(ExprParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arg_decl}
	 * labeled alternative in {@link ExprParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_decl(ExprParser.Arg_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arg_param}
	 * labeled alternative in {@link ExprParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_param(ExprParser.Arg_paramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Blockstmts}
	 * labeled alternative in {@link ExprParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockstmts(ExprParser.BlockstmtsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block_decl}
	 * labeled alternative in {@link ExprParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_decl(ExprParser.Block_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block_stmt}
	 * labeled alternative in {@link ExprParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_stmt(ExprParser.Block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondBlock(ExprParser.CondBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(ExprParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(ExprParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(ExprParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OutBlock}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutBlock(ExprParser.OutBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnBasic}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBasic(ExprParser.ReturnBasicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnValue}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnValue(ExprParser.ReturnValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(ExprParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link ExprParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(ExprParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivModExp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivModExp(ExprParser.MulDivModExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExp(ExprParser.NotExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpenBlock}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenBlock(ExprParser.OpenBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValTerminal}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValTerminal(ExprParser.ValTerminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayId}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayId(ExprParser.ArrayIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondOp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOp(ExprParser.CondOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(ExprParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(ExprParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadBlock}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadBlock(ExprParser.ReadBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(ExprParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(ExprParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExp(ExprParser.AddSubExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolOp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp(ExprParser.BoolOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssgnOp}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssgnOp(ExprParser.AssgnOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#arrayIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIdentifier(ExprParser.ArrayIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Read}
	 * labeled alternative in {@link ExprParser#read_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(ExprParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadFile}
	 * labeled alternative in {@link ExprParser#read_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFile(ExprParser.ReadFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValUint}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValUint(ExprParser.ValUintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValInt}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValInt(ExprParser.ValIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(ExprParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID(ExprParser.IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link ExprParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ExprParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_bool}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_bool(ExprParser.Type_boolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_char}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_char(ExprParser.Type_charContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_string}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_string(ExprParser.Type_stringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_file}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_file(ExprParser.Type_fileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_int}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_int(ExprParser.Type_intContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_uint}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_uint(ExprParser.Type_uintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_void}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_void(ExprParser.Type_voidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_float}
	 * labeled alternative in {@link ExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_float(ExprParser.Type_floatContext ctx);
}