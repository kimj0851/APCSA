//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit_11;
import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];	
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds	
		if (spot < pups.length) {
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		Dog placerDog = new Dog(0, "null");
		
		for (int x = 0; x < pups.length; x++) 
		{
			if (pups[x].getAge() > placerDog.getAge()) 
			{
				placerDog = pups[x];
			}
		}
		return placerDog.getName();
	}

	public String getNameOfYoungest()
	{
		Dog placerDog = new Dog(100, "null");
		
		for (int x = 0; x < pups.length; x++) {
			if (pups[x].getAge() < placerDog.getAge()) {
				placerDog = pups[x];
			}
		}
		
		return placerDog.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}