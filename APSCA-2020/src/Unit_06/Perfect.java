//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Joseph Kim
package Unit_06;

import static java.lang.System.*;

public class Perfect
{
   private int number;
   private int count;
	//add constructors
   public Perfect()
   {
	   setNumber(number);
   }
   public Perfect(int x)
   {
	   setNumber(x);
   }
   public void setNumber(int x)
   {
	   number = x;
	   count = 0;
   }
   public void calculate()
   {
	   int z = 1;
	   for(int num=2; num<=number; num+=1)
	   {
		   if(number % z == 0)
		   {
			   count = count + z;
			   z = z + 1;
		   }
		   else {
			   z = z + 1;
		   }
		   
	   }
   }

	//add a set method

	public boolean isPerfect()
	{
		if (number == count)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	//add a toString	
	public String toString()
	{
		if (isPerfect() == true)
		{
			return number + " is a perfect number";
		}
		else
		{
			return number + " is not a perfect number";
		}
}
}