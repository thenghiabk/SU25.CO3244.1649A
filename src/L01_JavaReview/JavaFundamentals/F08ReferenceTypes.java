package L01_JavaReview.JavaFundamentals;

public class F08ReferenceTypes {
    public static void main ( String[] args ) {
        /*
            Example 8: Reference Types
            This example demonstrates how to work with reference types in Java.
            We will create an array and copy its elements to another array.
         */

        // Create an array of integers with 7 elements
        int[] numbers = new int[7];

        // Assign values to the 'numbers' array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Create another array with the same size as the first array
        int[] anotherNumbers = new int[numbers.length];

        // Copy the values from the 'numbers' array to 'anotherNumbers'
        for (int i = 0; i < numbers.length; i++) {
            anotherNumbers[i] = numbers[i];
        }

        // Print the values of the 'anotherNumbers' array
        for (int i = 0; i < anotherNumbers.length; i++ ) {
            System.out.println(anotherNumbers[i]);
        }

        //System.out.println(anotherNumbers[10]); // Error - ArrayIndexOutOfBoundsException

    }
}
