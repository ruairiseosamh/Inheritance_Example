/**
 * Write a description of class Canary here.
 *
 * @author (Rory Ward)
 * @version (V0.1)
 */
public class Shark extends Fish     //is a child class of Fish
{
    

    /**
     * Constructor for objects of class Shark
     */
    public Shark(String name)
    {   
        // initialise instance variables 
        super();                        //inherits variables from parent class
        isDangerous = true;        
    }
    
    public void bite()          //descrbes how the shark bites
    {
        System.out.println("Mmmm tasty");
    }
    
    @Override                    //overriden method that was inherited from the parent class
    public String toString()
    {
       return "I have fins: " +hasFins ;
    }
    
    @Override                        //overriden method that was inherited from the parent class
    public boolean equals(java.lang.Object object)
    {
        if(this.isDangerous == Fish.isDangerous){       //checks if the passed in object is dangerous or not
            System.out.println("this.is Dangerous = "+ this.isDangerous);
            return isEquals = true;
        }
        else{
            System.out.println("this.isn't Dangerous = "+ this.isDangerous);
            return isEquals = false;
        }
    }
}
