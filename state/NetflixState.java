package state;

public class NetflixState implements State{

    private TV tv;
    private String[] movies;
    private String[] tvShows;

    
     
    

    /**
     * the constructor for the netflix State
     * @param tv the tv system
     */
    public void NetflixState(TV tv)
    {
        movies = new String[]{"The Land Before Time", "Frozen", "The Little Mermaid", "Ice Age"};
        tvShows = new String[]{"Peppa Pig", "My Little Pony", "Garfield", "Teenage Mutant Ninja Turtles"};
        this.tv = tv;
        
        
    

    }
    /**
     * this is the method in Netflix State that is foir pressing the home button while in netflix
     */
    public String pressHomeButton()
    {
        return "Display Home Screen";
        tv.setState(tv.getHomeState());

    }
    /**
     * this is the method for pressing netflix button while in netflix
     * @return the string for netflix button
     */
    public String pressNetlixButton()
    {
        return "Already viewing Netflix";
        tv.setState(tv.getNetflixState());
        
    }
     /**
     * this is the method for pressing Hulu button while in netflix
     * @return the string for Hulu button
     */
    public String pressHuluButton()
    {
        return "Starting Hulu";
        tv.setState(tv.getHuluState());
        
    }
     /**
     * this is the method for pressing Movie button while in netflix
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
     * this is the method for pressing TV button while in netflix
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
