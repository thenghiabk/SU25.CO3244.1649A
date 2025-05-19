package L01_JavaReview;

import java.util.Scanner;

public class JavaMethodExample {
    public static void main ( String[] args ) {
        System.out.println("Program starts.");
        greets();
        askUserAge();
        System.out.println("Program ends.");
    }

    public static void greets(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ".");
        sc.close();
    }

    public static void askUserAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        String ageString = sc.nextLine();
        int age = Integer.parseInt(ageString);
        validateAge( age );

        sc.close();
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


