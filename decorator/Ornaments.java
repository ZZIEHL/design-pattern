package decorator;

import java.util.ArrayList;
/**
 * This is the Ornaments class, which accesses the txt file with the ornaments, and passes it into the IntegrateDecor method
 */
public class Ornaments extends TreeDecorator {
    
    private Tree tree;
    public Ornaments(Tree tree)
    {
        super(tree.lines);
        this.tree = tree;
        integrateDecor(FileReader.getLines("decorator/txt/ornaments.txt"));
    }
}
