package singleton;

import java.util.ArrayList;
import java.util.Random;
/**
 * this is the outfitCreator class. it creates a private outfit creator and gets an instance of it
 */
public class OutfitCreator {
    private ArrayList<ClothingItem> tops;
    private ArrayList<ClothingItem> bottoms;
    private ArrayList<ClothingItem> wholes;
    private Random rand = new Random();
    private static OutfitCreator outfitCreator;
    /**
     * the private contsructor
     */
    private  OutfitCreator() {}
    /**
     * this is the method to get an instance of the class
     * @return returns an outfitCreator
     */
    public static OutfitCreator getInstance()
    { 
        if(outfitCreator == null)
        {
            System.out.println("making an OutFit Creator");
            outfitCreator = new OutfitCreator();   
        }
    return outfitCreator;
    }
    /**
     * this class takes in a seasons and rreturns the random appropriate attire for said season
     * @param season the season being taken in
     * @return the string of the outfit
     */
    public String getOutfit(Season season)
    {
       
        int num = rand.nextInt(3);
        if(num==1)
        {
            if(FileReader.getClothing("singleton\txt\tops.txt", ClothingPart.TOP).contains(season))
             {
                  return  FileReader.getClothing("singleton\txt\tops.txt", ClothingPart.TOP).toString();
             }
              else
             {
               return "v-neck shirt : orange : fall, winter" + "sweat pants: purple: fall, winter";
             }
        }
        else if(num==2)
        {
            if(FileReader.getClothing("singleton\txt\bottoms.txt", ClothingPart.BOTTOM).contains(season))
             {
                  return  FileReader.getClothing("singleton\txt\bottoms.txt", ClothingPart.BOTTOM).toString();
             }
              else
             {
               return "pencil-skirt: navy blue: fall, winter" ;
             }
        }
        else if(num==3)
        {
            if(FileReader.getClothing("singleton\txt\tops.txt", ClothingPart.WHOLE).contains(season))
             {
                  return  FileReader.getClothing("singleton\txt\tops.txt", ClothingPart.WHOLE).toString();
             }
              else
             {
               return "sun dress: yellow: spring, summer";
             }
        }
        else
        {
            return "sun dress: yellow: spring, summer";
        }
            
          
        
    }
    
}
