//(c) A+ Computer Science
package FinalProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import SpaceRace.Scoreboard;
import SpaceRace.TitleScreen;

public class Road extends Canvas implements KeyListener, Runnable
{
	private boolean[] keys;
	private BufferedImage back;
	
	private Car car;
    private Rocks rock;
	private Trees tree;
	
	private int score;
	private Title Title;
	private String gameCondition;
	private boolean Start;

	public Road()
	{
		setBackground(Color.white);

		keys = new boolean[3];

		
		car = new Car(375,700,50,50,2);
	
		rock = new Rocks(3);
		tree = new Trees(5);
		score = 0;
		gameCondition = "";
		
		Title = new Title();
		
		Start = false;

		this.addKeyListener(this);
		new Thread(this).start();
		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		Graphics2D twoDGraph = (Graphics2D)window;
		if(back==null)
		{
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));
		}
		Graphics graphToBack = back.createGraphics();
		graphToBack.setColor(Color.white);
		graphToBack.fillRect(0,0,800,1200);
		
		car.draw(graphToBack);
		
		if (!Start) 
		{
			Title.draw(graphToBack);
		}

		if ( Start) 
		{
			car.draw(graphToBack);
			tree.drawEmAll(graphToBack);
			rock.drawEmAll(graphToBack);
			tree.moveEmAll();
			rock.moveEmAll();
			tree.checkShip(car);
			rock.checkShip(car);
			
			if (car.getSpeed()==0)
			{
				gameCondition ="Game Over";
				Font f = new Font("Dialog", Font.PLAIN, 50);
				graphToBack.setFont(f);
				graphToBack.setColor(Color.black); 
				graphToBack.drawString(gameCondition,300,350);
				graphToBack.drawString("Score: " + (tree.getDistance() + rock.getDistance()*10), 300, 400);
				car.explode();
				tree.lockout();
				rock.lockout(); 
				
				
			}


			if(keys[0] == true)
			{
			}
			else if( keys[1] == true) {
				car.move("LEFT");
			}
			else if( keys[2] == true) {
				car.move("RIGHT");
			}
		}
		
	
		
		graphToBack.setColor(Color.white); 
		
		graphToBack.drawString("Score: " + score , 10, 20); 
		


		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
		{
			keys[0] = true;
			Start = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[2] = true;
		}

		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[2] = false;
		}

		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}