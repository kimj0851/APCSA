package Unit_16;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class Tree extends AbstractShape {
	
	
	
	public Tree(int xPos, int yPos, int width, int height ) {
		super(xPos,yPos,width,height);
	}

	@Override
	public void draw(Graphics window) {	
		window.setColor(new Color(0,180,0));
		int[] xLine = { getXPos() + getWidth() /2,  getXPos() + getWidth(), getXPos() };
		int[] yLine = {getYPos(), getYPos() +getHeight(), getYPos() + getHeight()};
		
		
		window.fillPolygon(xLine, yLine, 3);
	    
	

		window.setColor(new Color(150, 75,0));

		window.fillRect(getXPos() + getWidth() / 3, getYPos() +  getHeight(), getWidth() / 3, getHeight());
		
	}
	
	

	@Override
	public void moveAndDraw(Graphics window) {
		  window.setColor(Color.blue);
		  draw(window);

	      setXPos(getXPos()+getXSpeed());
	      setYPos(getYPos()+getYSpeed());
	      
	      window.setColor(getColor());
	      
	      draw(window);
		
	}
}
