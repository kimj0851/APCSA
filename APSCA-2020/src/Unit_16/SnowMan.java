	package Unit_16;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
		window.setColor(Color.white);
		
		window.fillOval(getXPos() , getYPos(), getWidth(), getHeight());
		window.fillOval((int) (getXPos() + getWidth()* .7 / 4), getYPos() - 50, (int) (getWidth() * .7), (int) (getHeight()  *.7));
		window.fillOval((int) (getXPos() + getWidth() * .5  / 2) , getYPos() - 85, (int) (getWidth() * .5), (int) (getHeight()  *.5));

    	
   }

   public void moveAndDraw(Graphics window)
   {
	   draw(window);

	   setXPos(getXPos()+getXSpeed());
	   setYPos(getYPos()+getYSpeed());
	      
	   window.setColor(getColor());
	      
	   draw(window);
   }
}