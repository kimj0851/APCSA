package Unit_13;
//(c) A+ Computer Science
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;
	private String[] sorted;

	public WordSortTwo(String sentence)
	{
		int counter = 1;
		
		for (int x = 0; x < sentence.length();x++) {
			if (sentence.charAt(x) == ' '){
				counter++;
			}
		}
		
		wordRay = sentence.split(" "); 
	}

	public void sort()
	{
		sorted = new String [wordRay.length];
		for (int x = 0; x < wordRay.length; x++)
	      {
	         int max = x;
	         for (int y = 0; y < wordRay.length; y++)
	         {
	            if (wordRay[y].compareTo(wordRay[max]) > 0)
	            {
	               max = y;
	            }
	         }
	         sorted[(sorted.length-1) - x]=wordRay[max];
	         wordRay[max] = "";
	         
	       }
	}

	public String toString()
	{
		String output="";
		for (int x = 0; x < sorted.length;x++) {
			output = output + "\n" + sorted[x];
		}
		return output+"\n\n";
	}
}