package org.example.lesson8;

public abstract class Animal {
    public String name;
    public double age;

    public Animal(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public abstract void introduce();

    public String animalType() {
        return getClass().getName();
    }

    public final boolean isCat() {
        return this instanceof Cat;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + "]";
    }
}
