public class Powerup {
    private static Racket rack1, rack2;

    public Powerup(Racket rack1, Racket rack2){
        this.rack1 = rack1;
        this.rack2 = rack2;
    }

    public static void iSize1(){
        rack2.iHeight();
    }

    public static void iSize2(){
        rack1.iHeight();
    }
}
