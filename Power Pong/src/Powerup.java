/**
 * Created by wande18094 on 5/26/2017.
 */
public class Powerup {
    public Powerup(String powerup){
        findPowerup(powerup);
    }

    public void findPowerup(String powerup){
        if (powerup == "iSize") iSize();
    }

    public void iSize(){
        Racket.setHeight(Racket.getHeight() + 20);
    }
}
