import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * Created by Mhall17162 on 5/24/2017.
 */
public class Sound {

    public void sound (String path){
        try{
            AudioInputStream audioInputStream =
                    AudioSystem.getAudioInputStream(
                            this.getClass().getResource(path));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
        catch(Exception ex)
        {
        }
    }
}

