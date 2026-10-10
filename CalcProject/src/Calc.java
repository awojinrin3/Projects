// Name: Abidemi Awojinrin
// This class stores two numbers, validates input,
// and performs basic mathematical calculations.

import java.util.Scanner;

public class Calc {

    // Private data fields that store the two numbers.
    private double num1;
    private double num2;

    // Default constructor initializes both numbers to zero.
    public Calc() {
        num1 = 0.0;
        num2 = 0.0;
    }

    // Sets the value of the first number.
    public void setNum1(double newNum1) {
        num1 = newNum1;
    }

    // Sets the value of the second number.
    public void setNum2(double newNum2) {
        num2 = newNum2;
    }

    // Returns the value of the first number.
    public double getNum1() {
        return num1;
    }

    // Returns the value of the second number.
    public double getNum2() {
        return num2;
    }

    // Continues asking until the user enters numeric input.
    public double getValidNumber(Scanner scan, String prompt) {
        while (true) {
            System.out.println(prompt);

            // Return the input when it is a valid number.
            if (scan.hasNextDouble()) {
                return scan.nextDouble();
            }

            // Inform the user and remove the invalid input.
            System.out.println(
                    "Invalid input. Please enter a numeric value.");
            scan.next();
        }
    }

    // Returns the sum of the two numbers.
    public double add() {
        return num1 + num2;
    }

    // Returns the difference between the two numbers.
    public double subtract() {
        return num1 - num2;
    }

    // Returns the product of the two numbers.
    public double multiply() {
        return num1 * num2;
    }

    // Returns the quotient of the two numbers.
    public double divide() {
        return num1 / num2;
    }

    // Returns information about the private data fields.
    public String toString() {
        return "Displaying private data fields using toString():\n"
                + "Num1: " + num1 + "\n"
                + "Num2: " + num2;
    }
}