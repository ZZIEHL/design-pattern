package factory;

import javax.lang.model.util.ElementScanner14;
/**
 * This is the GroceryStore class, it is responsible for the checking out of the cereal
 */
public class GroceryStore {

    public GroceryStore() {}
    /**
     * this method creates the cereal based on the type entered
     * @param type is the type of cereal taken in string format. this determines which class to call
     * @return this returns the class of cereal once the type is determined
     */
    public Cereal createCereal(String type){
        if(type.equalsIgnoreCase("frosted flakes"))
        {
            return new FrostedFlakes();
        }
        else if(type.equalsIgnoreCase("fruit loops"))
        {
            return new FruitLoops();
        }
        else if(type.equalsIgnoreCase("lucky charms"))
        {
            return new LuckyCharms();
        }
        else
        {
            return null;
        }
        
    }
    
}
