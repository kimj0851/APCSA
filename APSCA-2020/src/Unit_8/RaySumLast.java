//(c) A+ Computer Science
//www.apluscompsci.com
//Name - joseph Kim
//Date - 2/24/20
package Unit_8;

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int x = 0;
		for (int i = 0; i < ray.length-1; i++)
		{
			if (ray[ray.length-1] < ray[i])
			{
				x = x + ray[i];
			}
		}
		if (x == 0)
		{
			x = -1;
		}
		return x;
	}
}