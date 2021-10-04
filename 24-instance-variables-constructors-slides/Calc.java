//(c) A+ Computer Science
// www.apluscompsci.com

//OOP example

import static java.lang.System.*;

public class Calc
{
   private int one, two;
   private int answer;

   public Calc( int n1, int n2 )
   {
      one=n1;
      two=n2;
   }

   public void add()
   {
      answer = one + two;
   }
   
   public int getAnswer()
   {
   	  return answer;
   }
   
   //add more operations - sub, mult, div

   public void print()
   {
      System.out.println(answer);
   }
   
   //toString method
   //returns all instance variables as a string
   public String toString()
   {
   	  return "" + one + " " + two + " " + getAnswer();
   }
}