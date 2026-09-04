// Name: Abidemi Awojinrin
// This program calculates and displays the average of three test scores.

public class Tests {
    public static void main(String[] args) {

        // Declare and initialize the three test scores.
        double testScore1 = 88.2;
        double testScore2 = 78.9;
        double testScore3 = 97.6;


        // Calculate the average of the three test scores
        double average = (testScore1 + testScore2 + testScore3) / 3.0;

        // Display each test score.
        System.out.println("Test score 1:   " + testScore1);
        System.out.println("Test score 2:  " + testScore2);
        System.out.println("Test score 3:  " + testScore3);

        //Display the average rounded to two decimal places.
        System.out.printf("The average of 3 test scores is:  %.2f%n", average);
    }
}