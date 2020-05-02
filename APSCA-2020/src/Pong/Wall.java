package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Wall extends Block 
{
	

	public Wall()
	{
		super(200,200);
	}

   public Wall(int x, int y) 
   {
	   super(x,y);
   }



   public Wall(int x, int y, int width, int height) 
   {
	   super(x, y, width, height);      
   }



   public Wall(int x, int y, int width, int height, Color col) 
   {
	   super(x, y, width, height, col);
   }

   public void erase(Graphics window) 
   {
	   window.setColor(Color.white);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
  


	public boolean equals(Wall obj)
	{
		
		if (this.getColor() == obj.getColor() && this.getHeight() == obj.getHeight() && this.getWidth() == obj.getWidth()) 
		{
			
			return true;
		}
		

		return false;
	}   
	
	
}