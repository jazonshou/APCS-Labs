import java.util.Scanner;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class Loops_Lab
{
    public static void main(String[] args) 
        throws IOException, URISyntaxException
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print( "Enter a starting number :: ");
        int numOne = kb.nextInt();
        
        System.out.print( "Enter an ending number :: ");
        int numTwo = kb.nextInt();
        
        //write a loop that will print out all of the numbers from numOne to numTwo inclusive of both
        for (int i = numOne; i <= numTwo; i++){
            System.out.println(i);
        }

        //play GLORY GLORY MAN UNITED :)
        Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=WEypRP0r34c").toURI());
    }
}
