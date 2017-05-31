/**
 * Created by wande18094 on 5/26/2017.
 */
public class Powerup {

    public Powerup(String powerup){
        findPowerup(powerup);
    }

    public void findPowerup(String powerup){
        if (powerup == "dSize") dSize();
    }

    public void dSize(){
        Racket.setHeight(Racket.getHeight() * 2);
    }
}
