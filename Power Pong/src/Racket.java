/**
 * Created by Mhall17162 on 5/26/2017.
 */

import java.awt.*;
import java.awt.event.KeyEvent;

public class Racket {
    private static int width = 10;
    public int height = 60;
    private Pong game;
    private int up, down;
    private int x;
    private int y;
    private int ya;

    private int count1 = 0;
    private int count2 = 0;

    private PongPanel p;

    public Racket(Pong game, int up, int down, int x, PongPanel p) {
        this.game = game;
        this.x = x;
        y = game.getHeight() / 2;
        this.up = up;
        this.down = down;
        this.p = p;
    }

    public void update() {
        if (y > 0 && y < game.getHeight() - height - 29)
            y += ya;
        else if (y <= 0)
            y =1;
        else if (y >= game.getHeight() - height - 29)
            y=game.getHeight()- height - 30;
    }

    public void setHeight(int newHeight){
        height = newHeight;
    }

    public void iHeight(){
        height += 20;
    }

    public int getHeight(){
        return height;
    }

    public void pressed(int keyCode) {
        if (keyCode == up)
            ya = -6;
        else if (keyCode == down)
            ya = 6;
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