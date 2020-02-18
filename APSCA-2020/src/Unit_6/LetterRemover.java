//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Joseph Kim
package Unit_6;
import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover(sentence , lookFor);
	}

	//add in second constructor
	public LetterRemover(String s, char rem)
	{
		setRemover(s,rem);
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
		
	}

	public String removeLetters()
	{
		int loc = sentence.indexOf(lookFor);
		while (loc != -1)
		{
			System.out.println(loc);
			sentence = sentence.substring(0,loc) + sentence.substring(loc+1);
			loc = sentence.indexOf(lookFor);

		}
		String cleaned=sentence;
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}