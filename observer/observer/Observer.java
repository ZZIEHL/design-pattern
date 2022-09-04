/**
 * Written by Zachary Ziehl
 */
package observer;
/**
 * this is the observer interface
 */
public interface Observer {

    /**
     * This method takes in an instance of Cry and updates teh observers, mom and dad
     * @param cry is the instance of Cry being taken in
     */
    public void update(Cry cry); //figure out how to put Cry cry in and if you have to change anything to return void
    
}
