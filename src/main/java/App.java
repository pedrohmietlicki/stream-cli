
import services.Loader;
import services.Player;
public class App {

    public static void main(String[] args) throws Exception {
            if(args.length < 1){
                System.out.println("Você deve passar o caminho para uma musica");
                return;
            }
            Loader loader = new Loader(args[0]);
            Player player =  new Player(loader.load());
            player.play(loader.isAudio());
       
          
    }
}