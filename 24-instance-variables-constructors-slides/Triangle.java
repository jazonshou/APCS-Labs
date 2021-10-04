//(c) A+ Computer Science
// www.apluscompsci.com

//OOP example

public class Triangle
{
	//instance variables
   private int sideA, sideB, sideC;

   //The Triangle constructor
   //is overloaded.
   
   public Triangle()
   {
      sideA=0;
      sideB=0;
      sideC=0;
   }
   
   public Triangle(int a)
   {
      sideA=a;
      sideB=0;
      sideC=0;
   }
   
   public Triangle(int a, int b)
   {
      sideA=a;
      sideB=b;
      sideC=0;
   }

   public Triangle(int a, int b, int c)
   {
      sideA=a;
      sideB=b;
      sideC=c;
   }

   public void setSideA(int a)
   {
   	sideA=a;
   }
   
   //add 2 more set / modifier /mutator methods 
   
   
   public int getSideA()
   {
   	return sideA;
   }
   
   //add 2 more get / accessor methods
   
   
   public void print()
   {
   	  System.out.println( "" + sideA + " " + sideB + " " + sideC );
   }
}