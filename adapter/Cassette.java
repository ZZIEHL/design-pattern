package adapter;

import java.util.ArrayList;

public class Cassette implements AnalogAlbum{

    private ArrayList<String> songs;
    private int currentIndex;

    public Cassette(ArrayList<String> songs)
    {
        this.songs = songs;
        this.currentIndex = currentIndex;

    }
    public String play()
    {
        return "Playing song " + songs.size() + songs.get(currentIndex);
    }
    public String rewind()
    {
        return "rewinding to song " + songs.size();
    }
    public String ffwd()
    {
        return "Forward to song " + songs.size();
    }
    public String pause()
    {
        return "Pausing...";
    }
    public String stopEject()
    {
        return " Stopping Cassette and ejecting ";
    }
    
    
}
