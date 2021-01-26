import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends CalculatorBaseVisitor<Integer> {
	/** "memory" for calculator; variable/value pairs go here */
	Map<String, Integer> memory = new HashMap<String, Integer>();
	/** ID '=' expr NEWLINE */
	
	@Override
	public Integer visitAssign(CalculatorParser.AssignContext ctx) {
		String id = ctx.ID().getText(); // id is left-hand side of '='
		int value = visit(ctx.expression()); // compute value of expression on right
		memory.put(id, value); // store it in our memory
		return value;
	}

	/** expr NEWLINE */
	@Override
	public Integer visitPrintExpr(CalculatorParser.PrintExprContext ctx)
	{
		Integer value = visit(ctx.expression()); // evaluate the expr child
		System.out.println(value); // print the result
		return 0; // return dummy value
	}
	
	/** INT */
	@Override
	public Integer visitInt(CalculatorParser.IntContext ctx) {
		return Integer.valueOf(ctx.INT().getText());
	}
	
	/** ID */
	@Override
	public Integer visitId(CalculatorParser.IdContext ctx) {
		String id = ctx.ID().getText();
		if ( memory.containsKey(id) ) return memory.get(id);
		return 0;
	}
	
	/** expr op=('*'|'/') expr */
	@Override
	public Integer visitMulDiv(CalculatorParser.MulDivContext ctx) {
		int left = visit(ctx.expression(0)); // get value of left subexpression
		int right = visit(ctx.expression(1)); // get value of right subexpression
		if ( ctx.op.getType() == CalculatorParser.MUL ) return left * right;
		return left / right; // must be DIV
	}
	
	/** expr op=('+'|'-') expr */
	@Override
	public Integer visitAddSub(CalculatorParser.AddSubContext ctx) {
		int left = visit(ctx.expression(0)); // get value of left subexpression
		int right = visit(ctx.expression(1)); // get value of right subexpression
		if ( ctx.op.getType() == CalculatorParser.ADD ) return left + right;
		return left - right; // must be SUB
	}

	/** op=(SIN|COS|TAN|ASIN|ACOS|ATAN) expr*/
	@Override
	public Integer visitTrig(CalculatorParser.TrigContext ctx) {
		int num = visit(ctx.expression());

		if (ctx.op.getType() == CalculatorParser.SIN) return (int)(Math.sin(Math.toRadians(num)));
		else if(ctx.op.getType() == CalculatorParser.COS) return (int)(Math.cos(Math.toRadians(num)));
		else if(ctx.op.getType() == CalculatorParser.TAN) return (int)(Math.tan(Math.toRadians(num)));
		else if(ctx.op.getType() == CalculatorParser.ASIN) return (int)(Math.asin(Math.toRadians(num)));
		else if(ctx.op.getType() == CalculatorParser.ACOS) return (int)(Math.acos(Math.toRadians(num)));
		return (int)(Math.atan(Math.toRadians(num)));

	}

	/** op=(LN|LOG) expr*/
	public Integer visitLog(CalculatorParser.LogContext ctx) {
		int num = visit(ctx.expression());

		if(ctx.op.getType() == CalculatorParser.LN) return (int)(Math.log(num));
		else if(ctx.op.getType() == CalculatorParser.LOG) return (int)(Math.log10(num));
		return null;
	}


	/** op=SQRT expr*/
	public Integer visitSqrt(CalculatorParser.SqrtContext ctx) {
		int num = visit(ctx.expression());
		return (int)(Math.sqrt(num));
	}





	/** expression op=(GT|LT|EQ) expression
	 * @return */
	@Override
	public Integer visitLogic(CalculatorParser.LogicContext ctx) {
		int left = visit(ctx.expression(0)); // get value of left subexpression
		int right = visit(ctx.expression(1)); // get value of right subexpression
		if ( ctx.op.getType() == CalculatorParser.GT )
		{
			if(left > right) {
				System.out.print("True");
				return 1;
			} else System.out.print("False");
			return 0;

		}else if ( ctx.op.getType() == CalculatorParser.LT )
		{
			if(left < right) {
				System.out.print("True");
				return 1;
			} else System.out.print("False");
			return 0;

		}else
		{
			if(left == right) {
				System.out.print("True");
				return 1;
			} else System.out.print("False");
			return 0;

		}

	}
	
	/** '(' expr ')' */
	@Override
	public Integer visitParens(CalculatorParser.ParensContext ctx) {
		return visit(ctx.expression()); // return child expr's value
	}
}