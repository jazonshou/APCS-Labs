//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jason Zhou

import static java.lang.System.*;
import java.util.Scanner;

public class SocialRunner
{
	public static void main( String args[] )
	{
        Scanner kb = new Scanner(System.in);
		//add test cases
		System.out.print("Please input your social security number: ");
        String scNum = kb.next();
        Social num = new Social(scNum);
        num.chopAndAdd();
        System.out.print("\n" + num.toString());
	}
}