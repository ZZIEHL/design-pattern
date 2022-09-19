package decorator;

import java.util.ArrayList;
/**
 * This is the Tree class, which provides the base tree for the Driver. 
 */
public abstract class Tree {
    protected ArrayList<String> lines;
    public Tree(ArrayList<String> lines)
    {
        for(int i=0; i<lines.size(); i++)
        {
            this.lines = lines;
        }
    }
    /**
     * This is the toString method, it prints ou the lines in the Arraylist for the default and modified trees
     * @returns tree which is the String that is printed in the driver for this project
     */
    public String toString()
    {  
        String tree = "";
        for(String str : lines)
        {
            System.out.println(str);
        }
        return tree;
        
        
        
    }
    
}
