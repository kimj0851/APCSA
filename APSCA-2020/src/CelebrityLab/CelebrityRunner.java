package CelebrityLab;
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

	}
}
