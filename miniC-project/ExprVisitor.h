
// Generated from Expr.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"
#include "ExprParser.h"



/**
 * This class defines an abstract visitor for a parse tree
 * produced by ExprParser.
 */
class  ExprVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by ExprParser.
   */
    virtual antlrcpp::Any visitProg(ExprParser::ProgContext *context) = 0;

    virtual antlrcpp::Any visitDecl_start(ExprParser::Decl_startContext *context) = 0;

    virtual antlrcpp::Any visitMethod_start(ExprParser::Method_startContext *context) = 0;

    virtual antlrcpp::Any visitDeclBasic(ExprParser::DeclBasicContext *context) = 0;

    virtual antlrcpp::Any visitDeclArr(ExprParser::DeclArrContext *context) = 0;

    virtual antlrcpp::Any visitArrayDeclaration(ExprParser::ArrayDeclarationContext *context) = 0;

    virtual antlrcpp::Any visitMethod(ExprParser::MethodContext *context) = 0;

    virtual antlrcpp::Any visitArg_decl(ExprParser::Arg_declContext *context) = 0;

    virtual antlrcpp::Any visitArg_param(ExprParser::Arg_paramContext *context) = 0;

    virtual antlrcpp::Any visitBlockstmts(ExprParser::BlockstmtsContext *context) = 0;

    virtual antlrcpp::Any visitBlock_decl(ExprParser::Block_declContext *context) = 0;

    virtual antlrcpp::Any visitBlock_stmt(ExprParser::Block_stmtContext *context) = 0;

    virtual antlrcpp::Any visitExpression(ExprParser::ExpressionContext *context) = 0;

    virtual antlrcpp::Any visitCondBlock(ExprParser::CondBlockContext *context) = 0;

    virtual antlrcpp::Any visitIfBlock(ExprParser::IfBlockContext *context) = 0;

    virtual antlrcpp::Any visitForBlock(ExprParser::ForBlockContext *context) = 0;

    virtual antlrcpp::Any visitWhileBlock(ExprParser::WhileBlockContext *context) = 0;

    virtual antlrcpp::Any visitOutBlock(ExprParser::OutBlockContext *context) = 0;

    virtual antlrcpp::Any visitReturnBasic(ExprParser::ReturnBasicContext *context) = 0;

    virtual antlrcpp::Any visitReturnValue(ExprParser::ReturnValueContext *context) = 0;

    virtual antlrcpp::Any visitBreak(ExprParser::BreakContext *context) = 0;

    virtual antlrcpp::Any visitContinue(ExprParser::ContinueContext *context) = 0;

    virtual antlrcpp::Any visitMulDivModExp(ExprParser::MulDivModExpContext *context) = 0;

    virtual antlrcpp::Any visitNotExp(ExprParser::NotExpContext *context) = 0;

    virtual antlrcpp::Any visitOpenBlock(ExprParser::OpenBlockContext *context) = 0;

    virtual antlrcpp::Any visitValTerminal(ExprParser::ValTerminalContext *context) = 0;

    virtual antlrcpp::Any visitArrayId(ExprParser::ArrayIdContext *context) = 0;

    virtual antlrcpp::Any visitCondOp(ExprParser::CondOpContext *context) = 0;

    virtual antlrcpp::Any visitTrue(ExprParser::TrueContext *context) = 0;

    virtual antlrcpp::Any visitFalse(ExprParser::FalseContext *context) = 0;

    virtual antlrcpp::Any visitReadBlock(ExprParser::ReadBlockContext *context) = 0;

    virtual antlrcpp::Any visitFuncCall(ExprParser::FuncCallContext *context) = 0;

    virtual antlrcpp::Any visitParenthesis(ExprParser::ParenthesisContext *context) = 0;

    virtual antlrcpp::Any visitAddSubExp(ExprParser::AddSubExpContext *context) = 0;

    virtual antlrcpp::Any visitBoolOp(ExprParser::BoolOpContext *context) = 0;

    virtual antlrcpp::Any visitAssgnOp(ExprParser::AssgnOpContext *context) = 0;

    virtual antlrcpp::Any visitArrayIdentifier(ExprParser::ArrayIdentifierContext *context) = 0;

    virtual antlrcpp::Any visitRead(ExprParser::ReadContext *context) = 0;

    virtual antlrcpp::Any visitReadFile(ExprParser::ReadFileContext *context) = 0;

    virtual antlrcpp::Any visitValUint(ExprParser::ValUintContext *context) = 0;

    virtual antlrcpp::Any visitValInt(ExprParser::ValIntContext *context) = 0;

    virtual antlrcpp::Any visitFloat(ExprParser::FloatContext *context) = 0;

    virtual antlrcpp::Any visitID(ExprParser::IDContext *context) = 0;

    virtual antlrcpp::Any visitString(ExprParser::StringContext *context) = 0;

    virtual antlrcpp::Any visitType_bool(ExprParser::Type_boolContext *context) = 0;

    virtual antlrcpp::Any visitType_char(ExprParser::Type_charContext *context) = 0;

    virtual antlrcpp::Any visitType_string(ExprParser::Type_stringContext *context) = 0;

    virtual antlrcpp::Any visitType_file(ExprParser::Type_fileContext *context) = 0;

    virtual antlrcpp::Any visitType_int(ExprParser::Type_intContext *context) = 0;

    virtual antlrcpp::Any visitType_uint(ExprParser::Type_uintContext *context) = 0;

    virtual antlrcpp::Any visitType_void(ExprParser::Type_voidContext *context) = 0;

    virtual antlrcpp::Any visitType_float(ExprParser::Type_floatContext *context) = 0;


};

