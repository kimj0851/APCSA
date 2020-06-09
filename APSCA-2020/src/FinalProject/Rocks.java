package FinalProject;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Rocks
{
	private List<Rock> Rocks;
	public int distance = 1;

	public Rocks(int size)
	{
		Rocks = new ArrayList<Rock>();
		int Xpos = 200;
		int Ypos = 600;
		
		for (int a = 0 ; a < size; a++) 
		{
			Rocks.add(new Rock( Xpos + 50, Ypos, 50, 50, 4));
			Xpos = Xpos + 200;
		}
		
	}


   public int getDistance()
   {
	   return distance;
   }
	public void add(Rock add)
	{
		Rocks.add(add);
	}

	public void drawEmAll( Graphics window )
	{
		for (Rock rock : Rocks) 
		{
			rock.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Rock rock: Rocks) 
		{
			
			rock.move("DOWN");
			
			if (rock.getY() > 850) 
			{
				rock.setY(0);
				rock.setX( (int) (Math.random()*600));
				distance++;

			}
		
		}
		
	}
	
	public List<Rock> getList() 
	{
        return Rocks;
    }
	 public void accelerate()
	   {
		   for(Rock rock: Rocks) 
		   {
			   rock.setSpeed(rock.getSpeed()+3);
		   }
	   }
	public void checkShip(Car car) 
	{
		for(Rock rock: Rocks) 
		{
			if ( (car.getX() > rock.getX() - rock.getWidth() / 2 ) && (car.getX() < rock.getX() + rock.getWidth() /  2 ) && (car.getY() < rock.getY() + rock.getHeight()) && car.getY() > rock.getY()) 
			{
				car.lockout();
			}
		}
	}
	public void lockout()
	{
		for(Rock rock: Rocks) 
		{
			rock.setSpeed(0);
		}
	

	}

	
	public String toString()
	{
		return "";
	}
}





	
