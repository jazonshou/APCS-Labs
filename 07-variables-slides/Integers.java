//(c) A+ Computer Science
//www.apluscompsci.com

//integer example

public class Integers{

	public static void main(String args[])
	{
		int one = 120;  
		int two = 987123;
		int three = 999999999;
		System.out.println(one);
		System.out.println(two);
		
		byte bite = 99;
		long longInt = 99234423;		
		System.out.println(bite);
		System.out.println(longInt);


		three = three * 3;   //creates an overflow error at runtime
									//the code does not throw an error message
									//but the value overflows and ends up 
									//with a value that is incorrect
									
		System.out.println(three);
	}
}
