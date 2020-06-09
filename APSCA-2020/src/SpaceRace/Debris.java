package SpaceRace;

import java.awt.Color;
import java.awt.Graphics;


public class Debris extends Projectile{
	
	
	private int radius;
	
	public Debris(int x, int y, int s, int r)  {
		super(x,y,s);
		
		radius = r;
		
	}
	
	public int returnRadius() {
		return radius;
	}
	
	public void draw(Graphics window) {

		window.setColor(Color.white);
		
		window.fillOval(returnX(),  returnY(), radius, radius);
	}
	
}