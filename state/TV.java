package state;

public class TV {

    private State homeState;
    private State netflixState;
    private State huluState;
    private State state;

    /**
     * the constructor for the tv system
     */
    public TV()
    {
        homeState = new HomeState();
        netflixState = new NetflixState();
        huluState = new HuluState();
        System.out.println("Starting up tv");
        state = homeState;
    }

    /**
     * the method for pressing the home button
     * @return the string for the home button
     */
    public String pressHomeButton()
    {
        state.pressHomeButton();
        System.out.println();
        return "Home button being pressed";

    }
    /**
     * the method for the netflix button
     * @return the string for pressing the netflix button
     */
    public String pressNetflixButton()
    {
        state.pressNetflixButton();
        System.out.println();
        return "Netflix button being pressed";

    }
    /**
     * the method for the movie button
     * @return the string for the movie button
     */
    public String pressMovieButton()
    {
        state.pressMovieButton();
        System.out.println();
        return "Movie button being pressed";

    }
    /**
     * the method for pressing the tv button
     * @return the tv button string
     */
    public String pressTVButton()
    {
        state.pressTVButton();
        System.out.println();
        return "TV button being pressed";
        
    }
    /**
     * the string for pressing the hulu button
     * @return the hulu string
     */
    public String pressHuluButton()
    {
        state.pressHuluButton();
        System.out.println();
        return "Hulu button being pressed";
        
    }
    /**
     * changes the state as it needs to be changed
     * @param state the state being changed to
     */
    public void setState(State state)
    {
        this.state = state;
        
    
        
    }
    /**
     * gets the home state of the TV
     * @return the home state
     */
    public State getHomeState()
    {
        return this.homeState;
        
    }
    /**
     * gets the Hulu State of the tv
     * @return the hulu state
     */
    public State getHuluState()
    {
        return this.huluState;
        
    }
    /**
     * gets the Netflix state of the tv
     * @return the netflix state
     */
    public State getNetflixState()
    {
        return this.netflixState;
        
    }


    
}
