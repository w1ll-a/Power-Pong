/**
 * Created by Mhall17162 on 5/26/2017.
 */import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.Timer;

public class PongPanel extends JPanel implements ActionListener, KeyListener {
    private Pong game;
    private Ball ball;
    static Racket player1, player2;
    private int score1, score2;
    //private BufferedImage b;

    public PongPanel(Pong game) {
        //this.b = ImageLoader.loadImage("/media/images/magenta-flower-wallpaper.jpg");
        setBackground(Color.pink);
        this.game = game;
        ball = new Ball(game);
        player1 = new Racket(game, KeyEvent.VK_UP, KeyEvent.VK_DOWN, game.getWidth() - 36, this);
        player2 = new Racket(game, KeyEvent.VK_W, KeyEvent.VK_S, 20, this);
        Timer timer = new Timer(5, this);
        timer.start();
        addKeyListener(this);
        setFocusable(true);
    }

    public Racket getPlayer(int playerNo) {
        if (playerNo == 1)
            return player1;
        else
            return player2;
    }

    public void increaseScore(int playerNo) {
        if (playerNo == 1) {
            score2++;
            Ball.speedUp2();
        }
        else {
            score1++;
            Ball.speedUp1();
        }
    }

    public void resetScore(){
        score1=0;
        score2=0;
    }

    public int getScore(int playerNo) {
        if (playerNo == 1)
            return score1;
        else
            return score2;
    }

    private void update() {
        ball.update();
        player1.update();
        player2.update();
    }

    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }

    public void keyPressed(KeyEvent e) {
        player1.pressed(e.getKeyCode());
        player2.pressed(e.getKeyCode());
    }

    public void keyReleased(KeyEvent e) {
        player1.released(e.getKeyCode());
        player2.released(e.getKeyCode());
    }

    public void keyTyped(KeyEvent e) {
         ;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(game.getPanel().getScore(1) + " : " + game.getPanel().getScore(2), game.getWidth() / 2, 10);
        //g.drawImage(b, 0, 0, null);
        ball.paint(g);
        player1.paint(g);
        player2.paint(g);
    }

    public Racket getRacketOne(){
        return player1;
    }

    public Racket getRacketTwo(){
        return player2;
    }
}
