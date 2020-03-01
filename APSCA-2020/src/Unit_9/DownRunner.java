
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Joseph Kim
//Date -2/26/20
package Unit_9;

import java.util.ArrayList;

public class DownRunner
{
	public static void main( String args[] )
	{	
		
		int[] test1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		ArrayList<Integer> Test1;
		Test1 = new ArrayList<Integer>();
		for(int i=0; i < test1.length-1; i++)
		{
			Test1.add(test1[i]);
		}
		System.out.println(ListDown.go(Test1));
		
		int[] test2 = {10,9,8,7,6,5,4,3,2,1,-99};
		ArrayList<Integer> Test2;
		Test2 = new ArrayList<Integer>();
		for(int i=0; i < test2.length-1; i++)
		{
			Test2.add(test2[i]);
		}
		System.out.println(ListDown.go(Test2));
		
		int[] test3 = {10,20,30,40,50,-11818,40,30,20,10};
		ArrayList<Integer> Test3;
		Test3 = new ArrayList<Integer>();
		for(int i=0; i < test3.length-1; i++)
		{
			Test3.add(test3[i]);
		}
		System.out.println(ListDown.go(Test3));
		
		int[] test4 = {32767};
		ArrayList<Integer> Test4;
		Test4 = new ArrayList<Integer>();
		for(int i=0; i < test4.length-1; i++)
		{
			Test4.add(test4[i]);
		}
		System.out.println(ListDown.go(Test4));
		
		int[] test5 = {255 ,255};
		ArrayList<Integer> Test5;
		Test5 = new ArrayList<Integer>();
		for(int i=0; i < test5.length-1; i++)
		{
			Test5.add(test5[i]);
		}
		System.out.println(ListDown.go(Test5));
		
		int[] test6 = {9,10,-88,100,-555,1000};
		ArrayList<Integer> Test6;
		Test6 = new ArrayList<Integer>();
		for(int i=0; i < test6.length-1; i++)
		{
			Test6.add(test6[i]);
		}
		System.out.println(ListDown.go(Test6));
		
		int[] test7 = {-111,1,2,3,9,11,20,30};
		ArrayList<Integer> Test7;
		Test7 = new ArrayList<Integer>();
		for(int i=0; i < test7.length-1; i++)
		{
			Test7.add(test7[i]);
		}
		System.out.println(ListDown.go(Test7));

		int[] test8 = {10,10,10,11,456};
		ArrayList<Integer> Test8;
		Test8 = new ArrayList<Integer>();
		for(int i=0; i < test8.length-1; i++)
		{
			Test1.add(test8[i]);
		}
		System.out.println(ListDown.go(Test8));
		
		int[] test9 = {9,8,7,6,5,4,3,2,0,-2,-989};
		ArrayList<Integer> Test9;
		Test9 = new ArrayList<Integer>();
		for(int i=0; i < test9.length-1; i++)
		{
			Test9.add(test9[i]);
		}
		System.out.println(ListDown.go(Test9));
		
		int[] test10 = {12,15,18,21,23,1000};
		ArrayList<Integer> Test10;
		Test10 = new ArrayList<Integer>();
		for(int i=0; i < test10.length-1; i++)
		{
			Test10.add(test10[i]);
		}
		System.out.println(ListDown.go(Test10));
		
		int[] test11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		ArrayList<Integer> Test11;
		Test11 = new ArrayList<Integer>();
		for(int i=0; i < test11.length-1; i++)
		{
			Test11.add(test11[i]);
		}
		System.out.println(ListDown.go(Test11));
		
		int[] test12 = {9,10,-8,10000,-5000,1000};
		ArrayList<Integer> Test12;
		Test12 = new ArrayList<Integer>();
		for(int i=0; i < test12.length-1; i++)
		{
			Test12.add(test1[i]);
		}
		System.out.println(ListDown.go(Test12));
	}
}