package decorator;

import java.util.ArrayList;
/**
 * Thisis the TreeDecorator class, which is meant to integrate the decor from Lights, Ornaments, and Star, and apply them to the existing tree
 */
public abstract class TreeDecorator extends Tree {

    public TreeDecorator(ArrayList<String> lines) {
        super((FileReader.getLines("decorator/txt/Tree.txt")));
        this.lines = lines;
        
    }
    /**
     * THis method integrates the decor onto the Christmas tree
     * @param decor is the type of decor being integrated
     */
    protected void integrateDecor(ArrayList<String> decor)
    {
        String tree = "";
        for(String str : decor)
        {
            for(int j=0; j<decor.size(); j++)
            {
                if(decor.get(j) != "")
                {
                    tree = lines.get(j) + decor.get(j);
                    System.out.println(tree);
                }
                else
                {
                    System.out.print(decor.get(j));
                }
            }
            
        }
        
    }
    
}
