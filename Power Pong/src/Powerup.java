public class Powerup {
    private static Racket rack1, rack2;

    public Powerup(String powerup, Racket rack1, Racket rack2){
        this.rack1 = rack1;
        this.rack2 = rack2;
        findPowerup(powerup);
    }

    public void findPowerup(String powerup){
        if (powerup == "iSize1") iSize1();
        if (powerup == "iSize2") iSize2();
    }

    public static void iSize1(){
        rack2.setHeight(PongPanel.player2.getHeight() + 20);
    }

    public static void iSize2(){
        rack1.setHeight(PongPanel.player1.getHeight() + 20);
    }
}
