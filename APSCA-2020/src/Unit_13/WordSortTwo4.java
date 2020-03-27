package Unit_13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo4
{
	private String[] wordRay;
	private String[] sorted;
	public WordSortTwo4(String sentence)
	{
		int counter = 1;
		
		for (int i = 0; i < sentence.length();i++)
		{
			if (sentence.charAt(i) == ' ')
			{
				counter++;
			}
		}
		wordRay = sentence.split(" ");
		//wordRay = new String [counter];
		//String word;
		//for (int i = 0; i < sentence.length(); i++)
		//{
		//	if (sentence.charAt(i) == ' ')
		//	{
		//		word = sentence.substring(0,i);
		//		wordRay[i]= word;
		//		sentence = sentence.substring(i+1,sentence.length()-1);
				
		//	}
		//}
	}

	public void sort()
	{
		int min = 0;
		sorted = new String [wordRay.length];
		for(int i =0; i < wordRay.length-1; i++)
		{
			min = i;
			for(int x= i+1; x< wordRay.length; x++)
			{
	            if (wordRay[x].compareTo(wordRay[i]) < 0)
	            {
	            	min = x;
	            }

			}
			String placer = wordRay[i];
	         wordRay[i] = wordRay[min];
	         wordRay[min] = placer;

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
