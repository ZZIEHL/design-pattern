package factory;
/**
 * This is the LuckyCharms class. It creates an instance of LuckyCharms
 */
public class LuckyCharms extends Cereal {
    /**
     *This Constructor sets the name and price, as well as adding the toys to the toy arraylist
     */
    public LuckyCharms() {
        super("Lucky Charms", 1.55);
        toys.add("My Little Pony Stickers");
        toys.add("Elsa ring");
        toys.add("Play doe");
        toys.add("Tiny truck");

        
    }
    /**
     * This method returns a string giving the preperation specific to Lucky Charms and also integrates the name of the Cereal(Lucky Chamrs) in.
     */
    public String prepare()
    {
        return String.format("Preparing the %s\n\t - Gather the grain\n\t -Shape into Xs and Ds\n\t-Create marshmallow shapes\n\t - Mix Grain and Marshmallows in\n", 
          super.name);
    }
    
}
