//(c) A+ Computer Science
// www.apluscompsci.com

//OOP example

import static java.lang.System.*;

public class CalcRunner
{
   public static void main(String args[])
   {
   	//instantiate a Calc object
      Calc test = new Calc(4,9);

      test.add();
      test.print();

      test = new Calc(27,19);

      test.add();
      test.print();
      
      System.out.println( test.getAnswer() );	 	//getAnswer is a return method
      
      //call setNums again
      
   }
}