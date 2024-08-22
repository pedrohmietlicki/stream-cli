package models;

public abstract class Streamable {
    private String name;
    private String path;

    public Streamable(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public void pause() {

    }

    public void stop() {

    }

    public boolean isPlaying() {
        return true;
    }

    public void play() {
    }
}
