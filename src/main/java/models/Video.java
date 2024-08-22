package models;

import javafx.application.Application;
import services.VideoPlayer;

public class Video extends Streamable {

    public Video(String name, String path) {
        super(name, path);
    }
    @Override
    public void play() {
       
        Application.launch(VideoPlayer.class,this.getPath());
    }
    
}
