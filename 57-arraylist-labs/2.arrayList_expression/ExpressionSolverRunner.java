//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;
import javax.swing.JOptionPane;

public class ExpressionSolverRunner
{
	public static void main( String args[] )
	{
        String in = javax.swing.JOptionPane.showInputDialog(null, "Give me an expression");
        ExpressionSolver es = new ExpressionSolver(in);
        es.solveExpression();
        JOptionPane.showMessageDialog(null, "Here is your solved expression: " + es.toString());
	}
}