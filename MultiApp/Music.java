import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.*;
import java.io.File;

public class Music {

    public static void main(String[] args){

    }

    void playMusic(String musicLocation){
    try {
        File musicPath = new File(musicLocation);
        if (musicPath.exists()) {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput); // it opens the input
            FloatControl gainControl =
                    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-10.0f); // Reduce volume by 10 decibels.
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);


            JOptionPane.showMessageDialog(null, "Don't Press Ok or it will stop the music!");
            long clipTimePosition = clip.getMicrosecondPosition();
            clip.stop();

            JOptionPane.showMessageDialog(null, "Welp, i told you...");

        } else {
            System.out.println("No Music File Found!");
        }
    } catch (Exception ex){
        ex.printStackTrace();
    }
}
}
/*
JOptionPane.showMessageDialog(null, "Press OK to pause"); // it helps the music to continue and not stop
            long clipTimePosition = clip.getMicrosecondPosition();
            clip.stop();

            JOptionPane.showMessageDialog(null, "Press OK to stop playing"); // it helps the music to continue and not stop

 */