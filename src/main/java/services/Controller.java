package services;

import java.util.Scanner;

import models.Streamable;

public class Controller {
    public Controller(Streamable stream){
    System.out.println("Comandos disponíveis: play, pause, stop, exit");
        Scanner scanner = new Scanner(System.in);
        while (stream.isPlaying()) {
            String command = scanner.nextLine();
            switch (command) {
                case "play":
                    stream.play();
                    break;
                case "pause":
                    stream.pause();
                    break;
                case "stop":
                    stream.stop();
                    break;
               
                default:
                    System.out.println("Comando inválido.");
            }
        }
        scanner.close();
    }
}
