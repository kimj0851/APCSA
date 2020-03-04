//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -
package Unit_03;
import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		
		Distance test1 = new Distance(1,1,2,1);
		test1.calcDistance();
		System.out.println( test1.toString());

		Distance test2 = new Distance(1,1,-2,2);
		test2.calcDistance();
		System.out.println( test2.toString());
		
		Distance test3 = new Distance(1,1,0,0);
		test3.calcDistance();
		System.out.println( test3.toString());
	}
}