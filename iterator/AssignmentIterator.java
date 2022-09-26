package iterator;
import java.util.Iterator;

public class AssignmentIterator implements java.util.Iterator {
    private Assignment[] assignments;
    private int position;
/**
 * constructor
 * @param assignments the Assignments ArrayList
 */
    public AssignmentIterator(Assignment[] assignments)
    {
        this.assignments = assignments;
        this.position=0;
    }
    public AssignmentIterator(String title, String description, Topic topic) {
}
    /**
     * This method checks whether the assignments arraylsit has more positions filled
     * @return boolean to say whether or not the list has next
     */
    public boolean hasNext()
    {
        if(position<assignments.length&&assignments[position]!=null)
            return true;

        return false;
    }
    /**
     * this method goes to the next position in the list
     * @return the assignment at the position specified
     */
    public Assignment next()
    {
        if(this.hasNext())
            return assignments[position++];
        return null;
    }
    
}
