//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Joseph Kim
package Unit_10;
import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy test1 = new Toy("sorry");
		test1.setCount(1);
		System.out.println(test1);
		
		Toy test2 = new Toy("gi joe");
		test2.setCount(5);
		System.out.println(test2);
	}
}