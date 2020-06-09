package Unit_16;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class Hat extends AbstractShape {
	
	
	
	
	
	public Hat(int xPos, int yPos, int width, int height ,int xSpeed, int ySpeed) {
		super(xPos,yPos,width,height,Color.gray, xSpeed,ySpeed);
	}

	@Override
	public void draw(Graphics window) {
		window.setColor(Color.black);
		
		//int[] xLine = { getXPos(), getXPos(),getXPos() + getWidth(), getXPos() + getWidth(),(int) (getXPos() + getWidth()*1.3),(int) (getXPos() + getWidth()*1.3),getXPos() - getWidth()/3,getXPos() - getWidth()/3 };
		//int[] yLine = {getYPos()+ getHeight(), getYPos()  , getYPos(), getYPos() + getHeight(),getYPos() + getHeight(),(int) (getYPos() + getHeight()*1.3),(int) (getYPos() + getHeight()*1.3),getYPos() + getHeight() };
		//int[] xLine = {getXPos(), getXPos() + getWidth(),(int)(getXPos() + getWidth() + getWidth()/5),getXPos() + getWidth(),(int)(getXPos()  + getWidth()/6) };
		//int[] yLine = {getYPos()+ getHeight(),getYPos()+ getHeight(),(int)(getYPos()- getHeight()/4), (int)(getYPos()- getHeight()/3), (int)(getYPos()- getHeight()/4) };
		int[] xLine = {getXPos(), getXPos() + getWidth(),(int)(getXPos() + getWidth() + getWidth()/3),getXPos() + getWidth(),(int)(getXPos()  + getWidth()/6),(int)(getXPos()  - getWidth()/6)};
		int[] yLine = { getYPos()+ getHeight(),getYPos()+ getHeight(),(int)(getYPos()- getHeight()/4),(int)(getYPos()- getHeight()/2),(int)(getYPos()- getHeight()/3),getYPos()};

		window.fillPolygon(xLine, yLine, 6);
	}
	
	

	@Override
	public void moveAndDraw(Graphics window) {
	      
	      draw(window);
		
	}
}
