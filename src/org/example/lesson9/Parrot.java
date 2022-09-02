package org.example.lesson9;

import org.example.lesson8.Animal;

public class Parrot extends Animal implements Flyable, Talkable {
    public Parrot(String name, double age) {
        super(name, age);
    }

    public void eat() {
        for (int i = 0; i < 3; i++) {
            System.out.print(i == 0 ? "Munch " : "munch ");
        }
        // \b is backspace; in basic terms, deleting the previous character
        System.out.println("\b...");
    }

    @Override
    public void introduce() {
        System.out.println("Hello! I am a parrot named " + name + ", and I'm around " + Math.round(age) + " years old!");
    }

    @Override
    public void fly(int kmRange) {
        System.out.println("I flew " + kmRange + " KM.");
    }

    @Override
    public int autoFly() {
        return Flyable.super.autoFly();
    }

    @Override
    public void talk() {
        System.out.println("I am talking to you!");
    }
}
