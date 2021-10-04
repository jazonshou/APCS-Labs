//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
        System.out.print("Enter 1st monster's name : ");
        String m1Name = keyboard.next();
        System.out.print("Enter 1st monster's size : ");
        int m1Size = keyboard.nextInt();
		
		//instantiate monster one	
        Monster one = new Monster(m1Name, m1Size);	
		
		//ask for name and size
        System.out.print("\nEnter 2nd monster's name : ");
        String m2Name = keyboard.next();
        System.out.print("Enter 2nd monster's size : ");
        int m2Size = keyboard.nextInt();
		
		//instantiate monster two
        Monster two = new Monster(m2Name, m2Size);

        System.out.println();
        System.out.println(one.toString());
        System.out.println(two.toString());

        if(one.isBigger(two)){
            System.out.println("Monster one is bigger than Monster two.");
        } else if(one.isSmaller(two)){
            System.out.println("Monster one is smaller than Monster two.");
        }
        if(one.namesTheSame(two)){
            System.out.println("Monster one has the same name as Monster two.");
        }
	}
}