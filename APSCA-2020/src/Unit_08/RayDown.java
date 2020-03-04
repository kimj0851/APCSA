//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Joseph Kim
//Date -2/24/20
package Unit_08;

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		boolean x=true;
		for(int i=0; i < numArray.length-1; i++)
		{
			if (numArray[i] > numArray[i + 1])
			{
				x = true;
		    }
			else
			{
				x = false;
				i = numArray.length;
			}

	}	
		return x;
}
}