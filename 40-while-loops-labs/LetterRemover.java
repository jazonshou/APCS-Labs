//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class LetterRemover
{
	public static String removeLetters( String s, char rem )
	{
		String cleaned = s;
        int loc = cleaned.indexOf(rem);
        while(loc >= 0) {
            cleaned = cleaned.substring(0, cleaned.indexOf(rem)) + cleaned.substring(cleaned.indexOf(rem)+1, cleaned.length());
            loc = cleaned.indexOf(rem);
        }
		return cleaned;
	}
}