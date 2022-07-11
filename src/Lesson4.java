import org.example.lesson4.Example;

import java.util.Scanner;

import static org.example.lesson4.Example.anotherExample;

public class Lesson4 {
    static int a = -3;

    public static void main(String[] args) {
        // Static methods ("functions")
        // • Naming convention: camelCase (like variables)
        System.out.println(test("Hello", '.'));
        greet();

        System.out.println();

        // Packages
        // • Naming convention: lowercase.separatedbydots.likethis
        // • Domain name in reverse
        // • The delimiter that separates folders is '.'
        //
        // Example (name list and file structure diagram):
        // • com.macintoshfan.other.Utility
        // • com.macintoshfan.other.Lol
        // • com.macintoshfan.learnjava.HelloWorld
        // • org.example.Test
        //
        //      <project folder>
        //      /              \
        //    com             org
        //     |               |
        //   macintoshfan    example
        //     |        |      |
        //     |        |      \-Test
        // learnjava   other
        //     |        | |
        // HelloWorld   | \------\
        //              |        |
        //            Utility   Lol

        // Access modifiers (1/2)
        // • Default access modifier: accessible within the same package
        // •                  Public: accessible anywhere
        // •                 Private: accessible within the class it is declared in (classes cannot be private)
        Example.publicTest();
        // Compile error
        //Example.packagePrivateTest();
        //Example.privateTest();

        System.out.println();

        // Static fields
        System.out.println(a);
        System.out.println(++a);
        System.out.println(Example.exampleId);
        System.out.println(++Example.exampleId);
        anotherExample = "Another example!";
        System.out.println(anotherExample);
        System.out.println(Example.anotherExample);
    }

// access   other  return method
//modifier keywords type  name (parameter(s)) {method code}
    private static String test(String msg, char add) {
        String returnValue = msg + add + '!';
        System.out.println("test method will return \"" + returnValue + '"');
        return returnValue /* Note that '!' and 'add' has a String/Strings before it, so it will be converted to a String too */;
    }

    private static void greet() {
        // System.in is the standard console input stream
        Scanner scanner = new Scanner(System.in);

        // System.out.println(String x) -> prints x + '\n'
        // System.out.print(String x)   -> prints x
        System.out.print("Hello. My name is Java! What's yours?\nEnter here: ");
        String input = scanner.next();
        scanner.nextLine();
        System.out.println("Nice to meet you, " + input);
    }
}
