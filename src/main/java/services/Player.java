package services;

import models.Streamable;

public class Player {
    private Streamable fileToplay;
    public Player (Streamable fileToPlay){
        this.fileToplay = fileToPlay;
    }
    public void play(boolean isAudio){
        this.fileToplay.play();
        if(isAudio){
            new Controller(this.fileToplay);
        }
    }
   
}
