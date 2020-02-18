//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Joseph Kim
//Date - 2/11/20
//Class - p2
//Lab  -  string equality check
package Unit_5;

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality test1 = new StringEquality("hello","goodbye");
		test1.checkEquality();
		System.out.println( test1.toString());
		
		StringEquality test2 = new StringEquality("one","two");
		test2.checkEquality();
		System.out.println( test2.toString());		
		
		StringEquality test3 = new StringEquality("three","four");
		test3.checkEquality();
		System.out.println( test3.toString());		
		
		StringEquality test4 = new StringEquality("TCEA","UIL");
		test4.checkEquality();
		System.out.println( test4.toString());	
		
		StringEquality test5 = new StringEquality("ABC","ABC");
		test5.checkEquality();
		System.out.println( test5.toString());
		
		StringEquality test6 = new StringEquality("ABC","CBA");
		test6.checkEquality();
		System.out.println( test6.toString());
		
		StringEquality test7 = new StringEquality("same","same");
		test7.checkEquality();
		System.out.println( test7.toString());
		
		
	}
}