import java.util.ArrayList;
public abstract class Robot {

    protected String name;
    protected ArrayList<String> character = new ArrayList<String>();
    protected MoveBehavior mb;
    /**
     * Creates an instance of a Robot
     */
    public Robot(String name){
        this.name = name;
    }
    /**
     * Sets the robot move behavior
     * @param moveBehavior the type of movement the robot uses
     */
    public void setMoveBehavior(MoveBehavior moveBehavior) {
        mb = moveBehavior;
    }
    /**
     * Moves the robot, calls the move methoid from MoveBehavior
     */
    public void move() {
        mb.move(character);
    }
    /**
     * Returns the figure of the robot, depending on what type of robot it is. 
     */
    public String toString() {
       return this.character.toString();
    }
    /**
     * Retrieves the name of the robot. 
     */
    public String getName() {
        return this.name;
    }

    
}
