package decorator;

import java.util.ArrayList;

public class Star extends TreeDecorator {
    private Tree tree;
    public Star(Tree tree)
    {
        super(tree.lines);
        this.tree = tree;
        integrateDecor(FileReader.getLines("decorator/txt/star.txt"));
        
    }
    
}
