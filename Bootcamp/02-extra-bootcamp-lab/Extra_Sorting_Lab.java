
/**
 * Write a description of class Extra_Sorting_Lab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.Desktop;
import java.io.IOException;
import java.util.Arrays;
import java.net.URISyntaxException;
import java.net.URL;


public class Extra_Sorting_Lab
{
    public static void main(String[] args) 
        throws IOException, URISyntaxException
    {
        // int[] array = {14,7,1,25,6,10,11,4,3,0,11};
        int[] array = new int[10000000];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*10000);
        }
        System.out.println ("Unsorted array");
        // System.out.println ( Arrays.toString( array ) );
        // Sort (in ascending order) the elements in the array  using loops.
        // If you are solving this problem is because you 
        // completed the bootcamp labs.
        // Please do not take shortcuts ... 
        //   Do not look at the web. 
        //   Do not copy code from a classmate
        //   Do not use Arrays.sort
        long startTime = System.currentTimeMillis();
        boolean finished = true;
        long comparisons = 0;
        // while (true){
        //     finished = true;
        //     for (int i = 0; i < array.length-1; i++){
        //         // int min = Math.min(array[i], array[i+1]);
        //         if(array[i] > array[i+1]){
        //             int t = array[i];
        //             array[i] = array[i+1];
        //             array[i+1] = t;
        //         }
        //     }
        //     for (int i = 0; i < array.length-1; i++){
        //         if (array[i] > array[i+1]){
        //             finished = false;
        //         }
        //     }
        //     comparisons++;
        //     // System.out.println("Comparisions: " + comparisons);
        //     if(finished) break;
        // }
        Arrays.sort(array);
        long endTime = System.currentTimeMillis();
        long time = endTime-startTime;
                
        System.out.println ();
        System.out.println ("Sorted array");
        System.out.println("Final Number of comparisons: " + comparisons);
        //print out the (resulting) sorted array
        // System.out.println(Arrays.toString(array));
        System.out.println("Time: " + time);

        // Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=WEypRP0r34c").toURI());
    }
}
