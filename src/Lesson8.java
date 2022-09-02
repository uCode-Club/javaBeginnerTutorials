import org.example.lesson8.Animal;
import org.example.lesson8.Cat;
import org.example.lesson8.Dog;

import java.awt.Color;

public final class Lesson8 {
    public static void main(String[] args) {
        // Abstract classes
        // • Would it make sense to instantiate a generic animal?

        Dog dog = new Dog("Charlie", 10);
        System.out.println(dog.animalType().toLowerCase());
        dog.introduce();
        System.out.println(dog);

        System.out.println();

        Animal catAsAnimal = new Cat("Toffee", 12.9, new Color(0x854F2E, true) /* java.awt.Color is the standard colour (US & coding: color) class for Java */);
        System.out.println(catAsAnimal.isCat());
        System.out.println(catAsAnimal);

        System.out.println();
        System.out.println();

        // Casting (classes: abstract classes)
        Cat cat = (Cat) catAsAnimal;
        cat.beLazy();

        System.out.println();
        System.out.println();

        // Anonymous objects
        // Note that we can only treat it as if it's the instance of an abstract class; can't use new fields and methods defined in it
        Animal myAnimal = new Animal("Anonymous name", 5.5) {
            @Override
            public void introduce() {
                System.out.println("???");
                age++;
            }

            @Override
            public String animalType() {
                return "Anonymous";
            }

            @Override
            public String toString() {
                System.out.println("toString...");
                return super.toString();
            }
        };
        System.out.println(myAnimal.age);
        myAnimal.introduce();
        System.out.println(myAnimal.age);
        System.out.println(myAnimal.name);
        System.out.println(myAnimal.animalType());
        System.out.println(myAnimal.isCat());
        System.out.println(myAnimal);
    }
}
