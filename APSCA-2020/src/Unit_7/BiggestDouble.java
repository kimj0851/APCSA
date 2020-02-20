//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Joseph Kim
package Unit_7;
import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;
	double finalNum = 0;

	public BiggestDouble()
	{
		this(0,0,0,0);
		setDoubles(one,two,three,four);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double x = 0; 
		double y = 0;

		if (one > two)
		{
			x = one;
		}
		else 
		{
			x = two;
		}
		if ( three > four)
		{
			y = three;
		}
		else 
		{
			y = four;
		}
		if (x > y)
		{
			finalNum = x;
		}
		else 
		{
			finalNum = y;
		}
		return finalNum;
	}

	public String toString()
	{
	   return "";
	}
}