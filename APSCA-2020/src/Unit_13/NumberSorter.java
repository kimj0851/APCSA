package Unit_13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 1;
		while (number/10 !=0)
		{
			number = number/10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] presorted =  new int[getNumDigits(number)];
		int[] sorted =  new int[getNumDigits(number)];
		int min = 10;
		int placer =0;
		for ( int i=0; i< presorted.length; i++)
		{
			presorted[i]= number%10;
			number=number/10;
		}
		for(int i = 0; i < sorted.length; i++)
		{
			for(int x = 0; x < presorted.length; x++ )
			{
				if(presorted[x] < min)
				{
					min = presorted[x];
					placer =x;
				}
			}
			presorted[placer]=10;
			sorted[i] = min;
			min=10;
		}
		return sorted;
	}
}