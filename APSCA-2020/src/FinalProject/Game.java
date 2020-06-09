package FinalProject;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import javax.swing.JFrame;
import java.awt.Component;

public class Game extends JFrame {

    
    public Game() {
        super("Road");
        setSize(800, 1200);

        Road Game = new Road();
        ((Component) Game).setFocusable(true);

        getContentPane().add(Game);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String args[]) {
        Game run = new Game();
    }
}