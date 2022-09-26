package iterator;

public class Assignment {
    private String title;
    private String description;
    private Topic topic;
/**
 * constructor
 * @param title the title of the Assignment 
 * @param description the description of the Assignment 
 * @param topic the topic of the assignment 
 */
    public Assignment(String title, String description, Topic topic)
    {
        super();
        this.title = title;
        this.description = description;
        this.topic = topic;
    }
    /**
     * this method checks whether the topic enum has a topic
     * @param topic runs in the enum topic 
     * @return boolean as to whether or not it is a valid topic
     */
    public boolean hasTopic(Topic topic)
    {
       if(topic == Topic.ALL || topic == Topic.DESIGN_PATTERN || topic == Topic.GIT || topic == Topic.PROJECT)
       {
            return true;
       }
       else
       {
        return false;
       }

    }
    /**
     * this method returns the string of the entire iteration. 
     */
    public String toString()
    {
        String str ="*****" + title + "*****"+"\n" + description + "\n" + topic + "\n";
        return str;
    }
    
}
