package decorator;

import java.util.ArrayList;

public class Ornaments extends TreeDecorator {
    
    private Tree tree;
    public Ornaments(Tree tree)
    {
        super(tree.lines);
        this.tree = tree;
        integrateDecor(FileReader.getLines("decorator/txt/ornaments.txt"));
    }
}
