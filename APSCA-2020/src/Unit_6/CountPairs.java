//(c) A+ Computer Science
//www.apluscompsci.com
//Name Joseph Kim
package Unit_6;

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		int counter = 0;
		int x = 0;
		int y = 1;
		while(counter < str.length()-1) {
			if (str.substring(x,x+1).equals(str.substring(y,y+1))) {
				count = count +1;
				x = x + 1;
				y = y + 1;
				counter = counter + 1;
			}
			else {
				x = x + 1;
				y = y + 1;
				counter = counter + 1;
			}
				
		}
		return count;
	}
}