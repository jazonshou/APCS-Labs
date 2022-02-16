//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangle
{
	private int[][] mat;

	public PascalsTriangle()
	{

	}

	public PascalsTriangle(int size)
	{
        mat = new int[size][];
        for(int i = 0; i < mat.length; i++) {
            mat[i] = new int[i+1];
        }
	}

	public void createTriangle()
	{
        for(int r = 0; r < mat.length; r++) {
            mat[r][0] = 1;
            mat[r][mat[r].length-1] = 1;
            for(int c = 1; c < mat[r].length-1; c++) {
                mat[r][c] = mat[r-1][c] + mat[r-1][c-1];
            }
        }
	}

	public String toString()
	{
		String output="";
        for(int r = 0; r < mat.length; r++) {
            for(int c = 0; c < mat[r].length; c++) {
                output += mat[r][c] + "\t";
            }
            output += "\n";
        }
		return output;
	}
}