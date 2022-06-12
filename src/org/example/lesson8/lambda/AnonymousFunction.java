package org.example.lesson8.lambda;

@FunctionalInterface // Good to annotate the interface with if it is intended to be used with lambdas
public interface AnonymousFunction {
    int WRONG_PI = (int) Math.ceil(Math.PI);

    // Shortened from: public abstract Object getValue(Object... args);
    // Object... is used as Object[], except the user can pass in arguments instead of an array literal; it's called "varargs"
    Object getValue(Object... args);
}
