//(c) A+ Computer Science
// www.apluscompsci.com

//constructor example 

public class ConstructorRunner
{
  public static void main ( String[] args )
  {
      Eagle bird = new Eagle(5);
      bird.print();
      
      Eagle big = new Eagle(17, true);
      big.print();
      
      //make another Turkey
      //use the new constructor you created    
      Eagle bob = new Eagle (17, true, 3);
      bob.print();
  }
}