package org.example.lesson11;

//import java.util.Objects;

import java.io.Serializable;

public record User(String username, long registrationDate) implements Serializable {
    // Our safety check constructor (no parentheses as they're not needed here)
    public User {
        if (username == null || username.length() == 0) {
            throw new IllegalArgumentException("Username cannot be " + (username == null ? "null" : "empty") + '!');
        }

        // Allowed (record parameters will be final after this constructor has finished running)
        username += '?';

        System.out.println("Created record for " + username + '.');
    }

    public void printUsername() {
        // Not allowed (username is final)
        //username += '?';

        System.out.println(username);
    }

    // Overriding default method for getting the username
    @Override
    public String username() {
        System.out.println("Getting username...");
        return username;
    }
}

/*public final class User {
    // Note that these fields are immediately final in a class, unlike a record where they're final after the constructor
    private final String username;
    private final long registrationDate;

    public User(String username, long registrationDate) {
        if (username == null || username.length() == 0) {
            throw new IllegalArgumentException("Username cannot be " + (username == null ? "null" : "empty") + '!');
        }

        System.out.println("Created record for " + username + '.');
        this.username = username;
        this.registrationDate = registrationDate;
    }

    public void printUsername() {
        System.out.println(username);
    }

    public String username() {
        System.out.println("Getting username...");
        return username;
    }

    public long registrationDate() {
        return registrationDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true; // Default check in java.lang.Object for equals(Object Obj).
        if (obj == null || obj.getClass() != this.getClass()) return false; // Note: not using the instanceof keyword!
        var that = (User) obj; // Equivalent of: User that = (User) obj;
        return Objects.equals(this.username, that.username) &&
                this.registrationDate == that.registrationDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, registrationDate); // Generates a hash code for the sequence of inputted values (varargs is used here).
    }

    @Override
    public String toString() {
        return "User[" +
                "username=" + username + ", " +
                "registrationDate=" + registrationDate + ']';
    }
}*/
