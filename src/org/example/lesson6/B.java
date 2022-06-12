package org.example.lesson6;

public final class B extends A {
    public String infoText;
    public int errorCode = -1;
    public final double PI = Math.PI;

    public B() {
        super("Info text in B");
    }

    public void doStuff() {
        System.out.println("Doing stuff...");
    }

    @Override
    public void helloWorld() {
        System.out.println("Hi, World!");
    }

    @Override
    public String getName() {
        return className;
        //return super.getName();
    }

    @Override
    public String toString() {
        return "toString(): Class B is strange.";
    }
}
