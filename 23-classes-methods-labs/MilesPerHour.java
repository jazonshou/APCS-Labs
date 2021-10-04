//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jason Zhou

public class MilesPerHour
{
	public static double getMPH( int dist, int hrs, int mins )
	{
		double newHrs = (double)hrs + (double)mins/60;
        // System.out.println(newHrs);
        return (double)dist/newHrs;
	}
}

