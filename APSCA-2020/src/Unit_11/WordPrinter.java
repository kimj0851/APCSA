//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Joseph Kim
package Unit_11;
import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
	private static String words = "";
	public static String printWord(String word, int times)
	{
		words = word + "\n";
		for(int i =1; i < times; i++)
		{
			words = words + word + "\n";
		}
		return words;
	}
}