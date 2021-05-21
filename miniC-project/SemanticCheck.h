#include <bits/stdc++.h>

using namespace std;

struct Test
{
  string name, type;
  bool flag;
};

class SemanticCheck : public ASTvisitor
{
public:
  list<unordered_map<string, string>> var_decl;
  unordered_map<string, ASTMethod *> func_decl;
  vector<Test> global_func;
  bool funcDeclCheck(ASTFuncCall &node)
  {
    bool check = false;
    ASTMethod *new_node = nullptr;
    if(func_decl.find(node.getID()) != func_decl.end()){
      check = true;
      new_node = func_decl.find(node.getID())->second;
    }

    if(!check) {
      cerr << "Function ID " << node.getID() << " NOT FOUND" << endl;
      return false;
    }
    if(!new_node->getargs().empty() && !node.getarg().empty()) {

      bool flag = true;
      int n = new_node->getargs().size();
      if (n == node.getarg().size())
      {

        for (int i = 0; i < n; i++)
        {
          if (node.getarg()[i]->type != "undefined" && new_node->getargs()[i]->gettype() != node.getarg()[i]->type)
          {
            flag = false;
          }
        }
      }
      else {
        flag = false;
      }

      if(flag) {
        node.type = new_node->gettype();
        return true;
      }
    }
    cerr << "Function params of " << node.getID() << " don't match" << endl;
    return false;
  }

  virtual void visit(ASTProg &node)
  {
    unordered_map<string, string> global_decl;
    var_decl.push_back(global_decl);
    for (auto &stat : node.statementList) {
      stat->accept(*this);
    }
  };

  virtual void visit(ASTStatExpr &node)
  {
    node.expr->accept(*this);
  };

  virtual void visit(ASTNotExpr &node)
  {
    node.expr->accept(*this);
  };

  virtual void visit(ASTDecl &node)
  {
    auto local_decl = var_decl.rbegin();
    if (local_decl->find(node.getID()->getID()) != local_decl->end())
    {
      cerr << "Variable " << node.getID()->getID() << " already defined" << endl;
    }
    if (func_decl.find(node.getID()->getID()) != func_decl.end())
    {
      cerr << "Function with name " << node.getID()->getID() << " already exits" << endl;
    }
    local_decl->insert({node.getID()->getID(), node.gettype()});
  };

  virtual void visit(ASTMethod &node)
  {
    if(func_decl.find(node.getfunc()) != func_decl.end()) {
      cerr << "Function " << node.getfunc() << " already defined" << endl;
    }
    auto current_scope = var_decl.rbegin();
    if (current_scope->find(node.getfunc()) != current_scope->end())
    {
      cerr << "Variable with name" << node.getfunc() << " already defined" << endl;
    }
    this->func_decl.insert({node.getfunc(), &node});
    global_func.push_back({node.getfunc(), node.gettype(), false});
    unordered_map<string, string> local_decl;
    var_decl.push_back(local_decl);
    if (!node.getargs().empty())
    {
      for(auto idx: node.getargs()) {
        idx->accept(*this);
      }
    }
    for (auto idx : node.getblock())
    {
      idx->accept(*this);
    }
    if(global_func.back().flag == false) {
      cerr << "Function " << global_func.back().name << " has missing Return stmt" << endl;
    }
    var_decl.pop_back();
    global_func.pop_back();
  };

  virtual void visit(ASTIF &node)
  {
    ASTExpr *cond = node.getcond();
    cond->accept(*this);
    if (node.getcond()->type != "bool")
    {
      cerr << "Condition given in IF not bool type" << endl;
    }
    //ifscope
    unordered_map<string, string> if_scope;
    var_decl.push_back(if_scope);

    for (auto idx : node.getifstmt())
    {
      idx->accept(*this);
    }
    var_decl.pop_back();

    //elsescope
    unordered_map<string, string> else_scope;
    var_decl.push_back(else_scope);

    for (auto idx : node.getelsestmt())
    {
      idx->accept(*this);
    }
    var_decl.pop_back();
  };

  virtual void visit(ASTFOR &node)
  {
    unordered_map<string, string> for_scope;
    var_decl.push_back(for_scope);

    for (auto idx : node.getexpr())
    {
      idx->accept(*this);
    }
    //forscope
    for (auto idx : node.getblock())
    {
      idx->accept(*this);
    }
    var_decl.pop_back();
  };

  virtual void visit(ASTWhile &node)
  {
    //check the condition bool
    ASTStat *decl = node.getexpr();
    decl->accept(*this);
    if (node.getexpr()->type != "bool")
    {
      cerr << "Condition given in WHILE not bool type" << endl;
    }
    //whilescope
    unordered_map<string, string> while_scope;
    var_decl.push_back(while_scope);
    for (auto idx : node.getblock())
    {
      idx->accept(*this);
    }
    var_decl.pop_back();
  };

  virtual void visit(ASTFuncCall &node)
  {
    string id = node.getID();
    for (auto itr : node.getarg())
    {
      itr->accept(*this);
    }
    if(!funcDeclCheck(node)){
      cerr << "Function " << node.getID() << " is not defined" << endl;
    }
  };

  virtual void visit(ASTParenExpr &node)
  {
    node.expr->accept(*this);
    node.type = node.expr->type;
  };

  virtual void visit(ASTExpr &node){};

  virtual void visit(ASTExprBinary &node)
  {
    ASTExpr *left = node.getLeft();
    ASTExpr *right = node.getRight();

    left->accept(*this);
    right->accept(*this);

    if (right->type != "undefined" && left->type != right->type)
    {
      cerr << "Binary operation on type " << right->type << " and type " << left->type <<endl;
    }
    else {
      node.type = left->type;
    }
    string op = node.getBin_operator();
    if (op == "<" | op == ">" | op == ">=" | op == "<=" | op == "==" | op == "!=") {
      node.type = "bool";
    }
  };

  virtual void visit(ASTExprTernary &node)
  {
    ASTExpr *first = node.getFirst();
    ASTExpr *second = node.getSecond();
    ASTExpr *third = node.getThird();

    first->accept(*this);
    second->accept(*this);
    third->accept(*this);
    if(first->type == "bool")
    {
      cerr << "Condition given is not bool type" << endl;
    }
  };

  virtual void visit(ASTReturn &node)
  {    
    ASTExpr *expr = node.getexp();
    global_func.back().flag = true;
    string func_type = global_func.back().type;
    if (expr == nullptr)
    {
      if (func_type != "void") {
        cerr << "Return type void doesn't match func type " << func_type << endl;
      }
    }
    else {
      expr->accept(*this);
      if (expr->type != func_type)
      {
        cerr << "Return type " << expr->type << " doesn't match func type " << func_type << endl;
      }
    }
  };

  virtual void visit(ASTExprID &node){
    bool flag = false;
    for (auto it = var_decl.rbegin(); it != var_decl.rend(); it++)
    {
      if (it->find(node.getID()) != it->end())
      {
        flag = true;
        node.type = it->find(node.getID())->second;
        break;
      }
    }
    if (!flag)
    {
      cerr << "ID " << node.getID() << " not found" << endl;
      return;
    }
  };

  virtual void visit(ASTExprINT &node){
    node.type = "int";
  };

  virtual void visit(ASTExprString &node)
  {
    node.type = "string";
  };

  virtual void visit(ASTExprBool &node)
  {
    node.type = "bool";
  };

  virtual void visit(ASTExprFLOAT &node){
    node.type = "float";
  };

  virtual void visit(ASTReadFile &node){
    //check in var_decl list
    bool flag = false;
    if(node.getfile() != ""){
      for (auto it = var_decl.rbegin(); it != var_decl.rend(); it++)
      {
        if (it->find(node.getfile()) != it->end())
        {
          flag = true;
          if (it->find(node.getfile())->second != "file")
          {
            cerr << "File name " << node.getfile() << " is wrong" << endl;
          }
          break;
        }
        if (!flag)
        {
          cerr << "File " << node.getfile() << "not found" << endl;
        }
      }
    }
    else {
      node.type = "undefined";
    }
  };

  virtual void visit(ASTOpenFile &node){
    bool flag = false;
    for (auto it = var_decl.rbegin(); it != var_decl.rend(); it++)
    {
        if (it->find(node.getfileopen()->getID()) != it->end())
        {
          flag = true;
          if (it->find(node.getfileopen()->getID())->second != "file")
          {
            cerr << "File name " << node.getfileopen()->getID() << " is wrong" << endl;
          }
          break;
        }
        if (!flag)
        {
          cerr << "File " << node.getfileopen()->getID() << "not found" << endl;
        }
    }
    node.type = "undefined";
  };

  virtual void visit(ASTArray &node){
    bool flag = false;
    for (auto it = var_decl.rbegin(); it != var_decl.rend(); it++)
    {
      if (it->find(node.id) != it->end())
      {
        flag = true;
        node.type = it->find(node.id)->second;
        break;
      }
    }
    if (!flag)
    {
      cerr << "Array ID " << node.id << " not found" << endl;
      return;
    }
    for (auto idx : node.indexList)
    {
      idx->accept(*this);
      if (idx->type != "int")
      {
        cerr << "Index type of " << node.id << " is not int" << endl;
      }
    }
  };
};