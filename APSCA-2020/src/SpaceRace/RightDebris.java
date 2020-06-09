package SpaceRace;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class RightDebris {
	
	
	private List<Debris> debris;
	
	public RightDebris() {
		debris = new ArrayList<Debris>();
		
		Random random = new Random();
		
		for (int a = 0; a < 20; a++) {
			debris.add(   new Debris( random.nextInt(800) , random.nextInt(600), 2,30) );
		}
	}
	
	public void startGame(Graphics window)
	{
		for ( Debris object: debris) {
			object.draw(window);
		}
	}
	
	public void moveRight()
	{
		for ( Debris object: debris) {
			object.moveRight();
			if ( object.returnX() >= 1200) {
				
				object.setX(0);
			}
		}
		
		
	}

	
	public List<Debris> getList() {
        return debris;
    }
}