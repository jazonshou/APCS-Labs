//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jason Zhou

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }
   // custom pattern
    public void printCoolShrug(){
        System.out.println("¯\\_(ツ)_/¯");
    }
    public void printFacts(){
        System.out.println("GLORY GLORY MAN UNITED!!!! \nARSENAL & MAN CITY SUCKS!!!!");
    }

   public void printTwentyStars()
   {
       for(int i = 0; i < 20; i++) {
           out.print("*");
       }
       out.println();
   }

   public void printTwentyDashes()
   {
        for(int i = 0; i < 20; i++) {
            out.print("-");
        }
        out.println();
   }

   public void printTwoBlankLines()
   {
        out.println();
        out.println();
   }
   
   public void printASmallBox()
   {	
       out.println("*****");
       out.println("*   *");
       out.println("*   *");
       out.println("*   *");
       out.println("*****");
   }
 
   public void printABigBox()
   { 	
       out.println("**********");
       out.println("*        *");
       out.println("*        *");
       out.println("*        *");
       out.println("*        *");
       out.println("*        *");
       out.println("*        *");
       out.println("*        *");
       out.println("**********");
   }   
}