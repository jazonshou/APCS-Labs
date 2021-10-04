import java.util.Scanner;
import java.util.Arrays;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class Matrices_Lab
{
	public static int sumMat( int[][] matty )
	{
	    int sum = 0;
	    // add up all the values from the matrix
	    // store them in sum
	    // return sum
        for (int i = 0; i < matty.length; i++){
            for (int j = 0; j < matty[i].length; j++){
                sum += matty[i][j];
            }
        }
        
		return sum;
	}
	
    public static void main(String[] args) 
        throws IOException, URISyntaxException
    {
       int[][] mat = {{2,3,4},
                      {55,66,77},
                      {22,11}};
       
       System.out.println( sumMat( mat ) );      
       
        //play GLORY GLORY MAN UNITED :)
        Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=WEypRP0r34c").toURI());
   }
}
