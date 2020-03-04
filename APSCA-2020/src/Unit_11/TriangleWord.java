//(c) A+ Computer Science
//www.apluscompsci.com
//Name Joseph Kim
package Unit_11;

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	private static String newWord ="";
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		for (int i =0; i < word.length(); i++ )
		{
			for (int z =0;  z <= i; z++)
			{
			newWord = newWord + word.substring(0,i+1);
			}
			newWord = newWord + "\n";
		}
	}
	public static String tostring()
	{
		return newWord;
	}
	
}