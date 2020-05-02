package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

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

public class BreakOut extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle Paddle;
	private boolean[] keys;
	private BufferedImage back;
	private int Score;
	
	private Wall leftWall;
	private Wall rightWall;
	private Wall topWall;
	private Wall bottomWall;
	private Block b1;

	


	public BreakOut()
	{
		//set up all variables related to the game
		
		ball = new Ball(390,200,20,20,Color.white,3,3);
		
		//ball = new BlinkyBall(100,100,20,20,Color.BLACK,3,3);
		
		//ball = new InvisibleBall(100,100,20,20,Color.BLACK,3,3);
		
		//ball = new SpeedUpBall(100,100,20,20,Color.BLACK,3,3);
		
		Paddle = new Paddle(20,10,20,100,Color.white,4);
		b1 = new Block(500, 30, 50,100,Color.red);
		
		
		leftWall = new Wall(0,0,10 , 800, Color.black);
		rightWall = new Wall(775, 0, 15, 460, Color.white);
		
		topWall = new Wall(0,0,800,10, Color.white);
		bottomWall = new Wall(0,460,800,10, Color.white);


		keys = new boolean[2];

		Score = 0;
    	setBackground(Color.black);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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


		ball.moveAndDraw(graphToBack);
		Paddle.draw(graphToBack);
		
		leftWall.draw(graphToBack);
		rightWall.draw(graphToBack);
		topWall.draw(graphToBack);
		bottomWall.draw(graphToBack);
		b1.draw(graphToBack);

		


		//see if ball hits left wall or right wall
		if(ball.didCollideRight(leftWall))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			
			if (ball.didCollideRight(leftWall)) {
				Score++;
			}
			
			graphToBack.setColor(Color.black);
			graphToBack.fillRect(350, 480, 100, 60);
			graphToBack.setColor(Color.white);

			graphToBack.drawString("Score: " + Score , 350, 500);  
			ball.erase(graphToBack);
			ball.setXSpeed(3);
			ball.setYSpeed(3);
			ball.setX(390);
			ball.setY(200);
		}
		graphToBack.setColor(Color.white);
		graphToBack.drawString("Score: " + Score , 350, 500); 
	

		//see if the ball hits the top or bottom wall 

		if(ball.didCollideBottom(topWall) || ball.didCollideTop(bottomWall))
		{
			ball.setYSpeed(ball.getYSpeed() * -1);
		}
		if(ball.didCollideLeft(rightWall))
		{
			ball.setXSpeed(ball.getXSpeed() * -1);
		}
		if(ball.didCollideRight(Paddle))
		{
			ball.setXSpeed(ball.getXSpeed() * -1);
		}
			
		if(ball.didCollideLeft(b1)||ball.didCollideRight(b1))
		{
			ball.setYSpeed(ball.getYSpeed() * -1);
			Score++;
			b1.setPos(0, 0);
			b1.setHeight(0);
			b1.setWidth(0);
			b1.setColor(Color.black);
		}
		else if(ball.didCollideBottom(b1)||ball.didCollideTop(b1))
		{
			ball.setXSpeed(ball.getXSpeed() * -1);
			Score++;
			b1.setPos(0, 0);
			b1.setHeight(0);
			b1.setWidth(0);
			b1.setColor(Color.black);
		}
		

		
		
		
		
		
		//see if the paddles need to be moved

		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			if (Paddle.getY()  + Paddle.getHeight() <= bottomWall.getY()) {
				Paddle.moveUpAndDraw(graphToBack);
			}
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			if (Paddle.getY() >= topWall.getY() + topWall.getHeight() ) {
				Paddle.moveDownAndDraw(graphToBack);
			}

		}


		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'Z' : keys[0]=true; break;
			case 'W' : keys[1]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'Z' : keys[0]=false; break;
			case 'W' : keys[1]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}