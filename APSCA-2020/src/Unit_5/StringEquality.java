//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Joseph Kim
//Date - 2/11/20
//Class - p2
//Lab  - String equality
package Unit_5;

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		setWords(wordOne , wordTwo);

	}

	public StringEquality(String one, String two)
	{
		setWords(one,two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one; 
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if (wordOne.equals(wordTwo)) {
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		if (wordOne.equals(wordTwo)) {
		return wordOne + " does have the same letters as " + wordTwo + "\n";
	}
		else {
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
}
}