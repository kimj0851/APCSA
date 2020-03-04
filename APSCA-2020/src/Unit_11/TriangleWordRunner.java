//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Joseph Kim
package Unit_11;

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		for (int i =0; i < 1; i++)
		{
			System.out.print("Enter a word :: ");
			String word = keyboard.nextLine();
			TriangleWord.printTriangle(word);
			System.out.print(TriangleWord.tostring());
			out.print("Do you want to enter more sample input?      y or n :: ");
			String ans = keyboard.nextLine();
			if (ans.contains("y"))
			{
				i = -1;
			}
		}
	}
}