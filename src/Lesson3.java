public class Lesson3 {
    public static void main(String[] args) {
        // Arrays
        String[] names = {"Arcadi", "Ryan", "Ashley", "Serena"};
        char[] chars;
        chars = new char[]{'C', 'B'};
        int[] firstPrimeNumbers = {1, 2, 3, 5, 7};
        boolean[] booleans = new boolean[2]; // [<empty slot>, <empty slot>]

        System.out.println(names[names.length - 1]);

        System.out.println();
        System.out.println();

        // for-each loop
        // Iterates through an array the easy way
        for (int firstPrimeNumber : firstPrimeNumbers) {
            // firstPrimeNumber = firstPrimeNumbers[i] /* just the value, not the reference to the array spot itself */
            System.out.println("for-each loop: " + firstPrimeNumber);
        }

        System.out.println();
        System.out.println();

        // for-i loop
        // initialization; condition; update (optional: if not provided, syntax: "for (int i = 0; i < names.length;) {<code in the loop>}")
        // Other way of iterating through an array; can also be useful if working with more than one array or working with a changing value
        for (int i = 0; i < names.length; i++) {
            System.out.println("for-i loop: " + names[i]); // <- example of indexing: arrayName[indexInt]
            System.out.println(i);
        }

        System.out.println();
        System.out.println();

        // while loop
        // while (<boolean>) {<code in the loop>}
        // Loops while the condition in 'while' is true
        int number = 0;
        while (true) {
            if (number == 3) {
                number++;
                continue; // Works in any kind of loop
            }
            if (number == 5) {
                break; // Works in any kind of loop
            }

            System.out.println("while loop: " + number);
            number++; // Other way: "++number;"
        }
        System.out.println("Exited while loop. The number is: " + number);

        System.out.println();
        System.out.println();

        // do-while loop
        // do {<code in the do-while loop>} while (<boolean>);
        // "does" the code in do {}, and then checks the boolean in 'while', and keeps looping until it is false.
        number = 0;
        do {
            System.out.println("do-while loop: " + number);
            number++;
        } while (number != 2);
    }
}
