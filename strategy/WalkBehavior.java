import java.util.ArrayList;
public class WalkBehavior extends MoveBehavior{
    MoveBehavior mb;
     /**
     * moves the robot at walk speed
     * @param character shape of robot,  type of robot
     */
    public void move(ArrayList<String> character) {
        mb.move(character, 2);
    }
}
