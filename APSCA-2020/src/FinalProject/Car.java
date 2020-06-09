package FinalProject;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Car extends MovingThing {

    private int speed;
    private Image image;

    public Car(int x, int y, int w, int h, int s) {
        super(x, y, w, h);
        speed = s;
        try {
            URL url = getClass().getResource("car.png");
            image = ImageIO.read(url);
        } catch (Exception e) {
            //feel free to do something here
        }
    }

    public void setSpeed(int s) {
        //add more code
        speed = s;
    }

    public int getSpeed() {
        return speed;
    }

    public void move(String direction) {
        if (direction.equals("LEFT")) 
        {
            super.setX(super.getX() - getSpeed());
        }
        if (direction.equals("RIGHT")) 
        {
            super.setX(super.getX() + getSpeed());
        }
    }

    public void draw(Graphics window) 
    {
        window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
    }
    public void lockout()
    {
    	speed = 0;
    	
    }
    public void explode()
    {
    	try {
            URL url = getClass().getResource("explosion.png");
            image = ImageIO.read(url);
        } catch (Exception e) {
        	
        }
    }
    
    public String toString() {
        return super.toString() + getSpeed();
    }
}