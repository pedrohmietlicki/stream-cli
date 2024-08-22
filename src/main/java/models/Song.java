package models;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Song extends Streamable {

    private String name;
    private String path;
    private Clip audioClip;
    private AudioInputStream audioStream;

    public Song(String name, String path) {
        super(name, path);
        this.name = name;
        this.path = path;
        loadAudio();
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public void pause() {
        this.audioClip.stop();
    }

    private void loadAudio() {
        try {

            File audioFile = new File(this.path);
            System.out.println(audioFile);
            this.audioStream = AudioSystem
                    .getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();

            DataLine.Info info = new DataLine.Info(Clip.class, format);

            this.audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);

        } catch (UnsupportedAudioFileException e) {
            System.out.println("O tipo de arquivo de áudio não é suportado.");

            System.out.println("Esses São os tipos suportados.");
            final AudioFileFormat.Type[] types = AudioSystem.getAudioFileTypes();
            for (final AudioFileFormat.Type t : types) {
                System.out.print(" - " + t);
            }
            System.out.println();

            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de áudio.");
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.out.println("Linha de áudio não disponível.");
            e.printStackTrace();
        }
    }
    public void stop(){
        audioClip.close();
        audioClip.drain();
    }
    public void play() {
        this.audioClip.start();
      
        

     


    }
    public boolean isPlaying(){
        return audioClip.isRunning() || audioClip.isOpen();
    }
}
