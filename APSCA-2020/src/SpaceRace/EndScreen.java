package SpaceRace;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class EndScreen {
	
	
	private String winner;
	
	public EndScreen() {
		
		winner = "No one yet";
		
	}
	
	public void setWinner(String winner) {
		
		this.winner = winner;
	}
	
	
	public void drawEndScreen(Graphics window) {
		
		Font f = new Font("Dialog", Font.PLAIN, 125);
		window.setFont(f);
		
		window.setColor(Color.white); 
		
		
		window.drawString( winner + " Wins!", 150, 450);
		


		

		
	}
	

}