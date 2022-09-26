package iterator;

import java.util.Arrays;

public class Course {
    private Assignment[] assignments = new Assignment[5];
    private int count;
    private String name;
    private String title;
/**
 * constructor
 * @param name the name of the course
 * @param title the title of the course
 */
    public Course(String name, String title)
    {
        super();
        this.name = name;
        this.title = title;
        
    }

    /**
     * THis method adds an assignment to the assignments list. 
     * @param title the title of the specified assignment
     * @param description the description of the specified assignment 
     * @param topic the topic of the specified assignment 
     */
    public void addAssignment(String title, String description, Topic topic)
    {
        boolean added=false;
        for(int i=0; i< assignments.length; i++)
        {
            if(assignments[i]==null)
            {
                assignments[i]=new Assignment(title, description, topic);
                added = true;
                break;
            }
        }
        if(added == false)
        {
            this.assignments = this.growArray(assignments);
            this.addAssignment(title, description, topic);

        }

    }
    /**
     * this method creates the iterator
     * @return a new AssignmentIterator with assignments in it
     */
    public AssignmentIterator createIterator()
    {
        return new AssignmentIterator(this.assignments);
    }
    /**
     * this method returns the string value
     */
    public String toString()
    {
        return this.name;
    }
    /**
     * this method grows the assignments array
     * @param first the first value in the assignments array
     * @return the copy of the array x 2
     */
    private Assignment[] growArray(Assignment[] first)
    {
        return Arrays.copyOf(first, first.length*2);
    }
    
}
