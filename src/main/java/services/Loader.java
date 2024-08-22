package services;

import models.AudioFormat;
import models.Song;
import models.Streamable;
import models.Video;
import models.VideoFormat;

public class Loader {
    private String path;
    private boolean isAudio;
    public Loader(String path){
        this.path = path;
      
    }

    public Streamable load() throws Exception{
        int pontoIndex = path.lastIndexOf('.');
        String format = path.substring(pontoIndex+ 1);
        
        if(AudioFormat.isValidFormat(format))
        {
            this.isAudio = true;
            Song song = new Song("nome", path.toString());
            return song;

        }
        else if(VideoFormat.isValidFormat(format)) {

            this.isAudio = false;
            Video video = new Video(format, path.toString());
            return video;
        }
        else {
          throw new Exception("Formato Invalido");
        }
    }
  public boolean isAudio(){
    return this.isAudio;
  }
}
