package Unit_16;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a FancySnowFlake clas

public class FancySnowFlake extends AbstractShape {
	
	;
	
	public FancySnowFlake(int xPos, int yPos, int width, int height, Color color, int xSpeed, int ySpeed) 
	{
		super(xPos,yPos,width,height,color,xSpeed,ySpeed);
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		window.setColor(Color.white);
		int[] xLine = {getXPos()+getWidth()/2,getXPos()+getWidth(),getXPos()+getWidth(),getXPos()+getWidth()/2,getXPos(),getXPos()};
		int[] yLine = {getYPos(),(int) (getYPos() + getHeight()*.3),(int) (getYPos() + getHeight()*.8),getYPos() + getHeight(),(int) (getYPos() + getHeight()*.8),(int) (getYPos() + getHeight()*.3) };
		window.drawPolygon(xLine, yLine, 6);
		
		int[] xLine2 = {getXPos()+getWidth()/2,getXPos()+getWidth()/2,};
		int[] yLine2 = {getYPos()-getHeight()/2, (int) (getYPos()+getHeight()*1.5)};
		window.drawPolygon(xLine2, yLine2, 2);
		
		int[] xLine3 = {(int) (getXPos()+getWidth()*1.5), getXPos()-getWidth()/2};
		int[] yLine3 = {(int) (getYPos()+getHeight()/15), (int) (getYPos()+getHeight()*1.05)};
		window.drawPolygon(xLine3, yLine3, 2);
		
		int[] xLine4 = {(int) (getXPos()-getWidth()/2), (int) (getXPos()+getWidth()*1.5)};
		int[] yLine4 = {(int) (getYPos()+getHeight()/15), (int) (getYPos()+getHeight()*1.05)};
		window.drawPolygon(xLine4, yLine4, 2);
		

		
	
		
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

