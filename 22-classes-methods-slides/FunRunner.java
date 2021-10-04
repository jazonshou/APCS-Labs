//(c) A+ Computer Science
// www.apluscompsci.com

//return method example 1

public class FunRunner
{
   public static void main(String args[])
   {		
		Fun aplus = new Fun();
		System.out.println( aplus.times( 3, 4 ) );
		System.out.println( aplus.times( 11, 5 ) );
		
		int storeIt = aplus.times( 7, 7);
		System.out.println( storeIt  );
   }
}
