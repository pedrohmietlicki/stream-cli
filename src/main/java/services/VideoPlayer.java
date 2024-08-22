package services;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaPlayer.Status;
import javafx.stage.Stage;
import java.util.List;
import java.io.File;

public class VideoPlayer extends Application {
    private String videoPath;

    @Override
    public void start(Stage primaryStage) throws Exception {
        List<String> list = getParameters().getRaw();
        this.videoPath = list.getFirst();
        File videoFile = new File(this.videoPath);
        System.out.println(videoFile.getAbsolutePath());
        Media media = new Media(videoFile.toURI().toURL().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);

        // Configurações para exibir o vídeo
        MediaView mediaView = new MediaView(mediaPlayer);

        Group root = new Group();
        root.getChildren().add(mediaView);
        root.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                
               
                if( mediaPlayer.getStatus() == Status.PAUSED){
                    mediaPlayer.play();
                }else {

                    mediaPlayer.pause();
                }
            }
            
        });
        primaryStage.setTitle("Playing Video");
        primaryStage.show();
        
        mediaPlayer.setOnReady(() -> {
          
            Scene scene = new Scene(root,media.getWidth(),media.getHeight());
            primaryStage.setScene(scene);
        });
   
       
        // Inicia a reprodução do vídeo
        mediaPlayer.play();
    }

}
