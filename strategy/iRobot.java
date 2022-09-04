import java.util.ArrayList;
import java.util.ArrayList;
public class iRobot extends Robot{
    /**
     * Creates an instance of a iRobot
     * @param name name of the iRobot
     */
    public iRobot(String name){
        super(name);   
    }
    /**
     * returns the shape of the iRobot
     */
    public String toString() {

        ArrayList<String> character = new ArrayList<String>();
        character.add("__\n |\n_|_");
        return character.toString() + this.name;  
      }
}
