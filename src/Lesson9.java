import org.example.lesson8.Animal;
import org.example.lesson9.Flyable;
import org.example.lesson9.Parrot;
import org.example.lesson9.Talkable;
import org.example.lesson9.lambda.AnonymousFunction;

public final class Lesson9 {
    public static void main(String[] args) {
        // What are interfaces?
        // • Another abstract type to specify additional behaviour for classes that must be implemented.
        // • Can't directly be instantiated.
        // • Don't extend Object since classes that implement the interface do extend Object.
        // • Classes can implement any number of interfaces, unlike with classes.
        //
        // Example use cases:
        // • Event listeners
        // • Contracts (more of an idea)
        // • Special data types (Collection<E>, List<E>, Set<E>, etc.)
        // • Total abstraction
        // • Simplified and more generic data types when creating objects: a generic Flyable object that can take in any flyable animal
        // • Additional functionality to classes
        //
        // What can interfaces do (only shows what they can do) (with example after ':')?
        // • Public abstract methods: String getName();
        // • Public non-final default methods (the interface's way for regular methods): default void doStuff() {...}
        // • Private methods: private void test() {...}
        // • (public static final) fields: int WRONG_PI = (int) Math.ceil(Math.PI);
        //
        // Interfaces do take time to understand, so don't be surprised if you don't completely understand how they work by the end of this lesson.

        //          Animal                     ^
        //            ^                        | Extends (classes extending classes, interfaces extending interfaces)
        //            |                        |
        // Flyable    |    Talkable
        //    ^       |        ^
        //    |       |        |               ^
        //            |                        | Implements (classes implementing interfaces)
        //    |       |        |
        //            |                        |
        //    \ - - Parrot - - /

        Animal parrotAsAnimal = new Parrot("Jack", 10.6);
        parrotAsAnimal.introduce();
        System.out.println(parrotAsAnimal.isCat());
        // Compile error
        //parrotAsAnimal.fly(); // Animal is not an instance of Parrot, Flyable
        //parrotAsAnimal.eat(); // Animal is not an instance of Parrot

        System.out.println();

        System.out.println(parrotAsAnimal instanceof Flyable);
        Flyable parrotAsFlyable = (Flyable) parrotAsAnimal;
        parrotAsFlyable.fly(1);
        // Compile error
        //parrotAsFlyable.introduce(); // Flyable is not an instance of Parrot, Animal.
        //parrotAsFlyable.eat(); // Flyable is not an instance of Parrot

        System.out.println();

        Parrot parrot = (Parrot) parrotAsAnimal;
        parrot.eat();

        talk(parrot); // Parrot is an instance of Talkable
        // Compile error
        //talk(parrotAsAnimal); // Animal is not an instance of Talkable
        //talk(parrotAsFlyable); // Flyable is not an instance of Talkable

        System.out.println();
        System.out.println();

        // Anonymous objects with interfaces
        // Notes:
        // • We can only treat it as if it's the instance of an interface; can't use new fields and methods defined in it.
        // • While interfaces don't directly have object methods, anonymous objects do.
        AnonymousFunction anonymousFunction = new AnonymousFunction() {
            @Override
            public Object getValue(Object... args) {
                System.out.println("In anonymous AnonymousFunction!");
                return args[1];
            }
        };
        System.out.println(anonymousFunction.getValue("Text", "Text 1"));

        System.out.println();

        Flyable myFlyable = new Flyable() {
            private int flyDistance = 5;

            @Override
            public void fly(int kmRange) {
                System.out.println("Flew " + (kmRange + flyDistance++) + " KM.");
            }

            @Override
            public int autoFly() {
                return flyDistance;
                //return Flyable.super.autoFly();
            }

            // Can't override java.lang.Object methods in interfaces, but can in anonymous objects
            @Override
            public String toString() {
                return "A flyable anonymous object!";
            }
        };
        System.out.println(myFlyable.autoFly());
        myFlyable.fly(3);
        System.out.println(myFlyable.autoFly());
        System.out.println(myFlyable);

        System.out.println();

        // The lambda way (alternative to anonymous objects for interfaces*)!
        // * Can be used if there is only one abstract method in the interface
        // • Use parentheses in the argument definition (except for one argument): () -> {...};, arg1 -> {...};, (arg1, arg2) -> {...};
        // • Can directly point to return value (non-void return) or a statement (void return): (a, b) -> a + b;
        AnonymousFunction lambdaFunction = args1 -> {
            System.out.println("In lambda!");
            System.out.println(AnonymousFunction.WRONG_PI);
            return args1[1];
        };
        System.out.println(lambdaFunction.getValue("Text 2", "Text 3"));

        Runnable runnable = () -> System.out.println("Runnable lambda");
        runnable.run();
    }

    private static void talk(Talkable talkable) {
        talkable.talk();
    }
}
