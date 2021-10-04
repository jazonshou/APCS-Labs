//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordFunRunner
{
	public static void main( String args[] )
	{
	    WordFun test = new WordFun("Hello World");
	    out.println(test);
	    test.makeUpper();
	    out.println(test);
	    test.addHyphen();
	    out.println(test);

	    //add more test cases
        WordFun test2 = new WordFun("Jim Bob");
	    out.println(test2);
	    test2.makeUpper();
	    out.println(test2);
	    test2.addHyphen();
	    out.println(test2);
	}
}