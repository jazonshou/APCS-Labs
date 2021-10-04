//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jason Zhou
//Date - 9/22/2021  
//Class - B5
//Lab  - Social Security

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
        socialNum = null;
	}

	public Social(String soc)
	{
        socialNum = soc;
	}


	public void setWord(String w)
	{
        socialNum = w;
	}

	public void chopAndAdd()
	{
		String sub = socialNum;
        String sub2 = sub.substring(sub.indexOf("-")+1, sub.length());
        int num1 = Integer.parseInt(sub.substring(0, sub.indexOf("-")));
        int num2 = Integer.parseInt(sub2.substring(0, sub2.indexOf("-")));
        int num3 = Integer.parseInt(sub2.substring(sub2.indexOf("-")+1, sub2.length()));

        sum = num1 + num2 + num3;
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}