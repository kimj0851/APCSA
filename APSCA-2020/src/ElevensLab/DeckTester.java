package ElevensLab;
public class DeckTester {

	public static void main(String[] args) {
		// Note: Student solutions will vary.  The following is an example.

		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.dealCard());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + d.dealCard());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + d.dealCard());
		System.out.println();
		System.out.println();
		
		
System.out.println("\nActivity 2 output: ");
		
		String[] rank1 = {"jack", "queen"};
		String[] suit1 = {"green", "yellow"};
		int[] num1 = {11,12};
		Deck deck1 = new Deck(rank1,suit1,num1);
		
		System.out.println( "All cards in order." );
		for( int j = 1; j <= 4; j++ )
		{
			System.out.println( deck1.dealCard() );
		}
		
		deck1.shuffle();	
		
		System.out.println( "\n\nAll cards after shuffling." );
		for( int j = 1; j <= 4; j++ )
		{
			System.out.println( deck1.dealCard() );
		}
		
		System.out.println( "\n\nIs it empty?" );
		System.out.println( deck1.isEmpty() );
		
		
		String[] rank2 = {"jack", "queen", "king"};
		String[] suit2 = {"barn", "city","field"};
		int[] num2 = {11,12,13};
		Deck deck2 = new Deck(rank2,suit2,num2);
		
		System.out.println( "\n\nAll cards in order." );
		for( int j = 1; j <= 9; j++ )
		{
			System.out.println( deck2.dealCard() );
		}
		
		deck2.shuffle();	
		System.out.println( "\nIs it empty after shuffling?" );
		System.out.println( deck2.isEmpty() );
		
		System.out.println( "\n\nAll cards after shuffling." );
		for( int j = 1; j <= 9; j++ )
		{
			System.out.println( deck2.dealCard() );
		
		}
		
		
		
		String[] rank3 = { "queen", "king"};
		String[] suit3 = {"sky", "blue","bird"};
		int[] num3 = {12,13};
		Deck deck3 = new Deck(rank3,suit3,num3);
		
		System.out.println( "\n\nAll cards in order." );
		for( int j = 1; j <= 6; j++ )
		{
			System.out.println( deck3.dealCard() );
		}
		
		deck3.shuffle();	
		System.out.println( "\nIs it empty after shuffling?" );
		System.out.println( deck3.isEmpty() );
		
		System.out.println( "\n\nAll cards after shuffling." );
		for( int j = 1; j <= 6; j++ )
		{
			System.out.println( deck3.dealCard() );
		
		}
		

	}
}