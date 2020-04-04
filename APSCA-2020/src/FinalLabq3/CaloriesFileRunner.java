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
import java.io.File;

public class CaloriesFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Gym program!");
		
		Scanner file = new Scanner(new File("src/FinalLabq3/Gymstats.dat"));
		String GymName = file.nextLine();
		int numPeople = file.nextInt();
		
		file.nextLine();
		
		Gym GymClass = new Gym(GymName, numPeople);
		
		for(int i=0; i<numPeople; i++)
		{
			String name = file.nextLine();
			String cals = file.nextLine();
			String gender1 = file.nextLine();
			String weight1 = file.nextLine();
			String height1 = file.nextLine();
			String age1 = file.nextLine();
			double weight = Double.parseDouble(weight1);
			double height= Double.parseDouble(height1);
			double age = Double.parseDouble(age1);
			char gender = gender1.charAt(0);
			GymClass.addPerson(i,new Person(name,cals,weight,height,age,gender));
		}
		out.println("\n\n"+GymClass+"\n\n");
		
		out.println("Average Intake");
		for (int i =0; i < GymClass.getSize(); i++)
		{
			out.println(String.format(GymClass.getPersonName(i) + "\'s daily average caloric intake = %.2f",GymClass.getPersonAverage(i)));
		}
		out.println("\n\n");
		out.println("Recommended Intake");
		for (int i =0; i < GymClass.getSize(); i++)
		{
			out.println(String.format(GymClass.getPersonName(i) + "\'s recommended daily intake = %.2f",GymClass.getRecommended(i)));
			out.println(String.format(GymClass.getPersonName(i) + "\'s recommended weekly intake = %.2f",(GymClass.getRecommended(i)) *7));
		}
		out.println("\n\n");
		out.println("Over or under");
		for (int i =0; i < GymClass.getSize(); i++)
		{
			if (GymClass.getDiff(i) > 0)
			{
			out.println(String.format(GymClass.getPersonName(i) + "\'s daily intake is over by = %.2f",Math.abs(GymClass.getDiff(i))));
			out.println(String.format(GymClass.getPersonName(i) + "\'s recommended weekly intake is over by = %.2f",Math.abs((GymClass.getDiff(i)) *7)));
			}
			
			else if (GymClass.getDiff(i) < 0)
			{
				out.println(String.format(GymClass.getPersonName(i) + "\'s daily intake is under by = %.2f",Math.abs(GymClass.getDiff(i))));
				out.println(String.format(GymClass.getPersonName(i) + "\'s recommended weekly intake is under by = %.2f",Math.abs((GymClass.getDiff(i)) *7)));
			}
			else if (GymClass.getDiff(i) == 0)
			{
				out.println(String.format(GymClass.getPersonName(i)+ " is eating well!"));
			}
		}
		out.println("\n\n");
		out.println("Big Boy");
			out.println(String.format(GymClass.getBigBoy()));
			
		out.println("\n\n");
		out.println("Biggest Boy");
			out.println(String.format(GymClass.getBiggestBoy()));
			
		












	}		
}