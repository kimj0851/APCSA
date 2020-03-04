package ElevensLab;

public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		// Note: Student solutions will vary.  The following is an example.

		Card aceClubs1 = new Card("clubs", "ace", 1);
		Card aceClubs2 = new Card("clubs", "ace", 1);
		Card sixHearts = new Card("hearts", "6", 6);

		System.out.println("**** ace of clubs #1 Tests ****");
		System.out.println("  rank: " + aceClubs1.getRank());
		System.out.println("  suit: " + aceClubs1.getSuit());
		System.out.println("  pointValue: " + aceClubs1.getFace());
		System.out.println("  toString: " + aceClubs1.toString());
		System.out.println();

		System.out.println("**** ace of clubs #2 Tests ****");
		System.out.println("  rank: " + aceClubs2.getRank());
		System.out.println("  suit: " + aceClubs2.getSuit());
		System.out.println("  pointValue: " + aceClubs2.getFace());
		System.out.println("  toString: " + aceClubs2.toString());
		System.out.println();

		System.out.println("**** six of hearts Tests ****");
		System.out.println("  rank: " + sixHearts.getRank());
		System.out.println("  suit: " + sixHearts.getSuit());
		System.out.println("  pointValue: " + sixHearts.getFace());
		System.out.println("  toString: " + sixHearts.toString());
		System.out.println();

		System.out.println("**** matches Tests ****");
		System.out.println("  matching: " + aceClubs1.testEquality(aceClubs2));
		System.out.println("  not matching: " + aceClubs1.testEquality(sixHearts));
		
		
		System.out.println("\nActivity 1 Test: ");
		
		Card card1 = new Card("hearts", "king",13);
		System.out.println("Card 1 = " +card1.toString());
		
		
		Card card2 = new Card("hearts", "king",13);
		System.out.println("Card 2 = " +card2.toString());
		
		Card card3 = new Card("DIAMONDS", "seven",7);
		System.out.println("Card 3 = " +card3.toString());
		
		System.out.println("Card 1 = Card 2 is " + card1.testEquality(card2));
		
		System.out.println("Card 2 = Card 3 is " + card2.testEquality(card3));

	}
}