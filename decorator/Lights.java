package decorator;

import java.util.ArrayList;
/**
 * This is the Lights class, which accesses the txt file with the lights, and passes it into the IntegrateDecor method
 */
public class Lights extends TreeDecorator{
    private Tree tree;
    public Lights(Tree tree)
    {
        super(tree.lines);
        this.tree = tree;
        integrateDecor(FileReader.getLines("decorator/txt/lights.txt"));
        
        
        
    }
}
