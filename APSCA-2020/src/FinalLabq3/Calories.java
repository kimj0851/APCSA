package FinalLabq3;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Calories
{
	private int[] calories;
	
	public Calories()
	{
		setcals("");
		
	}
	
	public Calories(String calList)
	{
		setcals(calList);		
	}
	
	public void setcals(String calList)
	{
		Scanner input = new Scanner(calList);
		int numCals = input.nextInt();
		calories = new int[numCals];
		
		input.next();
		
		for (int i = 0; i < numCals; i++) 
		{
			calories[i] = input.nextInt();
		}



	}
	
	public void setcals(int spot, int calorie)
	{
		calories[spot] = calorie;
	}
	
	public int getTotal()
	{
		int total=0;
		for(int calorie: calories) 
		{
			total +=calorie;
		}
		return total;
	}
	public int getDays() 
	{
		return calories.length;
	}
	public double getAverage()
	{
		double average =0.0;
		average = getTotal() / getDays();
		return average;
	}
	
	
	public String toString()
	{
		String output="Total caloric intake for this week is " +getTotal()
			+ "\n Average caloric intake per day is " +getAverage();
		
		return output;
	}	
}