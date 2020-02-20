//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  joseph Kim
package Unit_7;

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	private String winner = "";

	public RockPaperScissors()
	{
		setPlayers(playChoice);
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}
	public String determineComp()
	{
		double x = Math.random() *10;
		if (x <= 3.33)
		{
			compChoice = "R";
		}
		if((x > 3.33) && ( x<= 6.66));
		{
			compChoice ="P";
		}
		if ((x > 6.66) && ( x<= 10))
		{
			compChoice = "S";
		}
		return "Player Chooses: " + playChoice + "\nComputer Chooses:  " + compChoice;
	}

	public String determineWinner()
	{
		if ((compChoice.contains("R")) && (playChoice.contains("S")) || (compChoice.contains("S")) && (playChoice.contains("P")) ||(compChoice.contains("P")) && (playChoice.contains("R")) )
		{
			winner = "Computer";
		}
		if ((compChoice.contains("S")) && (playChoice.contains("R")) || (compChoice.contains("P")) && (playChoice.contains("S")) ||(compChoice.contains("R")) && (playChoice.contains("P")) )
		{
			winner = "Player";
		}
		if (compChoice.equals(playChoice))
		{
			winner = "Draw";
		}
		return "";
	}

	public String toString()
	{
		String output="";
		if (((compChoice.contains("R")) && (playChoice.contains("S")) || ((compChoice.contains("S")) && (playChoice.contains("R")))))
			{
			output = "<<Rock Breaks Scissors>>";
			return winner + " wins " + output;
			}
		if (((compChoice.contains("S")) && (playChoice.contains("P")) || ((compChoice.contains("P")) && (playChoice.contains("S")))))
		{
		output = "<<Scissors Cuts Paper>>";
		return winner + " wins " + output;
		}
		if (((compChoice.contains("P")) && (playChoice.contains("R")) || ((compChoice.contains("R")) && (playChoice.contains("P")))))
		{
		output = "<<Paper Covered Rock>>";
		return winner + " wins " + output;
		}
		if (winner.contains("Draw"))
		{
		return "!Draw Game!";
		}
		return "";
	}
}