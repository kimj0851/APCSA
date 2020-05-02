package Pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;


	

	public Block()
	{
		setColor(Color.blue);
		setPos(100,200);
		setWidth(100);
		setHeight(100);
		

	}

	//add other Block constructors - x , y , width, height, color

	
   //add the other set methods
   

   public Block(int x, int y, int width, int height) {
	   this.xPos = x;
	   this.yPos = y;
	   this.width = width;
	   this.height = height;
	   setColor(Color.cyan);
	}

   public Block(int x, int y, int width, int height, Color color) {
	   this.xPos = x;
	   this.yPos = y;
	   this.width = width;
	   this.height = height;
	   this.color = color;
   }

   public Block(int x, int y) {
	   this.xPos = x;
	   this.yPos = y;
	   setWidth(100);
	   setHeight(100);
	   setColor(Color.blue);

	   
}

public void setColor(Color col)
   {

	   this.color = col;
   }

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   public void erase(Graphics window) 
   {
	   window.setColor(Color.black);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
	public boolean equals(Block obj)
	{
		Block other = obj;
		
		if (this.color == obj.getColor() && this.height == obj.getHeight() && this.width == obj.getWidth()) {
			
			return true;
		}
		
		return false;

	}

	@Override
	public void setPos(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}

	@Override
	public void setX(int x) 
	{
		this.xPos = x;
	}

	@Override
	public void setY(int y) 
	{
		this.yPos = y;
	}

	@Override
	public int getX() 
	{
		return xPos;
	}

	@Override
	public int getY() 
	{
		return yPos;
	}   

   //add the other get methods
	public int getWidth() 
	{
		return width;
	}

	public void setWidth(int width) 
	{
		this.width = width;
	}

	public int getHeight() 
	{
		return height;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}

	public Color getColor() 
	{
		return color;
	}
	
	
	public String toString() 
	{
		return xPos + ", " + yPos + ", " + width + ", " + height + ", " + color;
	}


   //add a toString() method  - x , y , width, height, color
}