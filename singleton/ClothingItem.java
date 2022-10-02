package singleton;


import java.util.ArrayList;
/**
 * This is the ClothingItem method. It has the name, part, and color of the clothing Item.
 */
public class ClothingItem {
    private String name;
    private ClothingPart part;
    private String color;
    private ArrayList<Season> seasons = new ArrayList<Season>();
    /**
     * constructor
     * @param name name of the item
     * @param part what kind of part it is
     * @param color color of the item
     */
    public ClothingItem(String name, ClothingPart part, String color)
    {
        super();
        this.name = name;
        this.part = part;
        this.color = color;
    }
    /**
     * THis method checks if the program has a season specified. 
     * @param season the season being taken in
     * @return the boolean being returned
     */
    public boolean hasSeason(Season season)
    {
        if(FileReader.getClothing("singleton\txt\tops.txt", ClothingPart.TOP ).contains(season))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    /**
     * this method adds the season to the Season Array
     * @param season the season being passed in
     */
    public void addSeason(Season season)
    {
        seasons.add(season);
    }
    /**
     * this class prints out the informaition for clothing and seasons
     */
    public String toString()
    {
        String seasonsData = seasons.size()>0?("Seasons:" + seasons):"";
        return "Clothing Item" + name + ":" + part + "" + color + "\n" + seasonsData;
    }
    
}
