import java.util.ArrayList;
public class RunBehavior extends MoveBehavior {
    MoveBehavior mb;
     /**
     * moves the robot at run speed
     * @param character shape of robot,  type of robot
     */
    public void move(ArrayList<String> character) {
        mb.move(character, 3);
    }
}
