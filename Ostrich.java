/**
 * Write a description of class Canary here.
 *
 * @author (Rory Ward)
 * @version (V0.1)
 */
public class Ostrich extends Birds          //is a child class of Birds
{
    boolean hasLongThinLegs;                //declares variables
    boolean isTall; 
    boolean flies;
    
    /**
     * Constructor for objects of class Ostich
     */
    public Ostrich(String name)
    {   
        // initialise instance variables 
        super();                            //inherits variables from parent class
        flies = false;
        System.out.println("I'm a bird but cannnot fly");   //simplest way of getting ostrich to print out message
    }
    
    @Override                   //overriden method that was inherited from the parent class
    public String toString()
    {
       return "I have wings: " +hasWings;
    }
    
    @Override                                    //overriden method that was inherited from the parent class
    public boolean equals(java.lang.Object object)
    {
        if(this.hasWings == Birds.hasWings){        //checks if the passed in object has wings or not
            System.out.println("they have wings "+ this.hasWings);
            return isEquals = true;
        }
        else{
            System.out.println("they haven't wings "+ this.hasWings);
            return isEquals = false;
        }
    }
}