/**
 * Written by Zachary Ziehl
 */
package observer;

/**
 * This is the Subject interface
 */
public interface Subject {
    /**
     * this is the registerObserver method it registers an observer to the Subject
     * @param observer = an instance of observer
     */
public void registerObserver(Observer observer);
    /**
     * this is the removeObserver method it removes an observer to the Subject
     * @param observer = an instance of observer
     */
public void removeObserver(Observer observer);
/**
     * this is the notifyObservers method it notifies the observers of the Subject
     * @param observer = an instance of observer
     */
public void notifyObservers(Cry cry);
    
}
