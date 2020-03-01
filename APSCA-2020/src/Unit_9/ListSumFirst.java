//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Joseph Kim                         
//Date - 2/29/20
package Unit_9;
import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int x =0;
		for (int i=0; i < ray.size(); i++)
		{
			if (ray.get(i) > ray.get(0)) {
				x += ray.get(i);
			}
			
		}
		if (x == 0 || ray.size() == 0) {
			return -1;
		}
		return x;
	}
}