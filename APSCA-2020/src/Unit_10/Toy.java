//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Joseph Kim
package Unit_10;
import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
		name = "name";
		count = 0;
	}

	public Toy( String nm )	
	{
		name = nm;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count =cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public String toString()
	{
	   return name +" " + count;
	}
}