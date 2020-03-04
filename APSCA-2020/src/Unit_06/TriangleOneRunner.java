//(c) A+ Computer Science
//www.apluscompsci.com
//Name Joseph Kim
package Unit_06;
import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		TriangleOne test1 = new TriangleOne("hippo");
		test1.print();
		
		TriangleOne test2 = new TriangleOne("abcd");
		test2.print();
		
		TriangleOne test3 = new TriangleOne("it");
		test3.print();
		
		TriangleOne test4 = new TriangleOne("a");
		test4.print();
		
		TriangleOne test5 = new TriangleOne("chicken");
		test5.print();
	}
}