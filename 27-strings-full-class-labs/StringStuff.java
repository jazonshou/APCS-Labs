//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StringStuff
{
	private String word;

	public StringStuff( String w )
	{
        word = w;
	}

 	public String getFirstLastLetters()
 	{
 		return Character.toString(word.charAt(0)) + Character.toString(word.charAt(word.length()-1));
	}
	
 	public String getMiddleLetter()
 	{
 		return Character.toString(word.charAt(word.length()/2));
	}	
	
 	public boolean sameFirstLastLetters()
 	{
 		return Character.toString(word.charAt(0)).equals(Character.toString(word.charAt(word.length()-1)));
	}	

 	public String toString()
 	{
 		return "" + word;
	}
}