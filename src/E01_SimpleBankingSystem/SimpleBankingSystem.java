package E01_SimpleBankingSystem;

import java.util.Scanner;

public class SimpleBankingSystem {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter initial balance: ");
        double balance = Double.parseDouble( scanner.nextLine() );

        boolean running = true;

        do {
            System.out.println("-----------");
            System.out.println("Banking Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transaction History");
            System.out.println("4. Exit");
            System.out.print("Please select an option (1-4): ");
            System.out.println("\n-----------");

            String userChoice = scanner.nextLine();

            switch ( userChoice ) {
                case "1":
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = Double.parseDouble( scanner.nextLine() );
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Updated balance: " + balance);
                    } else {
                        System.out.println("Invalid deposit amount. Please enter a positive number.");
                    }

                    break;
                case "2":
                    System.out.println("Enter deposit amount: ");
                    double withdrawalAmount = Double.parseDouble( scanner.nextLine() );
                    if (withdrawalAmount > 0) {
                        balance -= withdrawalAmount;
                        System.out.println("Updated balance: " + balance);
                    } else {
                        System.out.println("Invalid withdrawal amount. Please enter a positive number.");
                    }
                    break;
                case "3":
                    System.out.println("User selected Transaction History");
                    break;
                case "4":
                    System.out.println("User selected Exit");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option (1-4).");
                    break;

            }

        } while (running);

    }
}
