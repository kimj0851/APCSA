//(c) A+ Computer Science
//www.apluscompsci.com
//Name Joseph Kim
package Unit_6;

import static java.lang.System.*;

public class Word
{
	private String word;
	public Word()
	{
		setString(word);	
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		char first = (word.charAt(0));
		return first;
	}

	public char getLastChar()
	{
		char last = (word.charAt((word.length()-1)));
		return last;
	}

	public String getBackWards()
	{
		String back = "";
		int x = word.length();
		for (int z=0; z < word.length() ; z +=1)
		{
			back = back + (word.substring(x-1,x));
			x = x-1;
		}
		return back;
	}

 	public String toString()
 	{
 		return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word;
 	}
}