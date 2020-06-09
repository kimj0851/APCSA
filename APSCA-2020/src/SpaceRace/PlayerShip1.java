package SpaceRace;

import javax.imageio.ImageIO;

import StarFighter.Alien;
import StarFighter.Ammo;

import java.io.IOException;
import java.util.List;
import java.awt.Graphics;
import java.awt.Image;


public class PlayerShip1 extends Projectile{
	
	private Image image;
	
	private int width;
	private int height;
	
	private int playerOneScore;
	
	public PlayerShip1(int x, int y, int s, int w, int h) throws IOException {
		super(x,y,s);
		
		width = w;
		height = h;
		
		image = ImageIO.read(getClass().getResource("ship.jpg"));
		
		playerOneScore = 0;
		
	}
	
	public int returnWidth() {	
		return width;
	}
	
	public int returnHeight() {
		return height;
	}
	
	public void draw(Graphics window) {
		window.drawImage( image, returnX(), returnY(), returnWidth(), returnHeight(), null);
		
	}
	
	public boolean gotHit(List<Debris> debris) {
		
		for ( Debris object: debris) {
			if ((returnX() + returnWidth() /2 > object.returnX() + object.returnRadius() / 2 ) && (returnX() + returnWidth() /2 < object.returnX() + object.returnRadius()) && (returnY()  < object.returnY() + object.returnRadius()) && returnY() > object.returnY()) {
				setX(300);
				setY(700);
				return true;
			}
		}
		
		return false;
		
	}
	
	public boolean reachedFinish() {
		
		if ( returnY() <=0) {
			setX(300);
			setY(700);
			
			return true;
		}
		return false;
	}
	
	public void incrementScore() {
		playerOneScore++;
	}
	
	public int returnScore() {
		return playerOneScore;
	}
	
}
