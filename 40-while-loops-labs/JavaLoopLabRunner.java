//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class JavaLoopLabRunner
{
    public static void main( String args[] )
    {
        int[] cases = {234, 10000, 111, 9005, 84645, 8547, 123456789, 55556468, 8525455, 8514548, 111111, 1212121212, 222222 };
        int[] perfectCases = {496, 45, 6, 14, 8128, 1245, 33, 28, 27, 33550336};

        //uncomment the class you need to test 
        //as you need to test them
        

        DigitMath s = new DigitMath();
        // Perfect s = new Perfect();
        
                
        // for( int val : perfectCases )
        // {
        //     System.out.println( s.isPerfect( val ) );
        // }
        for( int val : cases )
        {
            System.out.println( s.go( val ) );
        }
        
    }
}