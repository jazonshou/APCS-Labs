import java.util.Scanner;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class NestedLoops_Lab
{
    public static void main(String[] args) 
        throws IOException, URISyntaxException
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print( "Enter the size of the triangle :: ");
        int size = kb.nextInt();
        
        //write nested loops that will print out a box of asterisks based on the size
        for (int i = 0; i < size+1; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //play GLORY GLORY MAN UNITED :)
        Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=WEypRP0r34c").toURI());
    }
}
