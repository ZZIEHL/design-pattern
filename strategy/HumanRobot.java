import java.util.ArrayList;
import java.util.ArrayList;
public class HumanRobot extends Robot {
    /**
     * Creates an instance of a HumanRobot
     * @param name name of the HumanRobot
     */
    public HumanRobot(String name){
        super(name); 
    }
    /**
     * returns the shape of the HumanRobot
     */
    public String toString() {
        ArrayList<String> character = new ArrayList<String>();
        character.add("o\n|\n___\n/\\n");
        return character.toString() + this.name;  
    }
}
