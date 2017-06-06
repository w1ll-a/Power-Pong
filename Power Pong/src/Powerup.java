/**
 * Created by wande18094 on 5/26/2017.
 */
public class Powerup {
    private Racket rack1, rack2;

    public Powerup(String powerup, Racket rack1, Racket rack2){
        this.rack1 = rack1;
        this.rack2 = rack2;
        findPowerup(powerup);
    }

    public void findPowerup(String powerup){
        if (powerup == "iSize1") iSize1();
        if (powerup == "iSize2") iSize2();
    }

    public void iSize1(){
        rack1.setHeight(PongPanel.player1.getHeight() + 20);
    }

    public void iSize2(){
        rack2.setHeight(PongPanel.player2.getHeight() + 20);
    }
}
