package Unit_13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter.shiftEm(NumberShifter.makeLucky7Array(10));
		System.out.println();
		NumberShifter.shiftEm(NumberShifter.makeLucky7Array(10));
		System.out.println();

		NumberShifter.shiftEm(NumberShifter.makeLucky7Array(10));
		System.out.println();
	}
}



