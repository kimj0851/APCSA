package winter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape 
{
	public FancySnowFlake(int xPos, int yPos, int width, int height, Color color, int xSpeed, int ySpeed) 
	{
		super(xPos,yPos,width,height,color,xSpeed,ySpeed);
	}
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		window.setColor(Color.white);
		int[] xLine = { getXPos(), getWidth() + getXPos() , getXPos() + getWidth(), getXPos(), getXPos() - getWidth(), getXPos() - getWidth(), getXPos() };
		int[] yLine = {getHeight() + getYPos(), getYPos() + 2* getHeight() , getYPos() - 2 * getHeight() , getYPos() - getHeight() , getYPos() - 2 * getHeight() , getYPos() + 2 * getHeight() , getYPos() + getHeight()  };
		
		window.fillPolygon(xLine, yLine, 7);
		
		window.fillRect((int) ((int)getXPos() - 2.5 *getWidth()), getYPos()- getHeight() /2, getWidth() * 5, getHeight());
		
	}
	
	

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		  window.setColor(Color.blue);
		  draw(window);

	      setXPos(getXPos()+getXSpeed());
	      setYPos(getYPos()+getYSpeed());
	      
	      window.setColor(getColor());
	      
	      draw(window);
		
	}
}


