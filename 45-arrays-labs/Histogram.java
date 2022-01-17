//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Arrays;
import java.util.Scanner; 

public class Histogram
{
	private int[] numCount;

	public Histogram(String line, int size )
	{
        numCount = new int[size];
        Scanner scan = new Scanner(line);
        while(scan.hasNextInt()) {
            int i = scan.nextInt();
            if(i >= 0 && i < numCount.length) {
                numCount[i]++;
            }
        }
        // System.out.println(Arrays.toString(numCount));
	}

	public void reset(String line, int size)
	{
        int[] nums = new int[size];
        Scanner scan = new Scanner(line);
        while(scan.hasNextInt()) {
            int i = scan.nextInt();
            if(i >= 0 && i < nums.length) {
                nums[i]++;
            }
        }
        numCount = nums;
	}
	
	public void changeCount( int v, int a )
	{
        if(v < numCount.length && v >= 0) {
            numCount[v] += a;
        }
	}
	
	public int getMax()
	{
        int max = 0, maxNum = 0;
        for(int i = 0; i < numCount.length; i++) {
            if(numCount[i] > max) {
                max = numCount[i];
                maxNum = i;
            }
        }
		return maxNum;
	}

	public String toString()
	{
		String output="";
        for(int i = 0; i < numCount.length; i++) {
            output += (i + " - " + numCount[i] + " | ");
        }
		return output;
	}
}