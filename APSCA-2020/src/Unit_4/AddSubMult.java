//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Joseph Kim
package Unit_4;
import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		double sub1;
		double sub2;
		double multi;
		sub1 = (a - b);
		sub2 = (b - a);
		multi = (a * b);
	if (a > b) {
		return sub1;
		}
	else if (a < b) {
		return sub2;
	}
	else if (a == b) {
		return multi;
	}
	else {
		return 0.0;
	}
	}
}