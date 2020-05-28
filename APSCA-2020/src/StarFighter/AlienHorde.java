package StarFighter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int score;

	public AlienHorde(int size)
	{
		score = 0;
		aliens = new ArrayList<Alien>();
		int Xpos = 0;
		int Ypos = -200;
		
		for (int a = 0 ; a < size / 2; a++) 
		{
			aliens.add(new Alien( Xpos + 50, Ypos, 50, 50, 1));
			Xpos = Xpos + 150;
		}
		
		Xpos = 0;
		Ypos = Ypos + 50;

		
		for (int a = 0 ; a < size / 2; a++) 
		{
			aliens.add(new Alien( Xpos + 50, Ypos, 50, 50, 1));
			Xpos = Xpos + 150;
		}
	}


   
	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien alien : aliens) 
		{
			alien.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien alien: aliens) 
		{
			
			alien.move("DOWN");
			
			if (alien.getY() <  0) 
			{
				alien.move("RIGHT"); 
			}
			else if (alien.getY() < 300 ) 
			{
				alien.move("LEFT"); 

			}
			else if (alien.getY() < 600 ) 
			{
				alien.move("RIGHT"); 

			}
			
			if (alien.getY() >  600) 
			{
				alien.setY(0);
			}
		
		}
		
	}
	public int getScore() 
	{
		return score;
	}
	
	public List<Alien> getList() 
	{
        return aliens;
    }
	
	public void checkShip(Ship ship) 
	{
		for(Alien alien: aliens) 
		{
			if ( (ship.getX() > alien.getX() - alien.getWidth() / 2 ) && (ship.getX() < alien.getX() + alien.getWidth() /  2 ) && (ship.getY() < alien.getY() + alien.getHeight()) && ship.getY() > alien.getY()) {
			
				ship.setX(-1000);
				ship.setY(-1000);
				
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (Ammo ammo : shots) 
		{
			for (Alien alien: aliens) 
			{
				if ( (ammo.getX() > alien.getX() - alien.getWidth() / 2 ) && (ammo.getX() < alien.getX() + alien.getWidth() /  2 ) && (ammo.getY() < alien.getY() + alien.getHeight()) && ammo.getY() > alien.getY()) {
					aliens.remove(alien);
					score++;
					ammo.setX(-200);
					ammo.setY(0);
					break;
				}
			}
		}
	}
	public void removeAll()
	{
		for(Alien alien: aliens) 
		{
			alien.setPos(-1000, -1000);
		}
	}

	public String toString()
	{
		return "";
	}
}





	
