/**
 * Created by Mhall17162 on 5/26/2017.
 */import java.awt.Color;

import javax.swing.JFrame;

public class Pong extends JFrame {
    private final static int WIDTH = 1200, HEIGHT = 800;
    private PongPanel panel;

    public Pong() {
        setSize(WIDTH, HEIGHT);
        setTitle("Mike did nothing");
        setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new PongPanel(this);
        add(panel);
    }

    public PongPanel getPanel() {
        return panel;
    }

    public static void main(String[] args) {
        new Pong();
    }
}