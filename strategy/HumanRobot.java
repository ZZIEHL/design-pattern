import java.util.ArrayList;
import java.util.ArrayList;
/**
 * represents a human robot 
 */
public class HumanRobot extends Robot {
    /**
     * Creates an instance of a HumanRobot
     * @param name name of the HumanRobot
     */
    public HumanRobot(String name){
        super(name); 
    }
    /**
     * -------WRONG returns the shape of the HumanRobot
     * returns a string representation of the robot
     * @return the name and type of the robot
     */
    public String toString() {
        ArrayList<String> character = new ArrayList<String>();
        character.add("o\n_|_\n /\\");
        return character.toString() + this.name;  
    }
}
/**
 * description
 * @param name description of param
 * @return description of whats being returned
 */
