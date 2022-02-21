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
		for( int i = 0; i < 1; i++ )   //change the 3 to whatever you want
		{
			//add in keyboard input for numrows and numcols
			Forest woods = new Forest(15, 15);
			System.out.println( woods.toString() + "\n\n");
			System.out.println( woods.setTrappedToNull() + "\n\n");
			System.out.println( woods + "\n\n");
		}
	}
}



