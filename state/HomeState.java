package state;

public class HomeState implements State {
    private TV tv;
   

    
     
    

    /**
     * the constructor for the home state
     * @param tv the tv systemj
     */
    public void HomeState(TV tv)
    {
       
        this.tv = tv;
        
        
    

    }
    /**
     * this is the method for pressing Home button while in Home
     * @return the string for home button
     */
    public String pressHomeButton()
    {
        return "Display Home Screen";
        tv.setState(tv.getHomeState());

    }
    /**
     * this is the method for pressing Netflix button while in Home
     * @return the string for Netflix button
     */
    public String pressNetlixButton()
    {
        return "Already viewing Netflix";
        tv.setState(tv.getNetflixState());
        
    }
    /**
     * this is the method for pressing Hulu button while in Home
     * @return the string for Hulu button
     */
    public String pressHuluButton()
    {
        return "Starting Hulu";
        tv.setState(tv.getHuluState());
        
    }
    /**
     * this is the method for pressing movie button while in Home
     * @return the string for movie button
     */
    public String pressMovieButton()
    {
        return "you have to pick a movie system";
        
        
    }
    /**
     * this is the method for pressing tv button while in Home
     * @return the string for tv button
     */
    public String pressTVButton()
    {
        return "you have to pick a tv system";
        
        
    }
    @Override
    public String pressNetflixButton() {
        // TODO Auto-generated method stub
        return null;
    }
  
    
}


