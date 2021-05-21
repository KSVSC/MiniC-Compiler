
// Generated from Expr.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"




class  ExprParser : public antlr4::Parser {
public:
  enum {
    T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, 
    T__7 = 8, T__8 = 9, T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, 
    T__14 = 15, T__15 = 16, T__16 = 17, T__17 = 18, T__18 = 19, T__19 = 20, 
    T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24, T__24 = 25, T__25 = 26, 
    T__26 = 27, T__27 = 28, T__28 = 29, T__29 = 30, T__30 = 31, T__31 = 32, 
    T__32 = 33, Type_uint = 34, Type_int = 35, Type_float = 36, Type_char = 37, 
    Type_string = 38, Type_void = 39, Type_bool = 40, Type_file = 41, True = 42, 
    False = 43, Continue = 44, Break = 45, Return = 46, Read = 47, Asgn_op = 48, 
    MAIN = 49, U_INT = 50, INT = 51, FLOAT = 52, ID = 53, STRING = 54, FUNC = 55, 
    NEWLINE = 56, WS = 57
  };

  enum {
    RuleProg = 0, RuleStart = 1, RuleDecl = 2, RuleArrayDeclaration = 3, 
    RuleMethod = 4, RuleArgs = 5, RuleBlock = 6, RuleStmt = 7, RuleExpr = 8, 
    RuleArrayIdentifier = 9, RuleRead_block = 10, RuleValue = 11, RuleType = 12
  };

  ExprParser(antlr4::TokenStream *input);
  ~ExprParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class ProgContext;
  class StartContext;
  class DeclContext;
  class ArrayDeclarationContext;
  class MethodContext;
  class ArgsContext;
  class BlockContext;
  class StmtContext;
  class ExprContext;
  class ArrayIdentifierContext;
  class Read_blockContext;
  class ValueContext;
  class TypeContext; 

  class  ProgContext : public antlr4::ParserRuleContext {
  public:
    ProgContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *NEWLINE();
    std::vector<StartContext *> start();
    StartContext* start(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ProgContext* prog();

  class  StartContext : public antlr4::ParserRuleContext {
  public:
    StartContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    StartContext() = default;
    void copyFrom(StartContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  Decl_startContext : public StartContext {
  public:
    Decl_startContext(StartContext *ctx);

    DeclContext *decl();
    antlr4::tree::TerminalNode *NEWLINE();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  Method_startContext : public StartContext {
  public:
    Method_startContext(StartContext *ctx);

    MethodContext *method();
    antlr4::tree::TerminalNode *NEWLINE();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  StartContext* start();

  class  DeclContext : public antlr4::ParserRuleContext {
  public:
    DeclContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    DeclContext() = default;
    void copyFrom(DeclContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  DeclArrContext : public DeclContext {
  public:
    DeclArrContext(DeclContext *ctx);

    TypeContext *type();
    ArrayDeclarationContext *arrayDeclaration();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  DeclBasicContext : public DeclContext {
  public:
    DeclBasicContext(DeclContext *ctx);

    TypeContext *type();
    antlr4::tree::TerminalNode *ID();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  DeclContext* decl();

  class  ArrayDeclarationContext : public antlr4::ParserRuleContext {
  public:
    ArrayDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ID();
    std::vector<antlr4::tree::TerminalNode *> U_INT();
    antlr4::tree::TerminalNode* U_INT(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayDeclarationContext* arrayDeclaration();

  class  MethodContext : public antlr4::ParserRuleContext {
  public:
    MethodContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeContext *type();
    antlr4::tree::TerminalNode *FUNC();
    ArgsContext *args();
    antlr4::tree::TerminalNode *NEWLINE();
    BlockContext *block();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodContext* method();

  class  ArgsContext : public antlr4::ParserRuleContext {
  public:
    ArgsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    ArgsContext() = default;
    void copyFrom(ArgsContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  Arg_paramContext : public ArgsContext {
  public:
    Arg_paramContext(ArgsContext *ctx);

    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  Arg_declContext : public ArgsContext {
  public:
    Arg_declContext(ArgsContext *ctx);

    std::vector<DeclContext *> decl();
    DeclContext* decl(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  ArgsContext* args();

  class  BlockContext : public antlr4::ParserRuleContext {
  public:
    BlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    BlockContext() = default;
    void copyFrom(BlockContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  BlockstmtsContext : public BlockContext {
  public:
    BlockstmtsContext(BlockContext *ctx);

    antlr4::tree::TerminalNode *NEWLINE();
    std::vector<BlockContext *> block();
    BlockContext* block(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  Block_stmtContext : public BlockContext {
  public:
    Block_stmtContext(BlockContext *ctx);

    StmtContext *stmt();
    antlr4::tree::TerminalNode *NEWLINE();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  Block_declContext : public BlockContext {
  public:
    Block_declContext(BlockContext *ctx);

    DeclContext *decl();
    antlr4::tree::TerminalNode *NEWLINE();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  BlockContext* block();

  class  StmtContext : public antlr4::ParserRuleContext {
  public:
    StmtContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    StmtContext() = default;
    void copyFrom(StmtContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  WhileBlockContext : public StmtContext {
  public:
    WhileBlockContext(StmtContext *ctx);

    ExprContext *expr();
    antlr4::tree::TerminalNode *NEWLINE();
    BlockContext *block();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  OutBlockContext : public StmtContext {
  public:
    OutBlockContext(StmtContext *ctx);

    ExprContext *expr();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ExpressionContext : public StmtContext {
  public:
    ExpressionContext(StmtContext *ctx);

    ExprContext *expr();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ForBlockContext : public StmtContext {
  public:
    ForBlockContext(StmtContext *ctx);

    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);
    antlr4::tree::TerminalNode *NEWLINE();
    BlockContext *block();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  BreakContext : public StmtContext {
  public:
    BreakContext(StmtContext *ctx);

    antlr4::tree::TerminalNode *Break();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  CondBlockContext : public StmtContext {
  public:
    CondBlockContext(StmtContext *ctx);

    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  IfBlockContext : public StmtContext {
  public:
    IfBlockContext(StmtContext *ctx);

    ExprContext *expr();
    std::vector<antlr4::tree::TerminalNode *> NEWLINE();
    antlr4::tree::TerminalNode* NEWLINE(size_t i);
    std::vector<BlockContext *> block();
    BlockContext* block(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ReturnValueContext : public StmtContext {
  public:
    ReturnValueContext(StmtContext *ctx);

    antlr4::tree::TerminalNode *Return();
    ExprContext *expr();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ReturnBasicContext : public StmtContext {
  public:
    ReturnBasicContext(StmtContext *ctx);

    antlr4::tree::TerminalNode *Return();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ContinueContext : public StmtContext {
  public:
    ContinueContext(StmtContext *ctx);

    antlr4::tree::TerminalNode *Continue();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  StmtContext* stmt();

  class  ExprContext : public antlr4::ParserRuleContext {
  public:
    ExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    ExprContext() = default;
    void copyFrom(ExprContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  MulDivModExpContext : public ExprContext {
  public:
    MulDivModExpContext(ExprContext *ctx);

    antlr4::Token *op = nullptr;
    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  NotExpContext : public ExprContext {
  public:
    NotExpContext(ExprContext *ctx);

    ExprContext *expr();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  OpenBlockContext : public ExprContext {
  public:
    OpenBlockContext(ExprContext *ctx);

    antlr4::tree::TerminalNode *ID();
    antlr4::tree::TerminalNode *STRING();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ValTerminalContext : public ExprContext {
  public:
    ValTerminalContext(ExprContext *ctx);

    ValueContext *value();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ArrayIdContext : public ExprContext {
  public:
    ArrayIdContext(ExprContext *ctx);

    ArrayIdentifierContext *arrayIdentifier();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  CondOpContext : public ExprContext {
  public:
    CondOpContext(ExprContext *ctx);

    antlr4::Token *cond_op = nullptr;
    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  TrueContext : public ExprContext {
  public:
    TrueContext(ExprContext *ctx);

    antlr4::tree::TerminalNode *True();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  FalseContext : public ExprContext {
  public:
    FalseContext(ExprContext *ctx);

    antlr4::tree::TerminalNode *False();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ReadBlockContext : public ExprContext {
  public:
    ReadBlockContext(ExprContext *ctx);

    Read_blockContext *read_block();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  FuncCallContext : public ExprContext {
  public:
    FuncCallContext(ExprContext *ctx);

    antlr4::tree::TerminalNode *FUNC();
    ArgsContext *args();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ParenthesisContext : public ExprContext {
  public:
    ParenthesisContext(ExprContext *ctx);

    ExprContext *expr();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  AddSubExpContext : public ExprContext {
  public:
    AddSubExpContext(ExprContext *ctx);

    antlr4::Token *op = nullptr;
    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  BoolOpContext : public ExprContext {
  public:
    BoolOpContext(ExprContext *ctx);

    antlr4::Token *bool_op = nullptr;
    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  AssgnOpContext : public ExprContext {
  public:
    AssgnOpContext(ExprContext *ctx);

    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);
    antlr4::tree::TerminalNode *Asgn_op();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  ExprContext* expr();
  ExprContext* expr(int precedence);
  class  ArrayIdentifierContext : public antlr4::ParserRuleContext {
  public:
    ArrayIdentifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ID();
    std::vector<ExprContext *> expr();
    ExprContext* expr(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayIdentifierContext* arrayIdentifier();

  class  Read_blockContext : public antlr4::ParserRuleContext {
  public:
    Read_blockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    Read_blockContext() = default;
    void copyFrom(Read_blockContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  ReadContext : public Read_blockContext {
  public:
    ReadContext(Read_blockContext *ctx);

    antlr4::tree::TerminalNode *Read();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ReadFileContext : public Read_blockContext {
  public:
    ReadFileContext(Read_blockContext *ctx);

    antlr4::tree::TerminalNode *ID();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  Read_blockContext* read_block();

  class  ValueContext : public antlr4::ParserRuleContext {
  public:
    ValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    ValueContext() = default;
    void copyFrom(ValueContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  FloatContext : public ValueContext {
  public:
    FloatContext(ValueContext *ctx);

    antlr4::tree::TerminalNode *FLOAT();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ValUintContext : public ValueContext {
  public:
    ValUintContext(ValueContext *ctx);

    antlr4::tree::TerminalNode *U_INT();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  ValIntContext : public ValueContext {
  public:
    ValIntContext(ValueContext *ctx);

    antlr4::tree::TerminalNode *INT();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  IDContext : public ValueContext {
  public:
    IDContext(ValueContext *ctx);

    antlr4::tree::TerminalNode *ID();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  StringContext : public ValueContext {
  public:
    StringContext(ValueContext *ctx);

    antlr4::tree::TerminalNode *STRING();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  ValueContext* value();

  class  TypeContext : public antlr4::ParserRuleContext {
  public:
    TypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
   
    TypeContext() = default;
    void copyFrom(TypeContext *context);
    using antlr4::ParserRuleContext::copyFrom;

    virtual size_t getRuleIndex() const override;

   
  };

  class  Type_floatContext : public TypeContext {
  public:
    Type_floatContext(TypeContext *ctx);

    antlr4::tree::TerminalNode *Type_float();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  Type_boolContext : public TypeContext {
  public:
    Type_boolContext(TypeContext *ctx);

    antlr4::tree::TerminalNode *Type_bool();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  Type_fileContext : public TypeContext {
  public:
    Type_fileContext(TypeContext *ctx);

    antlr4::tree::TerminalNode *Type_file();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  Type_voidContext : public TypeContext {
  public:
    Type_voidContext(TypeContext *ctx);

    antlr4::tree::TerminalNode *Type_void();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  Type_charContext : public TypeContext {
  public:
    Type_charContext(TypeContext *ctx);

    antlr4::tree::TerminalNode *Type_char();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  Type_intContext : public TypeContext {
  public:
    Type_intContext(TypeContext *ctx);

    antlr4::tree::TerminalNode *Type_int();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  Type_uintContext : public TypeContext {
  public:
    Type_uintContext(TypeContext *ctx);

    antlr4::tree::TerminalNode *Type_uint();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  class  Type_stringContext : public TypeContext {
  public:
    Type_stringContext(TypeContext *ctx);

    antlr4::tree::TerminalNode *Type_string();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
  };

  TypeContext* type();


  virtual bool sempred(antlr4::RuleContext *_localctx, size_t ruleIndex, size_t predicateIndex) override;
  bool exprSempred(ExprContext *_localctx, size_t predicateIndex);

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

