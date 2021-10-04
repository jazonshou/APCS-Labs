import java.util.Scanner;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class String_Lab
{
    public static void main(String[] args) 
        throws IOException, URISyntaxException
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print( "Enter a word :: ");
        String word = kb.next();
        
        //print out the first and last letter of the word
        System.out.println(word.charAt(0) + ", " + word.charAt(word.length()-1));
        
        
        //print out the word backwords
        for (int i = word.length()-1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
        System.out.println();
        
        
        //check to see if the word contains a vowel
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String lowerCaseWord = word.toLowerCase();
        boolean loopBroken = false;
        for (int i = 0; i < word.length(); i++){
            for(char j : vowels){
                if(lowerCaseWord.charAt(i) == j){
                    System.out.println("This word has a vowel");
                    loopBroken = true;
                    break;
                }
            }
            if (loopBroken) break;
        }

        //play GLORY GLORY MAN UNITED :)
        Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=WEypRP0r34c").toURI());
    }
}
