
/**
 * Write a description of class Canary here.
 *
 * @author (Rory Ward)
 * @version (V0.1)
 */
public abstract class Animal                 //parent class
{
    // instance variables 
    boolean breathes;                               //variables that describe attributes of animals
    boolean hasSkin;
    static String color;
    String name;
    boolean isEquals;
    
    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        breathes = true;                //sets values of variables
        color = "Grey";
        hasSkin = true;
    }
    
    public String getColour()
    {
        return color;                   //accesor method
    }
    
    public void move(int distance)      //describes movement of animals
    {
        System.out.printf("I move %d meters \n", distance);
    }
    
    public void eat()                   //describes how animals eat
    {
        System.out.println("I love to eat");
    }
    
    public String getName()             //accesor method for name
    {
        return name;
    }
        
}
