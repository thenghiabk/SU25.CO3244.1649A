package L01_JavaReview.JavaFundamentals;

public class F06ForLoop {
    public static void main ( String[] args ) {
        /*
            Example 6: For loop
            Ref: https://www.w3schools.com/java/java_for_loop.asp
         */

        int lastValue = 0;

        // loop from 0 to 4
        for (int i = 0; i < 5; i++) {
            lastValue = i;

            // Solution 1: print even numbers
            //if (i % 2 == 0) {
            //    System.out.println(i); // prints 0, 2, 4
            //}

            // Solution 2: increment i directly
            //i++;

            // Solution 3: skip odd numbers using continue
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);

        }

        // print the value of the loop variable after the loop
        System.out.println(lastValue);
    }
}
