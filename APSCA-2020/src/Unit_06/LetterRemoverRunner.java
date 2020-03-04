//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Joseph Kim
package Unit_06;

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases	
		LetterRemover test1 = new LetterRemover("I am Sam I am", 'a')	;	
		System.out.println(test1.toString());
		System.out.println(test1.removeLetters());
		
		LetterRemover test2 = new LetterRemover("ssssssssxssssesssssesss", 's')	;	
		System.out.println(test2.toString());
		System.out.println(test2.removeLetters());

		LetterRemover test3 = new LetterRemover("qwertyqwertyqwerty", 'a')	;	
		System.out.println(test3.toString());
		System.out.println(test3.removeLetters());

		LetterRemover test4 = new LetterRemover("abababababa", 'b')	;	
		System.out.println(test4.toString());
		System.out.println(test4.removeLetters());

		LetterRemover test5 = new LetterRemover("abaababababa", 'x')	;	
		System.out.println(test5.toString());
		System.out.println(test5.removeLetters());

											
	}
}