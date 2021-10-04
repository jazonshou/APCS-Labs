//(c) A+ Computer Science
// www.apluscompsci.com

public class AngryBear 
{
    //add instance variables
    //one for number of teeth
    //one for number of days awake
    private int daysAwake, teeth;
    
    public AngryBear( int one, int two )
    {
    	//add code here
        daysAwake = one;
        teeth = two;
    }
    
    public boolean isAngry()
    {
    	//add code here
    	return (daysAwake > 3 && teeth < 10) || (teeth < 0) || (daysAwake > 5);
    }
}