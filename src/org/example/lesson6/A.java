package org.example.lesson6;

// This class implicitly extends Object (java.lang.Object)
public class A {
    public String info;
    public int successCode = 0;
    public int errorCode = 1;
    protected String className;

    public A(String info) {
        this.info = info;
        String[] nameArray = getClass().getName().split("\\.");
        className = nameArray[nameArray.length - 1];
    }

    public A() {
        this("This is class 'A'; is it useless?");
    }

    public void welcome() {
        System.out.println("Welcome to class A!");
    }

    public void helloWorld() {
        System.out.println("Hello, World!");
    }

    // Access modifiers (2/2)
    // + protected:
    // • https://usemynotes.com/wp-content/uploads/2021/02/what-are-access-specifiers-in-java.jpg
    // • Same package:
    //     • Sub-class: yes
    //     • Non-sub-class: yes
    // • Different package:
    //     • Sub-class ('no' if you use the default modifier): yes
    //     • Non-sub-class: no
    protected String getName() {
        return className;
    }

    @Override
    public String toString() {
        return "toString(): Class A";
    }
}
