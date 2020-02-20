//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Joseph Kim
package Unit_7;
import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		String playAgain = "";
		//add in a do while loop after you get the basics up and running
		while (playAgain != "Y")
		{
		String player ="";
		
			out.print("Rock Paper Scissors-pick your weapon [R,P,S] :: ");
			player = keyboard.nextLine();
			
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors(player);		
			System.out.println(game.determineComp());
			System.out.println(game.determineWinner());
			System.out.println(game.toString());
			Scanner again = new Scanner(System.in);
			out.print("Play Again? Y/N :: ");
			playAgain = again.nextLine();
		}
			
	}
}



