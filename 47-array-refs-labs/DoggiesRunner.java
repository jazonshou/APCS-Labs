//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Arrays;
import java.util.Scanner;

public class DoggiesRunner
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        do {
		    System.out.print("How many Dogs are in the pack? :: ");
		    int size = keyboard.nextInt();
            System.out.println();
		    Doggies pack = new Doggies(size);

		    for(int i = 0; i < size; i++)
		    {
		    	//read in age and name of the dog
		    	System.out.print("Enter the age :: ");
                int age = keyboard.nextInt();
                System.out.print("Enter the name :: ");
                String name = keyboard.next();
                System.out.println();
		    	//call the method to add a new dog to the pack
		    	pack.set(i, age, name);
		    }		
		    System.out.println("pack :: "+pack);
            System.out.println();
		    System.out.println("NAME OF OLDEST :: "+pack.getNameOfOldest());
		    System.out.println("NAME OF YOUNGEST :: "+pack.getNameOfYoungest());
            System.out.println();
            System.out.print("Do you have another pack? [y/n] ");
        } while(keyboard.next().equals("y"));
        keyboard.close();	
	}
}