import java.util.ArrayList;
public class CrawlBehavior extends MoveBehavior{
    MoveBehavior mb;
    /**
     * moves the robot at crawl speed
     * @param character shape of robot,  type of robot
     */
    public void move(ArrayList<String> character) {
        mb.move(character, 1);
    }
    
}
