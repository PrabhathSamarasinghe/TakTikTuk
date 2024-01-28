import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Songs {

    public void Cheering(){
        try{
            File file = new File("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\videogame-death-sound-43894.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void Laughing(){
        try{
            File file = new File("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\surprised-child-voice-sound-113127.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void Beep(){
        try{
            File file = new File("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\button-41.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void Start(){
        try{
            File file = new File("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\game-start-6104.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }catch(Exception e){
            System.out.println(e);
        } 
    }
    public void End(){
        try{
            File file = new File("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\winfantasia-6912.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }catch(Exception e){
            System.out.println(e);
        } 
    }
    public void Win(){
        try{
            File file = new File("D:\\Progamming Works\\TikTakTuk\\TakTikTuk\\Media\\singleWin.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }catch(Exception e){
            System.out.println(e);
        } 
    }
}
