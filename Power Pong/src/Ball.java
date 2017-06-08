import java.awt.*;

import javax.swing.JOptionPane;

public class Ball {
    private static final int WIDTH = 20, HEIGHT = 20;
    private Pong game;
    private static final int VELO = 4;
    private static int x, y, xa = VELO, ya = VELO;

    public Ball(Pong game) {
        this.game = game;
        x = game.getWidth() / 2;
        y = game.getHeight() / 2;
    }

    public void update() {
        x += xa;
        y += ya;
        if (x < 0) {
            game.getPanel().increaseScore(1);
            x = game.getWidth() / 2;
            xa = -xa;
        } else if (x > game.getWidth() - WIDTH - 7) {
            game.getPanel().increaseScore(2);
            x = game.getWidth() / 2;
            xa = -xa;
        } else if (y < 0 || y > game.getHeight() - HEIGHT - 29)
            ya = -ya;
        if (game.getPanel().getScore(1) == 10) {
            JOptionPane.showMessageDialog(null, "Player 1 wins", "Pong", JOptionPane.PLAIN_MESSAGE);
            game.getPanel().resetScore();
        } else if (game.getPanel().getScore(2) == 10) {
            JOptionPane.showMessageDialog(null, "Player 2 wins", "Pong", JOptionPane.PLAIN_MESSAGE);
            game.getPanel().resetScore();
        }
        checkCollision();
    }


    public void checkCollision() {
        if (game.getPanel().getPlayer(1).getBounds().intersects(getBounds())){
            xa = -xa;
            speedUp2();
        }
        if (game.getPanel().getPlayer(2).getBounds().intersects(getBounds())) {
            xa = -xa;
            speedUp1();
        }
    }

    public static void resetSpeed() {
        xa = VELO;
        ya = VELO;
    }

    public static void speedUp1(){
        xa++;
        //ya++;
    }

    public static void speedUp2(){
        xa--;
        //ya--;
    }

    public Rectangle getBounds() {
        return new Rectangle (x, y, WIDTH, HEIGHT);
    }

    public void paint(Graphics g) {
        g.setColor(new Color(0, 0, 128));
        g.fillOval(x, y, WIDTH, HEIGHT);
    }
}