Group:  Abraham Solis, Tyler Hennig, Joshua Garcia

This is the final project for Programming Languages.

To use Antlr4 functionalities:
doskey antlr4=java org.antlr.v4.Tool $*

Then process the grammar:
antlr4 -no-listener –visitor Calculator.g4

Compile all java files
javac Calculator*.java
javac EvalVisitor.java
javac Calc.java

run the program, click enter, type input, click ctrl Z to get output
java Calc 

or open file containing input
java Calc test.expr