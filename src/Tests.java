// Name: Abidemi Awojinrin
// This class calculates the average of user-entered test scores.

import java.util.Scanner;

public class Tests {
    // Read-only data fields
    private int numberOfScores;
    private double average;

    // Default constructor
    public Tests() {
        numberOfScores = 0;
        average = 0.0;
    }

    // Returns the number of scores entered
    public int getNumberOfScores() {
        return numberOfScores;
    }

    // Returns the calculated test average
    public double getTestAverage() {
        return average;
    }

    // Collects test scores and calculates the average
    public void getAverage() {
        Scanner scnr = new Scanner(System.in);

        double sum = 0.0;
        int count = 0;

        System.out.println("Enter a test score (-1 to quit):");
        double testScore = scnr.nextDouble();

        while (testScore != -1) {
            sum += testScore;
            count++;

            System.out.println("Enter a test score (-1 to quit):");
            testScore = scnr.nextDouble();
        }

        numberOfScores = count;
        average = sum / count;
    }

    // Returns the result with the average formatted to two decimals
    public String toString() {
        return String.format(
                "The average of the %d scores entered is %.2f.",
                numberOfScores, average
        );
    }
}