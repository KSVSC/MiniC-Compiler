
// Generated from Expr.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"
#include "ExprVisitor.h"


/**
 * This class provides an empty implementation of ExprVisitor, which can be
 * extended to create a visitor which only needs to handle a subset of the available methods.
 */
class  ExprBaseVisitor : public ExprVisitor {
public:

  virtual antlrcpp::Any visitProg(ExprParser::ProgContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitDecl_start(ExprParser::Decl_startContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitMethod_start(ExprParser::Method_startContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitDeclBasic(ExprParser::DeclBasicContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitDeclArr(ExprParser::DeclArrContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArrayDeclaration(ExprParser::ArrayDeclarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitMethod(ExprParser::MethodContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArg_decl(ExprParser::Arg_declContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArg_param(ExprParser::Arg_paramContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlockstmts(ExprParser::BlockstmtsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlock_decl(ExprParser::Block_declContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlock_stmt(ExprParser::Block_stmtContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitExpression(ExprParser::ExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCondBlock(ExprParser::CondBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIfBlock(ExprParser::IfBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitForBlock(ExprParser::ForBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitWhileBlock(ExprParser::WhileBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitOutBlock(ExprParser::OutBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitReturnBasic(ExprParser::ReturnBasicContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitReturnValue(ExprParser::ReturnValueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBreak(ExprParser::BreakContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitContinue(ExprParser::ContinueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitMulDivModExp(ExprParser::MulDivModExpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitNotExp(ExprParser::NotExpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitOpenBlock(ExprParser::OpenBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitValTerminal(ExprParser::ValTerminalContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArrayId(ExprParser::ArrayIdContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCondOp(ExprParser::CondOpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitTrue(ExprParser::TrueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFalse(ExprParser::FalseContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitReadBlock(ExprParser::ReadBlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFuncCall(ExprParser::FuncCallContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitParenthesis(ExprParser::ParenthesisContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAddSubExp(ExprParser::AddSubExpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBoolOp(ExprParser::BoolOpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAssgnOp(ExprParser::AssgnOpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArrayIdentifier(ExprParser::ArrayIdentifierContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitRead(ExprParser::ReadContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitReadFile(ExprParser::ReadFileContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitValUint(ExprParser::ValUintContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitValInt(ExprParser::ValIntContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFloat(ExprParser::FloatContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitID(ExprParser::IDContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitString(ExprParser::StringContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitType_bool(ExprParser::Type_boolContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitType_char(ExprParser::Type_charContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitType_string(ExprParser::Type_stringContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitType_file(ExprParser::Type_fileContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitType_int(ExprParser::Type_intContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitType_uint(ExprParser::Type_uintContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitType_void(ExprParser::Type_voidContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitType_float(ExprParser::Type_floatContext *ctx) override {
    return visitChildren(ctx);
  }


};

