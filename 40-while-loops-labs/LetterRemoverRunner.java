//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases	
        Scanner kb = new Scanner(System.in);
        String sentence = "";
        char letter;
        // System.out.println(LetterRemover.removeLetters("I am Sam I am   a", 'a'));	
        
        do {
            System.out.print("Please input a sentence :: ");
            sentence = kb.nextLine();
            System.out.print("Please input the letter you want removed :: ");
            letter = kb.nextLine().charAt(0);

            System.out.println("Here is the sentence with " + Character.toString(letter) + " removed :: " + LetterRemover.removeLetters(sentence, letter));

            System.out.print("Again? [y/n] ");
        } while(!kb.next().equals("n"));
	}
}