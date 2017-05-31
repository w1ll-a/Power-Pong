/**
 * Created by Mhall17162 on 5/26/2017.
 */

import java.awt.*;

public class Racket {
    private static int width = 10, height = 60;
    private Pong game;
    private int up, down, powerUp;
    private int x;
    private int y, ya;

    public Racket(Pong game, int up, int down, int powerUp, int x) {
        this.game = game;
        this.x = x;
        y = game.getHeight() / 2;
        this.up = up;
        this.down = down;
        this.powerUp = powerUp;
    }

    public void update() {
        if (y > 0 && y < game.getHeight() - height - 29)
            y += ya;
        else if (y <= 0)
            y =1;
        else if (y >= game.getHeight() - height - 29)
            y=game.getHeight()- height - 30;
    }

    public static void setHeight(int newHeight){
        height = newHeight;
    }

    public static int getHeight(){
        return height;
    }

    public void pressed(int keyCode) {
        if (keyCode == up)
            ya = -6;
        else if (keyCode == down)
            ya = 6;
        else if (keyCode == powerUp)
            new Powerup("iSize");
    }

    public void released(int keyCode) {
        if (keyCode == up || keyCode == down)
            ya = 0;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, width, height);
    }
}