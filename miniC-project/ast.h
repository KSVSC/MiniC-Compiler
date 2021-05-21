#include <string>
#include <vector>

using namespace std;

class ASTProg;

class ASTStatExpr;
class ASTDecl;
class ASTMethod;
class ASTIF;
class ASTFOR;
class ASTWhile;
class ASTFuncCall;
class ASTReturn;

class ASTExpr;
class ASTExprBinary;
class ASTExprTernary;
class ASTExprID;
class ASTExprBool;
class ASTExprString;
class ASTExprINT;
class ASTExprFLOAT;
class ASTNotExpr;
class ASTParenExpr;
class ASTReadFile;
class ASTOpenFile;
class ASTArray;

class ASTvisitor
{
public:
    virtual void visit(ASTProg &node) = 0;
    virtual void visit(ASTStatExpr &node) = 0;
    virtual void visit(ASTDecl &node) = 0;
    virtual void visit(ASTMethod &node) = 0;
    virtual void visit(ASTIF &node) = 0;
    virtual void visit(ASTFOR &node) = 0;
    virtual void visit(ASTWhile &node) = 0;
    virtual void visit(ASTReturn &node) = 0;

    virtual void visit(ASTExprBinary &node) = 0;
    virtual void visit(ASTExprTernary &node) = 0;
    virtual void visit(ASTExprID &node) = 0;
    virtual void visit(ASTExprString &node) = 0;
    virtual void visit(ASTExprBool &node) = 0;
    virtual void visit(ASTExprINT &node) = 0;
    virtual void visit(ASTExprFLOAT &node) = 0;
    virtual void visit(ASTNotExpr &node) = 0;
    virtual void visit(ASTParenExpr &node) = 0;
    virtual void visit(ASTReadFile &node) = 0;
    virtual void visit(ASTOpenFile &node) = 0;
    virtual void visit(ASTArray &node) = 0;
    virtual void visit(ASTExpr &node) = 0;
    virtual void visit(ASTFuncCall &node) = 0;
};

class ASTnode
{
public:
    virtual ~ASTnode()
    {
    }

    //  virtual void printPostFix() const = 0;

    virtual void accept(ASTvisitor &V) = 0;
};

class ASTStat : public ASTnode
{
public:
    ASTExpr *expr;
    virtual ~ASTStat()
    {
    }

    //  virtual void printPostFix() const = 0;

    virtual void accept(ASTvisitor &V) = 0;
};

class ASTProg : public ASTnode
{
public:
    std::vector<ASTStat *> statementList;
    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTExpr : public ASTStat
{
public:
    // Type type = 
    string type = "undefined";
    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTStatExpr : public ASTStat
{
public:
    ASTExpr *expr;
    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTFuncCall : public ASTExpr
{
    string id;
    vector<ASTExpr *> args;
public:
    ASTFuncCall(string id, vector<ASTExpr *> args) : id(id), args(args) {}

    string getID()
    {
        return id;
    }

    vector<ASTExpr *> getarg()
    {
        return args;
    }

    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTReturn : public ASTStat
{
    string id;
    ASTExpr * expr;

public:
    ASTReturn(string id, ASTExpr * expr) : id(id), expr(expr) {}

    string getID()
    {
        return id;
    }

    ASTExpr* getexp()
    {
        return expr;
    }

    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTDecl : public ASTStat
{
    string type;
    ASTExprID * id;
    std::vector<ASTExpr *> indexList;


public:
    ASTDecl(string type, ASTExprID* id, vector<ASTExpr *> indexList) : type(type), id(id), indexList(indexList) {}

    string gettype()
    {
        return type;
    }
    ASTExprID* getID()
    {
        return id;
    }

    vector<ASTExpr *> getflagvec()
    {
        return indexList;
    }

    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTIF : public ASTExpr
{
    ASTExpr *cond;
    vector<ASTStat *> ifstmt;
    vector<ASTStat *> elsestmt;

public:
    ASTIF(ASTExpr *cond, vector<ASTStat *> ifstmt, vector<ASTStat *> elsestmt) : cond(cond), ifstmt(ifstmt), elsestmt(elsestmt) {}

    ASTExpr* getcond()
    {
        return cond;
    }
    vector<ASTStat *> getifstmt()
    {
        return ifstmt;
    }
    vector<ASTStat *> getelsestmt()
    {
        return elsestmt;
    }

    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTFOR : public ASTStat
{
    vector<ASTExpr *> expr;
    vector<ASTStat *> block;

public:
    ASTFOR(vector<ASTExpr *> expr, vector<ASTStat *> block) : expr(expr), block(block) {}

    vector<ASTExpr *> getexpr()
    {
        return expr;
    }
    vector<ASTStat *> getblock()
    {
        return block;
    }

    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTWhile : public ASTStat
{
    ASTExpr* expr;
    vector<ASTStat *> block;
public:
    ASTWhile(ASTExpr * expr, vector<ASTStat*> block): expr(expr),block(block) {}
    ASTExpr * getexpr()
    {
        return expr;
    }
    vector<ASTStat *> getblock()
    {
        return block;
    }
    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTMethod : public ASTStat
{
    string type;
    string funcname;
    vector<ASTDecl *> args;
    vector<ASTStat *> block;

public:
    ASTMethod(string type, string funcname, vector<ASTDecl *> args, vector<ASTStat *> block) : type(type), funcname(funcname), args(args), block(block) {}

    string gettype()
    {
        return type;
    }
    string getfunc()
    {
        return funcname;
    }

    vector<ASTDecl *> getargs()
    {
        return args;
    }

    vector<ASTStat *> getblock()
    {
        return block;
    }

    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTNotExpr : public ASTExpr
{
public:
    ASTExpr *expr;
    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTReadFile : public ASTExpr
{

    string file;

public:
    ASTReadFile(string file) : file(file) {}

    string getfile()
    {
        return file;
    }

    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTOpenFile : public ASTExpr
{

    ASTExprID * file;
    string mode;

public:
    ASTOpenFile(ASTExprID* file, string mode) : file(file), mode(mode) {}

    ASTExprID* getfileopen()
    {
        return file;
    }

    string getmode()
    {
        return mode;
    }

    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTParenExpr : public ASTExpr
{
public:
    ASTExpr *expr;
    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTArray : public ASTExpr
{
public:
    string id;
    std::vector<ASTExpr *> indexList;
    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTExprBinary : public ASTExpr
{
    std::string bin_operator;

    // lhs and rhs can be of any type.
    // So we need to use BaseAST
    ASTExpr *left;
    ASTExpr *right;

public:
    // Constructor to initialize binary operator,
    // lhs and rhs of the binary expression.
    ASTExprBinary(std::string op, ASTExpr *_left, ASTExpr *_right) : bin_operator(op), left(_left), right(_right) {}

    /*  virtual void printPostFix() const 
     {
     	lhs->printPostFix();
     	rhs->printPostFix();
     	std::cout << bin_operator << " "; 
     } */

    ASTExpr *getLeft()
    {
        return left;
    }

    ASTExpr *getRight()
    {
        return right;
    }

    std::string getBin_operator()
    {
        return bin_operator;
    }
    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTExprTernary : public ASTExpr
{

    ASTExpr *first;
    ASTExpr *second;
    ASTExpr *third;

public:
    ASTExprTernary(ASTExpr *first, ASTExpr *second, ASTExpr *third) : first(first), second(second), third(third) {}

    /*   virtual void printPostFix() const
     {
     	first->printPostFix();
     	second->printPostFix();
     	third->printPostFix();
     	std::cout << "? " << std::endl; 
     }  */

    ASTExpr *getFirst()
    {
        return first;
    }

    ASTExpr *getSecond()
    {
        return second;
    }

    ASTExpr *getThird()
    {
        return third;
    }

    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTExprINT : public ASTExpr
{

    int intlit;

public:
    ASTExprINT(int intlit) : intlit(intlit) {}

    int getIntLit()
    {
        return intlit;
    }

    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }

    /* virtual void printPostFix() const
	{
		std::cout << intlit << " " ;
	} */
};

class ASTExprFLOAT : public ASTExpr
{

    float floatlit;

public:
    ASTExprFLOAT(float floatlit) : floatlit(floatlit) {}

    float getFloatLit()
    {
        return floatlit;
    }

    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }

    /* virtual void printPostFix() const
	{
		std::cout << intlit << " " ;
	} */
};

class ASTExprString : public ASTExpr
{

    string id;

public:
    ASTExprString(string id) : id(id) {}

    string getString()
    {
        return id;
    }

    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTExprBool : public ASTExpr
{

    string id;

public:
    ASTExprBool(string id) : id(id) {}

    string getBool()
    {
        return id;
    }

    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTExprID : public ASTExpr
{

    string id;

public:
    ASTExprID(string id) : id(id) {}

    string getID()
    {
        return id;
    }

    virtual void accept(ASTvisitor &v)
    {
        v.visit(*this);
    }
};

class ASTContext
{
public:
    ASTnode *root;

    ~ASTContext()
    {
        clearAST();
    }

    /// free all saved expression trees
    void clearAST()
    {
        delete root;
    }
};
