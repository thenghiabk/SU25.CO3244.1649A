package L01_JavaReview.JavaFundamentals;

public class F07Arrays {
    public static void main ( String[] args ) {
        /*
            Example 7: Arrays
            Ref: https://www.w3schools.com/java/java_arrays.asp
         */

        // Declare an array of size 7
        int[] numbers = new int[7];

        // Assign initial values to the first 5 elements of the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Another way of assigning initial values to the array
        // Loop through the first 5 elements of the array
        // and assign the value of 10 + the loop index times 10
        for ( int i = 0; i < 5; i++ ) {
            numbers[i] = i*10 + 10;
        }

        // Print the first five elements of the numbers array
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        // Loop through the numbers array and print each element
        for (int i = 0; i < numbers.length; i++ ) {
            // Print the element at index i
            System.out.println(numbers[i]);
        }


        // Declare an array of strings with 6 elements
        // The elements are the names of car brands
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Mercedes", "Audi"};

        // Loop through the cars array and print each element
        // The loop index is used to access each element in the array
        // The loop iterates 'cars.length' number of times
        for (int i = 0; i < cars.length; i++) {
            // Print the element at index i
            System.out.println(cars[i]);
        }
    }
}
