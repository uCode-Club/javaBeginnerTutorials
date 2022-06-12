public class Lesson2 {
    public static void main(String[] args) {
        // Line comment
        /*
        Block comment
         */

        // Basic data types and operators (variable naming convention: camelCase; constants: MACRO_CASE)
        // See (operators): https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
        // <data type> <variable name> = <value>;
        String message = "Welcome to the uCode Club!";
        message += "\nNew line"; // message = message + "\nNew line";
        int number = -(25 % (13 / 2 /* Not 6.5 */)) - (3 * (5 + 1));
                  // -(25 % 6) - (3 * 6)
                  // -1 - 18
                  // -19

                  // US English in code itself; that's how it is done.
        final double GALLON_TO_LITER = 7.58 / 2; // WARNING: don't add floating-point numbers due to base-2 precision errors (worry about this later on)
        // Compile error
        //GALLON_TO_LITER = 3.79;
        char firstLetter = 'A';
        boolean inJava = true;
        boolean inPython = false;

        // More about boolean operators...
        // Note that 'Object' just refers to any data type
        // Note that 'Number' refers to any number type, such as int, double, etc.
        //
        // Object == Object    Checks if primitive types have the same value; or, checks if an Object is equal to an Object (memory pointer)
        // Object != Object    Checks if primitive types don't have the same value; or, checks if an Object is not equal to an Object (memory pointer)
        // Number < Number     Checks if a Number is less than a Number
        // Number > Number     Checks if a Number is greater than a Number
        // Number <= Number    Checks if a Number is less than or equal to a Number
        // Number >= Number    Checks if a Number is greater than or equal to a Number
        // boolean && boolean  Logical AND
        // boolean || boolean  Logical OR
        // !boolean            Logical NOT

        // Printing our variables
        // Note that anything we append to a String will automatically be converted to a String
        System.out.println(message + " (\\n)");
        System.out.println(number - 1);
        System.out.println(GALLON_TO_LITER);
        System.out.println(firstLetter);
        System.out.println("Java condition: " + inJava);
        System.out.println("Python condition: " + inPython);

        System.out.println();
        System.out.println();

        // Casting (primitive types)
        // From: https://www.w3schools.com/java/java_type_casting.asp
        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double
        //
        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte
        double d = 3 /* int to double */;
        System.out.println(d);

        int i = (int) -3.91 /* double to int */;
        System.out.println(i);

        System.out.println();
        System.out.println();

        // int fact: The limit range for int is -2,147,483,648 – 2,147,483,647

        // Additional data types
        byte b = 1; // -128 – 127
        short s = 32767; // -32,768 – 32,767
        long l = 12345678900L; // -9,223,372,036,854,775,808 – 9,223,372,036,854,775,807
        float f = 2.71f;

        // Wrapped data types; provides extra functionality compared to the primitive types
        Integer integer = 3;
        // integer.byteValue();
        // integer.longValue();
        // more
        // Integer.parseInt("3");

        // If, else-if, else statements
        // You don't have to use 'else', but will need to for certain programs at times
        if (3 == 5) {
            // Runs if (3 == 5) is true
            System.out.println("3 is equal to 5!");
        } else if (3 != 5) {
            // Runs if (3 != 5) is true and the previous if statement was false
            System.out.println("3 is not equal to 5!");
        } else {
            // Called if all the other if statements are false
        }

        if (message.equals("text") || true) {
            System.out.println("True for logical OR");
        }

        if (3 == 3 && 5 == 5) {
            System.out.println("True for logical AND");
        }

        System.out.println();
        System.out.println();

        int lesson = 2;
        int confidence = 1;
        // boolean ? value : value;
        String upToDate = confidence == lesson || confidence == lesson - 1 ? "You are up-to-date!" : confidence > lesson ? "You are ahead!" : "You are behind!";
        System.out.println(upToDate);

        System.out.println();
        System.out.println();

        // switch-case statements
        // A more efficient way to check for certain values.
        // Only supports the primitive types and Strings;

        // Enhanced (works strictly as if, else-if..., else)
        switch (firstLetter) {
            case 'A' -> {
                System.out.println("Newer switch statement!");
                System.out.println("Letter is 'A'");
            }
            case 'B' -> {
                System.out.println("Newer switch statement!");
                System.out.println("Letter is 'B'");
            }
            default -> System.out.println("The letter is not 'A' or 'B' in the newer switch statement!");
        }

        firstLetter = 'B';

        // Classic, but also useful sometimes for specific control flow
        switch (firstLetter) {
            case 'A':
                System.out.println("Letter is 'A'");
                System.out.println("Classic switch statement!");
                break;
            case 'B':
                System.out.println("Letter is 'B'");
                System.out.println("Classic switch statement!");
                // Since 'break' is not called, it will run all the code until it lands on another 'break' or finishes the switch statement.
                //break;
            default:
                System.out.println("The letter is not 'A' or 'B', or is it?");
                break;
        }
    }
}
