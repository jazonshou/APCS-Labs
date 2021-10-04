//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jason Zhou

import java.util.Scanner;
import static java.lang.System.*;

public class MPHRunner
{
	public static void main( String[] args )
	{   
		//add code here
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter values (distance, hours, minutes) :: ");
        int dist = kb.nextInt(), hr = kb.nextInt(), min = kb.nextInt();
        System.out.println(dist + " " + hr + " " + min + " = " + Math.round(MilesPerHour.getMPH(dist, hr, min)) + " MPH");
        // out.print(MilesPerHour.getMPH(45, 0, 32));
	}
}

/*
 
45 0 32 = 84 MPH
96 1 43 = 56 MPH
100 2 25 = 41 MPH
50 2 25 = 21 MPH
10 10 19 = 1 MPH
100 50 77 = 2 MPH

*/