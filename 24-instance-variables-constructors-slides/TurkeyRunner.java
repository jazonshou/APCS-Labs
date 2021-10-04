//(c) A+ Computer Science
// www.apluscompsci.com

//class example

import static java.lang.System.*;

public class TurkeyRunner
{
   public static void main(String[] args)
   {  	
      Turkey bird = new Turkey(5);
 		bird.print();	
 		bird.changeFly( true );
  		bird.print();	
 		System.out.println( bird.canFly() );	          	 	        
   }
}