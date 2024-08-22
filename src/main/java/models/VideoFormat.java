package models;
import java.util.Set;
import java.util.HashSet;
import interfaces.FormatInterface;

public class VideoFormat implements FormatInterface{
    public static final Set<String> validFormats = loadFormats();

    private static Set<String> loadFormats (){
        Set<String> validFormats = new HashSet<String>();
        validFormats.add("mp4");
        validFormats.add("webm");
        return validFormats;
    }

    public static boolean isValidFormat(String format) {
        return validFormats.contains(format);
    }
}
