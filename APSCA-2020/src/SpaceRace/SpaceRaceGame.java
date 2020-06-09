package SpaceRace;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SpaceRaceGame extends Canvas implements KeyListener, Runnable
{
	private boolean[] keys;
	private BufferedImage back;
	
	private PlayerShip1 ship1;
	private PlayerShip2 ship2;
	
	private LeftDebris leftDebris;
	private RightDebris rightDebris;
	
	private Scoreboard scoreboard;
	private TitleScreen titleScreen;
	private EndScreen endScreen;
	
	private boolean gameStarted;
	private boolean gameEnded;
	
	public SpaceRaceGame() throws IOException
	{
		setBackground(Color.black);

		keys = new boolean[5];

		ship1 = new PlayerShip1(300,700, 2, 50,50);
		ship2 = new PlayerShip2(850,700,2,50,50);
		
		rightDebris = new RightDebris();
		leftDebris = new LeftDebris();
		
		scoreboard = new Scoreboard();
		titleScreen = new TitleScreen();
		endScreen = new EndScreen();
		
		gameStarted = false;
		gameEnded = false;
		
		addKeyListener(this);
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
		if(back==null) {
			back = (BufferedImage)(createImage(getWidth(),getHeight()));
		}
		Graphics graphToBack = back.createGraphics();
		
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,1200,1200);
		
		if (!gameStarted && !gameEnded) {
			titleScreen.drawTitleScreen(graphToBack);
		}

		if ( gameStarted && !gameEnded) 
		{
			
			ship1.draw(graphToBack);
			ship2.draw(graphToBack);
			
			leftDebris.startGame(graphToBack);
			rightDebris.startGame(graphToBack);

			leftDebris.moveLeft();
			rightDebris.moveRight();
			
			if ( ship1.reachedFinish() ) {
				ship1.incrementScore();
				
				scoreboard.updateScoreboard(ship1.returnScore(), ship2.returnScore());
			}
			
			if ( ship2.reachedFinish() ) {
				ship2.incrementScore();
				
				scoreboard.updateScoreboard(ship1.returnScore(), ship2.returnScore());
			}
			
			if ( ship1.returnScore() == 10) {
				
				endScreen.setWinner("Player 1");
				gameEnded = true;
			}
			
			if ( ship2.returnScore() == 10) {
				
				endScreen.setWinner("Player 2");
				gameEnded = true;
			}
			
			ship1.gotHit(leftDebris.getList());
			ship1.gotHit(rightDebris.getList());
			ship2.gotHit(leftDebris.getList());
			ship2.gotHit(rightDebris.getList());
			
			scoreboard.drawScoreboard(graphToBack);

			

			if(keys[0] == true)
			{
			}
			else if( keys[1] == true) {
				ship1.moveUp();
			}
			else if( keys[2] == true) {
				ship1.moveDown();
			}
			else if( keys[3] == true) {
				ship2.moveUp();
			}
			else if( keys[4] == true) {   
				ship2.moveDown();
			}
		}
		
		if (gameEnded) {
			endScreen.drawEndScreen(graphToBack);
		}
		
		
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[0] = true;
			gameStarted = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_I)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_K)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_I)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_K)
		{
			keys[4] = false;
		}
		repaint();
	}

	@Override
	public void run() {
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
		
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}