//#include "ast.h"
#include <iostream>
using namespace std;

class PostFixVisitor : public ASTvisitor
{
public:
    virtual void visit(ASTProg &node)
    {
        cout << "PostFixVisit traversal invoked" << endl;
        int i = 1;
        cout << "program {" << endl;
        for (auto statement : node.statementList)
        {
            cout << "line " << i << " : ";
            statement->accept(*this);
            cout << endl;
            i = i + 1;
        }
        cout << "}" << endl;
    }

    virtual void visit(ASTStatExpr &node)
    {
        node.expr->accept(*this);
    }
    
    virtual void visit(ASTNotExpr &node)
    {
        node.expr->accept(*this);
        cout << "! ";
    }

    virtual void visit(ASTReadFile &node)
    {
        cout << "Read( " << node.getfile() << ")";
    }

    virtual void visit(ASTOpenFile &node)
    {
        cout << "Open( " << node.getfileopen() << ", " << node.getmode() << ")";
    }

    virtual void visit(ASTArray &node)
    {
        cout << node.id;
        for (auto idx : node.indexList)
        {
            cout << "[";
            idx->accept(*this);
            cout << "]";
        }
    }

    virtual void visit(ASTDecl &node)
    {
        if(node.getflagvec().size() == 0)
            cout << node.gettype() << " " << node.getID()->getID();
        else
        {
            cout << node.gettype() << " ";
            for (auto idx : node.getflagvec())
            {
                cout << "[";
                idx->accept(*this);
                cout << "]";
            }
        }
        
    }

    virtual void visit(ASTMethod &node)
    {
        cout << node.gettype() << " " <<node.getfunc() << " " << "(";
        for (auto idx : node.getargs())
        {
            idx->accept(*this);
        }
        cout << ")" << " " << "{";
        for (auto idx : node.getblock())
        {
            idx->accept(*this);
        }
        cout << ")";
    }

    virtual void visit(ASTIF &node)
    {
        cout << "if ";
        ASTExpr *cond = node.getcond();
        cond->accept(*this);
        cout << " ";
        for (auto idx : node.getifstmt())
        {
            idx->accept(*this);
            cout << " ";
        }
        for (auto idx : node.getelsestmt())
        {
            idx->accept(*this);
            cout << " ";
        }
    }

    virtual void visit(ASTFOR &node)
    {
        cout << "for ";
        for (auto idx : node.getexpr())
        {
            idx->accept(*this);
            cout << ";";
        }
        cout << "{";
        for (auto idx : node.getblock())
        {
            idx->accept(*this);
        }
        cout << "}";
    }

    virtual void visit(ASTWhile &node)
    {
        cout << "while(";
        ASTStat *decl = node.getexpr();
        cout << ")";
        decl->accept(*this);
        cout << "{";
        for (auto idx : node.getblock())
        {
            idx->accept(*this);
        }
        cout << "}";
    }

    virtual void visit(ASTFuncCall &node)
    {
        cout << node.getID() << " ";
        // vector<ASTStat *> args = node.getarg();
        for (auto itr : node.getarg())
        {
            itr->accept(*this);
            cout << " ";
        }
    }

    virtual void visit(ASTParenExpr &node)
    {
        cout << "(";
        node.expr->accept(*this);
        cout << ")";
    }

    virtual void visit(ASTExpr &node)
    {
        cout << "ASTExpr visit function" << endl;
    }

    virtual void visit(ASTExprBinary &node)
    {
        ASTExpr *left = node.getLeft();
        ASTExpr *right = node.getRight();

        left->accept(*this);
        right->accept(*this);
        cout << " " + node.getBin_operator();
    }

    virtual void visit(ASTExprTernary &node)
    {
        ASTExpr *first = node.getFirst();
        ASTExpr *second = node.getSecond();
        ASTExpr *third = node.getThird();

        first->accept(*this);
        second->accept(*this);
        third->accept(*this);

        // visit(node.getFirst());
        // visit(node.getSecond());
        // visit(node.getThird());
        cout << " ?:";
    }

    virtual void visit(ASTReturn &node)
    {
        cout << node.getID() << " ";
        ASTExpr *exp = node.getexp();
        if(exp != nullptr)
            exp->accept(*this);
    }

    virtual void visit(ASTExprID &node)
    {
        cout << " " << node.getID();
    }

    virtual void visit(ASTExprString &node)
    {
        cout << " " << node.getString();
    }

    virtual void visit(ASTExprBool &node)
    {
        cout << " " << node.getBool();
    }

    virtual void visit(ASTExprINT &node)
    {
        cout << " " << node.getIntLit();
    }

    virtual void visit(ASTExprFLOAT &node)
    {
        cout << " " << node.getFloatLit();
    }
};