package SpaceRace;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class LeftDebris {
	
	
	private List<Debris> debris;
	
	public LeftDebris() {
		debris = new ArrayList<Debris>();
		
		Random random = new Random();
		
		for (int a = 0; a < 20; a++) {
			debris.add(   new Debris( random.nextInt(800), random.nextInt(600), 2, 30)     );
		}
	}
	
	public void startGame(Graphics window)
	{
		for ( Debris object: debris) {
			object.draw(window);
		}
	}
	
	public void moveLeft()
	{
		for ( Debris object: debris) {
			object.moveLeft();
			if ( object.returnX() <= 0) {
				
				object.setX(1200);
			}
		}
		
		
	}

	
	public List<Debris> getList() {
        return debris;
    }
}
