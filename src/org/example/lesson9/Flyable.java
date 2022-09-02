package org.example.lesson9;

public interface Flyable {
    // Shortened from: public abstract void fly(int kmRange);
    void fly(int kmRange);

    // Default methods also work from Java 8 and up
    default int autoFly() {
        return 10;
    }

    // Useless as classes that implement this interface already have an implementation (only useful for abstract classes to mark abstract)
    @Override
    String toString();

    // Can't override with implementation
//    @Override
//    default int hashCode() {
//        return 0;
//    }
}
