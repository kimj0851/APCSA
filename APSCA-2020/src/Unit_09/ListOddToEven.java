//(c) A+ Computer Science
//www.apluscompsci.com
//Name -joseph
//Date -Kim
package Unit_09;

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int y = -1;
		int first = 0;
		int last = 0;
		for(int i=0; i < ray.size()-1; i++)
		{
			if (ray.get(i) %2 == 1 )
			{
				first = i;
				i = ray.size();
			}
		}
		for(int z = 0; z < ray.size()-1; z++)
		{
			if (ray.get(z) %2 == 1 )
			{
				if(ray.get(z+1)%2 == 0)
					{
						last = z +1;
						y = last - first;
						 z = ray.size();
					
					}
			}
			
		}
		return y;
	}
}