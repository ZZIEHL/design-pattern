package decorator;

import java.util.ArrayList;
/**
 * This is the star class, which accesses the txt file with the star, and passes it into the IntegrateDecor method
 */
public class Star extends TreeDecorator {
    private Tree tree;
    public Star(Tree tree)
    {
        super(tree.lines);
        this.tree = tree;
        integrateDecor(FileReader.getLines("decorator/txt/star.txt"));
        
    }
    
}
