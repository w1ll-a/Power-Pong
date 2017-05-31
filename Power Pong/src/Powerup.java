/**
 * Created by wande18094 on 5/26/2017.
 */
public class Powerup {
    public Powerup(String powerup){
        findPowerup(powerup);
    }

    public void findPowerup(String powerup){
        if (powerup == "iSize1") iSize1();
        if (powerup == "iSize2") iSize2();
    }

    public void iSize1(){
        Racket.setHeight(PongPanel.player1.getHeight() + 20);
    }

    public void iSize2(){
        Racket.setHeight(PongPanel.player2.getHeight() + 20);
    }
}
