//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Jason

import java.util.Scanner;

public class MultTableRunner
{
	public static void main ( String[] args )
	{
		//add test cases
        Scanner kb = new Scanner(System.in);
        int num = 0; int amt = 0;

        while(true) {
            System.out.print("Please input the number you want a multiplication table for :: ");
            num = kb.nextInt();
            System.out.print("Number of rows for the table :: ");
            amt = kb.nextInt();
            System.out.println();

		    MultTable table = new MultTable(num, amt);
            table.printTable();

            System.out.print("Would you like to do it again [y/n]? ");
            if(kb.next().equals("n")) break;
            else continue;
        }
        kb.close();
	}
}