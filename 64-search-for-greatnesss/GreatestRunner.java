
/**
 * Write a description of class GreatestRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class GreatestRunner
{
    public static void main (String [] args) {
        GreatestSearch search = new GreatestSearch();
        // Complete make some tests for both searches
        // Manchester United and also Baby City.
        // if you search for Manchester United you should return 12
        System.out.println("Linear Search (Man United) :: " + search.linearSearch("Manchester United"));
        System.out.println("Binary Search (Man United) :: " + search.binarySearch("Manchester United"));
        // when you search for Baby City you should return a negative value
        System.out.println("Linear Search (Baby City) :: " + search.linearSearch("Baby City"));
        System.out.println("Binary Search (Baby City) :: " + search.binarySearch("Baby City"));
        
        // Use the toString method so that all the teams are printed
        System.out.println();
        System.out.println(search.toString());
    }
}
