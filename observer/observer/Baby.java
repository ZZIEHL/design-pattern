/*
 * Written by Zachary Ziehl
 */
package observer;
import java.util.ArrayList;
import java.util.Random;
/*
 * This is the Baby class, which is in implementation of Subject. 
 */
public class Baby  implements Subject{

    private String name;
    private ArrayList<Observer> observers;
    private Subject subject;
    private int random;
    public Baby(String name)
    {
        Random rand = new Random();
        observers = new ArrayList<Observer>();
        random = rand.nextInt(1);
        this.name = name;

    }
    /**
     * This method gets the name of the baby
     * @return the name of the baby
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * This method randomly prints out if the baby continues to be upset or if it is loved 
     */
    public void receiveLove()
    {
        if(random == 0)
        { 
            System.out.println(name + "feels loved and appreciated");
        }
        if(random == 1)
        { 
            System.out.println(name + "pushes everyone away and continues to cry");
        }
    }
    /**
     * This method randomly prints out if the baby throws his food or is full 
     */
    public void eat()
    {
        if(random == 0)
        { 
            System.out.println(name + "has a happy full tummy");
        }
        if(random == 1)
        { 
            System.out.println(name + "throws all his food on the floor");
        }
    }
    /**
     * This method prints out that the baby is being changed
     */
    public void getChanged()
    {
        System.out.println(name + "is having a diaper change");
    }
    /**
     * This method adds an observer to the baby
     * @param observer = an instance of observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        
    }
    /**
     * This method removes an observer
     * @param observer = an instance of observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        
    }
    /**
     * This method notifies the observer(s)
     * @param observer = an instance of observer
     */
    @Override
    public void notifyObservers(Cry cry) {
        for(Observer observer : observers)
        {
            observer.update(cry);
        }
        
    }
    /**
     * This method sets the cry type to angry and prints out the specified string. also notifies the observers
     */
    public void angryCry()
    {
        
        System.out.println("Waaaaaaaaaaa! " + name + " is feeling abandoned and angry.");
        notifyObservers(Cry.ANGRY);
    }
    /**
     * This method sets the cry type to hungry and prints out the specified string. also notifies the observers
     */
    public void hungryCry()
    {
        System.out.println("Neh Neh Neh! " + name + " is starving!!!!");
        notifyObservers(Cry.HUNGRY);
    }
    /**
     * This method sets the cry type to wet and prints out the specified string. also notifies the observers
     */
    public void wetCry()
    {
        System.out.println("Aaaaaaaa! " + name + " is WET!");
        notifyObservers(Cry.WET);
    }
    
}
