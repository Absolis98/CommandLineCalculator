# CommandLineCalculator
A command line calculator created using ANTLR. Equations can be inputed while the program is running, or equations can be read from a file.
The calculator is able to do addition, subtraction, multiplication, and division. It can also store variables (a=4, a+4=8). The calculator also supports
trigonometric functions, boolean logic comparisons (>, <, ==), and operation order priority (PEMDAS).

How to Use
--------------

User Input:
1. Ensure you are within the project folder directory.
2. Run "java Calc"
3. Input an expression and press enter
4. After inputting 1 or more expressions, click ctrl+z to see the results

![](demos/comLineinput.gif)

Read a File Containing Equations:
1. Ensure you are within the project folder directory.
2. Run "java Calc %input-file-name.expr%" to calculate the equations.

![](demos/readFile.gif)

Here are the contents (equations) inside test.expr

![](demos/testexpr.png)

Here is the grammar (syntax) for the calculator input

![](demos/syntaxSheet.png)
