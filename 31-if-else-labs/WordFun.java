//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class WordFun
{
	private String word;
	
	public WordFun(String w)
	{
        word = w;
	}

	public void makeUpper()
	{
        word = word.toUpperCase();
	}

	public void addHyphen()
	{
		int loc = word.indexOf(" ");
        word = word.substring(0, loc) + "-" + word.substring(loc+1, word.length());
	}

	public String toString()
	{
		return word;
	}
}