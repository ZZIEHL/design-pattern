package decorator;
/**
 * This is the ChristmasTree class, which gets the default tree from the txt file, reads it in, and passes it to the Tree class to be printed with the toString
 */
public class ChristmasTree extends Tree {
    public ChristmasTree(){
        super(FileReader.getLines("decorator/txt/tree.txt"));

    }
    
}
