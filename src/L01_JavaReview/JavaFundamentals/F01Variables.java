package L01_JavaReview.JavaFundamentals;

public class F01Variables {
    public static void main ( String[] args ) {
        /*
            Example 2: Variables
            Ref: https://www.w3schools.com/java/java_variables.asp
         */

        // declare variable x of type int and assign value 5
        int x = 5;

        // declare variable y of type int
        int y;
        // assign value 10 to y
        y = 10;

        // print x
        System.out.println("x = " + x);
        // assign new value to x
        x = 55;
        // print new value of x
        System.out.println("x = " + x);

        // declare variable z of type float
        float z;
        // assign value 9.9 to z
        z = 9.9f;
        // assign value of x to z
        z = x;
        // print z
        System.out.println("z = " + z);

        // declare variable name of type String and assign value "John"
        String name = "John";
        // print greeting with name
        System.out.println("Hello " + name);
    }
}
