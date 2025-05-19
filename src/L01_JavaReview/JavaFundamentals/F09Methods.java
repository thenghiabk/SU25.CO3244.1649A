package L01_JavaReview.JavaFundamentals;

import java.util.Scanner;

public class F09Methods {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program starts.");

        String userName = getUserName(scanner);
        System.out.println("Hello " + userName + "!");

        int userAge = getUserAge(scanner);

        boolean isAccessGranted = validateAge(userAge);
        System.out.println(isAccessGranted ? "Access granted - You are old enough!" : "Access denied - You are not old enough!");

        System.out.println("Program ends.");

        scanner.close();
    }

    public static String getUserName(Scanner scanner){
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        return name;
    }

    public static int getUserAge(Scanner scanner){
        System.out.print("How old are you? ");
        String ageString = scanner.nextLine();
        int age = Integer.parseInt(ageString);
        return age;
    }

    public static boolean validateAge(int age) {
        return age >= 18;
    }


}


