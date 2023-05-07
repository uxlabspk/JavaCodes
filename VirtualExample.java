
import java.util.LinkedList;

// Animal parent class
class Animal 
{
    // normal method acting like virtual methods.
    public void eat()
    {
        System.out.println("I eat like a generic Animal.");
    }
}

// Fish inherited from Animal class.
class Fish extends Animal
{
    // Overriding the Animal class 'eat' method
    @Override
    public void eat()
    {
        System.out.println("I eat like a fish.");
    }
}

// Goldfish inherited from Animal class.
class GoldFish extends Animal
{
    // Overriding the Animal class 'eat' method
    @Override
    public void eat()
    {
        System.out.println("I eat like a gold fish.");
    }
}

// otherAnimals inherited from Animal class.
class otherAnimals extends Animal 
{
    // no overriding of 'eat' virtual method. 
    // therefore, the parent class method will be 
    // printed on console.
}


// main example class.
public class VirtualExample 
{
    // main drivan method.
    public static void main(String[] args) 
    {
        // Creating a linked list of type 'Animal' class.
        LinkedList<Animal> animals = new LinkedList<>();

        // Adding the Fish, GoldFish, Animal and otherAnimals class objects.
        animals.add(new Fish());
        animals.add(new GoldFish());
        animals.add(new Animal());
        animals.add(new otherAnimals());

        // Using the enhanced or for-each loop to iterate over the linkedlist.
        for (Animal animal : animals) 
        {
            animal.eat();    
        }
    }   
}
