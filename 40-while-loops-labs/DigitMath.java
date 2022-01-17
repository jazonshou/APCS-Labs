import java.net.ContentHandler;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class DigitMath
{
    public static int countDigits( int number )
    {
        int cnt = 0;
        while(number != 0) {
            number /= 10;
            cnt++;
        }
    	return cnt;
    }

    public static int sumDigits( int number )
	{
		return number % 10;
	}

	//method go must call countDigits and sumDigits
	//to receive full credit
	public static double go( int number )
	{
        int ogTotal = number;
        int i = 0;
        int total = 0;
        while(i < countDigits(number)) {
            total += sumDigits(number);
            number /= 10;
        }
		return total / (double)countDigits(ogTotal);
	}
}