//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors(String player)
	{
        playChoice = player;
        switch((int)(Math.random() * 3)){
            // rock
            case 0: compChoice = "R"; 
                    break;
            // paper
            case 1: compChoice = "P"; 
                    break;
            // scissors 
            case 2: compChoice = "S"; 
                    break;
        }
	}

	public String determineWinner()
	{
        String winner="";

        if(compChoice.equals(playChoice)){
            winner = "!Draw Game!";
        } else if(compChoice .equals( "R") && playChoice .equals( "P")) {
            winner = "!Player wins <<Paper Covers Rock>>!";
        } else if(compChoice .equals( "P") && playChoice .equals( "R")) {
            winner = "!Computer wins <<Paper Covers Rock>>!";
        } else if(compChoice .equals( "P") && playChoice .equals( "S")) {
            winner = "!Player wins <<Scissors Cut Paper>>!";
        } else if(compChoice .equals( "S") && playChoice .equals( "P")) {
            winner = "!Computer wins <<Scissors Cut Paper>>!";
        } else if(compChoice .equals( "R") && playChoice .equals( "S")) {
            winner = "!Computer wins <<Rock Breaks Scissors>>!";
        } else {
            winner = "!Player wins <<Rock Breaks Scissors>>!";
        }
		return winner;
	}

	public String toString()
	{
		String output = "player had " + playChoice + "\ncomputer had " + compChoice + "\n" + determineWinner();
        
		return output;
	}
}