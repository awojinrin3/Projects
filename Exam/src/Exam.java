// Name: Abidemi Awojinrin
// Assignment: Module 6 Inheritance Assignment
// Description: Calculates an exam score and letter grade using inheritance.

public class Exam extends Assessment {

    // Number of questions on the exam.
    private int numQuestions;

    // Number of points each question is worth.
    private double pointsEach;

    // Number of questions missed.
    private int numMissed;

    // Creates an Exam object and calculates its score.
    public Exam(int questions, int missed) {
        double numericScore;

        numQuestions = questions;
        numMissed = missed;

        pointsEach = 100.0 / numQuestions;
        numericScore = 100.0 - (numMissed * pointsEach);

        // Assessment stores the score as an integer.
        setScore((int) Math.round(numericScore));
    }

    // Returns the points each question is worth.
    public double getPointsEach() {
        return pointsEach;
    }

    // Returns the number of questions missed.
    public int getNumMissed() {
        return numMissed;
    }
}