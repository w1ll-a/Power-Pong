import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

/**
 * Created by Mhall17162 on 5/24/2017.
 */
public class SoundTest {

    public static void main (String [] args){
        String bip = "bomb.mp3";
        Media hit = new Media(new File(bip).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }
}
