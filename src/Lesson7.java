import org.example.lesson7.CustomException;
import org.example.lesson7.CustomRuntimeException;

import java.util.Scanner;

public final class Lesson7 {
    public static void main(String[] args) {
        // Understanding throwable classes in Java
        //
        // Throwable hierarchy diagram below with example classes
        //
        //     Throwable
        //     ^      ^
        //     |      |
        //  Error*  Exception <-------¬- IOException
        //     ^                      |
        //     |                      |
        // StackOverflowError  RuntimeException*
        //
        // *= class/subclasses can be thrown without needing to declare 'throws' or surround with try-catch
        //
        // Notes:
        // • If you are using a method/constructor that declares 'throws' with a non-runtime Throwable object being thrown,
        //   you need to surround with try-catch, or declare 'throws' if you're using it in a method/constructor.
        // • Exception**: The class Exception and its subclasses are a form of Throwable that indicates conditions that a reasonable application might want to catch.
        // • Error**: An Error is a subclass of Throwable that indicates serious problems that a reasonable application should not try to catch.
        //
        // **= from part of Javadoc

        // CustomException
        //exception(); // CustomException is not a runtime throwable, so we need to handle it (two ways):
                       // • Surround with try-catch
                       // • Declare 'throws' (only in method/constructor)
//        try {
//            exception();
//        } catch (CustomException ce) {
//            ce.printStackTrace();
//        }

        // CustomRuntimeException
        //runtimeException(); // CustomRuntimeException is a runtime throwable (RuntimeException), so we don't have to handle it
//        try {
//            runtimeException();
//        } catch (CustomRuntimeException cre) {
//            cre.printStackTrace();
//        }

        // StackOverflowError
        //stackOverflowError(); // StackOverflowError is a runtime throwable (Error), so we don't have to handle it
//        try {
//            stackOverflowError();
//        } catch (StackOverflowError soe) {
//            soe.printStackTrace();
//        }

        // User input (and connected to above)
        // java.util.Scanner methods (descriptions assume you're using java.util.Scanner for user input (System.in)):
        // • scanner.nextLine()    reads user input as String until '\n' (or by pressing enter)
        // • scanner.next()        reads user input as String until ' '
        // • scanner.nextInt()     reads user input as int
        // • scanner.nextDouble()  reads user input as double
        // Important note:
        // • If you're reusing the scanner that did not call scanner.nextLine() and does not call scanner.nextLine() next,
        //   you'll want to call it before the next user input due to line problems;
        //   for example, like this: scanner.nextInt(); scanner.nextLine(); scanner.nextInt() /* assume integer inputs, but nextLine() "clears the line" */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: "); // This is the prompt
        drive(scanner.nextInt() /* <- will throw java.util.InputMismatchException if the user does not input a valid integer */);
        scanner.close();
    }

    private static void exception() throws CustomException {
        throw new CustomException();
    }

    private static void runtimeException() {
        throw new CustomRuntimeException();
    }

    private static void stackOverflowError() {
        // Infinite recursion will eventually cause StackOverflowError to be thrown
        stackOverflowError(); // Method will never complete
    }

    private static void drive(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Parameter 'age' should not be less than 0!");
        }
        if (age < 16) {
            throw new CustomRuntimeException("You must be at least 16 years old to drive!");
        }

        System.out.println("Driving...");
    }
}
