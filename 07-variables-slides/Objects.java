//(c) A+ Computer Science
//www.apluscompsci.com

//references example

public class Objects
{
	public static void main(String args[])
	{
		//intObj refers to an Integer object
		Integer intObj = 99;   
		System.out.println(intObj);

		Double decObj = 9.84;
		System.out.println(decObj);

		double decPrim = decObj;
		decObj=decPrim;
		System.out.println(decPrim);
	}
}