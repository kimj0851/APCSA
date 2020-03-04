//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Joseph Kim
//Date - 2/10/20
//Class - p2
//Lab  - Number verify runner
package Unit_04;
import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(System.in); 
		out.print("Type in a number :: ");
		int num = keyboard.nextInt();
		out.println(num + " is odd " + NumberVerify.isOdd(num));
		out.println(num + " is even " + NumberVerify.isEven(num));
		
		//add in more test cases
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		System.out.println("111 is odd :: " + NumberVerify.isOdd(111));
		System.out.println("111 is even :: " + NumberVerify.isEven(111));
		
		System.out.println("2000 is odd :: " + NumberVerify.isOdd(2000));
		System.out.println("2000 is odd :: " + NumberVerify.isEven(2000));
		System.out.println("-99 is even :: " + NumberVerify.isOdd(-99));
		System.out.println("-99 is even :: " + NumberVerify.isEven(-99));
		System.out.println("1111 is odd :: " + NumberVerify.isOdd(1111));
		System.out.println("1111 is odd :: " + NumberVerify.isEven(1111));
		System.out.println("-850 is even :: " + NumberVerify.isOdd(-850));
		System.out.println("-850 is even :: " + NumberVerify.isEven(-850));
		
	}
}