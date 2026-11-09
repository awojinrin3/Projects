import javax.swing.JOptionPane;

/**
 * This program demonstrates the Exam class
 * and safely handles invalid input.
 */
public class Runner {

    public static void main(String[] args) {
        String input;
        int questions;
        int missed;
        boolean validInput = false;

        while (!validInput) {
            try {
                // Get the number of questions.
                input = JOptionPane.showInputDialog(
                        "How many questions are on the exam?"
                );
                questions = Integer.parseInt(input);

                // Prevent division by zero.
                if (questions == 0) {
                    throw new ArithmeticException(
                            "The number of questions cannot be zero."
                    );
                }

                // Get the number of missed questions.
                input = JOptionPane.showInputDialog(
                        "How many questions did the student miss?"
                );
                missed = Integer.parseInt(input);

                // Create the Exam object.
                Exam exam = new Exam(questions, missed);

                // Display the results.
                String message = "Each question counts "
                        + exam.getPointsEach();

                message += " points.\nThe exam score is "
                        + exam.getScore();

                message += "\nThe exam grade is "
                        + exam.getGrade();

                JOptionPane.showMessageDialog(null, message);

                validInput = true;
            }
            catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid input. Please enter a whole number."
                );
            }
            catch (ArithmeticException exception) {
                JOptionPane.showMessageDialog(
                        null,
                        exception.getMessage()
                );
            }
        }

        System.exit(0);
    }
}