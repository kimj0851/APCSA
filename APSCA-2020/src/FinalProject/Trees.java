package FinalProject;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Trees
{
	private List<Tree> trees;
	public int distance =1;
	public Trees(int size)
	{
		trees = new ArrayList<Tree>();
		int Xpos = 150;
		int Ypos = -1200;
		
		for (int a = 0 ; a < size / 5; a++) 
		{
			trees.add(new Tree( Xpos, Ypos, 50, 50, 4));
			Xpos = Xpos + 150;
			Ypos = Ypos + 300;
		}
		
		for (int a = 0 ; a < size / 5; a++) 
		{
			trees.add(new Tree( Xpos, Ypos, 50, 50, 4));
			Xpos = Xpos + 150;
			Ypos = Ypos + 300;
		}
		
		for (int a = 400 ; a < size / 5; a++) 
		{
			trees.add(new Tree( Xpos, Ypos, 50, 50, 4));
			Xpos = Xpos + 150;
			Ypos = Ypos + 300;
		}
		for (int a = 0 ; a < size / 5; a++) 
		{
			trees.add(new Tree( Xpos, Ypos, 50, 50, 4));
			Xpos = Xpos + 150;
			Ypos = Ypos + 300;
		}
		
		for (int a = 400 ; a < size / 5; a++) 
		{
			trees.add(new Tree( Xpos, Ypos, 50, 50, 4));
			Xpos = Xpos + 150;
			Ypos = Ypos + 300;
		}
	}


   
	public void add(Tree add)
	{
		trees.add(add);
	}
	   public int getDistance()
	   {
		   return distance;
	   }

	public void drawEmAll( Graphics window )
	{
		for (Tree tree : trees) 
		{
			tree.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Tree tree: trees) 
		{
			
			tree.move("DOWN");
			if (tree.getY() > 850) 
			{
			tree.setY(0);
			tree.setX( (int) (Math.random()*600));
			distance++;
			}
			
			

		
		}
		
	}
	public List<Tree> getList() 
	{
        return trees;
    }
	   public void accelerate()
	   {
		   for(Tree tree: trees) 
		   {
			   tree.setSpeed(tree.getSpeed()+1);
		   }
	   }
	public void checkShip(Car car) 
	{
		for(Tree tree: trees) 
		{
			if ( (car.getX() > tree.getX() - tree.getWidth() / 2 ) && (car.getX() < tree.getX() + tree.getWidth() /  2 ) && (car.getY() < tree.getY() + tree.getHeight()) && car.getY() > tree.getY()) 
			{
				car.lockout();
			}
		}
	}
	public void lockout()
	{
		for(Tree tree: trees) 
		{
			tree.setSpeed(0);
		}
	}
	
	public String toString()
	{
		return "";
	}
}





	
