package SpaceRace;

import javax.swing.JFrame;
import java.awt.Component;
import java.io.IOException;

public class Main extends JFrame {

    public Main() throws IOException {
        super("Space Race");
        setSize(1200, 1200);

        SpaceRaceGame game = new SpaceRaceGame();
        ((Component) game).setFocusable(true);

        getContentPane().add(game);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String args[]) throws IOException {
        Main run = new Main();
    }
}