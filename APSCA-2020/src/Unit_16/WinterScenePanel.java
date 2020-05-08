package Unit_16;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class WinterScenePanel extends JPanel implements Runnable
{
	private static final String FancySnowFlake = null;
	private List<AbstractShape> shapes;
	private AbstractShape sMan;
	private FancySnowFlake snow;
	private ArrayList<AbstractShape> arrayList;
	private SnowMan snowMan;
	private Tree tree;
	private Hat hat;
	
	public WinterScenePanel()
	{
		setVisible(true);
		//refer shapes to a new ArrayList of AbstractShape
		arrayList = new ArrayList<AbstractShape>();
		
		for (int x = 0; x < 50; x++) 
		{
			
			FancySnowFlake snow  = new FancySnowFlake( (int) (Math.random() * 700), 0, (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2) , Color.white, (int) (Math.random() * 5 + 1),(int) (Math.random() * 5+ 1));
			arrayList.add(snow);
			
			
		}
		
		//populate the list with 50 unique snowflakes
		
		snowMan = new SnowMan(650,475,100,100);

		//instantiate a snowman
		snow  = new FancySnowFlake(100,100,100,100,Color.white,1,1);
		
		tree = new Tree(500,200,150,200);
		hat = new Hat(680,350, 40,40 ,0, 0);

		

		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.BLUE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));

		for ( AbstractShape snowflake: arrayList) 
		{
			
			snowflake.moveAndDraw(window);
			
			if(snowflake.getXPos() >= 800 || snowflake.getYPos() >= 700) 
				{
				snowflake.setXPos((int) (Math.random() * 400));
				snowflake.setYPos(0);
			}
		}
		snowMan.draw(window);
		tree.draw(window);
		hat.draw(window);
		

		//make the snowman appear
		//make the snowflakes appear and move down the screen
		//check to see if any of the snowflakes need to be reset to the top of the screen
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(35);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}