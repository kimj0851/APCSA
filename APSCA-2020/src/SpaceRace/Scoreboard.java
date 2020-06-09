package SpaceRace;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Scoreboard {
	
	private int playerOneX;
	private int playerOneY;
	
	private int playerTwoX;
	private int playerTwoY;
	
	private int oneScore;
	private int twoScore;

	
	public Scoreboard() {
		
		playerOneX = 100;
		playerOneY = 750;
		
		playerTwoX = 1000;
		playerTwoY = 750;
		
		oneScore = 0;
		twoScore = 0;
		
	}
	
	public void drawScoreboard(Graphics window) {
		
		Font f = new Font("Dialog", Font.PLAIN, 50);
		window.setFont(f);
		
		window.setColor(Color.white); 
		window.drawString("P1: " + oneScore,playerOneX , playerOneY);
		
		window.drawString("P2: " + twoScore,playerTwoX , playerTwoY);


		
	}
	
	public void updateScoreboard( int score1, int score2) {
		
		oneScore = score1;
		twoScore = score2;
	}
}

