import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com

public class LetterCount
{
	private String[] wordRay;

	public LetterCount(String sent)
	{
        String s = sent;
        int cnt = 0;
        while(s.indexOf(" ") >= 0) {
            cnt++;
            s = s.substring(s.indexOf(" ")+1);
        }
        wordRay = new String[cnt+1];
        int i = 0;
        while(sent.indexOf(" ") >= 0) {
            wordRay[i] = sent.substring(0, sent.indexOf(" "));
            sent = sent.substring(sent.indexOf(" ")+1, sent.length());
            i++;
        }
        wordRay[wordRay.length-1] = sent;
        // System.out.println(Arrays.toString(wordRay));
	}

	public int countLetter( String s )
	{
		int cnt = 0;
        for(String item : wordRay) {
            if(item.indexOf(s) == 0) {
                cnt++;
            }
        }
		return cnt;
	}
}