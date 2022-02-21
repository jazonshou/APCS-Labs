//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class ForestRunner
{
	public static void main( String args[] ) throws IOException
	{
		for( int i = 0; i < 100; i++ )   //change the 3 to whatever you want
		{
			//add in keyboard input for numrows and numcols
			Forest woods = new Forest(100, 6);
			System.out.println( woods.toString() + "\n\n");

            // for(int r = 0; r < 6; r++) {
            //     for(int c = 0; c < 6; c++) {
            //         System.out.print(woods.isTrapped(r, c) + " ");
            //     }
            //     System.out.println();
            // }

			System.out.println( woods.setTrappedToNull() + "\n\n");
			System.out.println( woods.toString() + "\n\n");
		}
	}
}



