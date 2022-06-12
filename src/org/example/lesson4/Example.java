package org.example.lesson4;

public class Example {
    public static int exampleId = 0;
    public static String anotherExample;

    public static void publicTest() {
        System.out.println("Public test");
        //packagePrivateTest();
        //privateTest();
    }

    static void packagePrivateTest() {
        System.out.println("Package-private test");
    }

    private static void privateTest() {
        System.out.println("Private test");
    }
}
