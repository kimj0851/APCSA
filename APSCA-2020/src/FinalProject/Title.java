package FinalProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Title {
	
	public Title() 
	{
		
	}
	
	public void draw(Graphics window) {
		window.setColor(Color.white);
		window.fillRect(0, 0, 800, 1200);
		Font f = new Font("Dialog", Font.PLAIN, 150);
		window.setFont(f);
		
		window.setColor(Color.black); 
		
		window.drawString("Speed", 100, 200);
		
		Font g = new Font("Dialog", Font.PLAIN, 50);
		window.setFont(g);
		
		window.drawString("By Joseph Kim", 100, 500);
		
		Font h = new Font("Dialog", Font.PLAIN, 25);
		window.setFont(h);
		
		window.drawString("Press Enter to Start Game", 100, 600);
		window.drawString("Press a/s to move the Car side to side", 100, 650);
		window.drawString("The game will get faster then longer you play", 100, 700);



		

		
	}
	

}