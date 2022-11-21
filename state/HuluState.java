package state;

public class HuluState implements State{

    private TV tv;
    private String[] movies;
    private String[] tvShows;

    
     
    

    /**
     * the construcctor for hulu state
     * @param tv the tv system
     */
    public void HuluState(TV tv)
    {
        movies = new String[]{"Cars", "Cinderella", "Wall-E", "ET"};
        tvShows = new String[]{"Sesame Street", "Care Bears", "Looney Tunes"};
        this.tv = tv;
        
        
    

    }
     /**
     * this is the method for pressing Home button while in Hulu
     * @return the string for home button
     */
    public String pressHomeButton()
    {
        return "Display Home Screen";
        tv.setState(tv.getHomeState());

    }
     /**
     * this is the method for pressing netflix button while in Hulu
     * @return the string for netflix button
     */
    public String pressNetlixButton()
    {
        return "Starting Netflix";
        tv.setState(tv.getNetflixState());
        
    }
     /**
     * this is the method for pressing hulu button while in Hulu
     * @return the string for hulu button
     */
    public String pressHuluButton()
    {
        return "Already Viewing Hulu";
        tv.setState(tv.getHuluState());
        
    }
     /**
     * this is the method for pressing Movie button while in Hulu
     * @return the string for Movie button
     */
    public String pressMovieButton()
    {
        return "you have the following movies";
        for(int i = 0; i<movies.length; i++)
        {
            System.out.println(movies[i]);
        }
        
    }
     /**
     * this is the method for pressing TV button while in Hulu
     * @return the string for TV button
     */
    public String pressTVButton()
    {
        return "you have the following TV shows";
        for(int i = 0; i<tvShows.length; i++)
        {
            System.out.println(tvShows[i]);
        }
        
    }
    @Override
    public String pressNetflixButton() {
        // TODO Auto-generated method stub
        return null;
    }
    
    
}
 

