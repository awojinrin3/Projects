// Name: Abidemi Awojinrin
// This class is a blueprint for creating Pet objects.

public class Pet {

    // Private data fields
    private String type;
    private String name;
    private int age;

    // Default constructor
    public Pet() {
        setType("Animal");
        setName("Pet Name");
        setAge(1);
    }

    // Custom constructor
    public Pet(String newType, String newName, int newAge) {
        setType(newType);
        setName(newName);
        setAge(newAge);
    }

    // Returns the pet's type
    public String getType() {
        return type;
    }

    // Changes the pet's type
    public void setType(String newType) {
        type = newType;
    }

    // Returns the pet's name
    public String getName() {
        return name;
    }

    // Changes the pet's name
    public void setName(String newName) {
        name = newName;
    }

    // Returns the pet's age
    public int getAge() {
        return age;
    }

    // Changes the pet's age
    public void setAge(int newAge) {
        age = newAge;
    }

    // Returns the sound made by the pet
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Yowl";
        }
    }

    // Returns the pet's information as a String
    public String toString() {
        String petInformation = "Pet information:\n";
        petInformation += "Type: " + type + "\n";
        petInformation += "Name: " + name + "\n";
        petInformation += "Sound: " + speak() + "\n";
        petInformation += "Age: " + age;

        return petInformation;
    }
}