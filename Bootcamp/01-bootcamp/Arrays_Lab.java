import java.util.Scanner;

import java.util.Arrays;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class Arrays_Lab 
{ 
    public static void main(String[] args) 
        throws IOException, URISyntaxException
    {
        int[] rayOne = {2,3,4,5,6,7,8,9,0,11,2,3,4,5,3};
        
        //write a loop to print out every other number in the array
        for(int i = 0; i < rayOne.length; i += 2) {
            System.out.println(rayOne[i]);
        }
        
        
        //write a loop to print out all of the numbers backwards
        for (int i = rayOne.length-1; i >= 0; i--){
            System.out.println(rayOne[i]);
        }

        //play GLORY GLORY MAN UNITED :)
        Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=WEypRP0r34c").toURI());
    }
}
