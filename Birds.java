
/**
 * Write a description of class Canary here.
 *
 * @author (Rory Ward)
 * @version (V0.1)
 */
public abstract class Birds extends Animal       //is a child class of Animal
{
    // instance variables
    static boolean hasFeathers;
    static boolean hasWings;
    /**
     * Constructor for objects of class Birds
     */
    public Birds()          
    {   
        // initialise instance variables 
        super();       //inherits variables from parent class
        hasFeathers = true;
        hasWings = true;
    }
    @Override       //overriden function inherited from parent class
    public abstract void move(int distance);
    {
        System.out.printf("I fly %d meters \n");
    }
    public boolean hasWings()       //accesor method for wings
    {
        return hasWings;
    }
    public boolean hasFeathers()        // accesor method for feathers
    {
        return hasFeathers;
    }
    
}
