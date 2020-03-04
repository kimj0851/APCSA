//(c) A+ Computer Science
//www.apluscompsci.com
//Name -joseph Kim
package ElevensLab;

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	private String suit;
	private String rank;
	private int face;

	//instance variables
		//String suit
		//int face

  	//constructors
	public Card(String shape, String order, int number) {
		suit = shape;
		rank = order;
		face = number;
	}
	
	public Card(String shape, int number) {
		suit = shape;
		face = number;
	}
	
	public void setSuit(String shape) {
		suit = shape;
	}

	public void setFace(int number) {
		face = number;
	}
	
	public void setRank(String order) {
		rank = order;
	}

	// modifiers
		//set methods


  	//accessors
		//get methods
	public String getSuit() {
		return suit;
	}
	
	public int getFace() {
		return face;
	}
	
	public String getRank() {
		return rank;
	}
	
	// test equality
	
	public boolean testEquality(Card b) {
		
		if (face == b.face && suit.equals(b.getSuit())) {
			return true;
		}
		
		return false;
		
	}


  	//toString
	public String toString() {
		rank = FACES[face];
		return rank  +" of "+suit + " (Point Value = " + face + ")";

	}
}