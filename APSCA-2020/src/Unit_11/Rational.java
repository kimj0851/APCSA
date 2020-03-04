//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Joseph Kim
package Unit_11;

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator;
	private int denominator;
	//write two constructors
	public Rational()
	{
		setRational(1,1);
	}
	public Rational(int num, int denom)
	{
		setRational(num, denom);
	}

	//write a setRational method
	public void setRational(int num, int denom)
	{
		numerator = num;
		denominator = denom;
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int num)
	{
		numerator = num;
	}
	public int getNumerator()
	{
		return numerator;
	}
	public void setDenominator(int denom)
	{
		denominator = denom;
	}
	public int getDenominator()
	{
		return denominator;
	}
	public void add(Rational  other)
	{
		other.getNumerator();
		other.getDenominator();
		numerator = numerator*  other.getDenominator() + other.getNumerator() + denominator;
		denominator = denominator * other.getDenominator();
		//new numerator = (num1 * den2 + num2 * den1)	
		//new denominator = (den1 * den2)
		reduce();
	}

	private void reduce()
	{
		if (numerator > denominator)
		{
			int x = 0;
			for (int i =2; i < denominator; i++)
			{
				if (numerator % i == 0 && denominator % i == 0)
				{
					x = i;
				}
			}
			numerator = numerator / x;
			denominator = denominator / x;
		}
		else if(numerator < denominator)
		{
			int x = 0;
			for (int i =2; i < numerator; i++)
			{
				if (numerator % i == 0 && denominator % i == 0)
				{
					x = i;
				}
			}
			numerator = numerator / x;
			denominator = denominator / x;
		}


	}

	private int gcd(int numOne, int numTwo)
	{
	int x =0;
		if (numerator > denominator)
		{
			for (int i =2; i < denominator; i++)
			{
				if (numerator % i == 0 && denominator % i == 0)
				{
					x = i;
				}
			}
			numerator = numerator / x;
			denominator = denominator / x;
		}
		else if(numerator < denominator)
		{
			for (int i =2; i < numerator; i++)
			{
				if (numerator % i == 0 && denominator % i == 0)
				{
					x = i;
				}
			}
			numerator = numerator / x;
			denominator = denominator / x;
		}

		return x;
	}

	public Object clone ()
	{
		return new Rational(numerator,denominator);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{
		
		((Rational) obj).reduce();
		if (numerator = other.getNumerator() && denominator = other.getDenominator())


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}