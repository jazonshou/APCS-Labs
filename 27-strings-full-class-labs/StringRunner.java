//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a word :: ");
		String word = keyboard.next();

        StringStuff stringStuff = new StringStuff(word);

        System.out.println("has first last letter :: " + stringStuff.getFirstLastLetters());
        System.out.println("has the middle letter :: " + stringStuff.getMiddleLetter());
        System.out.println("has the same first and last letter :: " + stringStuff.sameFirstLastLetters());
		
		//add test cases
	}
}