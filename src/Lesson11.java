import org.example.lesson11.User;

// What are records?
// • Data-only classes that make holding data convenient (alternative to manual data class).
// • Improved default method implementations from the java.lang.Record superclass (boolean equals(Object obj), int hashCode(), String toString()).
// • Extend java.lang.Record (abstract class).
// • Records are final (can't be extended from).
// • Can only have one type of constructor
// • Can't have instance fields
public final class Lesson11 {
    public static void main(String[] args) {
        User arcadi = new User("Arcadi", System.currentTimeMillis());
        System.out.println(arcadi);
        System.out.println(arcadi.username()); // Method is overridden
        System.out.println(arcadi.registrationDate()); // Method is not overridden
        arcadi.printUsername();
    }
}
