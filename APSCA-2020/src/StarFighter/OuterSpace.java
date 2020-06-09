//(c) A+ Computer Science
package StarFighter;

import java.awt.Color;
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

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	//private Alien alien1;
	//private Alien alien2;

	private Ammo ammo;
	
    private AlienHorde horde;
	private Bullets shots;
	
	private int score;
	private String gameCondition;

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		
		ship = new Ship(350,500,50,50,2);
		
		//alien1= new Alien(100,20,50,50,1);
		//alien2= new Alien(200,20,50,50,2);
		horde = new AlienHorde(8);
		shots = new Bullets();
		score = 0;
		gameCondition = "";
		
		ammo = new Ammo(0,0,1);

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
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		
		
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		ship.draw(graphToBack);
		//alien1.draw(graphToBack);
		//alien2.draw(graphToBack);
		
		ammo.draw(graphToBack);
		

		if(keys[0] == true)
		{
			ship.move("UP");
		}
		else if( keys[1] == true) {
			ship.move("LEFT");
		}
		else if( keys[2] == true) {
			ship.move("DOWN");
		}
		else if( keys[3] == true) {
			ship.move("RIGHT");
		}
		
		if( keys[4] == true) {    

			shots.add(new Ammo(ship.getX() + ship.getWidth() / 2, ship.getY()));
			keys[4] = false;
		}
		
		
			
	    horde.drawEmAll(graphToBack);
	    shots.drawEmAll(graphToBack);

	    horde.moveEmAll();
	    shots.moveEmAll();
	
	    horde.removeDeadOnes(shots.getList());
	    
	    horde.checkShip(ship);
	    if (ship.getX() == -1000 && ship.getY() == -1000)
	    {
	    	gameCondition ="Game Over";
	    	graphToBack.setColor(Color.red); 
	    	graphToBack.drawString(gameCondition,350,350);
	    	horde.removeAll();
	    	ship.lockout();
	    }
	    else if (score == 8)
	    {
	    gameCondition ="Victory royale";
    	graphToBack.setColor(Color.green); 
    	graphToBack.drawString(gameCondition,350,350);
    	horde.removeAll();
    	ship.lockout();
	    	
	    }
	    
	    score = horde.getScore();
		
		graphToBack.setColor(Color.white); 
		
		graphToBack.drawString("Score: " + score , 10, 20); 
		


		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
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