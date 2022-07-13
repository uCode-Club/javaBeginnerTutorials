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

    public double getAge() {
        return age;
    }

    public String getBLOOD_TYPE() {
        return BLOOD_TYPE;
    }

    public static void setSuccessCode(int successCode) {
        Person.successCode = successCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
