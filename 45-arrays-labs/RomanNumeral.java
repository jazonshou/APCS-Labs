//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
										 50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
											 "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
        roman = str;
	}

	public RomanNumeral(Integer orig)
	{
        number = orig;
	}

	public void setNumber(Integer num)
	{
        number = num;
	}

	public void setRoman(String rom)
	{
        roman = rom;
	}

	public Integer getNumber()
	{
        number = 0;
        int romanLength = roman.length();
            
        for(int i = 0; i < romanLength; i++) {
            for(int j = 0; j < LETTERS.length; j++) {
                while(roman.indexOf(LETTERS[j]) == 0) {
                    number += NUMBERS[j];
                    roman = roman.substring(LETTERS[j].length());
                }
            }
        }
        
        return number;
	}

	public String toString()
	{
        String rom = "";
            
        for(int i = 0; i < NUMBERS.length; i++) {
            while(number >= NUMBERS[i]) {
                rom += LETTERS[i];
                number -= NUMBERS[i];
            }
        }
        
        roman = rom;
        return roman + "\n";
	}
}