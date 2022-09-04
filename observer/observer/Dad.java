/**
 * Written by Zachary Ziehl
 */
package observer;
import java.util.Random;
/**
 * This is the Dad class, which is an implementation of Observer.
 */
public class Dad implements Observer {

    private Subject baby;
    private int random;
    public Dad(Subject baby)
    {
        Random rand = new Random();
        this.baby = baby;
        baby.registerObserver(this);
        random = rand.nextInt(2);
    }
    /**
     * The update function takes in an instance of Cry and randomly prints one of 3 responses
     * @param cry = an instance of Cry
     */
    @Override
    public void update(Cry cry) {
        
        if(random == 2)
        {
            System.out.println("Dad puts a pillow over his head");
        }
        if(random == 1)
        {
            System.out.println("Dad nudges Mom");
        }
        if(random == 0)
        {
            System.out.println("Dad screams ... aaaaa");
        }
        
        
        
    }
    
    
}
