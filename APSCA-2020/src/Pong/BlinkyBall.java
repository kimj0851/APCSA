package Pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   //constructors
   public BlinkyBall()
   {
		super(100,100);
   }

   public BlinkyBall(int x, int y)
   {

	   super(x,y);

   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {

	   super(x,y,wid,ht);

   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {

	   super(x,y,wid,ht,Color.blue,xSpd,ySpd);

   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {

	   super(x,y,wid,ht,col,xSpd,ySpd);


   }

   public Color randomColor()
   {
   		int r = (int) (Math.random() * 255);		//use Math.random()
 		int g = (int) (Math.random() * 255);;
 		int b = (int) (Math.random() * 255);;
 		return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window)
   {
	   window.setColor(Color.black);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   
	   setX(getX()+getXSpeed());
	   setY(getY()+getYSpeed());

	   window.setColor(randomColor());
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
   public void erase(Graphics window) {
	   
	   window.setColor(Color.black);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   
   }
}





