//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSummingRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("matsum.dat"));
		//slideshow 13 has info on reading from a file
        MatrixSumming matrixSumming = new MatrixSumming();

        System.out.println("Matrix values\n" + matrixSumming.toString() + "\n");

        while(file.hasNextLine()) {
            int a = file.nextInt();
            int b = file.nextInt();
            System.out.println("The sum of " + a + ", " + b + " is " + matrixSumming.sum(a, b) + ".");
        }
	}
}



