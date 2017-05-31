import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * Created by Mhall17162 on 5/24/2017.
 */
public class Sound {

    public Sound (String path){
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
    public static void main (String [] args){
        Sound test= new Sound("media/sound/bullshit.mp3");
    }
}

