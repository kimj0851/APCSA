package CelebrityLab1;
/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{
		Celebrity test1 = new Celebrity("Arnold Schwarzenegger", "I'll be back");
		System.out.println(test1);
		
		test1.setAnswer("Tom Hanks");
		
		System.out.println(test1);
		
		System.out.println("The clue is " + test1.getClue() ); 
		
		CelebrityGame game = new CelebrityGame();
		
		game.play();
	}
}
