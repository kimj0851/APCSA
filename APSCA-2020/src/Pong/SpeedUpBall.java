package Pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables
	private int xSpd;
	private int ySpd;

   public SpeedUpBall()
   {

	   super(100,100);
   }

   public SpeedUpBall(int x, int y)
   {

	   super(x,y);
   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {

	   super(x,y);
	   
	   this.xSpd = xSpd;
	   this.ySpd = ySpd;
	   
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {

	   super(x,y,wid,ht);
	   
	   this.xSpd = xSpd;
	   this.ySpd = ySpd;
	   
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {

	   super(x,y,wid,ht, col);
	   
	   this.xSpd = xSpd;
	   this.ySpd = ySpd;


   }
   
   public void moveAndDraw(Graphics window)
   {
	   window.setColor(Color.black);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   
	   setX(getX()+getXSpeed());
	   setY(getY()+getYSpeed());

	   window.setColor(getColor());
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
   public void erase(Graphics window) 
   {
	   
	   window.setColor(Color.black);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   
   }
   
   public boolean didCollideLeft(Object obj)
{
		Block thing = (Block) obj;
		if (thing.getX() <= getX() + getWidth()  + getWidth() && getY() >= thing.getY() && getY() <= thing.getY() + thing.getHeight()) 
		{
			if (getXSpeed() < 0)
			{
			setXSpeed(getXSpeed() - 1);
			}
			else if (getXSpeed() > 0)
			{
			setXSpeed(getXSpeed() + 1);
			}
			if (getXSpeed() < 0)
			{
			setYSpeed(getYSpeed() - 1);
			}
			else if (getXSpeed() > 0)
			{
			setYSpeed(getYSpeed() + 1);
			}

			return true;
		}
		return false;
	}

		

	@Override
	public boolean didCollideRight(Object obj)
	{
		Block thing = (Block) obj;
		if (thing.getX() + thing.getWidth() >= getX() - getWidth() && getY() >= thing.getY() && getY() <= thing.getY() + thing.getHeight()) {
			if (getXSpeed() < 0)
			{
			setXSpeed(getXSpeed() - 1);
			}
			else if (getXSpeed() > 0)
			{
			setXSpeed(getXSpeed() + 1);
			}
			if (getXSpeed() < 0)
			{
			setYSpeed(getYSpeed() - 1);
			}
			else if (getXSpeed() > 0)
			{
			setYSpeed(getYSpeed() + 1);
			}
			return true;
		}
		return false;
	}
	
	

	@Override
	public boolean didCollideTop(Object obj) {
		
		Block thing = (Block) obj;
		
		if( getY() + getHeight() >= thing.getY() && getX() >= thing.getX() && getX() <= thing.getX() + thing.getWidth()) {
			if (getXSpeed() < 0)
			{
			setXSpeed(getXSpeed() - 1);
			}
			else if (getXSpeed() > 0)
			{
			setXSpeed(getXSpeed() + 1);
			}
			if (getXSpeed() < 0)
			{
			setYSpeed(getYSpeed() - 1);
			}
			else if (getXSpeed() > 0)
			{
			setYSpeed(getYSpeed() + 1);
			}

			return true;
		}
		return false;
	}



	@Override
	public boolean didCollideBottom(Object obj) 
	{
		
		Block thing = (Block) obj;
		if (getY()  <= thing.getY()  && getX() >= thing.getX() && getX() <= thing.getX() + thing.getWidth()) {
			if (getXSpeed() < 0)
			{
			setXSpeed(getXSpeed() - 1);
			}
			else if (getXSpeed() > 0)
			{
			setXSpeed(getXSpeed() + 1);
			}
			if (getXSpeed() < 0)
			{
			setYSpeed(getYSpeed() - 1);
			}
			else if (getXSpeed() > 0)
			{
			setYSpeed(getYSpeed() + 1);
			}

			return true;
		}
		return false;
	}
   
   

   public void setXSpeed( int xSpd )
   {
	   this.xSpd = xSpd;
	   


   }

   public void setYSpeed( int ySpd )
   {

	   this.ySpd = ySpd;

   }

   public int getXSpeed() 
   {
	   return xSpd;
   }


   public int getYSpeed() 
   {
	   return ySpd;
   }

   
}
