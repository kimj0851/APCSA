//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Joseph Kim
//Date - 02/24/20
package Unit_08;



public class RayOddToEven
{
	public static int go(int[] ray)
	{

		int x = -1;
		int first = 0; 
		int last =0;
		for (int z=0; z < ray.length-1; z++)
		{
			if ( ray[z]%2==1)
			{
				first = z;
				z = ray.length;
			}
		}
		for (int i =0; i < ray.length-1; i++)
		{
			if (ray[i] % 2 == 1)
			{
				if(ray[i+1] % 2 == 0)
				{
					last = i+1;
					x = last - first;
					i = ray.length;
				}

			}
		}
		return x;
	}
}