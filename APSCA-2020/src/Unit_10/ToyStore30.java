//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit_10;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;


public class ToyStore30
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();
	private ArrayList<Toy> sortedList=new ArrayList<Toy>();


	public ToyStore30()
	{
		
	}

	public void loadToys( String toys )
	{
		Toy holder = new Toy(toys.substring(0,toys.indexOf(' ')));
		while (toys.indexOf(' ') !=-1)
		{
			holder = new Toy(toys.substring(0,toys.indexOf(' ')));
			toyList.add(holder);
			toys =  toys.substring(toys.indexOf(' ')+1);
		}
		toyList.add(holder);
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int x = 0; x < toyList.size(); x++) {
  			if (toyList.get(x).getName().equals(nm)) {
  				return toyList.get(x);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy mostToy = sortedList.get(0);
  		for (int x = 1; x < sortedList.size();x++) {
  			if (sortedList.get(x).getCount() > mostToy.getCount()) {
  				mostToy = sortedList.get(x);
  			}
  		}
  		
  		
  		return mostToy.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		for (int x=0; x< toyList.size(); x++)
  		{
  			int count =0;
  			for (int y=0; y < toyList.size(); y++)
  			{
  				if (toyList.get(x).getName().equals(toyList.get(y).getName())) 
  				{
  					count++;
  				}
  			}
  			Toy placerToy = new Toy(toyList.get(x).getName());
  			placerToy.setCount(count);
  	  		sortedList.add(placerToy);
  	  		for (int z = 1; z < toyList.size();z++) 
  	  		{
  	  			if (toyList.get(z).getName().equals(placerToy.getName()))
  	  			{
				toyList.remove(toyList.get(z));
  	  			}
  	  		}
  		}
  		
  	}  
  	public String myName(){
  		
  		System.out.println("Joseph Kim");
  		
  		return "Joseph Kim";
  	}

  	  
	public String toString()
	{
	   return sortedList.toString();
	}
}