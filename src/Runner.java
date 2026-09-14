import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Create the first pet with the default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());
        System.out.println();

        // Create the second pet with the custom constructor
        Pet pet2 = new Pet("Dog", "Buster", 11);
        System.out.println(pet2.toString());
        System.out.println();

        // Collect information for the third pet
        System.out.println("Enter animal type:");
        String animalType = scnr.nextLine();

        System.out.println("Enter animal name:");
        String animalName = scnr.nextLine();

        System.out.println("Enter animal age:");
        int animalAge = scnr.nextInt();

        System.out.println();

        // Create the third pet using the entered information
        Pet pet3 = new Pet(animalType, animalName, animalAge);
        System.out.println(pet3.toString());
    }
}