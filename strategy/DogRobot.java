import java.util.ArrayList;

public class DogRobot extends Robot {
    /**
     * Creates an instance of a DogRobot
     * @param name name of the DogRobot
     */
    public DogRobot(String name){
        super(name);
    }
    /**
     * returns the shape of the DogRobot
     */
    public String toString() {
        ArrayList<String> character = new ArrayList<String>();
        character.add("++o");
        return character.toString() + this.name;  
    }
}
