import java.util.List;
import java.util.ArrayList;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class List_Lab
{
	public static int sumList( List<Integer> list )
	{
	    int sum =0;
	    // add all the elements that are inside list.
        for(int i : list){
            sum += i;
        }
         
        sum = sum + 7;
		return sum;
	}
	
	public static void main(String[] args) 
        throws IOException, URISyntaxException
    {
		List<Integer> nums = new ArrayList<Integer>();
		//add in some numbers to the list
		//use a loop and Math.random() if you feel froggy
        for(int i = 0; i < 10; i++) {
            nums.add((int)(Math.random()*10));
        }
		
        // System.out.println(nums);
   	    System.out.println( sumList( nums ) );
        
        //play GLORY GLORY MAN UNITED :)
        Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=WEypRP0r34c").toURI());
    }
}
