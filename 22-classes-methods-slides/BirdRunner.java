//(c) A+ Computer Science
// www.apluscompsci.com

//methods example 1

public class BirdRunner
{
   public static void main(String[] args)
   {
		System.out.println( "Test 1" );	   	
      Bird bird = new Bird();
      bird.speak();
      bird.sayName();
      bird.speak();
      bird.sayName();
      bird.speak();   

		System.out.println( "\n\nTest 2" );		
      Bird it = new Bird();
      it.sayName();
      it.sayName();    
      	
		System.out.println( "\n\nTest 3" );		
      //make more Birds and 
      //call the old methods and 
      //the new method you created             	 	        
   }
}