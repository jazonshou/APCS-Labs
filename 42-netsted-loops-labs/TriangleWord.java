//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleWord
{
   private String word;

	public TriangleWord(String w)
	{
		word = w;
	}

	public String toString()
	{
		String output="";
        for(int i = 0; i < word.length(); i++) {
            int num = word.length() - i;
            for(int j = 0; j < num; j++) {
                output += " ";
            }

            if(i == word.length()-1) {
                for(int g = word.length()-1; g >= 0; g--) {
                    output += Character.toString(word.charAt(g));
                }
                output += word.substring(1, word.length());
                break;
            }

            output += Character.toString(word.charAt(i));
            for(int k = 0; k < i*2-1; k++) {
                output += " ";
            }
            if(i != 0) {
                output += Character.toString(word.charAt(i));
            }
            for(int j = 0; j < num; j++) {
                output += " ";
            }
            output += "\n";
        }

		return output+"\n";
	}
}