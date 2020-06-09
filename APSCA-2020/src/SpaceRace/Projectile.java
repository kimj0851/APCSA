package SpaceRace;

public class Projectile {
	
	private int xPosition;
	private int yPosition;
	
	private int speed;
	
	public Projectile(int x, int y, int s) {
		xPosition = x;
		yPosition = y;
		speed = s;
	}
	
	public void setX( int x ) {
		xPosition = x;
	}
	
	public void setY(int y) {
		yPosition = y;
	}
	
	public int returnX() {
		return xPosition;
	}
	
	public int returnY() {
		return yPosition;
	}
	
	public int returnSpeed() {
		return speed;
	}
	
	public void moveLeft() {
		setX( returnX() - returnSpeed());
	}
	
	public void moveRight() {
		setX( returnX() + returnSpeed());
	
	}
	
	public void moveDown() {
		setY(returnY() + returnSpeed());
	}
	
	public void moveUp() {
		setY(returnY() - returnSpeed());
	}
	
}