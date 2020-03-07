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
		numerator = (numerator *  other.getDenominator()) + (other.getNumerator() * denominator);
		denominator = denominator * other.getDenominator();
		//new numerator = (num1 * den2 + num2 * den1)	
		//new denominator = (den1 * den2)
		reduce();
	}

	private void reduce()
	{
		int numPlacer = numerator;
		numerator = numerator / gcd(numerator, denominator);
		denominator = denominator / gcd(numPlacer, denominator);
	}

	private int gcd(int numOne, int numTwo)
	{
		if (numOne >= numTwo)
		{
			for(int i =numOne; i > 1; i--)
			{
				if (numOne%i ==0 && numTwo %i ==0) {
					return i;
				}
			}
		}		
		else if (numOne < numTwo)
		{
			for(int i =numTwo; i > 1; i--)
			{
				if (numOne%i ==0 && numTwo %i ==0) {
					return i;
				}
			}
		}

		return 1;
	}

	public Object clone ()
	{
		return new Rational(numerator,denominator);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Rational obj)
	{
		
		if ((double)obj.getNumerator() / obj.getDenominator() == (double)numerator/denominator) {
			return true;
		}


		return false;
	}

	public int compareTo(Rational other)
	{
		if ((double) numerator/denominator >= (double) other.getNumerator()/other.getDenominator()) {
			return 1;
		}


		return -1;
	}



	public String toString() 
	{
		return numerator + "/" + denominator;
	}

	//write  toString() method
	
	
}