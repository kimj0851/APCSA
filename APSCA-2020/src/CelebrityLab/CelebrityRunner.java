/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
package CelebrityLab;

public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{
		
		Celebrity newCel = new Celebrity("Arnold Schwarzenegger", "I'll be back");
		
		System.out.println(newCel);
		
		newCel.setAnswer("Tom Hanks");
		
		System.out.println(newCel);
		
		System.out.println("The clue is " + newCel.getClue() ); 
		
		CelebrityGame game = new CelebrityGame();
		
		game.play();


	}
}