#include <bits/stdc++.h>

#include "llvm/ADT/APFloat.h"
#include "llvm/ADT/STLExtras.h"
#include "llvm/IR/BasicBlock.h"
#include "llvm/IR/Constants.h"
#include "llvm/IR/DerivedTypes.h"
#include "llvm/IR/Function.h"
#include "llvm/IR/IRBuilder.h"
#include "llvm/IR/LLVMContext.h"
#include "llvm/IR/Module.h"
#include "llvm/IR/Type.h"
#include "llvm/IR/Verifier.h"
#include <llvm/IR/LegacyPassManager.h>
#include <llvm/IR/LegacyPassManagers.h>
#include <llvm/IR/IRPrintingPasses.h>
#include <llvm/Support/TargetSelect.h>
#include <llvm/AsmParser/Parser.h>
#include <llvm/IR/Instructions.h>
#include <llvm/IR/CallingConv.h>
#include <llvm/ExecutionEngine/GenericValue.h>
#include <llvm/Support/raw_ostream.h>
#include <llvm/Pass.h>
#include <llvm/ADT/SmallVector.h>
#include <llvm/IR/BasicBlock.h>
#include <llvm/IR/CallingConv.h>
#include <llvm/IR/Constants.h>
#include <llvm/IR/GlobalVariable.h>
#include <llvm/IR/InlineAsm.h>
#include <llvm/Support/FormattedStream.h>
#include <llvm/Support/MathExtras.h>
#include <iostream>

using namespace std;
using namespace llvm;

static llvm::LLVMContext Context;
static llvm::IRBuilder<> Builder(Context);
static unordered_map<string, llvm::Value *> NamedValues;
static llvm::Module *MyModule;

class CodeGenerator : public ASTvisitor
{
    public:
        llvm::Function *InitFunction;
        vector<pair<unordered_map<string, llvm::Value *>, llvm::BasicBlock *>> global_blocks;
        llvm::Value *return_val;

        virtual void visit(ASTProg &node)
        {
            cout << "IR visit to ProgramNode" << endl;
            MyModule = new llvm::Module("MiniC", Context);
            BasicBlock *prog_block = llvm::BasicBlock::Create(Context, "prog", nullptr, 0);
            unordered_map<string, llvm::Value *> prog_map;
            global_blocks.push_back(make_pair(prog_map, prog_block));
            for (auto &stat: node.statementList)
            {
                stat->accept(*this);
            }
            global_blocks.pop_back();
            Builder.CreateRetVoid();
            llvm::verifyFunction(*InitFunction);
            llvm::legacy::PassManager PM;
            PM.add(llvm::createPrintModulePass(llvm::outs()));
            PM.run(*MyModule);
        };

        virtual void visit(ASTStatExpr &node)
        {
            cout << "IR visit to StatExpr" << endl;
            node.expr->accept(*this);
        };

        virtual void visit(ASTNotExpr &node)
        {
            cout << "IR visit to ASTNotExpr" << endl;
            node.expr->accept(*this);
        };

        virtual void visit(ASTDecl &node)
        {
            cout << "IR visit to ASTDecl" << endl;
            llvm::AllocaInst *AllocaInst = new llvm::AllocaInst(llvm::IntegerType::get(Context, 32), 0, node.getID()->getID(), global_blocks.back().second);
            cout << "IR visit to ASTDecl" << endl;
            // llvm::AllocaInst *AllocaInst = new llvm::AllocaInst(llvm::Type::getInt64Ty(Context), 0, node.getID()->getID(), global_blocks.back().second);
            new llvm::StoreInst(llvm::ConstantInt::get(llvm::Type::getInt64Ty(Context), 0, true), AllocaInst, false, global_blocks.back().second);
            global_blocks.back().first.insert({node.getID()->getID(), AllocaInst});
        };

        virtual void visit(ASTMethod &node){
            cout << "IR visit to ASTMethod" << endl;
            if (node.getfunc() == "Main")
            {
                llvm::FunctionType *func_type = llvm::FunctionType::get(llvm::Type::getVoidTy(Context), false);
                llvm::Function *InitFunction = llvm::Function::Create(func_type, llvm::GlobalValue::ExternalLinkage, "Main", MyModule);
                llvm::BasicBlock *main_block = llvm::BasicBlock::Create(Context, "Init", InitFunction, 0);
                unordered_map<string, llvm::Value *> var_scope;
                global_blocks.push_back(make_pair(var_scope, main_block));
            }
            llvm::Type *arg_type;
            std::vector<llvm::Type *> types;
            std::vector<ASTDecl *> args = node.getargs();
            for (auto it : args)
            {
                if ((it)->gettype() == "int")
                {
                    arg_type = llvm::Type::getInt64Ty(Context);
                }
                else if ((it)->gettype() == "string")
                {
                    arg_type = llvm::Type::getInt8PtrTy(Context);
                }
                else if ((it)->gettype() == "bool")
                {
                    arg_type = llvm::Type::getInt1Ty(Context);
                }
                    types.push_back(arg_type);
            }
            std::string func_name = node.getfunc();
            llvm::Type *func_type;
            if (node.gettype() == "int")
                func_type = llvm::Type::getInt64Ty(Context);
            else if (node.gettype() == "void")
                func_type = llvm::Type::getVoidTy(Context);
            else if (node.gettype() == "bool")
                func_type = llvm::Type::getInt1Ty(Context);

            llvm::FunctionType *ftype = llvm::FunctionType::get(func_type, llvm::makeArrayRef(types), false);
            llvm::Function *function = llvm::Function::Create(ftype, llvm::GlobalValue::InternalLinkage, func_name, MyModule);
            std::string entry = "enter";
            llvm::BasicBlock *block = llvm::BasicBlock::Create(Context, entry, function, 0);
            llvm::Function::arg_iterator it2 = function->arg_begin();
            std::vector<ASTDecl *>::iterator it;
            for (auto it: args)
            {
                llvm::Value *arg = &(*it2);
                llvm::AllocaInst *allocaInst = new llvm::AllocaInst(llvm::Type::getInt64Ty(Context), 0, (it)->getID()->getID(), global_blocks.back().second);
                new llvm::StoreInst(arg, allocaInst, false, global_blocks.back().second);
                global_blocks.back().first.insert({(it)->getID()->getID(), allocaInst});
                it2++;
            }
            for (auto idx : node.getblock())
            {
                idx->accept(*this);
            }
            global_blocks.pop_back();
        };

        virtual void visit(ASTIF &node){
            cout << "IR visit to ASTIF" << endl;
        };

        virtual void visit(ASTFOR &node){
            cout << "IR visit to ASTFOR" << endl;
        };

        virtual void visit(ASTWhile &node){
            cout << "IR visit to ASTWhile" << endl;
        };

        virtual void visit(ASTFuncCall &node){
            cout << "IR visit to ASTFunCall" << endl;

            for (auto itr : node.getarg())
            {
                itr->accept(*this);
            }
        };

        virtual void visit(ASTParenExpr &node){
            cout << "IR visit to ASTParenExpr" << endl;

            node.expr->accept(*this);
        };

        virtual void visit(ASTExpr &node){
            cout << "IR visit to ASTExpr" << endl;
        };

        virtual void visit(ASTExprBinary &node)
        {
            cout << "IR visit to ASTBinary" << endl;
            ASTExpr *left = node.getLeft();
            ASTExpr *right = node.getRight();

            left->accept(*this);
            llvm::Value *lhs = return_val;
            right->accept(*this);
            llvm::Value *rhs = return_val;
            string op = node.getBin_operator();
            if(op == "+")
                return_val = llvm::BinaryOperator::Create(llvm::Instruction::Add, lhs, rhs, "tmp", global_blocks.back().second);
            if(op == "-")
                return_val = llvm::BinaryOperator::Create(llvm::Instruction::Sub, lhs, rhs, "tmp", global_blocks.back().second);
            if(op == "=")
                new llvm::StoreInst(rhs, lhs, false, global_blocks.back().second);
            if (op == "/")
                return_val = llvm::BinaryOperator::Create(llvm::Instruction::SDiv, lhs, rhs, "tmp", global_blocks.back().second);
            if (op == "%")
                return_val = llvm::BinaryOperator::Create(llvm::Instruction::SRem, lhs, rhs, "tmp", global_blocks.back().second);
            if (op == "<")
                new llvm::ZExtInst(llvm::CmpInst::Create(llvm::Instruction::ICmp, llvm::ICmpInst::ICMP_SLT, lhs, rhs, "tmp", global_blocks.back().second), llvm::Type::getInt64Ty(Context), "zext", global_blocks.back().second);
            if (op == ">")
                new llvm::ZExtInst(llvm::CmpInst::Create(llvm::Instruction::ICmp, llvm::ICmpInst::ICMP_SGT, lhs, rhs, "tmp", global_blocks.back().second), llvm::Type::getInt64Ty(Context), "zext", global_blocks.back().second);
            if (op == "<=")
                new llvm::ZExtInst(llvm::CmpInst::Create(llvm::Instruction::ICmp, llvm::ICmpInst::ICMP_SLE, lhs, rhs, "tmp", global_blocks.back().second), llvm::Type::getInt64Ty(Context), "zext", global_blocks.back().second);
            if (op == "<=")
                new llvm::ZExtInst(llvm::CmpInst::Create(llvm::Instruction::ICmp, llvm::ICmpInst::ICMP_SGE, lhs, rhs, "tmp", global_blocks.back().second), llvm::Type::getInt64Ty(Context), "zext", global_blocks.back().second);
            if (op == "==")
                new llvm::ZExtInst(llvm::CmpInst::Create(llvm::Instruction::ICmp, llvm::ICmpInst::ICMP_EQ, lhs, rhs, "tmp", global_blocks.back().second), llvm::Type::getInt64Ty(Context), "zext", global_blocks.back().second);
            if (op == "!=")
                new llvm::ZExtInst(llvm::CmpInst::Create(llvm::Instruction::ICmp, llvm::ICmpInst::ICMP_NE, lhs, rhs, "tmp", global_blocks.back().second), llvm::Type::getInt64Ty(Context), "zext", global_blocks.back().second);
            if (op == "&")
                return_val = llvm::BinaryOperator::Create(llvm::Instruction::And, lhs, rhs, "tmp", global_blocks.back().second);
            if (op == "|")
                return_val = llvm::BinaryOperator::Create(llvm::Instruction::Or, lhs, rhs, "tmp", global_blocks.back().second);
        };

        virtual void visit(ASTExprTernary &node){
            ASTExpr *first = node.getFirst();
            ASTExpr *second = node.getSecond();
            ASTExpr *third = node.getThird();

            first->accept(*this);
            second->accept(*this);
            third->accept(*this);
        };

        virtual void visit(ASTReturn &node){
            ASTExpr *expr = node.getexp();
            if (expr == nullptr)
            {
                llvm::ReturnInst::Create(Context, global_blocks.back().second);
            }
            else
            {
                expr->accept(*this);
                llvm::ReturnInst::Create(Context, llvm::ConstantInt::get(llvm::Type::getInt64Ty(Context), 0, true), global_blocks.back().second);
            }
        };

        virtual void visit(ASTExprID &node)
        {
            for (auto it = global_blocks.rbegin(); it != global_blocks.rend(); it++)
            {
                if (it->first.find(node.getID()) != it->first.end())
                {
                    return_val = it->first.find(node.getID())->second;
                    break;
                }
            }
        };

        virtual void visit(ASTExprINT &node)
        {
            llvm::Type *x = llvm::Type::getInt64Ty(Context);
            return_val = llvm::ConstantInt::get(x, node.getIntLit(), true);
        };

        virtual void visit(ASTExprString &node)
        {
            return_val = Builder.CreateGlobalStringPtr(node.getString());
        };

        virtual void visit(ASTExprBool &node)
        {
            llvm::IntegerType *x = llvm::Type::getInt1Ty(Context);
            return_val = llvm::ConstantInt::get(x, node.getBool(), true);
        };

        virtual void visit(ASTExprFLOAT &node)
        {
            llvm::Type *x = llvm::Type::getInt64Ty(Context);
            return_val = llvm::ConstantInt::get(x, node.getFloatLit(), true);
        };

        virtual void visit(ASTReadFile &node)
        {
            //check in var_decl list
            // bool flag = false;
            // if (node.getfile() != "")
            // {
            //     for (auto it = var_decl.rbegin(); it != var_decl.rend(); it++)
            //     {
            //         if (it->find(node.getfile()) != it->end())
            //         {
            //             flag = true;
            //             if (it->find(node.getfile())->second != "file")
            //             {
            //                 cerr << "File name " << node.getfile() << " is wrong" << endl;
            //             }
            //             break;
            //         }
            //         if (!flag)
            //         {
            //             cerr << "File " << node.getfile() << "not found" << endl;
            //         }
            //     }
            // }
            // else
            // {
            //     node.type = "undefined";
            // }
        };

        virtual void visit(ASTOpenFile &node)
        {
            // bool flag = false;
            // for (auto it = var_decl.rbegin(); it != var_decl.rend(); it++)
            // {
            //     if (it->find(node.getfileopen()->getID()) != it->end())
            //     {
            //         flag = true;
            //         if (it->find(node.getfileopen()->getID())->second != "file")
            //         {
            //             cerr << "File name " << node.getfileopen()->getID() << " is wrong" << endl;
            //         }
            //         break;
            //     }
            //     if (!flag)
            //     {
            //         cerr << "File " << node.getfileopen()->getID() << "not found" << endl;
            //     }
            // }
            // node.type = "undefined";
        };

        virtual void visit(ASTArray &node)
        {
            // bool flag = false;
            // for (auto it = var_decl.rbegin(); it != var_decl.rend(); it++)
            // {
            //     if (it->find(node.id) != it->end())
            //     {
            //         flag = true;
            //         node.type = it->find(node.id)->second;
            //         break;
            //     }
            // }
            // if (!flag)
            // {
            //     cerr << "Array ID " << node.id << " not found" << endl;
            //     return;
            // }
            // for (auto idx : node.indexList)
            // {
            //     idx->accept(*this);
            //     if (idx->type != "int")
            //     {
            //         cerr << "Index type of " << node.id << " is not int" << endl;
            //     }
            // }
        };
};