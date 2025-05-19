package L01_JavaReview.JavaFundamentals;

import java.util.Scanner;

public class F02UserInput {
    public static void main ( String[] args ) {
        /*
            Example 3: User Input
            Ref: https://www.w3schools.com/java/java_user_input.asp
                 https://www.w3schools.com/java/java_type_casting.asp
         */

        Scanner sc = new Scanner(System.in);

        // Prompt user for name
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);

        // Prompt user for age
        System.out.println("Enter your age: ");
        String age = sc.nextLine();
        System.out.println("Your age is " + age);

        // Prompt user for email address
        System.out.println("Enter your email address: ");
        String email = sc.nextLine();
        System.out.println("Your email address is " + email);

        // Convert age from String to int
        int ageInt = Integer.parseInt(age);

        // Print out next year's age
        System.out.println("Next year you will be " + (ageInt+1));
    }
}
