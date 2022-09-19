package factory;

import java.util.ArrayList;
import java.util.Random;
/**
 * this is the Cereal class, it is the super of the other cereals. 
 */
public abstract class Cereal {
    protected String name;
    protected double price;
    private int random;
    Random rand = new Random();
    protected ArrayList<String> toys = new ArrayList<String>();
    /**
     * this constructor has a name and a price assigned to it, which is determined by the other classes and which ones are called
     * @param name is the name of the cereal
     * @param price is the price of the cereal
     */
    public Cereal(String name, double price)
    {
        this.name = name;
        this.price = price;
        
        
        
    }

    /**
     * This method is the preperation method. it returns the child prepare method of whatever class is being called. 
     * @return null, which is changed depending on the class. 
     */
    public String prepare()
    {
        return null;
    }
    /**
     * This method is to return the boxing of the cereal, which returns whatever cereal name is being called with the child, and also the toys along 
     * @return
     */
    public String boxCereal()
    {
        random = rand.nextInt(3);
        return String.format("Boxing the %s\n\t - Drawing fun pictures of %s on the box\n\t - Pouring the %s into the box\n\t - Adding the surprise %s\n", 
          name,name,name,toys.get(random));
        
    }
    public String priceCereal()
    {
        return String.format("putting the price tag of $%.2f on the %s box",price, name);
    }
}
