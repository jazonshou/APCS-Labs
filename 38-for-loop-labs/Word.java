import java.nio.charset.CharacterCodingException;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Word
{
	private String word;

	public Word(String s)
	{
        word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		String back="";
        for(int i = word.length()-1; i > -1; i--) {
            back += Character.toString(word.charAt(i));
        }
		return back;
	}

 	public String toString()
 	{
 		return "1st Char :: " + getFirstChar() + "\n" + "Last Char :: " + getLastChar() + "\n" + word + " Spelled Backwards :: " + getBackWards() + "\n" + "The word :: " + word + "\n\n";
	}
}