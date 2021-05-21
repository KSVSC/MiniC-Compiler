#include <iostream>

#include "antlr4-runtime.h"
#include "ExprLexer.cpp"
#include "ExprParser.cpp"

#include "ExprBuildASTVisitor.h"

#include "PostfixVisitor.h"
#include "SemanticCheck.h"
#include "CodeGenerator.h"

using namespace std;
using namespace antlr4;

int main(int argc, const char* argv[]) {
    std::ifstream stream;

    cout << "Processing input file " << argv[1] << endl;
    stream.open(argv[1]);
    
    ANTLRInputStream input(stream);

    ExprLexer lexer(&input);
    CommonTokenStream tokens(&lexer);
    ExprParser parser(&tokens);    

    ExprParser::ProgContext *ctx = parser.prog();

    ExprVisitor *visitor = new ExprBuildASTVisitor();

    ASTProg *program_root = visitor->visitProg(ctx);

    cout << "--------------------SEMANTIC CHECK------------------------" << endl;
    SemanticCheck *pv = new SemanticCheck();
    pv->visit(*program_root);
    cout << "----------------------------------------------------------" << endl;

    cout << "--------------------IR GENERATION-------------------------" << endl;
    CodeGenerator *pv1 = new CodeGenerator();
    pv1->visit(*program_root);
    cout << "----------------------------------------------------------" << endl;
    return 0;
}
