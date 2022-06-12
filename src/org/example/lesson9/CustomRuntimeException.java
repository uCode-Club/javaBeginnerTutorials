package org.example.lesson9;

// Note that we redefine the constructors:
// • We instantiate this class with an argument (String message);
// • We also instantiate this class without arguments.
// Therefore, since Java does not automatically define constructors with arguments, we need to redefine them;
// and, when we define constructors, the no-args constructor no longer exists, unless we redefine it.
public class CustomRuntimeException extends RuntimeException {
    public CustomRuntimeException() {
        // No need to call super() as Java automatically does that for no-args constructors
    }

    public CustomRuntimeException(String message) {
        super(message); // Calling the super constructor to fully-initialize the exception
    }
}
