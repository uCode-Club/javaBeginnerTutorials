package org.example.lesson8;

public final class Dog extends Animal {
    public Dog(String name, double age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("Bark! I am " + name + " and I am " + age + " years old!");
    }
}
