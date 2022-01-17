import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
        Scanner kb = new Scanner(System.in);
        String word = "";
        while(true) {
            System.out.print("Input a word to dissect :: ");
            word = kb.next();
            Word hey = new Word(word);

            System.out.println(hey.toString());

            System.out.print("Would you like to go again [y/n]? ");
            if(kb.next().equals("n")) break;
            else continue;
        }
        kb.close();
	}
}