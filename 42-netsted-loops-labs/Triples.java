//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
 
public class Triples
{
   private int number;

	public Triples(int num)
	{
        number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
        int gcf = 0;
		for(int i = 1; i <= 10; i++) {
            if((a % i == b % i) && (b % i == c % i)) {
                gcf = (int)Math.max(gcf, a % i);
            }
        }
        return gcf;
	}

	public String toString()
	{
		String output="";
        for(int i = 1; i <= number; i++) {
            for(int j = i; j <= number; j++) {
                for(int k = j; k <= number; k++) {
                    if((i * i + j * j) == k * k && greatestCommonFactor(i, j, k) <= 1 && (i % 2 != j % 2 && k % 2 == 1)) {
                        output += i + " " + j + " " + k + "\n";
                    }
                }
            }
        }
		return output+"\n";
	}
}