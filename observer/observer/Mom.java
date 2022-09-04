/*
 * Written by Zachary Ziehl
 */
package observer;
/*
 * This is the Mom class, which is an implementation of Observer
 */
public class Mom implements Observer{

    private Subject baby;

    public Mom(Subject baby)
    {
        this.baby = baby;
        baby.registerObserver(this);
    }
    /**
     * This is the update method for the mother. It searches for the tye of cry and responds to it. 
     * @param cry = the instance of Cry being taken into the method
     */
    @Override
    public void update(Cry cry) {

        if(cry.equals(Cry.ANGRY))
        {
            System.out.println( "Mom hugs " + ((Baby)baby).getName());
            ((Baby)baby).receiveLove();
            
        }
        if(cry.equals(Cry.HUNGRY))
        {
            System.out.println( "Mom feeds " + ((Baby)baby).getName());
            ((Baby)baby).eat();
            
        }
        if(cry.equals(Cry.WET))
        {
            System.out.println( "Mom changes " + ((Baby)baby).getName());
            ((Baby)baby).getChanged();
            
        }
        
       

        
    }

    
    
}
