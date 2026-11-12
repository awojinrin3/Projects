// Name: Abidemi Awojinrin
// This program reads employee pay data, calculates weekly pay,
// and writes the results to a new CSV file.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class M8A1 {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            // Skip the headings from the input file and write new headings.
            reader.readLine();
            writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            writer.newLine();

            String inputLine;

            // Read and process each employee record.
            while ((inputLine = reader.readLine()) != null) {
                String[] employeeData = inputLine.split(",");

                String employeeID = employeeData[0].trim();
                double payRate = Double.parseDouble(employeeData[1].trim());
                double hoursWorked = Double.parseDouble(employeeData[2].trim());
                double weeklyPay;

                // Pay overtime at 1.5 times the regular rate after 40 hours.
                if (hoursWorked > 40) {
                    double regularPay = payRate * 40;
                    double overtimePay = (hoursWorked - 40) * payRate * 1.5;
                    weeklyPay = regularPay + overtimePay;
                }
                else {
                    weeklyPay = payRate * hoursWorked;
                }

                String formattedPay = String.format("$%.2f", weeklyPay);
                String outputLine = employeeID + "," + payRate + ","
                        + hoursWorked + "," + formattedPay;

                writer.write(outputLine);
                writer.newLine();
            }

            System.out.println("The payroll data was written to " + outputFile);
        }
        catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("The CSV file contains an invalid number.");
        }
    }
}
