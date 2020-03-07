//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Joseph Kim
package ElevensLab;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int size;
	private Card top;
	
	public Deck() {
		cards = new ArrayList<Card>();
		
		for (int x = 0; x <4; x++) {
			for (int y = 1; y<=13; y++) {
				cards.add(new Card(SUITS[x], y));
			}
		}
		size = cards.size();
	}
	
	public Deck(String[] ranks, String[] suits, int[] numbers) {
		
		cards = new ArrayList<Card>();
		
		for (int x = 0; x < suits.length; x++) {
			for (int y = 0; y<numbers.length; y++) {
				cards.add(new Card(suits[x], numbers[y]));
			}
		}
		
		
		size = cards.size();
		
	}
	
	
	public Card dealCard() {
		if (size == 0) {
			return null;
		}
		top = cards.get(size-1);
		size--;
		return top;
	}
	
	public void shuffle() {
		
		size = cards.size();

		Random rand = new Random();
		int r = 0;
		Card placer;
		for (int k = (cards.size())-1; k >=1; k-- ) {
			r= rand.nextInt(k+1);
			placer = cards.get(k);
			cards.set(k, cards.get(r)); 
			cards.set(r, placer);  
		}
	}
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}	
	
	public int size() {
		return size;
	}

	public String toString() {
		String returnValue = "";
		
		for (int x = 0; x < size; x++) {
			returnValue = returnValue + cards.get(x).toString() + "\n";
		}
		
		return returnValue;
	}

   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

   
   //make a dealCard() method that returns the top card
   
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
}