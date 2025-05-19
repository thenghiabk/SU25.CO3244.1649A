package L01_JavaReview;

import java.util.Scanner;

public class JavaMethodExample {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program starts.");
        greets(scanner);
        int userAge = askUserAge(scanner);
        validateAge( userAge );
        System.out.println("Program ends.");

        scanner.close();
    }

    public static void greets(Scanner scanner){
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ".");
    }

    public static int askUserAge(Scanner scanner){
        System.out.println("How old are you?");
        String ageString = scanner.nextLine();
        System.out.println("Your age is " + ageString);
        int age = Integer.parseInt(ageString);
        return age;
    }

    public static void validateAge(int age){
        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }


}


