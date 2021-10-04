//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
        String player = "";
		
		//add in a do while loop after you get the basics up and running
		do {
            out.print("\n\nRock-Paper-Scissors - pick your weapon[R,P,S]:: ");

            //read in the player value
            player = keyboard.next();
            RockPaperScissors game = new RockPaperScissors(player);
            System.out.print(game.toString());
            System.out.print("\n\nDo you want to play again? ");
            response = keyboard.next().charAt(0);
        } while (response == 'y');
	
		
        keyboard.close();
	}
}



