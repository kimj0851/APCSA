//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Joseph Kim
package Unit_10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore30 newToyStore = new ToyStore30();
		System.out.println(newToyStore);
		newToyStore.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball" );
		
		
		newToyStore.sortToysByCount();
		
		
		System.out.println("Sorted Toy List: ");

		System.out.println(newToyStore);
		System.out.println("\nMost Toy: ");

		System.out.println(newToyStore.getMostFrequentToy());





	}
}