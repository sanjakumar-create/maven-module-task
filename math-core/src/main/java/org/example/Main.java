package org.example; // Make sure this matches your actual folder structure!

import com.example.math.Addition; // This imports your class from the other module!

/**
 * The main application class for the calculator.
 */
public class Main {

    /**
     * The main entry point of the program.
     * * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting the Calculator App...");

        // 1. Create an instance of the Addition class from your math-core module
        Addition addition = new Addition();

        // 2. Use the method
        int result = addition.add(15, 25);

        // 3. Print the result
        System.out.println("The result of 15 + 25 is: " + result);
    }
}