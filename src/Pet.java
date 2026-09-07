// Name: Abidemi Awojinrin
// This program creates and displays two Pet objects.

public class Pet {

    // Private data field that stores the pet's name.
    private String name;

    // Default constructor that gives the pet a default name.
    public Pet() {
        setName("Pet Name");
    }

    // Returns the pet's name.
    public String getName() {
        return name;
    }

    // Changes the pet's name.
    public void setName(String newName) {
        name = newName;
    }

    // Returns the pet's information as a String.
    public String toString() {
        return "Pet information:\nName: " + name;
    }

    public static void main(String[] args) {

        // Create and display the first Pet using the default constructor.
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        System.out.println();

        // Create the second Pet and change its name.
        Pet pet2 = new Pet();
        pet2.setName("Buster");

        // Display the second Pet's information.
        System.out.println(pet2.toString());
    }
}