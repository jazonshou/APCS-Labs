//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class TriplesRunner
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        int num = 0;

        do {
            System.out.print("Enter a number :: ");
            num = kb.nextInt();
            Triples test = new Triples(num);

            System.out.println("Here are all the Pythagorean triples from " + num);
            System.out.println(test.toString());

            System.out.print("Play again? [y/n] ");
        } while(!kb.next().equals("n"));
	}
}