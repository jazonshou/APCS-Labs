//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
        String[] stuff = new String[] {"a", "b", "c", "d", "e", "f", "g", "0", "1", "2", "3"};
        Grid grid = new Grid(10, 10, stuff);
        System.out.println(grid.toString());
        for(String item : stuff) {
            System.out.println(item + " count is " + grid.countVals(item));
        }
        System.out.println("\n" + grid.findMax(stuff) + " occurs the most.");
	}
}