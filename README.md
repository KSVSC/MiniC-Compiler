# MiniC Compiler

MiniC Compiler built using LLVM and Antlr parse generator as a part of the Compilers course project at IIIT Hyderabad. MiniC is a minimalistic compiler inspired by the programming languages Python and C.

## Repo Structure
MiniC Compiler</br>
|__ [Language specifications manual](https://github.com/KSVSC/MiniC-Compiler/blob/main/Language%20Manual-%20MiniC%20Compiler.pdf) - contains the details about Micro and Macro syntax and Semantics of MiniC. </br>
|__ [Parser](https://github.com/KSVSC/MiniC-Compiler/tree/main/parser) - Parses MiniC expressions using Antlr Parse Generator which can be visualised in java GUI </br>
|__ [MiniC-Compiler](https://github.com/KSVSC/MiniC-Compiler/tree/main/miniC-project) - Complete compiler which includes Syntax Analyser, Expression Parser, AST Construction, Semantic checks, LLVM IR </br>
|__ Sample programs written in MiniC can be found [here](https://github.com/KSVSC/MiniC-Compiler/tree/main/samplecodes) 
## Installation

### Antlr:
Refer to the [antlr](https://www.antlr.org/) main website.You can find how to install on Linux, OS X, Windows.

*PS: Make sure you put following lines in your source file(.bashrc, .zshrc etc.,)*

```bash
export CLASSPATH=".:/usr/local/lib/antlr-4.8-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.8-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
```
```bash
$ source ~/.bashrc
```
### Java:
You can refer to Installation guide [here](https://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html).

To check if Java is installed:

```bash
$ java -version
$ javac -version
```
### LLVM:
You can refer to Installation guide [here](https://llvm.org/docs/GettingStarted.html#getting-the-source-code-and-building-llvm).


## Usage
### To Run the GUI parser

#### To Compile:
```bash
$ cd parser
$ make 
```

#### To Run:
General command:
```bash
$ grun <name_of_grammar> <root_node/Start Symbol> <path_to_test_file> <option>
```

Command here:
```bash
$ grun Expr prog ../tests/<test_file> -gui
```
### To Run the MiniC Compiler
#### To Compile:
```bash
$ cd miniC-project
$ make 
```
#### To Run:
```bash
./expr <test-code>
```