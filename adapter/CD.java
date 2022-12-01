package adapter;

import java.util.ArrayList;

public class CD implements DigitalAlbum{

    private ArrayList<String> songs;
    private int currentIndex;

    public CD(ArrayList<String> songs)
    {
        this.songs = songs;
        this.currentIndex = currentIndex;

    }
    public String playfromBeginning()
    {
        return " playing song 1 " + songs.get(0);
    }
    public String playSong(int num)
    {
        return " playing " + songs.get(currentIndex);
    }
    public String prevSong()
    {
        return "Skipping back and playing "  + songs.get(currentIndex);
    }
    public String nextSong()
    {
        return "playing " + (songs.size() + 1) + songs.get(currentIndex);
    }
    public String pause()
    {
        return "Pausing" ;
    }
    public String stop()
    {
        return "Stopping";
    }
    
    }
    

