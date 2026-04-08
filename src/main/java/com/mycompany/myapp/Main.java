// Main.java
package com.mycompany.myapp;
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        try {
            int result = myClass.factorial(5);
            System.out.println("Factorial: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        MyDerivedClass derivedClass = new MyDerivedClass();
        derivedClass.printMessage();
    }
}