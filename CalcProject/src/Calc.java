public class Calc {

    // Private data fields
    private double num1;
    private double num2;

    // Default constructor
    public Calc() {
        num1 = 0.0;
        num2 = 0.0;
    }

    // Set methods
    public void setNum1(double newNum1) {
        num1 = newNum1;
    }

    public void setNum2(double newNum2) {
        num2 = newNum2;
    }

    // Get methods
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    // Calculation methods
    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    // Displays the private data fields
    public String toString() {
        return "Displaying private data fields using toString():\n"
                + "Num1: " + num1 + "\n"
                + "Num2: " + num2;
    }
}