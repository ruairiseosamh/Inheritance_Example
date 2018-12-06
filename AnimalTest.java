/**
 * Write a description of class Canary here.
 *
 * @author (Rory Ward)
 * @version (V0.1)
 */
    public class AnimalTest             //testing class
{
    Animal[] animal = new Animal[4];    //creates new animal array of size 4

    /**
     * Constructor for objects of class Arrays
     */
    public AnimalTest()
    {   
        System.out.println("Scenario1 \n");                 //calls the various methods
        toStringTest();
        System.out.println("*********************** \n");
        System.out.println("Scenario2 \n");
        equalsTest();      
    }
    
    public void toStringTest()
    {
        animal[0] = new Canary ("Bluey");       //creating instances of animals
        animal[1] = new Ostrich ("Ozzy");
        animal[2] = new Shark ("Bitey");
        animal[3] = new Trout ("Dinner");
        for(Animal a: animal)
        {
          System.out.println(a);                //runs through animal array and prints out name
        }
    }
    
    public void equalsTest()
    {
     for(int j=0;j<4;j++)                       //checks all instances against all classes of the various instances
     {
        for(int i=0;i<4;i++)
        {
            animal[i].equals(animal[j]);
            animal[i].equals(animal[j]);
            animal[i].equals(animal[j]);
            animal[i].equals(animal[j]);
            System.out.println("\n");
        }
    }
    }
}
