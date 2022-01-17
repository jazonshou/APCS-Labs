//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Scanner;

public class LetterCountRunner
{
	public static void main(String args[])
	{	
		// String word = "apluscompsci is the best ap curriculum and it is fun i know";
        Scanner kb = new Scanner(System.in);

		//add test cases
        System.out.print("Enter a sentence :: ");
        String sentence = kb.nextLine();
        LetterCount cnt = new LetterCount(sentence);
        do {
            System.out.print("Enter a letter :: ");
            String letter = kb.next();
            System.out.println("\nYour sentence has " + cnt.countLetter(letter) + " instance(s) of " + letter);
            System.out.print("Do you want to try another letter? [y/n] ");
            // System.out.println();
        } while(kb.next().equals("y"));
	}
}