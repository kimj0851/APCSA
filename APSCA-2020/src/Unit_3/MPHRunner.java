//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -
package Unit_3;
import java.util.Scanner; 

import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		System.out.println(test.toString());
		
		//add more test cases
		MilesPerHour test1 = new MilesPerHour(10, 20, 30);
		test1.calcMPH();
		System.out.println("test one " + (test1.toString()));
		MilesPerHour test2 = new MilesPerHour(100, 1, 50);
		test2.calcMPH();
		System.out.println("test two` " + (test2.toString()));
	}
}