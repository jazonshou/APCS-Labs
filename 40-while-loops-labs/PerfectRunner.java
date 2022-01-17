//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases		
        Scanner kb = new Scanner(System.in);
        // System.out.println(Perfect.isPerfect(243633));
        // System.out.println(Perfect.isPerfect(999373));
        // System.out.println(Perfect.isPerfect(272171));
        // System.out.println(Perfect.isPerfect(463175));
        int[] nums = new int[4];
        boolean onePerfect = false;
        int correct = 0;
        do {
            while(!onePerfect){
                for(int i = 0; i < 4; i++) {
                    nums[i] = (int)(Math.random() * 10000);
                    if(Perfect.isPerfect(nums[i])) onePerfect = true;
                }
            }
            
            for(int i = 0; i < 4; i++) {
                if(Perfect.isPerfect(nums[i])) {
                    correct = i+1;
                }
            }

            int ans = 0;
            System.out.println("Which one of these is a perfect number?");
            for(int i = 1; i <= 4; i++) {
                System.out.println("[" + i + "]\t" + nums[i-1]);
            }

            System.out.print("Answer :: ");

            ans = kb.nextInt();

            if(ans == correct) {
                System.out.println("Correct!!!\n");
            } else {
                System.out.println("Wrong! The correct answer was " + correct + ". Try again next time!\n"); 
            }
            

            onePerfect = false;
            System.out.print("Again? [y/n]");
        } while(!kb.next().equals("n"));
	}
}