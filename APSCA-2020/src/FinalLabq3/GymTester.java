package FinalLabq3;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GymTester
{
   public static void main( String args[] )
   {
		Gym test = new Gym("Weight Training 1",3);
		test.addPerson(0,new Person("Joe mama"," 7 - 3000 2900 3000 3200 2900 2800 3100", 210, 74, 17,'m'));
		test.addPerson(1,new Person("billy bill"," 7 - 3000 2900 3000 3200 2900 2800 3100", 210, 74, 17,'m'));
		test.addPerson(2,new Person("Ted teddy"," 7 - 3000 2900 3000 3200 2900 2800 3100", 210, 74, 17,'m'));				
		out.println(test);
		
		out.println("Average Intake");
		for (int i =0; i < test.getSize(); i++)
		{
			out.println(String.format(test.getPersonName(i) + "\'s daily average caloric intake = %.2f",test.getPersonAverage(i)));
		}
		
		
										
	}		
}