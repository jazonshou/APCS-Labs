//(c) A+ Computer Science
// www.apluscompsci.com

//return methods example 2

public class FunRunner2
{
   public static void main(String args[])
   {
   	//call the static methods directly 
   	//on the class name ( Fun2 ) without 
   	//instantiating a ( Fun2 ) object
		System.out.println( Fun2.times(6,7) );
		System.out.println( Fun2.times(3,11) );
		System.out.println( Fun2.times(4,2) );
		System.out.println( Fun2.times(41,21) );
   }
}
