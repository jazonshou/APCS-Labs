//(c) A+ Computer Science
// www.apluscompsci.com

//class example

public class Turkey
{
	private int size;
	private boolean fly;
	private double age;
	
	public Turkey( int s )
	{
		size = s;
		fly = false;
		age =0.1;
	}
	
	public Turkey( int s, boolean c )
	{
		size = s;
		fly = c;
		age = 0.0;
	}
	
	public Turkey (int s, boolean c, double d) {
	    size =s;
	    fly = c;
	    age = d;
	    
	   }
	
	public void changeFly( boolean c )
	{
		fly = c;
	}
   	
   public boolean canFly()
   {
   	return fly;
   }	
   
   public void print()
   {
   	System.out.println( size + " " + fly + " " + age );
   }
}