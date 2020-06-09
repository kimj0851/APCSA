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

public class Tree extends MovingThing 
{

    private int speed;
    private Image image;



    public Tree(int x, int y, int w, int h, int s) 
    {
        super(x, y, w, h);
        speed = s;
        try 
        {
            URL url = getClass().getResource("tree.jpg");
            image = ImageIO.read(url);
        } catch (Exception e) 
        {
            //feel free to do something here
        }
    }

    public void setSpeed(int s) 
    {
        //add code
        speed = s;
    }

    public int getSpeed() 
    {
        return speed;
    }

    public void move(String direction) 
    {
        //add code here
        if (direction.equals("DOWN")) 
        {
            setY(getY() + getSpeed());
        }
    }

    public void draw(Graphics window) {
        window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
    }

    public String toString() {
        return "";
    }
}