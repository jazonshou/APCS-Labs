//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

import java.io.FileReader;

public class ExpressionSolver
{
	//add in instance variables
    private String expression;
    private int solvedNum;

	public ExpressionSolver(String s)
	{
        expression = s;
	}

	public void setExpression(String s)
	{
        expression = s;
	}

	public void solveExpression()
	{
        // splits expression up and converts it to an ArrayList
        ArrayList<String> splitExpression = new ArrayList<String>();
        String[] es = expression.split(" ");
        for(String item : es) {
            splitExpression.add(item);
        }
        
        // 1st cycles through '*' + '/' and calculates them individually
        // does the same for '+' + '-' afterwards
        boolean b = false;
        while(true) {
            int index = 0;
            String operator = "";
            for(int i = 0; i < splitExpression.size(); i++) {
                if(splitExpression.get(i).equals("*") || splitExpression.get(i).equals("/")) {
                    operator = splitExpression.get(i);
                    index = i;
                    break;
                } else if(i == splitExpression.size()-1) {
                    b = true;
                    break;
                }
            }
            if(b) break;
            int firstNum = Integer.parseInt(splitExpression.get(index-1));
            int secondNum = Integer.parseInt(splitExpression.get(index+1));
            splitExpression.remove(index+1);
            splitExpression.remove(index);
            splitExpression.set(index-1, (operator.equals("*") ? firstNum * secondNum : firstNum / secondNum) + "");
        }

        b = false;
        while(true) {
            int index = 0;
            String operator = "";
            for(int i = 0; i < splitExpression.size(); i++) {
                if(splitExpression.get(i).equals("+") || splitExpression.get(i).equals("-")) {
                    operator = splitExpression.get(i);
                    index = i;
                    break;
                } else if(i == splitExpression.size()-1) {
                    b = true;
                    break;
                }
            }
            if(b) break;
            int firstNum = Integer.parseInt(splitExpression.get(index-1));
            int secondNum = Integer.parseInt(splitExpression.get(index+1));
            splitExpression.remove(index+1);
            splitExpression.remove(index);
            splitExpression.set(index-1, (operator.equals("+") ? firstNum + secondNum : firstNum - secondNum) + "");
        }
        solvedNum = Integer.parseInt(splitExpression.get(0));
	}

	public String toString( )
	{
		return "" + solvedNum;
	}
}