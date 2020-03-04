//(c) A+ Computer Science
//www.apluscompsci.com
//Name joseph Kim
package Unit_06;
import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
		setWord(word);
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print()
	{
		int z = word.length();
		for(int x = 1; x <= word.length() ; x +=1 )
		{
			System.out.println(word.substring(0,z));
			z = z - 1; 
		}
	}
}