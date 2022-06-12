package org.example.lesson5;

public class Person {
    public static int successCode = 0;

    public String name;
    public double age;
    public final String BLOOD_TYPE;

    public Person(String name, double age, String bloodType) {
        this.name = name;
        this.age = age;
        BLOOD_TYPE = bloodType;
    }

    public Person() {
        this("Ashley", 17, "A+");
    }

    public void introduce() {
        System.out.println("Hello! My name is " + name + " and I am " + (int) Math.floor(age) + " years old!");
    }

    public String getName() {
        return name;
    }
}
