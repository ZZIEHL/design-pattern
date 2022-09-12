package decorator;

import java.util.ArrayList;

public abstract class Tree {
    protected ArrayList<String> lines;
    public Tree(ArrayList<String> lines)
    {
        for(int i=0; i<lines.size(); i++)
        {
            this.lines = lines;
        }
    }
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
