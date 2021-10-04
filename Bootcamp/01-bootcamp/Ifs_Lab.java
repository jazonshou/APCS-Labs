import java.util.Scanner;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class Ifs_Lab
{
    public static void main(String[] args) 
        throws IOException, URISyntaxException
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print( "Enter an integer :: ");
        int num = kb.nextInt();

        if(num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        // Alt Solution
        System.out.println(num % 2 == 0 ? "The number is even" : "The number is odd");
        
        //write an if statement to print out if the number is odd or even
        //you will need to use % mod to get the remainder of division
        //8 % 3 == 2

        //play GLORY GLORY MAN UNITED :)
        Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=WEypRP0r34c").toURI());
    }
}
