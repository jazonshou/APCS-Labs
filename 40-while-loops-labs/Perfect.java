//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Perfect
{
	public static boolean isPerfect( int number )
	{
        int num = 1;
        int val = 0;
        while (num < number) {
            if(number % num == 0) {
                val += num;
            }
            num++;
        }
		return val == number;
	}
}