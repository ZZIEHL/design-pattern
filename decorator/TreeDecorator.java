package decorator;

import java.util.ArrayList;

public abstract class TreeDecorator extends Tree {

    public TreeDecorator(ArrayList<String> lines) {
        super(lines);
        
    }
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
