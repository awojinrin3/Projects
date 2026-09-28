public class Animal {

    // Stores the animal's species.
    private String species;

    // Default constructor.
    public Animal() {
        setSpecies("Animal");
    }

    // Custom constructor.
    public Animal(String newSpecies) {
        setSpecies(newSpecies);
    }

    // Changes the animal's species.
    public void setSpecies(String newSpecies) {
        species = newSpecies;
    }

    // Returns the animal's species.
    public String getSpecies() {
        return species;
    }

    // Returns user-friendly information about the animal.
    public String toString() {
        return "Species: " + species;
    }
}