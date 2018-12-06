
/**
 * Write a description of class Canary here.
 *
 * @author (Rory Ward)
 * @version (V0.1)
 */
public class Canary extends Birds       //is a child class of Birds
{
   
    /**
     * Constructor for objects of class Canary
     */
    public Canary(String name)
    {
        // initialise instance variables
        super();    //inherits variables from parent class
        color = "Yellow";
        //Animal animal = new Animal();
        this.name = name;
    }
    
    @Override                             //overriden method that was inherited from the parent class
    public String toString()
    {
       return ("my name is " +name);
    }
    
    @Override                            //overriden method that was inherited from the parent class
    public boolean equals(java.lang.Object object)
    {
        if(this.color == Animal.color){     //checks if the passed in object is the same colour or not
            System.out.println("they have the same colour: "+ this.color);
            return isEquals = true;
        }
        else{
            System.out.println("they haven't the same colour: "+ this.color);
            return isEquals = false;
        }
    }
}
