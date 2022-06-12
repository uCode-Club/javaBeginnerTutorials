package org.example.lesson7;

import java.awt.Color;

public final class Cat extends Animal {
    public Color furColor;

    public Cat(String name, double age, Color furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public void beLazy() {
        System.out.println("Zzz...");
    }

    @Override
    public void introduce() {
        System.out.println("\"Meow\", said " + name);
    }

    @Override
    public String toString() {
        String superString = super.toString();
        //     String.substring(int beginIndex, int endIndex)      |
        //     returns a modified version of the current String;   |
        //     beginIndex means where to start the new String,     | Equivalent of: furColor.toString() since a String
        //     and endIndex means where to end the new String at.  |                comes before it
        return superString.substring(0, superString.length() - 1) + ", furColor=" + furColor + "]";
    }
}
