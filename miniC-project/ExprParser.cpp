
// Generated from Expr.g4 by ANTLR 4.8


#include "ExprVisitor.h"

#include "ExprParser.h"


using namespace antlrcpp;
using namespace antlr4;

ExprParser::ExprParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

ExprParser::~ExprParser() {
  delete _interpreter;
}

std::string ExprParser::getGrammarFileName() const {
  return "Expr.g4";
}

const std::vector<std::string>& ExprParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& ExprParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- ProgContext ------------------------------------------------------------------

ExprParser::ProgContext::ProgContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::ProgContext::NEWLINE() {
  return getToken(ExprParser::NEWLINE, 0);
}

std::vector<ExprParser::StartContext *> ExprParser::ProgContext::start() {
  return getRuleContexts<ExprParser::StartContext>();
}

ExprParser::StartContext* ExprParser::ProgContext::start(size_t i) {
  return getRuleContext<ExprParser::StartContext>(i);
}


size_t ExprParser::ProgContext::getRuleIndex() const {
  return ExprParser::RuleProg;
}


antlrcpp::Any ExprParser::ProgContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitProg(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::ProgContext* ExprParser::prog() {
  ProgContext *_localctx = _tracker.createInstance<ProgContext>(_ctx, getState());
  enterRule(_localctx, 0, ExprParser::RuleProg);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(26);
    match(ExprParser::T__0);
    setState(27);
    match(ExprParser::NEWLINE);
    setState(29); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(28);
      start();
      setState(31); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << ExprParser::Type_uint)
      | (1ULL << ExprParser::Type_int)
      | (1ULL << ExprParser::Type_float)
      | (1ULL << ExprParser::Type_char)
      | (1ULL << ExprParser::Type_string)
      | (1ULL << ExprParser::Type_void)
      | (1ULL << ExprParser::Type_bool)
      | (1ULL << ExprParser::Type_file))) != 0));
    setState(33);
    match(ExprParser::T__1);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StartContext ------------------------------------------------------------------

ExprParser::StartContext::StartContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t ExprParser::StartContext::getRuleIndex() const {
  return ExprParser::RuleStart;
}

void ExprParser::StartContext::copyFrom(StartContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- Decl_startContext ------------------------------------------------------------------

ExprParser::DeclContext* ExprParser::Decl_startContext::decl() {
  return getRuleContext<ExprParser::DeclContext>(0);
}

tree::TerminalNode* ExprParser::Decl_startContext::NEWLINE() {
  return getToken(ExprParser::NEWLINE, 0);
}

ExprParser::Decl_startContext::Decl_startContext(StartContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::Decl_startContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitDecl_start(this);
  else
    return visitor->visitChildren(this);
}
//----------------- Method_startContext ------------------------------------------------------------------

ExprParser::MethodContext* ExprParser::Method_startContext::method() {
  return getRuleContext<ExprParser::MethodContext>(0);
}

tree::TerminalNode* ExprParser::Method_startContext::NEWLINE() {
  return getToken(ExprParser::NEWLINE, 0);
}

ExprParser::Method_startContext::Method_startContext(StartContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::Method_startContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitMethod_start(this);
  else
    return visitor->visitChildren(this);
}
ExprParser::StartContext* ExprParser::start() {
  StartContext *_localctx = _tracker.createInstance<StartContext>(_ctx, getState());
  enterRule(_localctx, 2, ExprParser::RuleStart);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(41);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      _localctx = dynamic_cast<StartContext *>(_tracker.createInstance<ExprParser::Decl_startContext>(_localctx));
      enterOuterAlt(_localctx, 1);
      setState(35);
      decl();
      setState(36);
      match(ExprParser::NEWLINE);
      break;
    }

    case 2: {
      _localctx = dynamic_cast<StartContext *>(_tracker.createInstance<ExprParser::Method_startContext>(_localctx));
      enterOuterAlt(_localctx, 2);
      setState(38);
      method();
      setState(39);
      match(ExprParser::NEWLINE);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- DeclContext ------------------------------------------------------------------

ExprParser::DeclContext::DeclContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t ExprParser::DeclContext::getRuleIndex() const {
  return ExprParser::RuleDecl;
}

void ExprParser::DeclContext::copyFrom(DeclContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- DeclArrContext ------------------------------------------------------------------

ExprParser::TypeContext* ExprParser::DeclArrContext::type() {
  return getRuleContext<ExprParser::TypeContext>(0);
}

ExprParser::ArrayDeclarationContext* ExprParser::DeclArrContext::arrayDeclaration() {
  return getRuleContext<ExprParser::ArrayDeclarationContext>(0);
}

ExprParser::DeclArrContext::DeclArrContext(DeclContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::DeclArrContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitDeclArr(this);
  else
    return visitor->visitChildren(this);
}
//----------------- DeclBasicContext ------------------------------------------------------------------

ExprParser::TypeContext* ExprParser::DeclBasicContext::type() {
  return getRuleContext<ExprParser::TypeContext>(0);
}

tree::TerminalNode* ExprParser::DeclBasicContext::ID() {
  return getToken(ExprParser::ID, 0);
}

ExprParser::DeclBasicContext::DeclBasicContext(DeclContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::DeclBasicContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitDeclBasic(this);
  else
    return visitor->visitChildren(this);
}
ExprParser::DeclContext* ExprParser::decl() {
  DeclContext *_localctx = _tracker.createInstance<DeclContext>(_ctx, getState());
  enterRule(_localctx, 4, ExprParser::RuleDecl);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(49);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      _localctx = dynamic_cast<DeclContext *>(_tracker.createInstance<ExprParser::DeclBasicContext>(_localctx));
      enterOuterAlt(_localctx, 1);
      setState(43);
      type();
      setState(44);
      match(ExprParser::ID);
      break;
    }

    case 2: {
      _localctx = dynamic_cast<DeclContext *>(_tracker.createInstance<ExprParser::DeclArrContext>(_localctx));
      enterOuterAlt(_localctx, 2);
      setState(46);
      type();
      setState(47);
      arrayDeclaration();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArrayDeclarationContext ------------------------------------------------------------------

ExprParser::ArrayDeclarationContext::ArrayDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::ArrayDeclarationContext::ID() {
  return getToken(ExprParser::ID, 0);
}

std::vector<tree::TerminalNode *> ExprParser::ArrayDeclarationContext::U_INT() {
  return getTokens(ExprParser::U_INT);
}

tree::TerminalNode* ExprParser::ArrayDeclarationContext::U_INT(size_t i) {
  return getToken(ExprParser::U_INT, i);
}


size_t ExprParser::ArrayDeclarationContext::getRuleIndex() const {
  return ExprParser::RuleArrayDeclaration;
}


antlrcpp::Any ExprParser::ArrayDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitArrayDeclaration(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::ArrayDeclarationContext* ExprParser::arrayDeclaration() {
  ArrayDeclarationContext *_localctx = _tracker.createInstance<ArrayDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 6, ExprParser::RuleArrayDeclaration);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(51);
    match(ExprParser::ID);
    setState(55); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(52);
      match(ExprParser::T__2);
      setState(53);
      match(ExprParser::U_INT);
      setState(54);
      match(ExprParser::T__3);
      setState(57); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == ExprParser::T__2);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- MethodContext ------------------------------------------------------------------

ExprParser::MethodContext::MethodContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

ExprParser::TypeContext* ExprParser::MethodContext::type() {
  return getRuleContext<ExprParser::TypeContext>(0);
}

tree::TerminalNode* ExprParser::MethodContext::FUNC() {
  return getToken(ExprParser::FUNC, 0);
}

ExprParser::ArgsContext* ExprParser::MethodContext::args() {
  return getRuleContext<ExprParser::ArgsContext>(0);
}

tree::TerminalNode* ExprParser::MethodContext::NEWLINE() {
  return getToken(ExprParser::NEWLINE, 0);
}

ExprParser::BlockContext* ExprParser::MethodContext::block() {
  return getRuleContext<ExprParser::BlockContext>(0);
}


size_t ExprParser::MethodContext::getRuleIndex() const {
  return ExprParser::RuleMethod;
}


antlrcpp::Any ExprParser::MethodContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitMethod(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::MethodContext* ExprParser::method() {
  MethodContext *_localctx = _tracker.createInstance<MethodContext>(_ctx, getState());
  enterRule(_localctx, 8, ExprParser::RuleMethod);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(59);
    type();
    setState(60);
    match(ExprParser::FUNC);
    setState(61);
    match(ExprParser::T__4);
    setState(62);
    args();
    setState(63);
    match(ExprParser::T__5);
    setState(64);
    match(ExprParser::NEWLINE);
    setState(65);
    block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArgsContext ------------------------------------------------------------------

ExprParser::ArgsContext::ArgsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t ExprParser::ArgsContext::getRuleIndex() const {
  return ExprParser::RuleArgs;
}

void ExprParser::ArgsContext::copyFrom(ArgsContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- Arg_paramContext ------------------------------------------------------------------

std::vector<ExprParser::ExprContext *> ExprParser::Arg_paramContext::expr() {
  return getRuleContexts<ExprParser::ExprContext>();
}

ExprParser::ExprContext* ExprParser::Arg_paramContext::expr(size_t i) {
  return getRuleContext<ExprParser::ExprContext>(i);
}

ExprParser::Arg_paramContext::Arg_paramContext(ArgsContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::Arg_paramContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitArg_param(this);
  else
    return visitor->visitChildren(this);
}
//----------------- Arg_declContext ------------------------------------------------------------------

std::vector<ExprParser::DeclContext *> ExprParser::Arg_declContext::decl() {
  return getRuleContexts<ExprParser::DeclContext>();
}

ExprParser::DeclContext* ExprParser::Arg_declContext::decl(size_t i) {
  return getRuleContext<ExprParser::DeclContext>(i);
}

ExprParser::Arg_declContext::Arg_declContext(ArgsContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::Arg_declContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitArg_decl(this);
  else
    return visitor->visitChildren(this);
}
ExprParser::ArgsContext* ExprParser::args() {
  ArgsContext *_localctx = _tracker.createInstance<ArgsContext>(_ctx, getState());
  enterRule(_localctx, 10, ExprParser::RuleArgs);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(79);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx)) {
    case 1: {
      _localctx = dynamic_cast<ArgsContext *>(_tracker.createInstance<ExprParser::Arg_declContext>(_localctx));
      enterOuterAlt(_localctx, 1);
      setState(70);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << ExprParser::Type_uint)
        | (1ULL << ExprParser::Type_int)
        | (1ULL << ExprParser::Type_float)
        | (1ULL << ExprParser::Type_char)
        | (1ULL << ExprParser::Type_string)
        | (1ULL << ExprParser::Type_void)
        | (1ULL << ExprParser::Type_bool)
        | (1ULL << ExprParser::Type_file))) != 0)) {
        setState(67);
        decl();
        setState(72);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
      break;
    }

    case 2: {
      _localctx = dynamic_cast<ArgsContext *>(_tracker.createInstance<ExprParser::Arg_paramContext>(_localctx));
      enterOuterAlt(_localctx, 2);
      setState(76);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << ExprParser::T__4)
        | (1ULL << ExprParser::T__21)
        | (1ULL << ExprParser::T__30)
        | (1ULL << ExprParser::T__32)
        | (1ULL << ExprParser::True)
        | (1ULL << ExprParser::False)
        | (1ULL << ExprParser::Read)
        | (1ULL << ExprParser::U_INT)
        | (1ULL << ExprParser::INT)
        | (1ULL << ExprParser::FLOAT)
        | (1ULL << ExprParser::ID)
        | (1ULL << ExprParser::STRING)
        | (1ULL << ExprParser::FUNC))) != 0)) {
        setState(73);
        expr(0);
        setState(78);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockContext ------------------------------------------------------------------

ExprParser::BlockContext::BlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t ExprParser::BlockContext::getRuleIndex() const {
  return ExprParser::RuleBlock;
}

void ExprParser::BlockContext::copyFrom(BlockContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- BlockstmtsContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::BlockstmtsContext::NEWLINE() {
  return getToken(ExprParser::NEWLINE, 0);
}

std::vector<ExprParser::BlockContext *> ExprParser::BlockstmtsContext::block() {
  return getRuleContexts<ExprParser::BlockContext>();
}

ExprParser::BlockContext* ExprParser::BlockstmtsContext::block(size_t i) {
  return getRuleContext<ExprParser::BlockContext>(i);
}

ExprParser::BlockstmtsContext::BlockstmtsContext(BlockContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::BlockstmtsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitBlockstmts(this);
  else
    return visitor->visitChildren(this);
}
//----------------- Block_stmtContext ------------------------------------------------------------------

ExprParser::StmtContext* ExprParser::Block_stmtContext::stmt() {
  return getRuleContext<ExprParser::StmtContext>(0);
}

tree::TerminalNode* ExprParser::Block_stmtContext::NEWLINE() {
  return getToken(ExprParser::NEWLINE, 0);
}

ExprParser::Block_stmtContext::Block_stmtContext(BlockContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::Block_stmtContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitBlock_stmt(this);
  else
    return visitor->visitChildren(this);
}
//----------------- Block_declContext ------------------------------------------------------------------

ExprParser::DeclContext* ExprParser::Block_declContext::decl() {
  return getRuleContext<ExprParser::DeclContext>(0);
}

tree::TerminalNode* ExprParser::Block_declContext::NEWLINE() {
  return getToken(ExprParser::NEWLINE, 0);
}

ExprParser::Block_declContext::Block_declContext(BlockContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::Block_declContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitBlock_decl(this);
  else
    return visitor->visitChildren(this);
}
ExprParser::BlockContext* ExprParser::block() {
  BlockContext *_localctx = _tracker.createInstance<BlockContext>(_ctx, getState());
  enterRule(_localctx, 12, ExprParser::RuleBlock);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(96);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case ExprParser::T__6: {
        _localctx = dynamic_cast<BlockContext *>(_tracker.createInstance<ExprParser::BlockstmtsContext>(_localctx));
        enterOuterAlt(_localctx, 1);
        setState(81);
        match(ExprParser::T__6);
        setState(82);
        match(ExprParser::NEWLINE);
        setState(86);
        _errHandler->sync(this);
        _la = _input->LA(1);
        while ((((_la & ~ 0x3fULL) == 0) &&
          ((1ULL << _la) & ((1ULL << ExprParser::T__4)
          | (1ULL << ExprParser::T__6)
          | (1ULL << ExprParser::T__9)
          | (1ULL << ExprParser::T__12)
          | (1ULL << ExprParser::T__14)
          | (1ULL << ExprParser::T__15)
          | (1ULL << ExprParser::T__21)
          | (1ULL << ExprParser::T__30)
          | (1ULL << ExprParser::T__32)
          | (1ULL << ExprParser::Type_uint)
          | (1ULL << ExprParser::Type_int)
          | (1ULL << ExprParser::Type_float)
          | (1ULL << ExprParser::Type_char)
          | (1ULL << ExprParser::Type_string)
          | (1ULL << ExprParser::Type_void)
          | (1ULL << ExprParser::Type_bool)
          | (1ULL << ExprParser::Type_file)
          | (1ULL << ExprParser::True)
          | (1ULL << ExprParser::False)
          | (1ULL << ExprParser::Continue)
          | (1ULL << ExprParser::Break)
          | (1ULL << ExprParser::Return)
          | (1ULL << ExprParser::Read)
          | (1ULL << ExprParser::U_INT)
          | (1ULL << ExprParser::INT)
          | (1ULL << ExprParser::FLOAT)
          | (1ULL << ExprParser::ID)
          | (1ULL << ExprParser::STRING)
          | (1ULL << ExprParser::FUNC))) != 0)) {
          setState(83);
          block();
          setState(88);
          _errHandler->sync(this);
          _la = _input->LA(1);
        }
        setState(89);
        match(ExprParser::T__1);
        break;
      }

      case ExprParser::Type_uint:
      case ExprParser::Type_int:
      case ExprParser::Type_float:
      case ExprParser::Type_char:
      case ExprParser::Type_string:
      case ExprParser::Type_void:
      case ExprParser::Type_bool:
      case ExprParser::Type_file: {
        _localctx = dynamic_cast<BlockContext *>(_tracker.createInstance<ExprParser::Block_declContext>(_localctx));
        enterOuterAlt(_localctx, 2);
        setState(90);
        decl();
        setState(91);
        match(ExprParser::NEWLINE);
        break;
      }

      case ExprParser::T__4:
      case ExprParser::T__9:
      case ExprParser::T__12:
      case ExprParser::T__14:
      case ExprParser::T__15:
      case ExprParser::T__21:
      case ExprParser::T__30:
      case ExprParser::T__32:
      case ExprParser::True:
      case ExprParser::False:
      case ExprParser::Continue:
      case ExprParser::Break:
      case ExprParser::Return:
      case ExprParser::Read:
      case ExprParser::U_INT:
      case ExprParser::INT:
      case ExprParser::FLOAT:
      case ExprParser::ID:
      case ExprParser::STRING:
      case ExprParser::FUNC: {
        _localctx = dynamic_cast<BlockContext *>(_tracker.createInstance<ExprParser::Block_stmtContext>(_localctx));
        enterOuterAlt(_localctx, 3);
        setState(93);
        stmt();
        setState(94);
        match(ExprParser::NEWLINE);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StmtContext ------------------------------------------------------------------

ExprParser::StmtContext::StmtContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t ExprParser::StmtContext::getRuleIndex() const {
  return ExprParser::RuleStmt;
}

void ExprParser::StmtContext::copyFrom(StmtContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- WhileBlockContext ------------------------------------------------------------------

ExprParser::ExprContext* ExprParser::WhileBlockContext::expr() {
  return getRuleContext<ExprParser::ExprContext>(0);
}

tree::TerminalNode* ExprParser::WhileBlockContext::NEWLINE() {
  return getToken(ExprParser::NEWLINE, 0);
}

ExprParser::BlockContext* ExprParser::WhileBlockContext::block() {
  return getRuleContext<ExprParser::BlockContext>(0);
}

ExprParser::WhileBlockContext::WhileBlockContext(StmtContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::WhileBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitWhileBlock(this);
  else
    return visitor->visitChildren(this);
}
//----------------- OutBlockContext ------------------------------------------------------------------

ExprParser::ExprContext* ExprParser::OutBlockContext::expr() {
  return getRuleContext<ExprParser::ExprContext>(0);
}

ExprParser::OutBlockContext::OutBlockContext(StmtContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::OutBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitOutBlock(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ExpressionContext ------------------------------------------------------------------

ExprParser::ExprContext* ExprParser::ExpressionContext::expr() {
  return getRuleContext<ExprParser::ExprContext>(0);
}

ExprParser::ExpressionContext::ExpressionContext(StmtContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::ExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitExpression(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ForBlockContext ------------------------------------------------------------------

std::vector<ExprParser::ExprContext *> ExprParser::ForBlockContext::expr() {
  return getRuleContexts<ExprParser::ExprContext>();
}

ExprParser::ExprContext* ExprParser::ForBlockContext::expr(size_t i) {
  return getRuleContext<ExprParser::ExprContext>(i);
}

tree::TerminalNode* ExprParser::ForBlockContext::NEWLINE() {
  return getToken(ExprParser::NEWLINE, 0);
}

ExprParser::BlockContext* ExprParser::ForBlockContext::block() {
  return getRuleContext<ExprParser::BlockContext>(0);
}

ExprParser::ForBlockContext::ForBlockContext(StmtContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::ForBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitForBlock(this);
  else
    return visitor->visitChildren(this);
}
//----------------- BreakContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::BreakContext::Break() {
  return getToken(ExprParser::Break, 0);
}

ExprParser::BreakContext::BreakContext(StmtContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::BreakContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitBreak(this);
  else
    return visitor->visitChildren(this);
}
//----------------- CondBlockContext ------------------------------------------------------------------

std::vector<ExprParser::ExprContext *> ExprParser::CondBlockContext::expr() {
  return getRuleContexts<ExprParser::ExprContext>();
}

ExprParser::ExprContext* ExprParser::CondBlockContext::expr(size_t i) {
  return getRuleContext<ExprParser::ExprContext>(i);
}

ExprParser::CondBlockContext::CondBlockContext(StmtContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::CondBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitCondBlock(this);
  else
    return visitor->visitChildren(this);
}
//----------------- IfBlockContext ------------------------------------------------------------------

ExprParser::ExprContext* ExprParser::IfBlockContext::expr() {
  return getRuleContext<ExprParser::ExprContext>(0);
}

std::vector<tree::TerminalNode *> ExprParser::IfBlockContext::NEWLINE() {
  return getTokens(ExprParser::NEWLINE);
}

tree::TerminalNode* ExprParser::IfBlockContext::NEWLINE(size_t i) {
  return getToken(ExprParser::NEWLINE, i);
}

std::vector<ExprParser::BlockContext *> ExprParser::IfBlockContext::block() {
  return getRuleContexts<ExprParser::BlockContext>();
}

ExprParser::BlockContext* ExprParser::IfBlockContext::block(size_t i) {
  return getRuleContext<ExprParser::BlockContext>(i);
}

ExprParser::IfBlockContext::IfBlockContext(StmtContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::IfBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitIfBlock(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ReturnValueContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::ReturnValueContext::Return() {
  return getToken(ExprParser::Return, 0);
}

ExprParser::ExprContext* ExprParser::ReturnValueContext::expr() {
  return getRuleContext<ExprParser::ExprContext>(0);
}

ExprParser::ReturnValueContext::ReturnValueContext(StmtContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::ReturnValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitReturnValue(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ReturnBasicContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::ReturnBasicContext::Return() {
  return getToken(ExprParser::Return, 0);
}

ExprParser::ReturnBasicContext::ReturnBasicContext(StmtContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::ReturnBasicContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitReturnBasic(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ContinueContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::ContinueContext::Continue() {
  return getToken(ExprParser::Continue, 0);
}

ExprParser::ContinueContext::ContinueContext(StmtContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::ContinueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitContinue(this);
  else
    return visitor->visitChildren(this);
}
ExprParser::StmtContext* ExprParser::stmt() {
  StmtContext *_localctx = _tracker.createInstance<StmtContext>(_ctx, getState());
  enterRule(_localctx, 14, ExprParser::RuleStmt);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(147);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
    case 1: {
      _localctx = dynamic_cast<StmtContext *>(_tracker.createInstance<ExprParser::ExpressionContext>(_localctx));
      enterOuterAlt(_localctx, 1);
      setState(98);
      expr(0);
      break;
    }

    case 2: {
      _localctx = dynamic_cast<StmtContext *>(_tracker.createInstance<ExprParser::CondBlockContext>(_localctx));
      enterOuterAlt(_localctx, 2);
      setState(99);
      match(ExprParser::T__4);
      setState(100);
      expr(0);
      setState(101);
      match(ExprParser::T__5);
      setState(102);
      match(ExprParser::T__7);
      setState(103);
      expr(0);
      setState(104);
      match(ExprParser::T__8);
      setState(105);
      expr(0);
      break;
    }

    case 3: {
      _localctx = dynamic_cast<StmtContext *>(_tracker.createInstance<ExprParser::IfBlockContext>(_localctx));
      enterOuterAlt(_localctx, 3);
      setState(107);
      match(ExprParser::T__9);
      setState(108);
      match(ExprParser::T__4);
      setState(109);
      expr(0);
      setState(110);
      match(ExprParser::T__10);
      setState(111);
      match(ExprParser::NEWLINE);
      setState(112);
      block();
      setState(118);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 9, _ctx)) {
      case 1: {
        setState(114);
        match(ExprParser::NEWLINE);
        setState(115);
        match(ExprParser::T__11);
        setState(116);
        match(ExprParser::NEWLINE);
        setState(117);
        block();
        break;
      }

      }
      break;
    }

    case 4: {
      _localctx = dynamic_cast<StmtContext *>(_tracker.createInstance<ExprParser::ForBlockContext>(_localctx));
      enterOuterAlt(_localctx, 4);
      setState(120);
      match(ExprParser::T__12);
      setState(121);
      match(ExprParser::T__4);
      setState(122);
      expr(0);
      setState(123);
      match(ExprParser::T__13);
      setState(124);
      expr(0);
      setState(125);
      match(ExprParser::T__13);
      setState(126);
      expr(0);
      setState(127);
      match(ExprParser::T__10);
      setState(128);
      match(ExprParser::NEWLINE);
      setState(129);
      block();
      break;
    }

    case 5: {
      _localctx = dynamic_cast<StmtContext *>(_tracker.createInstance<ExprParser::WhileBlockContext>(_localctx));
      enterOuterAlt(_localctx, 5);
      setState(131);
      match(ExprParser::T__14);
      setState(132);
      match(ExprParser::T__4);
      setState(133);
      expr(0);
      setState(134);
      match(ExprParser::T__10);
      setState(135);
      match(ExprParser::NEWLINE);
      setState(136);
      block();
      break;
    }

    case 6: {
      _localctx = dynamic_cast<StmtContext *>(_tracker.createInstance<ExprParser::OutBlockContext>(_localctx));
      enterOuterAlt(_localctx, 6);
      setState(138);
      match(ExprParser::T__15);
      setState(139);
      expr(0);
      setState(140);
      match(ExprParser::T__5);
      break;
    }

    case 7: {
      _localctx = dynamic_cast<StmtContext *>(_tracker.createInstance<ExprParser::ReturnBasicContext>(_localctx));
      enterOuterAlt(_localctx, 7);
      setState(142);
      match(ExprParser::Return);
      break;
    }

    case 8: {
      _localctx = dynamic_cast<StmtContext *>(_tracker.createInstance<ExprParser::ReturnValueContext>(_localctx));
      enterOuterAlt(_localctx, 8);
      setState(143);
      match(ExprParser::Return);
      setState(144);
      expr(0);
      break;
    }

    case 9: {
      _localctx = dynamic_cast<StmtContext *>(_tracker.createInstance<ExprParser::BreakContext>(_localctx));
      enterOuterAlt(_localctx, 9);
      setState(145);
      match(ExprParser::Break);
      break;
    }

    case 10: {
      _localctx = dynamic_cast<StmtContext *>(_tracker.createInstance<ExprParser::ContinueContext>(_localctx));
      enterOuterAlt(_localctx, 10);
      setState(146);
      match(ExprParser::Continue);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExprContext ------------------------------------------------------------------

ExprParser::ExprContext::ExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t ExprParser::ExprContext::getRuleIndex() const {
  return ExprParser::RuleExpr;
}

void ExprParser::ExprContext::copyFrom(ExprContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- MulDivModExpContext ------------------------------------------------------------------

std::vector<ExprParser::ExprContext *> ExprParser::MulDivModExpContext::expr() {
  return getRuleContexts<ExprParser::ExprContext>();
}

ExprParser::ExprContext* ExprParser::MulDivModExpContext::expr(size_t i) {
  return getRuleContext<ExprParser::ExprContext>(i);
}

ExprParser::MulDivModExpContext::MulDivModExpContext(ExprContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::MulDivModExpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitMulDivModExp(this);
  else
    return visitor->visitChildren(this);
}
//----------------- NotExpContext ------------------------------------------------------------------

ExprParser::ExprContext* ExprParser::NotExpContext::expr() {
  return getRuleContext<ExprParser::ExprContext>(0);
}

ExprParser::NotExpContext::NotExpContext(ExprContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::NotExpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitNotExp(this);
  else
    return visitor->visitChildren(this);
}
//----------------- OpenBlockContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::OpenBlockContext::ID() {
  return getToken(ExprParser::ID, 0);
}

tree::TerminalNode* ExprParser::OpenBlockContext::STRING() {
  return getToken(ExprParser::STRING, 0);
}

ExprParser::OpenBlockContext::OpenBlockContext(ExprContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::OpenBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitOpenBlock(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ValTerminalContext ------------------------------------------------------------------

ExprParser::ValueContext* ExprParser::ValTerminalContext::value() {
  return getRuleContext<ExprParser::ValueContext>(0);
}

ExprParser::ValTerminalContext::ValTerminalContext(ExprContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::ValTerminalContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitValTerminal(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ArrayIdContext ------------------------------------------------------------------

ExprParser::ArrayIdentifierContext* ExprParser::ArrayIdContext::arrayIdentifier() {
  return getRuleContext<ExprParser::ArrayIdentifierContext>(0);
}

ExprParser::ArrayIdContext::ArrayIdContext(ExprContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::ArrayIdContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitArrayId(this);
  else
    return visitor->visitChildren(this);
}
//----------------- CondOpContext ------------------------------------------------------------------

std::vector<ExprParser::ExprContext *> ExprParser::CondOpContext::expr() {
  return getRuleContexts<ExprParser::ExprContext>();
}

ExprParser::ExprContext* ExprParser::CondOpContext::expr(size_t i) {
  return getRuleContext<ExprParser::ExprContext>(i);
}

ExprParser::CondOpContext::CondOpContext(ExprContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::CondOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitCondOp(this);
  else
    return visitor->visitChildren(this);
}
//----------------- TrueContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::TrueContext::True() {
  return getToken(ExprParser::True, 0);
}

ExprParser::TrueContext::TrueContext(ExprContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::TrueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitTrue(this);
  else
    return visitor->visitChildren(this);
}
//----------------- FalseContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::FalseContext::False() {
  return getToken(ExprParser::False, 0);
}

ExprParser::FalseContext::FalseContext(ExprContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::FalseContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitFalse(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ReadBlockContext ------------------------------------------------------------------

ExprParser::Read_blockContext* ExprParser::ReadBlockContext::read_block() {
  return getRuleContext<ExprParser::Read_blockContext>(0);
}

ExprParser::ReadBlockContext::ReadBlockContext(ExprContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::ReadBlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitReadBlock(this);
  else
    return visitor->visitChildren(this);
}
//----------------- FuncCallContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::FuncCallContext::FUNC() {
  return getToken(ExprParser::FUNC, 0);
}

ExprParser::ArgsContext* ExprParser::FuncCallContext::args() {
  return getRuleContext<ExprParser::ArgsContext>(0);
}

ExprParser::FuncCallContext::FuncCallContext(ExprContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::FuncCallContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitFuncCall(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ParenthesisContext ------------------------------------------------------------------

ExprParser::ExprContext* ExprParser::ParenthesisContext::expr() {
  return getRuleContext<ExprParser::ExprContext>(0);
}

ExprParser::ParenthesisContext::ParenthesisContext(ExprContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::ParenthesisContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitParenthesis(this);
  else
    return visitor->visitChildren(this);
}
//----------------- AddSubExpContext ------------------------------------------------------------------

std::vector<ExprParser::ExprContext *> ExprParser::AddSubExpContext::expr() {
  return getRuleContexts<ExprParser::ExprContext>();
}

ExprParser::ExprContext* ExprParser::AddSubExpContext::expr(size_t i) {
  return getRuleContext<ExprParser::ExprContext>(i);
}

ExprParser::AddSubExpContext::AddSubExpContext(ExprContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::AddSubExpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitAddSubExp(this);
  else
    return visitor->visitChildren(this);
}
//----------------- BoolOpContext ------------------------------------------------------------------

std::vector<ExprParser::ExprContext *> ExprParser::BoolOpContext::expr() {
  return getRuleContexts<ExprParser::ExprContext>();
}

ExprParser::ExprContext* ExprParser::BoolOpContext::expr(size_t i) {
  return getRuleContext<ExprParser::ExprContext>(i);
}

ExprParser::BoolOpContext::BoolOpContext(ExprContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::BoolOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitBoolOp(this);
  else
    return visitor->visitChildren(this);
}
//----------------- AssgnOpContext ------------------------------------------------------------------

std::vector<ExprParser::ExprContext *> ExprParser::AssgnOpContext::expr() {
  return getRuleContexts<ExprParser::ExprContext>();
}

ExprParser::ExprContext* ExprParser::AssgnOpContext::expr(size_t i) {
  return getRuleContext<ExprParser::ExprContext>(i);
}

tree::TerminalNode* ExprParser::AssgnOpContext::Asgn_op() {
  return getToken(ExprParser::Asgn_op, 0);
}

ExprParser::AssgnOpContext::AssgnOpContext(ExprContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::AssgnOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitAssgnOp(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::ExprContext* ExprParser::expr() {
   return expr(0);
}

ExprParser::ExprContext* ExprParser::expr(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  ExprParser::ExprContext *_localctx = _tracker.createInstance<ExprContext>(_ctx, parentState);
  ExprParser::ExprContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 16;
  enterRecursionRule(_localctx, 16, ExprParser::RuleExpr, precedence);

    size_t _la = 0;

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(172);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      _localctx = _tracker.createInstance<ReadBlockContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;

      setState(150);
      read_block();
      break;
    }

    case 2: {
      _localctx = _tracker.createInstance<ParenthesisContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(151);
      match(ExprParser::T__4);
      setState(152);
      expr(0);
      setState(153);
      match(ExprParser::T__5);
      break;
    }

    case 3: {
      _localctx = _tracker.createInstance<NotExpContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(155);
      match(ExprParser::T__21);
      setState(156);
      expr(10);
      break;
    }

    case 4: {
      _localctx = _tracker.createInstance<ValTerminalContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(157);
      value();
      break;
    }

    case 5: {
      _localctx = _tracker.createInstance<OpenBlockContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(158);
      match(ExprParser::T__30);
      setState(159);
      match(ExprParser::T__4);
      setState(160);
      match(ExprParser::ID);
      setState(161);
      match(ExprParser::T__31);
      setState(162);
      match(ExprParser::STRING);
      setState(163);
      match(ExprParser::T__5);
      break;
    }

    case 6: {
      _localctx = _tracker.createInstance<ArrayIdContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(164);
      arrayIdentifier();
      break;
    }

    case 7: {
      _localctx = _tracker.createInstance<TrueContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(165);
      match(ExprParser::True);
      break;
    }

    case 8: {
      _localctx = _tracker.createInstance<FalseContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(166);
      match(ExprParser::False);
      break;
    }

    case 9: {
      _localctx = _tracker.createInstance<FuncCallContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(167);
      match(ExprParser::FUNC);
      setState(168);
      match(ExprParser::T__4);
      setState(169);
      args();
      setState(170);
      match(ExprParser::T__5);
      break;
    }

    }
    _ctx->stop = _input->LT(-1);
    setState(191);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(189);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
        case 1: {
          auto newContext = _tracker.createInstance<MulDivModExpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(174);

          if (!(precpred(_ctx, 14))) throw FailedPredicateException(this, "precpred(_ctx, 14)");
          setState(175);
          dynamic_cast<MulDivModExpContext *>(_localctx)->op = _input->LT(1);
          _la = _input->LA(1);
          if (!((((_la & ~ 0x3fULL) == 0) &&
            ((1ULL << _la) & ((1ULL << ExprParser::T__16)
            | (1ULL << ExprParser::T__17)
            | (1ULL << ExprParser::T__18))) != 0))) {
            dynamic_cast<MulDivModExpContext *>(_localctx)->op = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(176);
          expr(15);
          break;
        }

        case 2: {
          auto newContext = _tracker.createInstance<AddSubExpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(177);

          if (!(precpred(_ctx, 13))) throw FailedPredicateException(this, "precpred(_ctx, 13)");
          setState(178);
          dynamic_cast<AddSubExpContext *>(_localctx)->op = _input->LT(1);
          _la = _input->LA(1);
          if (!(_la == ExprParser::T__19

          || _la == ExprParser::T__20)) {
            dynamic_cast<AddSubExpContext *>(_localctx)->op = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(179);
          expr(14);
          break;
        }

        case 3: {
          auto newContext = _tracker.createInstance<AssgnOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(180);

          if (!(precpred(_ctx, 8))) throw FailedPredicateException(this, "precpred(_ctx, 8)");
          setState(181);
          match(ExprParser::Asgn_op);
          setState(182);
          expr(9);
          break;
        }

        case 4: {
          auto newContext = _tracker.createInstance<CondOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(183);

          if (!(precpred(_ctx, 7))) throw FailedPredicateException(this, "precpred(_ctx, 7)");
          setState(184);
          dynamic_cast<CondOpContext *>(_localctx)->cond_op = _input->LT(1);
          _la = _input->LA(1);
          if (!((((_la & ~ 0x3fULL) == 0) &&
            ((1ULL << _la) & ((1ULL << ExprParser::T__22)
            | (1ULL << ExprParser::T__23)
            | (1ULL << ExprParser::T__24)
            | (1ULL << ExprParser::T__25)
            | (1ULL << ExprParser::T__26)
            | (1ULL << ExprParser::T__27))) != 0))) {
            dynamic_cast<CondOpContext *>(_localctx)->cond_op = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(185);
          expr(8);
          break;
        }

        case 5: {
          auto newContext = _tracker.createInstance<BoolOpContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(186);

          if (!(precpred(_ctx, 6))) throw FailedPredicateException(this, "precpred(_ctx, 6)");
          setState(187);
          dynamic_cast<BoolOpContext *>(_localctx)->bool_op = _input->LT(1);
          _la = _input->LA(1);
          if (!(_la == ExprParser::T__28

          || _la == ExprParser::T__29)) {
            dynamic_cast<BoolOpContext *>(_localctx)->bool_op = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(188);
          expr(7);
          break;
        }

        } 
      }
      setState(193);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- ArrayIdentifierContext ------------------------------------------------------------------

ExprParser::ArrayIdentifierContext::ArrayIdentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* ExprParser::ArrayIdentifierContext::ID() {
  return getToken(ExprParser::ID, 0);
}

std::vector<ExprParser::ExprContext *> ExprParser::ArrayIdentifierContext::expr() {
  return getRuleContexts<ExprParser::ExprContext>();
}

ExprParser::ExprContext* ExprParser::ArrayIdentifierContext::expr(size_t i) {
  return getRuleContext<ExprParser::ExprContext>(i);
}


size_t ExprParser::ArrayIdentifierContext::getRuleIndex() const {
  return ExprParser::RuleArrayIdentifier;
}


antlrcpp::Any ExprParser::ArrayIdentifierContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitArrayIdentifier(this);
  else
    return visitor->visitChildren(this);
}

ExprParser::ArrayIdentifierContext* ExprParser::arrayIdentifier() {
  ArrayIdentifierContext *_localctx = _tracker.createInstance<ArrayIdentifierContext>(_ctx, getState());
  enterRule(_localctx, 18, ExprParser::RuleArrayIdentifier);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(194);
    match(ExprParser::ID);
    setState(199); 
    _errHandler->sync(this);
    alt = 1;
    do {
      switch (alt) {
        case 1: {
              setState(195);
              match(ExprParser::T__2);
              setState(196);
              expr(0);
              setState(197);
              match(ExprParser::T__3);
              break;
            }

      default:
        throw NoViableAltException(this);
      }
      setState(201); 
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx);
    } while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Read_blockContext ------------------------------------------------------------------

ExprParser::Read_blockContext::Read_blockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t ExprParser::Read_blockContext::getRuleIndex() const {
  return ExprParser::RuleRead_block;
}

void ExprParser::Read_blockContext::copyFrom(Read_blockContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- ReadContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::ReadContext::Read() {
  return getToken(ExprParser::Read, 0);
}

ExprParser::ReadContext::ReadContext(Read_blockContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::ReadContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitRead(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ReadFileContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::ReadFileContext::ID() {
  return getToken(ExprParser::ID, 0);
}

ExprParser::ReadFileContext::ReadFileContext(Read_blockContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::ReadFileContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitReadFile(this);
  else
    return visitor->visitChildren(this);
}
ExprParser::Read_blockContext* ExprParser::read_block() {
  Read_blockContext *_localctx = _tracker.createInstance<Read_blockContext>(_ctx, getState());
  enterRule(_localctx, 20, ExprParser::RuleRead_block);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(207);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case ExprParser::Read: {
        _localctx = dynamic_cast<Read_blockContext *>(_tracker.createInstance<ExprParser::ReadContext>(_localctx));
        enterOuterAlt(_localctx, 1);
        setState(203);
        match(ExprParser::Read);
        break;
      }

      case ExprParser::T__32: {
        _localctx = dynamic_cast<Read_blockContext *>(_tracker.createInstance<ExprParser::ReadFileContext>(_localctx));
        enterOuterAlt(_localctx, 2);
        setState(204);
        match(ExprParser::T__32);
        setState(205);
        match(ExprParser::ID);
        setState(206);
        match(ExprParser::T__5);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ValueContext ------------------------------------------------------------------

ExprParser::ValueContext::ValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t ExprParser::ValueContext::getRuleIndex() const {
  return ExprParser::RuleValue;
}

void ExprParser::ValueContext::copyFrom(ValueContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- FloatContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::FloatContext::FLOAT() {
  return getToken(ExprParser::FLOAT, 0);
}

ExprParser::FloatContext::FloatContext(ValueContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::FloatContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitFloat(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ValUintContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::ValUintContext::U_INT() {
  return getToken(ExprParser::U_INT, 0);
}

ExprParser::ValUintContext::ValUintContext(ValueContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::ValUintContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitValUint(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ValIntContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::ValIntContext::INT() {
  return getToken(ExprParser::INT, 0);
}

ExprParser::ValIntContext::ValIntContext(ValueContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::ValIntContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitValInt(this);
  else
    return visitor->visitChildren(this);
}
//----------------- IDContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::IDContext::ID() {
  return getToken(ExprParser::ID, 0);
}

ExprParser::IDContext::IDContext(ValueContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::IDContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitID(this);
  else
    return visitor->visitChildren(this);
}
//----------------- StringContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::StringContext::STRING() {
  return getToken(ExprParser::STRING, 0);
}

ExprParser::StringContext::StringContext(ValueContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::StringContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitString(this);
  else
    return visitor->visitChildren(this);
}
ExprParser::ValueContext* ExprParser::value() {
  ValueContext *_localctx = _tracker.createInstance<ValueContext>(_ctx, getState());
  enterRule(_localctx, 22, ExprParser::RuleValue);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(214);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case ExprParser::U_INT: {
        _localctx = dynamic_cast<ValueContext *>(_tracker.createInstance<ExprParser::ValUintContext>(_localctx));
        enterOuterAlt(_localctx, 1);
        setState(209);
        match(ExprParser::U_INT);
        break;
      }

      case ExprParser::INT: {
        _localctx = dynamic_cast<ValueContext *>(_tracker.createInstance<ExprParser::ValIntContext>(_localctx));
        enterOuterAlt(_localctx, 2);
        setState(210);
        match(ExprParser::INT);
        break;
      }

      case ExprParser::FLOAT: {
        _localctx = dynamic_cast<ValueContext *>(_tracker.createInstance<ExprParser::FloatContext>(_localctx));
        enterOuterAlt(_localctx, 3);
        setState(211);
        match(ExprParser::FLOAT);
        break;
      }

      case ExprParser::ID: {
        _localctx = dynamic_cast<ValueContext *>(_tracker.createInstance<ExprParser::IDContext>(_localctx));
        enterOuterAlt(_localctx, 4);
        setState(212);
        match(ExprParser::ID);
        break;
      }

      case ExprParser::STRING: {
        _localctx = dynamic_cast<ValueContext *>(_tracker.createInstance<ExprParser::StringContext>(_localctx));
        enterOuterAlt(_localctx, 5);
        setState(213);
        match(ExprParser::STRING);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeContext ------------------------------------------------------------------

ExprParser::TypeContext::TypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t ExprParser::TypeContext::getRuleIndex() const {
  return ExprParser::RuleType;
}

void ExprParser::TypeContext::copyFrom(TypeContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- Type_floatContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::Type_floatContext::Type_float() {
  return getToken(ExprParser::Type_float, 0);
}

ExprParser::Type_floatContext::Type_floatContext(TypeContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::Type_floatContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitType_float(this);
  else
    return visitor->visitChildren(this);
}
//----------------- Type_boolContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::Type_boolContext::Type_bool() {
  return getToken(ExprParser::Type_bool, 0);
}

ExprParser::Type_boolContext::Type_boolContext(TypeContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::Type_boolContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitType_bool(this);
  else
    return visitor->visitChildren(this);
}
//----------------- Type_fileContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::Type_fileContext::Type_file() {
  return getToken(ExprParser::Type_file, 0);
}

ExprParser::Type_fileContext::Type_fileContext(TypeContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::Type_fileContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitType_file(this);
  else
    return visitor->visitChildren(this);
}
//----------------- Type_voidContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::Type_voidContext::Type_void() {
  return getToken(ExprParser::Type_void, 0);
}

ExprParser::Type_voidContext::Type_voidContext(TypeContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::Type_voidContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitType_void(this);
  else
    return visitor->visitChildren(this);
}
//----------------- Type_charContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::Type_charContext::Type_char() {
  return getToken(ExprParser::Type_char, 0);
}

ExprParser::Type_charContext::Type_charContext(TypeContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::Type_charContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitType_char(this);
  else
    return visitor->visitChildren(this);
}
//----------------- Type_intContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::Type_intContext::Type_int() {
  return getToken(ExprParser::Type_int, 0);
}

ExprParser::Type_intContext::Type_intContext(TypeContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::Type_intContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitType_int(this);
  else
    return visitor->visitChildren(this);
}
//----------------- Type_uintContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::Type_uintContext::Type_uint() {
  return getToken(ExprParser::Type_uint, 0);
}

ExprParser::Type_uintContext::Type_uintContext(TypeContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::Type_uintContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitType_uint(this);
  else
    return visitor->visitChildren(this);
}
//----------------- Type_stringContext ------------------------------------------------------------------

tree::TerminalNode* ExprParser::Type_stringContext::Type_string() {
  return getToken(ExprParser::Type_string, 0);
}

ExprParser::Type_stringContext::Type_stringContext(TypeContext *ctx) { copyFrom(ctx); }


antlrcpp::Any ExprParser::Type_stringContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<ExprVisitor*>(visitor))
    return parserVisitor->visitType_string(this);
  else
    return visitor->visitChildren(this);
}
ExprParser::TypeContext* ExprParser::type() {
  TypeContext *_localctx = _tracker.createInstance<TypeContext>(_ctx, getState());
  enterRule(_localctx, 24, ExprParser::RuleType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(224);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case ExprParser::Type_bool: {
        _localctx = dynamic_cast<TypeContext *>(_tracker.createInstance<ExprParser::Type_boolContext>(_localctx));
        enterOuterAlt(_localctx, 1);
        setState(216);
        match(ExprParser::Type_bool);
        break;
      }

      case ExprParser::Type_char: {
        _localctx = dynamic_cast<TypeContext *>(_tracker.createInstance<ExprParser::Type_charContext>(_localctx));
        enterOuterAlt(_localctx, 2);
        setState(217);
        match(ExprParser::Type_char);
        break;
      }

      case ExprParser::Type_string: {
        _localctx = dynamic_cast<TypeContext *>(_tracker.createInstance<ExprParser::Type_stringContext>(_localctx));
        enterOuterAlt(_localctx, 3);
        setState(218);
        match(ExprParser::Type_string);
        break;
      }

      case ExprParser::Type_file: {
        _localctx = dynamic_cast<TypeContext *>(_tracker.createInstance<ExprParser::Type_fileContext>(_localctx));
        enterOuterAlt(_localctx, 4);
        setState(219);
        match(ExprParser::Type_file);
        break;
      }

      case ExprParser::Type_int: {
        _localctx = dynamic_cast<TypeContext *>(_tracker.createInstance<ExprParser::Type_intContext>(_localctx));
        enterOuterAlt(_localctx, 5);
        setState(220);
        match(ExprParser::Type_int);
        break;
      }

      case ExprParser::Type_uint: {
        _localctx = dynamic_cast<TypeContext *>(_tracker.createInstance<ExprParser::Type_uintContext>(_localctx));
        enterOuterAlt(_localctx, 6);
        setState(221);
        match(ExprParser::Type_uint);
        break;
      }

      case ExprParser::Type_void: {
        _localctx = dynamic_cast<TypeContext *>(_tracker.createInstance<ExprParser::Type_voidContext>(_localctx));
        enterOuterAlt(_localctx, 7);
        setState(222);
        match(ExprParser::Type_void);
        break;
      }

      case ExprParser::Type_float: {
        _localctx = dynamic_cast<TypeContext *>(_tracker.createInstance<ExprParser::Type_floatContext>(_localctx));
        enterOuterAlt(_localctx, 8);
        setState(223);
        match(ExprParser::Type_float);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

bool ExprParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 8: return exprSempred(dynamic_cast<ExprContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool ExprParser::exprSempred(ExprContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 14);
    case 1: return precpred(_ctx, 13);
    case 2: return precpred(_ctx, 8);
    case 3: return precpred(_ctx, 7);
    case 4: return precpred(_ctx, 6);

  default:
    break;
  }
  return true;
}

// Static vars and initialization.
std::vector<dfa::DFA> ExprParser::_decisionToDFA;
atn::PredictionContextCache ExprParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN ExprParser::_atn;
std::vector<uint16_t> ExprParser::_serializedATN;

std::vector<std::string> ExprParser::_ruleNames = {
  "prog", "start", "decl", "arrayDeclaration", "method", "args", "block", 
  "stmt", "expr", "arrayIdentifier", "read_block", "value", "type"
};

std::vector<std::string> ExprParser::_literalNames = {
  "", "'program {'", "'}'", "'['", "']'", "'('", "')'", "'{'", "'?'", "':'", 
  "'if'", "') :'", "'else :'", "'for'", "';'", "'while'", "'out('", "'/'", 
  "'*'", "'%'", "'+'", "'-'", "'!'", "'<'", "'>'", "'>='", "'<='", "'=='", 
  "'!='", "'&'", "'|'", "'open'", "','", "'read('", "'uint'", "'int'", "'float'", 
  "'char'", "'string'", "'void'", "'bool'", "'file'", "'true'", "'false'", 
  "'continue'", "'break'", "'return'", "'read()'", "'='", "'main'"
};

std::vector<std::string> ExprParser::_symbolicNames = {
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "Type_uint", 
  "Type_int", "Type_float", "Type_char", "Type_string", "Type_void", "Type_bool", 
  "Type_file", "True", "False", "Continue", "Break", "Return", "Read", "Asgn_op", 
  "MAIN", "U_INT", "INT", "FLOAT", "ID", "STRING", "FUNC", "NEWLINE", "WS"
};

dfa::Vocabulary ExprParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> ExprParser::_tokenNames;

ExprParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0x3b, 0xe5, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 0x9, 
    0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 0x7, 0x4, 
    0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x4, 0xb, 0x9, 
    0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 0xe, 0x9, 0xe, 0x3, 
    0x2, 0x3, 0x2, 0x3, 0x2, 0x6, 0x2, 0x20, 0xa, 0x2, 0xd, 0x2, 0xe, 0x2, 
    0x21, 0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x5, 0x3, 0x2c, 0xa, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 
    0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 0x34, 0xa, 0x4, 0x3, 0x5, 0x3, 
    0x5, 0x3, 0x5, 0x3, 0x5, 0x6, 0x5, 0x3a, 0xa, 0x5, 0xd, 0x5, 0xe, 0x5, 
    0x3b, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 
    0x6, 0x3, 0x6, 0x3, 0x7, 0x7, 0x7, 0x47, 0xa, 0x7, 0xc, 0x7, 0xe, 0x7, 
    0x4a, 0xb, 0x7, 0x3, 0x7, 0x7, 0x7, 0x4d, 0xa, 0x7, 0xc, 0x7, 0xe, 0x7, 
    0x50, 0xb, 0x7, 0x5, 0x7, 0x52, 0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 
    0x7, 0x8, 0x57, 0xa, 0x8, 0xc, 0x8, 0xe, 0x8, 0x5a, 0xb, 0x8, 0x3, 0x8, 
    0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x5, 0x8, 
    0x63, 0xa, 0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 
    0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 
    0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 
    0x9, 0x5, 0x9, 0x79, 0xa, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 
    0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 
    0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 
    0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 
    0x3, 0x9, 0x3, 0x9, 0x5, 0x9, 0x96, 0xa, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 
    0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
    0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
    0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x5, 
    0xa, 0xaf, 0xa, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x7, 0xa, 0xc0, 0xa, 0xa, 0xc, 0xa, 0xe, 
    0xa, 0xc3, 0xb, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 
    0x6, 0xb, 0xca, 0xa, 0xb, 0xd, 0xb, 0xe, 0xb, 0xcb, 0x3, 0xc, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0xd2, 0xa, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 
    0xd, 0x3, 0xd, 0x3, 0xd, 0x5, 0xd, 0xd9, 0xa, 0xd, 0x3, 0xe, 0x3, 0xe, 
    0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x5, 0xe, 
    0xe3, 0xa, 0xe, 0x3, 0xe, 0x2, 0x3, 0x12, 0xf, 0x2, 0x4, 0x6, 0x8, 0xa, 
    0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x2, 0x6, 0x3, 0x2, 0x13, 
    0x15, 0x3, 0x2, 0x16, 0x17, 0x3, 0x2, 0x19, 0x1e, 0x3, 0x2, 0x1f, 0x20, 
    0x2, 0x105, 0x2, 0x1c, 0x3, 0x2, 0x2, 0x2, 0x4, 0x2b, 0x3, 0x2, 0x2, 
    0x2, 0x6, 0x33, 0x3, 0x2, 0x2, 0x2, 0x8, 0x35, 0x3, 0x2, 0x2, 0x2, 0xa, 
    0x3d, 0x3, 0x2, 0x2, 0x2, 0xc, 0x51, 0x3, 0x2, 0x2, 0x2, 0xe, 0x62, 
    0x3, 0x2, 0x2, 0x2, 0x10, 0x95, 0x3, 0x2, 0x2, 0x2, 0x12, 0xae, 0x3, 
    0x2, 0x2, 0x2, 0x14, 0xc4, 0x3, 0x2, 0x2, 0x2, 0x16, 0xd1, 0x3, 0x2, 
    0x2, 0x2, 0x18, 0xd8, 0x3, 0x2, 0x2, 0x2, 0x1a, 0xe2, 0x3, 0x2, 0x2, 
    0x2, 0x1c, 0x1d, 0x7, 0x3, 0x2, 0x2, 0x1d, 0x1f, 0x7, 0x3a, 0x2, 0x2, 
    0x1e, 0x20, 0x5, 0x4, 0x3, 0x2, 0x1f, 0x1e, 0x3, 0x2, 0x2, 0x2, 0x20, 
    0x21, 0x3, 0x2, 0x2, 0x2, 0x21, 0x1f, 0x3, 0x2, 0x2, 0x2, 0x21, 0x22, 
    0x3, 0x2, 0x2, 0x2, 0x22, 0x23, 0x3, 0x2, 0x2, 0x2, 0x23, 0x24, 0x7, 
    0x4, 0x2, 0x2, 0x24, 0x3, 0x3, 0x2, 0x2, 0x2, 0x25, 0x26, 0x5, 0x6, 
    0x4, 0x2, 0x26, 0x27, 0x7, 0x3a, 0x2, 0x2, 0x27, 0x2c, 0x3, 0x2, 0x2, 
    0x2, 0x28, 0x29, 0x5, 0xa, 0x6, 0x2, 0x29, 0x2a, 0x7, 0x3a, 0x2, 0x2, 
    0x2a, 0x2c, 0x3, 0x2, 0x2, 0x2, 0x2b, 0x25, 0x3, 0x2, 0x2, 0x2, 0x2b, 
    0x28, 0x3, 0x2, 0x2, 0x2, 0x2c, 0x5, 0x3, 0x2, 0x2, 0x2, 0x2d, 0x2e, 
    0x5, 0x1a, 0xe, 0x2, 0x2e, 0x2f, 0x7, 0x37, 0x2, 0x2, 0x2f, 0x34, 0x3, 
    0x2, 0x2, 0x2, 0x30, 0x31, 0x5, 0x1a, 0xe, 0x2, 0x31, 0x32, 0x5, 0x8, 
    0x5, 0x2, 0x32, 0x34, 0x3, 0x2, 0x2, 0x2, 0x33, 0x2d, 0x3, 0x2, 0x2, 
    0x2, 0x33, 0x30, 0x3, 0x2, 0x2, 0x2, 0x34, 0x7, 0x3, 0x2, 0x2, 0x2, 
    0x35, 0x39, 0x7, 0x37, 0x2, 0x2, 0x36, 0x37, 0x7, 0x5, 0x2, 0x2, 0x37, 
    0x38, 0x7, 0x34, 0x2, 0x2, 0x38, 0x3a, 0x7, 0x6, 0x2, 0x2, 0x39, 0x36, 
    0x3, 0x2, 0x2, 0x2, 0x3a, 0x3b, 0x3, 0x2, 0x2, 0x2, 0x3b, 0x39, 0x3, 
    0x2, 0x2, 0x2, 0x3b, 0x3c, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x9, 0x3, 0x2, 
    0x2, 0x2, 0x3d, 0x3e, 0x5, 0x1a, 0xe, 0x2, 0x3e, 0x3f, 0x7, 0x39, 0x2, 
    0x2, 0x3f, 0x40, 0x7, 0x7, 0x2, 0x2, 0x40, 0x41, 0x5, 0xc, 0x7, 0x2, 
    0x41, 0x42, 0x7, 0x8, 0x2, 0x2, 0x42, 0x43, 0x7, 0x3a, 0x2, 0x2, 0x43, 
    0x44, 0x5, 0xe, 0x8, 0x2, 0x44, 0xb, 0x3, 0x2, 0x2, 0x2, 0x45, 0x47, 
    0x5, 0x6, 0x4, 0x2, 0x46, 0x45, 0x3, 0x2, 0x2, 0x2, 0x47, 0x4a, 0x3, 
    0x2, 0x2, 0x2, 0x48, 0x46, 0x3, 0x2, 0x2, 0x2, 0x48, 0x49, 0x3, 0x2, 
    0x2, 0x2, 0x49, 0x52, 0x3, 0x2, 0x2, 0x2, 0x4a, 0x48, 0x3, 0x2, 0x2, 
    0x2, 0x4b, 0x4d, 0x5, 0x12, 0xa, 0x2, 0x4c, 0x4b, 0x3, 0x2, 0x2, 0x2, 
    0x4d, 0x50, 0x3, 0x2, 0x2, 0x2, 0x4e, 0x4c, 0x3, 0x2, 0x2, 0x2, 0x4e, 
    0x4f, 0x3, 0x2, 0x2, 0x2, 0x4f, 0x52, 0x3, 0x2, 0x2, 0x2, 0x50, 0x4e, 
    0x3, 0x2, 0x2, 0x2, 0x51, 0x48, 0x3, 0x2, 0x2, 0x2, 0x51, 0x4e, 0x3, 
    0x2, 0x2, 0x2, 0x52, 0xd, 0x3, 0x2, 0x2, 0x2, 0x53, 0x54, 0x7, 0x9, 
    0x2, 0x2, 0x54, 0x58, 0x7, 0x3a, 0x2, 0x2, 0x55, 0x57, 0x5, 0xe, 0x8, 
    0x2, 0x56, 0x55, 0x3, 0x2, 0x2, 0x2, 0x57, 0x5a, 0x3, 0x2, 0x2, 0x2, 
    0x58, 0x56, 0x3, 0x2, 0x2, 0x2, 0x58, 0x59, 0x3, 0x2, 0x2, 0x2, 0x59, 
    0x5b, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x58, 0x3, 0x2, 0x2, 0x2, 0x5b, 0x63, 
    0x7, 0x4, 0x2, 0x2, 0x5c, 0x5d, 0x5, 0x6, 0x4, 0x2, 0x5d, 0x5e, 0x7, 
    0x3a, 0x2, 0x2, 0x5e, 0x63, 0x3, 0x2, 0x2, 0x2, 0x5f, 0x60, 0x5, 0x10, 
    0x9, 0x2, 0x60, 0x61, 0x7, 0x3a, 0x2, 0x2, 0x61, 0x63, 0x3, 0x2, 0x2, 
    0x2, 0x62, 0x53, 0x3, 0x2, 0x2, 0x2, 0x62, 0x5c, 0x3, 0x2, 0x2, 0x2, 
    0x62, 0x5f, 0x3, 0x2, 0x2, 0x2, 0x63, 0xf, 0x3, 0x2, 0x2, 0x2, 0x64, 
    0x96, 0x5, 0x12, 0xa, 0x2, 0x65, 0x66, 0x7, 0x7, 0x2, 0x2, 0x66, 0x67, 
    0x5, 0x12, 0xa, 0x2, 0x67, 0x68, 0x7, 0x8, 0x2, 0x2, 0x68, 0x69, 0x7, 
    0xa, 0x2, 0x2, 0x69, 0x6a, 0x5, 0x12, 0xa, 0x2, 0x6a, 0x6b, 0x7, 0xb, 
    0x2, 0x2, 0x6b, 0x6c, 0x5, 0x12, 0xa, 0x2, 0x6c, 0x96, 0x3, 0x2, 0x2, 
    0x2, 0x6d, 0x6e, 0x7, 0xc, 0x2, 0x2, 0x6e, 0x6f, 0x7, 0x7, 0x2, 0x2, 
    0x6f, 0x70, 0x5, 0x12, 0xa, 0x2, 0x70, 0x71, 0x7, 0xd, 0x2, 0x2, 0x71, 
    0x72, 0x7, 0x3a, 0x2, 0x2, 0x72, 0x73, 0x5, 0xe, 0x8, 0x2, 0x73, 0x78, 
    0x3, 0x2, 0x2, 0x2, 0x74, 0x75, 0x7, 0x3a, 0x2, 0x2, 0x75, 0x76, 0x7, 
    0xe, 0x2, 0x2, 0x76, 0x77, 0x7, 0x3a, 0x2, 0x2, 0x77, 0x79, 0x5, 0xe, 
    0x8, 0x2, 0x78, 0x74, 0x3, 0x2, 0x2, 0x2, 0x78, 0x79, 0x3, 0x2, 0x2, 
    0x2, 0x79, 0x96, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x7b, 0x7, 0xf, 0x2, 0x2, 
    0x7b, 0x7c, 0x7, 0x7, 0x2, 0x2, 0x7c, 0x7d, 0x5, 0x12, 0xa, 0x2, 0x7d, 
    0x7e, 0x7, 0x10, 0x2, 0x2, 0x7e, 0x7f, 0x5, 0x12, 0xa, 0x2, 0x7f, 0x80, 
    0x7, 0x10, 0x2, 0x2, 0x80, 0x81, 0x5, 0x12, 0xa, 0x2, 0x81, 0x82, 0x7, 
    0xd, 0x2, 0x2, 0x82, 0x83, 0x7, 0x3a, 0x2, 0x2, 0x83, 0x84, 0x5, 0xe, 
    0x8, 0x2, 0x84, 0x96, 0x3, 0x2, 0x2, 0x2, 0x85, 0x86, 0x7, 0x11, 0x2, 
    0x2, 0x86, 0x87, 0x7, 0x7, 0x2, 0x2, 0x87, 0x88, 0x5, 0x12, 0xa, 0x2, 
    0x88, 0x89, 0x7, 0xd, 0x2, 0x2, 0x89, 0x8a, 0x7, 0x3a, 0x2, 0x2, 0x8a, 
    0x8b, 0x5, 0xe, 0x8, 0x2, 0x8b, 0x96, 0x3, 0x2, 0x2, 0x2, 0x8c, 0x8d, 
    0x7, 0x12, 0x2, 0x2, 0x8d, 0x8e, 0x5, 0x12, 0xa, 0x2, 0x8e, 0x8f, 0x7, 
    0x8, 0x2, 0x2, 0x8f, 0x96, 0x3, 0x2, 0x2, 0x2, 0x90, 0x96, 0x7, 0x30, 
    0x2, 0x2, 0x91, 0x92, 0x7, 0x30, 0x2, 0x2, 0x92, 0x96, 0x5, 0x12, 0xa, 
    0x2, 0x93, 0x96, 0x7, 0x2f, 0x2, 0x2, 0x94, 0x96, 0x7, 0x2e, 0x2, 0x2, 
    0x95, 0x64, 0x3, 0x2, 0x2, 0x2, 0x95, 0x65, 0x3, 0x2, 0x2, 0x2, 0x95, 
    0x6d, 0x3, 0x2, 0x2, 0x2, 0x95, 0x7a, 0x3, 0x2, 0x2, 0x2, 0x95, 0x85, 
    0x3, 0x2, 0x2, 0x2, 0x95, 0x8c, 0x3, 0x2, 0x2, 0x2, 0x95, 0x90, 0x3, 
    0x2, 0x2, 0x2, 0x95, 0x91, 0x3, 0x2, 0x2, 0x2, 0x95, 0x93, 0x3, 0x2, 
    0x2, 0x2, 0x95, 0x94, 0x3, 0x2, 0x2, 0x2, 0x96, 0x11, 0x3, 0x2, 0x2, 
    0x2, 0x97, 0x98, 0x8, 0xa, 0x1, 0x2, 0x98, 0xaf, 0x5, 0x16, 0xc, 0x2, 
    0x99, 0x9a, 0x7, 0x7, 0x2, 0x2, 0x9a, 0x9b, 0x5, 0x12, 0xa, 0x2, 0x9b, 
    0x9c, 0x7, 0x8, 0x2, 0x2, 0x9c, 0xaf, 0x3, 0x2, 0x2, 0x2, 0x9d, 0x9e, 
    0x7, 0x18, 0x2, 0x2, 0x9e, 0xaf, 0x5, 0x12, 0xa, 0xc, 0x9f, 0xaf, 0x5, 
    0x18, 0xd, 0x2, 0xa0, 0xa1, 0x7, 0x21, 0x2, 0x2, 0xa1, 0xa2, 0x7, 0x7, 
    0x2, 0x2, 0xa2, 0xa3, 0x7, 0x37, 0x2, 0x2, 0xa3, 0xa4, 0x7, 0x22, 0x2, 
    0x2, 0xa4, 0xa5, 0x7, 0x38, 0x2, 0x2, 0xa5, 0xaf, 0x7, 0x8, 0x2, 0x2, 
    0xa6, 0xaf, 0x5, 0x14, 0xb, 0x2, 0xa7, 0xaf, 0x7, 0x2c, 0x2, 0x2, 0xa8, 
    0xaf, 0x7, 0x2d, 0x2, 0x2, 0xa9, 0xaa, 0x7, 0x39, 0x2, 0x2, 0xaa, 0xab, 
    0x7, 0x7, 0x2, 0x2, 0xab, 0xac, 0x5, 0xc, 0x7, 0x2, 0xac, 0xad, 0x7, 
    0x8, 0x2, 0x2, 0xad, 0xaf, 0x3, 0x2, 0x2, 0x2, 0xae, 0x97, 0x3, 0x2, 
    0x2, 0x2, 0xae, 0x99, 0x3, 0x2, 0x2, 0x2, 0xae, 0x9d, 0x3, 0x2, 0x2, 
    0x2, 0xae, 0x9f, 0x3, 0x2, 0x2, 0x2, 0xae, 0xa0, 0x3, 0x2, 0x2, 0x2, 
    0xae, 0xa6, 0x3, 0x2, 0x2, 0x2, 0xae, 0xa7, 0x3, 0x2, 0x2, 0x2, 0xae, 
    0xa8, 0x3, 0x2, 0x2, 0x2, 0xae, 0xa9, 0x3, 0x2, 0x2, 0x2, 0xaf, 0xc1, 
    0x3, 0x2, 0x2, 0x2, 0xb0, 0xb1, 0xc, 0x10, 0x2, 0x2, 0xb1, 0xb2, 0x9, 
    0x2, 0x2, 0x2, 0xb2, 0xc0, 0x5, 0x12, 0xa, 0x11, 0xb3, 0xb4, 0xc, 0xf, 
    0x2, 0x2, 0xb4, 0xb5, 0x9, 0x3, 0x2, 0x2, 0xb5, 0xc0, 0x5, 0x12, 0xa, 
    0x10, 0xb6, 0xb7, 0xc, 0xa, 0x2, 0x2, 0xb7, 0xb8, 0x7, 0x32, 0x2, 0x2, 
    0xb8, 0xc0, 0x5, 0x12, 0xa, 0xb, 0xb9, 0xba, 0xc, 0x9, 0x2, 0x2, 0xba, 
    0xbb, 0x9, 0x4, 0x2, 0x2, 0xbb, 0xc0, 0x5, 0x12, 0xa, 0xa, 0xbc, 0xbd, 
    0xc, 0x8, 0x2, 0x2, 0xbd, 0xbe, 0x9, 0x5, 0x2, 0x2, 0xbe, 0xc0, 0x5, 
    0x12, 0xa, 0x9, 0xbf, 0xb0, 0x3, 0x2, 0x2, 0x2, 0xbf, 0xb3, 0x3, 0x2, 
    0x2, 0x2, 0xbf, 0xb6, 0x3, 0x2, 0x2, 0x2, 0xbf, 0xb9, 0x3, 0x2, 0x2, 
    0x2, 0xbf, 0xbc, 0x3, 0x2, 0x2, 0x2, 0xc0, 0xc3, 0x3, 0x2, 0x2, 0x2, 
    0xc1, 0xbf, 0x3, 0x2, 0x2, 0x2, 0xc1, 0xc2, 0x3, 0x2, 0x2, 0x2, 0xc2, 
    0x13, 0x3, 0x2, 0x2, 0x2, 0xc3, 0xc1, 0x3, 0x2, 0x2, 0x2, 0xc4, 0xc9, 
    0x7, 0x37, 0x2, 0x2, 0xc5, 0xc6, 0x7, 0x5, 0x2, 0x2, 0xc6, 0xc7, 0x5, 
    0x12, 0xa, 0x2, 0xc7, 0xc8, 0x7, 0x6, 0x2, 0x2, 0xc8, 0xca, 0x3, 0x2, 
    0x2, 0x2, 0xc9, 0xc5, 0x3, 0x2, 0x2, 0x2, 0xca, 0xcb, 0x3, 0x2, 0x2, 
    0x2, 0xcb, 0xc9, 0x3, 0x2, 0x2, 0x2, 0xcb, 0xcc, 0x3, 0x2, 0x2, 0x2, 
    0xcc, 0x15, 0x3, 0x2, 0x2, 0x2, 0xcd, 0xd2, 0x7, 0x31, 0x2, 0x2, 0xce, 
    0xcf, 0x7, 0x23, 0x2, 0x2, 0xcf, 0xd0, 0x7, 0x37, 0x2, 0x2, 0xd0, 0xd2, 
    0x7, 0x8, 0x2, 0x2, 0xd1, 0xcd, 0x3, 0x2, 0x2, 0x2, 0xd1, 0xce, 0x3, 
    0x2, 0x2, 0x2, 0xd2, 0x17, 0x3, 0x2, 0x2, 0x2, 0xd3, 0xd9, 0x7, 0x34, 
    0x2, 0x2, 0xd4, 0xd9, 0x7, 0x35, 0x2, 0x2, 0xd5, 0xd9, 0x7, 0x36, 0x2, 
    0x2, 0xd6, 0xd9, 0x7, 0x37, 0x2, 0x2, 0xd7, 0xd9, 0x7, 0x38, 0x2, 0x2, 
    0xd8, 0xd3, 0x3, 0x2, 0x2, 0x2, 0xd8, 0xd4, 0x3, 0x2, 0x2, 0x2, 0xd8, 
    0xd5, 0x3, 0x2, 0x2, 0x2, 0xd8, 0xd6, 0x3, 0x2, 0x2, 0x2, 0xd8, 0xd7, 
    0x3, 0x2, 0x2, 0x2, 0xd9, 0x19, 0x3, 0x2, 0x2, 0x2, 0xda, 0xe3, 0x7, 
    0x2a, 0x2, 0x2, 0xdb, 0xe3, 0x7, 0x27, 0x2, 0x2, 0xdc, 0xe3, 0x7, 0x28, 
    0x2, 0x2, 0xdd, 0xe3, 0x7, 0x2b, 0x2, 0x2, 0xde, 0xe3, 0x7, 0x25, 0x2, 
    0x2, 0xdf, 0xe3, 0x7, 0x24, 0x2, 0x2, 0xe0, 0xe3, 0x7, 0x29, 0x2, 0x2, 
    0xe1, 0xe3, 0x7, 0x26, 0x2, 0x2, 0xe2, 0xda, 0x3, 0x2, 0x2, 0x2, 0xe2, 
    0xdb, 0x3, 0x2, 0x2, 0x2, 0xe2, 0xdc, 0x3, 0x2, 0x2, 0x2, 0xe2, 0xdd, 
    0x3, 0x2, 0x2, 0x2, 0xe2, 0xde, 0x3, 0x2, 0x2, 0x2, 0xe2, 0xdf, 0x3, 
    0x2, 0x2, 0x2, 0xe2, 0xe0, 0x3, 0x2, 0x2, 0x2, 0xe2, 0xe1, 0x3, 0x2, 
    0x2, 0x2, 0xe3, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x14, 0x21, 0x2b, 0x33, 0x3b, 
    0x48, 0x4e, 0x51, 0x58, 0x62, 0x78, 0x95, 0xae, 0xbf, 0xc1, 0xcb, 0xd1, 
    0xd8, 0xe2, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

ExprParser::Initializer ExprParser::_init;
