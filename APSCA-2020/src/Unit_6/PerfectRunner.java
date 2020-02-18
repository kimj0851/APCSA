//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Joseph Kim
package Unit_6;

import static java.lang.System.*;

import Unit_5.WordsCompare; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
			Perfect test1 = new Perfect(496);
			test1.calculate();
			System.out.println( test1.toString());
			Perfect test2 = new Perfect(45);
			test2.calculate();
			System.out.println( test2.toString());
			Perfect test3 = new Perfect(6);
			test3.calculate();
			System.out.println( test3.toString());
			Perfect test4 = new Perfect(14);
			test4.calculate();
			System.out.println( test4.toString());
			Perfect test5 = new Perfect(8128);
			test5.calculate();
			System.out.println( test5.toString());			
			Perfect test6 = new Perfect(1245);
			test6.calculate();
			System.out.println( test6.toString());
			Perfect test7 = new Perfect(33);
			test7.calculate();
			System.out.println( test7.toString());
			Perfect test8 = new Perfect(28);
			test8.calculate();
			System.out.println( test8.toString());
			Perfect test9 = new Perfect(27);
			test9.calculate();
			System.out.println( test9.toString());
			Perfect test10 = new Perfect(33550336);
			test10.calculate();
			System.out.println( test10.toString());
	}
}