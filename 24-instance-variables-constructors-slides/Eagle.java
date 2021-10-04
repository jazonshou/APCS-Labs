//(c) A+ Computer Science
// www.apluscompsci.com

//constructor example 

public class Eagle
{
	private int size;
	private boolean fly;
	private int age; // 1. add instance variable
	//2. create new constructor
	public Eagle (int s, boolean c, int a) {
	      size = s;
	      fly = c;
	      age = a;
	}
	  	
	
	public Eagle()
	{
		size = 0;
		fly = false;
		age = 0;
	}
	
	public Eagle( int s )
	{
		size = s;
		fly = false;
		age = 0;
	}
	
	//add a fourth constructor
	
	public Eagle( int s, boolean c )
	{
		size = s;
		fly = c;
		age = 0;
	}
   

	 // change print method. 
   public void print()
   {
   	System.out.println( size + " " + fly + " " + age);
   }
}