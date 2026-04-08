// MyClass.java
package com.mycompany.myapp;
public class MyClass {
    public int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}