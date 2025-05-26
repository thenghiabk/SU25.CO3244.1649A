package E01_SimpleBankingSystem;

import java.util.Scanner;

public class SimpleBankingSystem {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = Double.parseDouble( scanner.nextLine() );
        System.out.println("Your account has been created. Current balance: " + balance);

        boolean running = true; // Variable to store user's choice

        do {
            System.out.println("-----------");
            System.out.println("Banking Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transaction History");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice (1-4): ");

            String userChoice = scanner.nextLine();

            switch ( userChoice ) {
                case "1":
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = Double.parseDouble( scanner.nextLine() );
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Updated balance: " + balance);
                    } else {
                        System.out.println("Invalid deposit amount. Please enter a positive number.");
                    }
                    break;

                case "2":
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = Double.parseDouble( scanner.nextLine() );
                    if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
                        balance -= withdrawalAmount;
                        System.out.println("Updated balance: " + balance);
                    } else if(withdrawalAmount <= 0){
                        System.out.println("Invalid withdrawal amount. Please enter a positive number.");
                    }
                    else
                    {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case "3":
                    System.out.println("User selected Transaction History");
                    break;
                case "4":
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option (1-4).");
                    break;
            }

        } while (running);

        scanner.close();
    }
}
