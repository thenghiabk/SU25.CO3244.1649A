package L01_JavaReview.JavaFundamentals;

public class F05WhileLoop {
    public static void main ( String[] args ) {
        /*
            Example 5: While loop
            Ref: https://www.w3schools.com/java/java_while_loop.asp
         */

        int i = 0;

        // loop until i is equal to 5
        while (i < 5) {
            int x = 5;
            // pre-increment operator
            //System.out.println(++i);

            // post-increment operator
            System.out.println(i++);

            // equivalent to i = i + 1;
            //++i;
            //i = i + 1;
            //i += 1;
            //i++;
        }

        System.out.println(i); // prints 5

        // variable x is out of scope here
        //System.out.println(x); // error
    }
}
