package adapter;

import java.util.ArrayList;

public class AnalogAdapter implements AnalogAlbum{

    private DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album)
    {
        String songInfo = album.toString();
        this.album = album;

    }
    public String play()
    {
        return "Playing song " + album.playSong(0);
    }
    public String rewind()
    {
        return "rewinding to song " + album.playfromBeginning();
    }
    public String ffwd()
    {
        return "Forward to song " + album.nextSong();
    }
    public String pause()
    {
       return album.pause();
    }
    public String stopEject()
    {
        return album.stop();
    }
    
}
