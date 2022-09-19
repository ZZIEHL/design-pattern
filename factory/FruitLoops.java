package factory;
/**
 * This is the FruitLoops class. It creates an instance of FruitLoops
 */
public class FruitLoops extends Cereal {

    private FruitLoops fruit;
    /**
     *This Constructor sets the name and price, as well as adding the toys to the toy arraylist
     */
    public FruitLoops() {
        super("Fruit Loops", 1.89);
        toys.add("Paw Patrol Stickers");
        toys.add("Bat Man ring");
        toys.add("Silly Putty");
        toys.add("Tiny Car");

        
    }

    /**
     * This method returns a string giving the preperation specific to Fruit Loops and also integrates the name of the Cereal(Fruit Loops) in.
     */
    public String prepare()
    {
        return String.format("Preparing the %s\n\t - Gether the grain\n\t - Shape into circles\n\t-Randomly color circles\n\t - Let Circles Dry In \n", 
          super.name);
    }
    
}
