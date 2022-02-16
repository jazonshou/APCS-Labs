//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangleRunner
{
	public static void main( String args[] ) throws IOException
	{
        File file = new File("triangle.dat");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextInt()) {
            int x = scanner.nextInt();
            PascalsTriangle bob = new PascalsTriangle(x);
            bob.createTriangle();
            System.out.println(bob.toString() + "\n\n");
        }
        scanner.close();
	}
}



