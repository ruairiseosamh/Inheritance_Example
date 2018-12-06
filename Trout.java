/**
 * Write a description of class Canary here.
 *
 * @author (Rory Ward)
 * @version (V0.1)
 */
public class Trout extends Fish     //is a child class of Fish
{    
    boolean isEdible;

    /**
     * Constructor for objects of class Salmon
     */
    public Trout(String name)
    {   
        // initialise instance variables 
        super();                    //inherits variables from parent class
        color = "Brown";
        hasSpikes = false;
        isEdible = true;
    }
    
    @Override                        //overriden method that was inherited from the parent class
    public void move(int distance)
    {
        System.out.printf("I move %d meters upriver to lay eggs\n", distance);
    }
    
    @Override                        //overriden method that was inherited from the parent class
    public String toString()
    {
       return "I am dangerous " +isDangerous;
    }
    
    @Override                        //overriden method that was inherited from the parent class
    public boolean equals(java.lang.Object object)
    {
        if(this.hasSpikes == Fish.hasSpikes)    //checks if the passed in object has spikes or not
        {   
            System.out.println("this has spikes = "+ this.hasGills);
            return isEquals = true;
        }
        else{
            System.out.println("this hasn't spikes = "+ this.isDangerous);
            return isEquals = false;
        }
    }
}
