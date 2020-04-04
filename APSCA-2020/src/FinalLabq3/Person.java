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

public class Person
{
	private String myName;
	private Calories myCals;
	private BMI myBMI;

	
	public Person()
	{
		setName("");
		setCals("");
		setBMI(0.0,0.0,0.0, (Character) null);
	}
	
	public Person(String name, String calList, double weight, double height, double age, char gender)
	{
		setName(name);
		setCals(calList);
		setBMI(weight,height,age,gender);


	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setCals(String calList)
	{
		myCals = new Calories(calList);
	
	}
	public void setCals(int spot, int calories)
	{
		myCals.setcals(spot,calories);
	}
	public void setBMI(double weight, double height, double age, char gender)
	{
		myBMI = new BMI(weight,height,age,gender);
	}
	public String getName()
	{
		return myName;
	}
	
	public int getDays()
	{
		return myCals.getDays();
	}

	public int getTotal()
	{
		return myCals.getTotal();
	}
	
	public double getAverage()
	{
		return getTotal()/getDays();
	}
	public double getAge()
	{
		return myBMI.getAge();
	}
	public double getHeight()
	{
		return myBMI.getHeight();
	}
	public double getWeight()
	{
		return myBMI.getWeight();
	}
	public String getGender()
	{
		return myBMI.getGender();
	}

	public double getBMI()
	{
		return myBMI.BMIcalc();
	}
	public double getBMIcal()
	{
		return getBMI() * getDays();
	}
	public double getDiff()
	{
		return (getBMIcal() - getTotal());
	}
	public double getAverageDiff()
	{
		return getDiff()/getDays();
	}
	
	public String toString()
	{ 	String output ="";
		return output;
	}	
}