package org.example.lesson4;

public class Example2 {
    private static void test() {
        Example.publicTest();
        Example.packagePrivateTest();

        // Compile error
        //Example.privateTest();
    }
}
