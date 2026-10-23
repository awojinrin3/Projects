// Name: Abidemi Awojinrin
// Assignment: Module 5 Assignment 2
// Description: Creates two ArrayLists, displays their contents,
// and demonstrates the remove() and set() methods.

import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {

        // Create one String ArrayList and one Integer ArrayList.
        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add four items to the String ArrayList.
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        // Add four items to the Integer ArrayList.
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Display the original String ArrayList.
        System.out.println("Original String ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Display the original Integer ArrayList.
        System.out.println("\nOriginal Integer ArrayList:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Use remove() and set() on both ArrayLists.
        fruits.remove(1);
        fruits.set(0, "Strawberry");

        numbers.remove(1);
        numbers.set(0, 100);

        // Display both ArrayLists after the changes.
        System.out.println("\nString ArrayList after changes:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nInteger ArrayList after changes:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}