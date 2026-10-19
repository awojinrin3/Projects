// Name: Abidemi Awojinrin
// Assignment: Module 5 Assignment 1
// Program: IntArray
// Description: Creates and manages an integer array. The program can fill
// the array with random numbers, access and change values, clear the array,
// and sort its values.

import java.util.Arrays;
import java.util.Random;

public class IntArray {

    // Stores the number of elements in the array.
    private int length;

    // Stores the integer array.
    private int myArray[];

    // Creates an array with the specified number of elements.
    public IntArray(int l) {
        length = l;
        myArray = new int[length];
    }

    // Removes all elements from the array.
    public void clear() {
        length = 0;
        myArray = new int[0];
    }

    // Fills the array with random integers from 1 through 6.
    public void fillRand() {
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            myArray[i] = random.nextInt(6) + 1;
        }
    }

    // Returns the value stored at the specified array position.
    public int get(int element) {
        return myArray[element];
    }

    // Changes the value at the specified array position.
    public void set(int element, int newValue) {
        myArray[element] = newValue;
    }

    // Returns the number of elements in the array.
    public int size() {
        return length;
    }

    // Returns true when the array has no elements.
    public boolean isEmpty() {
        return length == 0;
    }

    // Sorts the array values in ascending order.
    public void sort() {
        Arrays.sort(myArray);
    }

    // Returns the array contents as a readable String.
    public String toString() {
        return Arrays.toString(myArray);
    }
}