//(c) A+ Computer Science
//www.apluscompsci.com
//Name -joseph Kim
//Date -2/26/20
package Unit_9;

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		boolean x = true;
		for(int i =0; i <numArray.size()-1; i++)
		{
			if (numArray.get(i) > numArray.get(i + 1))
			{
				x = true;
		    }
			else
			{
				x = false;
				i = numArray.size();
			}

	}	
		return x;
}
}