package factory;
/**
 * This is the FrostedFlakes class. It creates an instance of FrostedFlakes
 */
public class FrostedFlakes extends Cereal {

    /**
     *This Constructor sets the name and price, as well as adding the toys to the toy arraylist
     */
    public FrostedFlakes() {
        super("frosted flakes", 2.99);
        toys.add("Spider man Tattoo");
        toys.add("Barbie Tattoo");
        toys.add("Snap Bracelet");
        toys.add("Happy Feet Figurine");

        
    }
    
    /**
     * This method returns a string giving the preperation specific to Frosted Flakes and also integrates the name of the Cereal(Frosted Flakes) in.
     */
    public String prepare()
    {
        return String.format("Preparing the %s\n\t - Gether the grain\n\t - Shape into flakes\n\t - Sprinkle with frosting \n", 
          super.name);
    }
    
}
