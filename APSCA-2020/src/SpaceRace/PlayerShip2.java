package SpaceRace;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.List;
import java.awt.Graphics;
import java.awt.Image;


public class PlayerShip2 extends Projectile{
	
	private Image image;
	
	private int width;
	private int height;
	
	private int playerTwoScore;

	
	public PlayerShip2(int x, int y, int s, int w, int h) throws IOException {
		super(x,y,s);
		
		width = w;
		height = h;
		
		image = ImageIO.read(getClass().getResource("ship2.jpg"));
		
		playerTwoScore = 0;
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
				setX(850);
				setY(700);
				return true;
			}
		}
		
		return false;
		
	}
	public boolean reachedFinish() {
		
		if ( returnY() <=0) {
			setX(850);
			setY(700);
			return true;
		}
		return false;
	}

	
	public void incrementScore() {
		playerTwoScore++;
	}
	
	public int returnScore() {
		return playerTwoScore;
	}
	
}
