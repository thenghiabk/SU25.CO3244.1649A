package E01_SimpleBankingSystem.V0;

import java.util.Scanner;

public class SimpleBankingSystem {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = Double.parseDouble( scanner.nextLine() );
        System.out.println("Your account has been created. Current balance: " + balance);

        double[] transactions = new double[5];
        int transactionIndex = 0;

        boolean running = true; // Variable to store user's choice

        do {
            System.out.println("-----------");
            System.out.println("Banking Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transaction History");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice (1-4): ");

            String userChoice = scanner.nextLine(); // Read user's choice

            switch ( userChoice ) {
                case "1": // Deposit
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = Double.parseDouble( scanner.nextLine() );

                    // Check if the deposit amount is valid
                    if (depositAmount > 0) {
                        balance += depositAmount;

                        if (transactionIndex == 5){
                            // shift the array to the left
                            for (int i = 0; i < 4; i++){
                                transactions[i] = transactions[i+1];
                            }

                            transactionIndex = 4;
                        }

                        transactions[transactionIndex] = depositAmount;
                        transactionIndex = transactionIndex + 1;

                        System.out.println("Updated balance: " + balance);
                    } else {
                        System.out.println("Invalid deposit amount. Please enter a positive number.");
                    }
                    break;

                case "2": // Withdraw
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = Double.parseDouble( scanner.nextLine() );

                    if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
                        balance -= withdrawalAmount;

                        if (transactionIndex == 5){
                            // shift the array to the left
                            for (int i = 0; i < 4; i++){
                                transactions[i] = transactions[i+1];
                            }

                            transactionIndex = 4;
                        }

                        transactions[transactionIndex] = -withdrawalAmount;
                        transactionIndex = transactionIndex + 1;

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
                    System.out.println("Transaction History");

                    for (int i = 0; i < transactionIndex; i++ ){

                        if (transactions[i] > 0) {
                            System.out.println("+" + transactions[i]);
                        } else {
                            System.out.println(transactions[i]);
                        }

                        // short-hand if
                        //System.out.println(transactions[i] > 0 ? "+" + transactions[i] : transactions[i]);
                    }

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
