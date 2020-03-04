//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Joseph Kim
//Date - 2/11/20
//Class - p2
//Lab  - words compared
package Unit_05;
import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{

		setWords(wordOne , wordTwo);
	}

	public WordsCompare(String one, String two)
	{
		setWords(one,two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void compare()
	{
		compare = wordOne.compareTo(wordTwo);
	}

	public String toString()
	{
		if(compare<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}