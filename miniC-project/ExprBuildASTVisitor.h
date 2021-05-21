#include <iostream>
#include "ast.h"
#include <vector>
#include "ExprVisitor.h"

using namespace std;

class ExprBuildASTVisitor : public ExprVisitor
{
public:
    virtual antlrcpp::Any visitProg(ExprParser::ProgContext *context)
    {
        cout << "In visitProg" << endl;
        ASTProg *node = new ASTProg();
        ASTStat *statementNode;
       
        for (auto statement : context->start())
        {
            try
            {
                ASTStat *Node = visit(statement);
                statementNode = Node;
                // throw exception;
            }
            catch (exception)
            {
                ASTDecl * Node = visit(statement);
                statementNode = (ASTStat *)Node;
            }
            if (statementNode != nullptr)
            {
                node->statementList.push_back((ASTStat *) statementNode);
            }
        }

        return (ASTProg *)node;
    }

    virtual antlrcpp::Any visitMethod_start(ExprParser::Method_startContext *context)
    {
        cout << "In visitMethod_start" << endl;
        return visit(context->method());
    }

    virtual antlrcpp::Any visitMethod(ExprParser::MethodContext *context)
    {
        cout << "In visitMethod" << endl;
        string type = visit(context->type());
        string funcname = context->FUNC()->getText();
        vector<ASTDecl *> args = visit(context->args());
        vector<ASTStat *> block = visit(context->block());
        ASTMethod *node = new ASTMethod(type, funcname, args, block);
        return (ASTStat *)node;
    }

    virtual antlrcpp::Any visitDecl_start(ExprParser::Decl_startContext *context)
    {
        cout << "In visitDecl_start" << endl;
        return visit(context->decl());
    }

    virtual antlrcpp::Any visitDeclBasic(ExprParser::DeclBasicContext *context)
    {
        cout << "In visitDeclBasic" << endl;
        string type = visit(context->type());
        ASTExprID *Varid = new ASTExprID(context->ID()->getText());
        std::vector<ASTExpr *> v = {};
        ASTDecl *node = new ASTDecl(type, Varid, v);
        
        return node;
    }

    virtual antlrcpp::Any visitDeclArr(ExprParser::DeclArrContext *context)
    {
        cout << "In visitDeclArr" << endl;
        string type = visit(context->type());
        ASTArray *arr = visit(context->arrayDeclaration());
        ASTExprID *AID = new ASTExprID(arr->id);
        std::vector<ASTExpr *> v = arr->indexList;
        ASTDecl *node = new ASTDecl(type, AID, v);
        return node;
    }

    virtual antlrcpp::Any visitArrayDeclaration(ExprParser::ArrayDeclarationContext *context)
    {
        cout << "In visitArrayDeclaration" << endl;
        ASTArray *node = new ASTArray();
        string idxNode;

        node->id = context->ID()->getText();
        for (auto idx : context->U_INT())
        {
            idxNode = idx->getText();
            if (idxNode != "")
            {
                ASTExprID *node1 = new ASTExprID(idxNode);
                node->indexList.push_back(node1);
            }
        }

        return node;
    }

    virtual antlrcpp::Any visitArg_decl(ExprParser::Arg_declContext *context)
    {
        cout << "In visitArgs_decl" << endl;
        vector<ASTDecl *> argsList;
        ASTDecl *declNode;

        for (auto itr : context->decl())
        {
            declNode = visit(itr);
            if (declNode != nullptr)
            {
                argsList.push_back(declNode);
            }
        }
        return argsList;
    }

    virtual antlrcpp::Any visitArg_param(ExprParser::Arg_paramContext *context)
    {
        cout << "In visitArgs_param" << endl;
        vector<ASTExpr *> valueList;
        ASTExpr *visitNode;
        // cout << context->

        for (auto itr : context->expr())
        {
            visitNode = visit(itr);
            if (visitNode != nullptr)
            {
                valueList.push_back((ASTExpr*) visitNode);
            }
        }
        return valueList;
    }

    virtual antlrcpp::Any visitBlockstmts(ExprParser::BlockstmtsContext *context) 
    {
        cout << "In visitBlockstmts" << endl;
        vector<ASTStat *> blockList;
        ASTStat *blockstmt;

        for (auto itr : context->block())
        {
            blockstmt = visit(itr);
            if (blockstmt != nullptr)
            {
                blockList.push_back(blockstmt);
            }
        }
        return blockList;
    }

    virtual antlrcpp::Any visitBlock_decl(ExprParser::Block_declContext *context) 
    {
        cout << "In visitBlock_decl" << endl;
        ASTDecl * node = visit(context->decl());
        return (ASTStat *)node;
    }

    virtual antlrcpp::Any visitBlock_stmt(ExprParser::Block_stmtContext *context) 
    {
        cout << "In visitBlock_stmt" << endl;
        // ASTStat* node = visit(context->stmt());
        return visit(context->stmt());
    }

    virtual antlrcpp::Any visitMulDivModExp(ExprParser::MulDivModExpContext *context)
    {
        cout << "In visitMulDivModExp" << endl;
        ASTExpr *left;
        ASTExpr *right;

        ASTExprBinary *node;

        left = visit(context->expr(0));
        right = visit(context->expr(1));

        string op = context->op->getText();

        if (op[0] == '*')
            node = new ASTExprBinary("*", left, right);
        else if (op[0] == '/')
            node = new ASTExprBinary("/", left, right);
        else
            node = new ASTExprBinary("%", left, right);

        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitNotExp(ExprParser::NotExpContext *context)
    {
        cout << "In visitNotExp" << endl;
        ASTNotExpr *node = new ASTNotExpr();
        
        node->expr = visit(context->expr());
        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitParenthesis(ExprParser::ParenthesisContext *context)
    {
        cout << "In visitParenthesis" << endl;
        ASTParenExpr *node = new ASTParenExpr();

        node->expr = visit(context->expr());
        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitValTerminal(ExprParser::ValTerminalContext *context)
    {
        cout << "In visitValTerminal" << endl;
        return visit(context->value());
    }

    virtual antlrcpp::Any visitArrayId(ExprParser::ArrayIdContext *context)
    {
        cout << "In visitArrayId" << endl;
        return visit(context->arrayIdentifier());
    }

    virtual antlrcpp::Any visitReadBlock(ExprParser::ReadBlockContext *context) 
    {
        cout << "In visitReadBlock" << endl;
        return visit(context->read_block());
    }

    virtual antlrcpp::Any visitCondOp(ExprParser::CondOpContext *context)
    {
        cout << "In visitCondOp" << endl;
        ASTExpr *left;
        ASTExpr *right;

        ASTExprBinary *node;

        left = visit(context->expr(0));
        right = visit(context->expr(1));

        string op = context->cond_op->getText();

        if (op[0] == '<')
            node = new ASTExprBinary("<", left, right);
        else if (op[0] == '>')
            node = new ASTExprBinary(">", left, right);
        else if (op[0] == '>' && op[1] == '=')
            node = new ASTExprBinary(">=", left, right);
        else if (op[0] == '<' && op[1] == '=')
            node = new ASTExprBinary("<=", left, right);
        else if (op[0] == '=' && op[1] == '=')
            node = new ASTExprBinary("==", left, right);
        else
            node = new ASTExprBinary("!=", left, right);

        node = new ASTExprBinary(op, left, right);

        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitAddSubExp(ExprParser::AddSubExpContext *context)
    {
        cout << "In visitAddSubExp" << endl;
        ASTExpr *left;
        ASTExpr *right;

        ASTExprBinary *node;

        left = visit(context->expr(0));
        right = visit(context->expr(1));

        string op = context->op->getText();

        if (op[0] == '+')
            node = new ASTExprBinary("+", left, right);
        else
            node = new ASTExprBinary("-", left, right);

        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitBoolOp(ExprParser::BoolOpContext *context)
    {
        cout << "In visitBoolOp" << endl;
        ASTExpr *left;
        ASTExpr *right;

        ASTExprBinary *node;

        left = visit(context->expr(0));
        right = visit(context->expr(1));

        string op = context->bool_op->getText();

        if (op[0] == '&')
            node = new ASTExprBinary("&", left, right);
        else
            node = new ASTExprBinary("|", left, right);

        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitAssgnOp(ExprParser::AssgnOpContext *context)
    {
        cout << "In visitAssgnOp" << endl;
        ASTExpr *left;
        ASTExpr *right;

        ASTExprBinary *node;

        left = visit(context->expr(0));
        right = visit(context->expr(1));

        string op = context->Asgn_op()->getText();

        node = new ASTExprBinary(op, left, right);

        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitRead(ExprParser::ReadContext *context)
    {
        cout << "In visitRead" << endl;
        ASTReadFile *node = new ASTReadFile("");
        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitReadFile(ExprParser::ReadFileContext *context)
    {
        cout << "In visitReadFile" << endl;
        ASTReadFile *node = new ASTReadFile(context->ID()->getText());
        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitOpenBlock(ExprParser::OpenBlockContext *context)
    {
        cout << "In visitOpenBlock" << endl;
        string file = context->ID()->getText();
        ASTExprID *FileID = new ASTExprID(file);
        ASTOpenFile *node = new ASTOpenFile(FileID, context->STRING()->getText());
        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitArrayIdentifier(ExprParser::ArrayIdentifierContext *context)
    {
        cout << "In visitArray_identifier" << endl;
        ASTArray *node = new ASTArray();
        ASTExpr *idxNode;

        node->id = context->ID()->getText();
        for (auto idx : context->expr())
        {
            idxNode = visit(idx);
            if (idxNode != nullptr)
            {
                node->indexList.push_back(idxNode);
            }
        }
        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitValUint(ExprParser::ValUintContext *context)
    {
        cout << "In visitValUint" << endl;
        ASTExprINT *node = new ASTExprINT(stoi(context->U_INT()->getText()));
        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitValInt(ExprParser::ValIntContext *context)
    {
        cout << "In visitValInt" << endl;
        ASTExprINT *node = new ASTExprINT(stoi(context->INT()->getText()));
        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitFloat(ExprParser::FloatContext *context)
    {
        cout << "In visitFloat" << endl;
        ASTExprFLOAT *node = new ASTExprFLOAT(stof(context->FLOAT()->getText()));
        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitID(ExprParser::IDContext *context)
    {
        cout << "In visitID" << endl;
        ASTExprID *node = new ASTExprID(context->ID()->getText());
        return (ASTExpr*) node;
    }

    virtual antlrcpp::Any visitString(ExprParser::StringContext *context)
    {
        cout << "In visitString" << endl;
        ASTExprString *node = new ASTExprString(context->STRING()->getText());
        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitType_bool(ExprParser::Type_boolContext *context) 
    {
        cout << "In visitType_bool" << endl;
        return context->Type_bool()->getText();
    }

    virtual antlrcpp::Any visitType_char(ExprParser::Type_charContext *context) 
    {
        cout << "In visitType_char" << endl;
        return context->Type_char()->getText();
    }

    virtual antlrcpp::Any visitType_string(ExprParser::Type_stringContext *context)
    {
        cout << "In visitType_string" << endl;
        return context->Type_string()->getText();
    }

    virtual antlrcpp::Any visitType_file(ExprParser::Type_fileContext *context) 
    {
        cout << "In visitType_file" << endl;
        return context->Type_file()->getText();
    }
    
    virtual antlrcpp::Any visitType_int(ExprParser::Type_intContext *context) 
    {
        cout << "In visitType_int" << endl;
        return context->Type_int()->getText();
    }
    
    virtual antlrcpp::Any visitType_uint(ExprParser::Type_uintContext *context) 
    {
        cout << "In visitType_uint" << endl;
        return context->Type_uint()->getText();
    }

    virtual antlrcpp::Any visitType_void(ExprParser::Type_voidContext *context) 
    {
        cout << "In visitType_void" << endl;
        return context->Type_void()->getText();
    }
    
    virtual antlrcpp::Any visitType_float(ExprParser::Type_floatContext *context) 
    {
        cout << "In visitType_float" << endl;
        return context->Type_float()->getText();
    }

    virtual antlrcpp::Any visitExpression(ExprParser::ExpressionContext *context) 
    {
        cout<<"In visitExpression"<<endl;
        ASTExpr *node = visit(context->expr());
        return (ASTStat *)node;
    }
    virtual antlrcpp::Any visitCondBlock(ExprParser::CondBlockContext *context) 
    {
        cout<<"In visitCondBlock"<<endl;
        ASTExpr *first;
        ASTExpr *second;
        ASTExpr *third;

        ASTExprTernary *node;

        first = visit(context->expr(0));
        second = visit(context->expr(1));
        third = visit(context->expr(2));
        node = new ASTExprTernary(first, second, third);

        return (ASTStat *)node;
    }

    virtual antlrcpp::Any visitIfBlock(ExprParser::IfBlockContext *context) 
    {
        cout<<"In visitIfBlock"<<endl;
        ASTIF *node;
        vector<ASTStat *> ifstmt = visit(context->block(0));
        
        if (context->block().size() > 1)
        {
            vector<ASTStat *> elsestmt = visit(context->block(1));
            node = new ASTIF(visit(context->expr()), ifstmt, elsestmt);
        }
        else
        {
            vector<ASTStat *> elsestmt = {};
            node = new ASTIF(visit(context->expr()), ifstmt, elsestmt);
        }
        return (ASTStat *)node;
    }

    virtual antlrcpp::Any visitForBlock(ExprParser::ForBlockContext *context) 
    {
        cout<<"In visitForBlock"<<endl;
        vector<ASTExpr*> exprList;
        for (auto idx : context->expr())
        {
            ASTExpr *exp = visit(idx);
            if (exp != nullptr)
            {
                exprList.push_back(exp);
            }
        }

        vector<ASTStat *> blockList = visit(context->block());
        ASTFOR *node = new ASTFOR(exprList, blockList);

        return (ASTStat *)node;
    }

    virtual antlrcpp::Any visitWhileBlock(ExprParser::WhileBlockContext *context) 
    {
        cout<<"In visitWhileBlock"<<endl;
        ASTExpr* exp = visit(context->expr());
        ASTWhile *node = new ASTWhile(exp, visit(context->block()));
        return (ASTStat *)node;
    }

    virtual antlrcpp::Any visitOutBlock(ExprParser::OutBlockContext *context) 
    {
        cout<<"In visitOutBlock"<<endl;
        ASTExpr *node = visit(context->expr());
        return (ASTStat *)node;
    }

    virtual antlrcpp::Any visitReturnBasic(ExprParser::ReturnBasicContext *context) 
    {
        cout<<"In visitReturnBasic"<<endl;
        string str = context->Return()->getText();
        ASTExpr *node1 = nullptr;
        ASTReturn *node = new ASTReturn(str, node1);
        return (ASTStat *)node;
    }

    virtual antlrcpp::Any visitReturnValue(ExprParser::ReturnValueContext *context) 
    {
        cout<<"In visitReturnValue"<<endl;
        string str = context->Return()->getText();
        ASTExpr *expr = visit(context->expr());
        ASTReturn *node = new ASTReturn(str, expr);
        return (ASTStat *)node;
    }

    virtual antlrcpp::Any visitBreak(ExprParser::BreakContext *context) 
    {
        cout<<"In visitBreak"<<endl;
        ASTExprString *node = new ASTExprString(context->Break()->getText());
        return (ASTStat *)node;
    }

    virtual antlrcpp::Any visitContinue(ExprParser::ContinueContext *context) 
    {
        cout<<"In visitContinue"<<endl;
        ASTExprString *node = new ASTExprString(context->Continue()->getText());
        return (ASTStat *)node;
    }

    virtual antlrcpp::Any visitFuncCall(ExprParser::FuncCallContext *context) 
    {
        cout << "In visitFunccall" << endl;
        string func = context->FUNC()->getText();
        vector<ASTExpr *> args = visit(context->args());
        ASTFuncCall *node = new ASTFuncCall(func, args);
        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitTrue(ExprParser::TrueContext *context)
    {
        cout<<"In visitTrue"<<endl;
        ASTExprBool *node = new ASTExprBool(context->True()->getText());
        return (ASTExpr *)node;
    }

    virtual antlrcpp::Any visitFalse(ExprParser::FalseContext *context)
    {
        cout<<"In visitFalse"<<endl;
        ASTExprBool *node = new ASTExprBool(context->False()->getText());
        return (ASTExpr *)node;
    }

};