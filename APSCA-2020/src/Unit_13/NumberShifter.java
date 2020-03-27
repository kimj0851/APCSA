package Unit_13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] array = new int[size];
		
		for (int i = 0; i < array.length; i++)
		{
			array[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(array));

		return array;
	}
	public static void shiftEm(int[] array)
	{
		int[] array2 = new int[array.length];
		int counter7 = 0;
		int placer =0;
		for (int i =0; i<array.length; i++)
		{
			if (array[i] == 7)
			{
				counter7 ++;
			}
		}
		for(int i = 0; i< counter7; i++)
		{
			array2[i] = 7;
		}
		for(int i = counter7; i<array.length; i++)
		{
			if(array[placer] != 7)
			{
				array2[i] = array[placer];
			}
			placer++;
		}

		System.out.println(Arrays.toString(array2));
	}
}