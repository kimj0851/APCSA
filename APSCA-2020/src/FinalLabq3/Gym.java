package FinalLabq3;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;

import Example.Student;

import static java.lang.System.*;
import static java.util.Arrays.*;

public class Gym
{
	private String name;
	private Person[] peopleList;
	
	public Gym()
	{
		name="";
		peopleList = new Person[0];
	}
	
	public Gym(String name, int perCount)
	{
		this.name = name;
		peopleList = new Person[perCount];

	
	}
	
	public void addPerson(int perNum, Person p)
	{
		peopleList[perNum] = p;
	}
	
	public String getGymName()
	{
	   return name;	
	}
	
	public int getSize()
	{
		return peopleList.length;
	}
	public double getGymTotal()
	{
		double GymSum = 0.0;
		for(Person p:peopleList) 
		{
			GymSum += p.getTotal();
		}
			return GymSum;
	}
	
	public double getPersonAverage(int perNum)
	{
		return peopleList[perNum].getAverage();
	}

	public double getPersonAverage(String stuName)
	{
		double average = 0.0;
		
		for(Person p:peopleList) {
			if(p.getName().equals(stuName))
				average = p.getAverage();
		}
		
		
		return average;
	}
	
	public String getPersonName(int perNum)
	{
		return peopleList[perNum].getName();
	}
	public double getDiff(int perNum)
	{
		return peopleList[perNum].getDiff();
	}
	public double getAvDiff(int perNum)
	{
		return peopleList[perNum].getAverageDiff();
	}
	public double getRecommended(int perNum)
	{
		return peopleList[perNum].getBMI();
	}

	public String getBiggestBoy()
	{
		double biggest = Double.MIN_VALUE;
		String biggestBoy ="";
		for(Person p:peopleList) {
			if(p.getTotal() > biggest) {
				biggest = p.getTotal();
				biggestBoy = p.getName();
			}
		}

		return biggestBoy;
	}

	public String getBigBoy()
	{
		double big = Double.MAX_VALUE;
		String bigBoy ="";
		for(Person p:peopleList) {
			if(p.getTotal() < big) {
				big = p.getTotal();
				bigBoy = p.getName();
			}
		}

		return bigBoy;	
	}
	
	public String getPerfect()
	{
		String perf = "";
		
		for(Person p:peopleList) 
		{
			if(p.getDiff() == 0) 
			{
				perf += p.getName() +"/ n";
			}
		}
		return perf;

	}
	
	public String toString()
	{
		String output=""+getGymName()+"\n";
		for(Person p:peopleList) {
			output += p.getName() +": "+ p.getGender()+ ", " + p.getAge() +" years old, "+p.getHeight() +" inches tall, " + p.getWeight() +" pounds \n";
		}
		return output;
	}  	
}