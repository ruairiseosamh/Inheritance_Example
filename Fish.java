/**
 * Write a description of class Canary here.
 *
 * @author (Rory Ward)
 * @version (V0.1)
 */
public class Fish extends Animal        //is a child class of Animal
{
    static boolean hasFins;         //declares variables
    static boolean hasGills;
    static boolean hasSpikes;
    static boolean isDangerous;

    /**
     * Constructor for objects of class Fish
     */
    public Fish()
    {   
        // initialise instance variables 
        super();                            //inherits variables from parent class
        hasFins = true;
        hasGills = true;
        hasSpikes = false;
        isDangerous = false;
    }
    
    @Override                //overriden method that was inherited from the parent class
    public void move(int distance)
    {
        System.out.printf("I swim %d meters \n", distance);
    }
    
}
