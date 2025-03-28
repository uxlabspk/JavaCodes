package src;

import java.util.LinkedList;

// src.src.Animal parent class
class Animal {
    // normal method acting like virtual methods.
    public void eat() {
        System.out.println("I eat like a generic src.src.Animal.");
    }
}

// src.Fish inherited from src.src.Animal class.
class Fish extends Animal {
    // Overriding the src.src.Animal class 'eat' method
    @Override
    public void eat() {
        System.out.println("I eat like a fish.");
    }
}

// Goldfish inherited from src.src.Animal class.
class GoldFish extends Animal {
    // Overriding the src.src.Animal class 'eat' method
    @Override
    public void eat() {
        System.out.println("I eat like a gold fish.");
    }
}

// src.otherAnimals inherited from src.src.Animal class.
class otherAnimals extends Animal {
    // no overriding of 'eat' virtual method. 
    // therefore, the parent class method will be 
    // printed on console.
}


// main src.example class.
public class VirtualExample {
    // main driven method.
    public static void main(String[] args) {
        // Creating a linked list of type 'src.src.Animal' class.
        LinkedList<Animal> animals = new LinkedList<>();

        // Adding the src.Fish, src.GoldFish, src.src.Animal and src.otherAnimals class src.objects.
        animals.add(new Fish());
        animals.add(new GoldFish());
        animals.add(new Animal());
        animals.add(new otherAnimals());

        // Using the enhanced or for-each loop to iterate over the linked list.
        for (var animal : animals) {
            animal.eat();
        }
    }
}
