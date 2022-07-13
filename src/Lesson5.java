import org.example.lesson5.Person;

public class Lesson5 {
    public static void main(String[] args) {
        Person arcadi = new Person("Arcadi", 16.9, "A+");
        arcadi.name = "arcadi";
        System.out.println(arcadi.name);
        arcadi.introduce();
        System.out.println(arcadi.getName());

        System.out.println();

        Person.successCode++;
        System.out.println(Person.successCode);
        System.out.println(arcadi.successCode);

        System.out.println();

        // Involves polymorphism
        Person ashley = new Person();
        System.out.println(ashley.BLOOD_TYPE);
        System.out.println(ashley.age);
    }
}
