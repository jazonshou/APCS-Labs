/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);

        int pos = sample.indexOf("slow");
        if(pos != -1)
           System.out.println("slow is found at position " + pos);
        else
           System.out.println("slow is not found");

		
		//  Try other methods here:
        int cnt = 0; 
        int prev = 0;
        String sentence = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
        for(int i = 0; i < sentence.length(); i++) {
            // System.out.println(sentence.indexOf("the", i));
            if(sentence.indexOf("the", i) != prev && sentence.indexOf("the", i) >= 0) {
                cnt++;
                prev = sentence.indexOf("the", i);
            }
        }
        // System.out.println(sentence.indexOf("the", 21));
        System.out.println(cnt);
	}

}
