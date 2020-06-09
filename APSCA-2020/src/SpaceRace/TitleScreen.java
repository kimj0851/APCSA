package SpaceRace;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class TitleScreen {
	
	
	private String author;
	private String title;
	
	public TitleScreen() {
		
		author = "Paul Han";
		title = "Space Race";
	}
	
	public void drawTitleScreen(Graphics window) {
		
		
		Font f = new Font("Dialog", Font.PLAIN, 200);
		window.setFont(f);
		
		window.setColor(Color.white); 
		
		window.drawString(title, 50, 200);
		
		Font g = new Font("Dialog", Font.PLAIN, 50);
		window.setFont(g);
		
		window.drawString("By " + author, 450, 300);
		
		Font h = new Font("Dialog", Font.PLAIN, 25);
		window.setFont(h);
		
		window.drawString("-Press Space to Start Game", 100, 400);
		window.drawString("-Press W/S to move Spaceship 1", 100, 450);
		window.drawString("-Press I/K to move Spaceship 2", 100, 500);
		window.drawString("Fly your ship safely throught the debris to score points!", 100, 550);


		

		
	}
	

}
