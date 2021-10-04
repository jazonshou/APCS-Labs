//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Scanner;
import java.lang.Math.*; 

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;

	public Triangle(int a, int b, int c)
	{
        sideA = a; sideB = b; sideC = c;
	}

	public void calcPerimeter( )
	{
        perimeter = sideA + sideB + sideC;
        // System.out.println(perimeter);
	}

	public double getArea( )
	{
        double s = perimeter / 2.0;
		return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}
}