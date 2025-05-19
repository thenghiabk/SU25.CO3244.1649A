package L01_JavaReview;

import java.util.Scanner;

public class HelloWorld {
    public static void main ( String[] args ) {
        /*
            Example 1: Output
            Ref: https://www.w3schools.com/java/java_output_numbers.asp
         */
        //System.out.println("Hello World"); // prints Hello World to console
        //
        //System.out.println(3*5);
        //
        //System.out.println("Hello " + 2025);

        /*
            Example 2: Variables
            Ref: https://www.w3schools.com/java/java_variables.asp
         */

        //int x = 5;
        //int y;
        //y = 10;
        //
        //System.out.println("x = " + x);
        //x = 55;
        //System.out.println("x = " + x);
        //
        //float z;
        //z = 9.9f;
        //z = x;
        //System.out.println("z = " + z); // prints z = 5.0
        //
        //String name = "John";
        //System.out.println("Hello " + name); // prints 'Hello John'

        /*
            Example 3: User Input
            Ref: https://www.w3schools.com/java/java_user_input.asp
                 https://www.w3schools.com/java/java_type_casting.asp
         */

        //Scanner sc = new Scanner(System.in);
        //
        ////System.out.println("Enter your name: ");
        ////String name = sc.nextLine();
        ////System.out.println("Your name is " + name);
        //
        //System.out.println("Enter your age: ");
        //String age = sc.nextLine();
        //System.out.println("Your age is " + age);
        //
        ////System.out.println("Enter your email address: ");
        ////String email = sc.nextLine();
        ////System.out.println("Your email address is " + email);
        //
        //int ageInt = Integer.parseInt(age);
        //
        //System.out.println("Next year you will be " + (ageInt+1));

        /*
            Example 4: Switch statement
            Ref: https://www.w3schools.com/java/java_switch.asp
         */

        //int day = 4;
        //switch (day) {
        //    case 1:
        //        System.out.println("Monday");
        //        break;
        //    case 2:
        //        System.out.println("Tuesday");
        //        break;
        //    case 3:
        //        System.out.println("Wednesday");
        //        break;
        //    case 4:
        //        System.out.println("Thursday");
        //        break;
        //    case 5:
        //        System.out.println("Friday");
        //        break;
        //    case 6:
        //        System.out.println("Saturday");
        //        break;
        //    case 7:
        //        System.out.println("Sunday");
        //        break;
        //}

        /*
            Example 5: While loop
            Ref: https://www.w3schools.com/java/java_while_loop.asp
         */

        //int i = 0;
        //
        //while (i < 5) {
        //    int x = 5;
        //    //System.out.println(++i);
        //    System.out.println(i++);
        //    //++i;
        //    //i = i + 1;
        //    //i += 1;
        //    //i++;
        //}
        //
        //System.out.println(i); // prints 5
        ////System.out.println(x); // error

        /*
            Example 6: For loop
            Ref: https://www.w3schools.com/java/java_for_loop.asp
         */

        //int finalI = 0;
        //
        //for (int i = 0; i < 5; i++) {
        //    finalI = i;
        //    // Solution 1
        //    //if (i % 2 == 0) {
        //    //    System.out.println(i); // prints 0, 2, 4
        //    //}
        //
        //    // Solution 2
        //    //i++;
        //
        //    // Solution 3
        //    if (i % 2 != 0) {
        //        continue;
        //    }
        //    System.out.println(i);
        //
        //}
        //
        //System.out.println(finalI);

        /*
            Example 7: Arrays
            Ref: https://www.w3schools.com/java/java_arrays.asp
         */

        //int[] numbers = new int[7];
        //numbers[0] = 10;
        //numbers[1] = 20;
        //numbers[2] = 30;
        //numbers[3] = 40;
        //numbers[4] = 50;

        //for ( int i = 0; i < 5; i++ ) {
        //    numbers[i] = i*10 + 10;
        //}

        //System.out.println(numbers[0]);
        //System.out.println(numbers[1]);
        //System.out.println(numbers[2]);
        //System.out.println(numbers[3]);
        //System.out.println(numbers[4]);

        //for (int i = 0; i < numbers.length; i++ ) {
        //    System.out.println(numbers[i]);
        //}

        //String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Mercedes", "Audi"};
        //
        //for (int i = 0; i < cars.length; i++) {
        //    System.out.println(cars[i]);
        //}

        /*
            Example 8: xxx
            Ref: xxx
         */

        int[] numbers = new int[7]; // Create an array of size 7
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        int[] anotherNumbers = new int[ numbers.length ]; // Create an array of size 7

        for(int i = 0; i < numbers.length; i++ ) { // Copy the values of numbers to anotherNumbers
            anotherNumbers[i] = numbers[i];
        }

        for (int i = 0; i < anotherNumbers.length; i++ ) { // Print the values of anotherNumbers
            System.out.println(anotherNumbers[i]);
        }

        System.out.println(anotherNumbers[10]);

    }
}
