// Name: Abidemi Awojinrin
// This class tests the methods in the Calc class.

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // Create a Calc object.
        Calc myCalculator = new Calc();

        // Create a Scanner object for keyboard input.
        Scanner scan = new Scanner(System.in);

        // Request and validate the first number.
        double n1 = myCalculator.getValidNumber(
                scan, "Please enter the first number: ");

        // Request and validate the second number.
        double n2 = myCalculator.getValidNumber(
                scan, "Please enter the second number: ");

        // Store the numbers in the Calc object.
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        // Display the private data fields using toString().
        System.out.println(myCalculator);

        // Display the numbers using their get methods.
        System.out.println("Calling num1 get method: "
                + myCalculator.getNum1());

        System.out.println("Calling num2 get method: "
                + myCalculator.getNum2());

        // Calculate and display the sum.
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);

        // Calculate and display the remaining results.
        System.out.println("The difference is: "
                + myCalculator.subtract());

        System.out.println("The product is: "
                + myCalculator.multiply());

        System.out.println("The quotient is: "
                + myCalculator.divide());

        // Close the Scanner object.
        scan.close();
    }
}