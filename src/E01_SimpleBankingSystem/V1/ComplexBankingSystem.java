package E01_SimpleBankingSystem.V1;

import java.util.Scanner;

public class ComplexBankingSystem {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner( System.in );

        // Arrays to store account data
        double[] balances = new double[ 5 ];

        // 2-D array to store transaction history
        double[][] transactions = new double[ 5 ][ 5 ];
        int[] transactionIndices = new int[ 5 ];

        System.out.print("Enter number of accounts to create (1-5):");
        int accountCount = Integer.parseInt( scanner.nextLine() );

        // Initialize the balances array
        for (int i = 0; i < accountCount; i++) {
            System.out.print("Enter balance for account " + (i+1) + ": ");
            balances[i] = Double.parseDouble( scanner.nextLine() );
            System.out.println("Account " + (i+1) + " has been created with initial balance: " + balances[i]);
        }

        boolean running = true; // Variable to store user's choice
        int currentAccount = -1; // will be set when user selects an account

        do {
            System.out.println("-----------");
            System.out.println("Banking Menu");
            System.out.println("1. Select Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Please enter your choice (1-5): ");

            String userChoice = scanner.nextLine(); // Read user's choice

            switch ( userChoice ) {
                case "1": // Select Account
                    System.out.print("Enter account number (1-" + accountCount + "): ");
                    currentAccount = Integer.parseInt( scanner.nextLine() ) - 1; // Convert to 0-based index
                    break;

                case "2": // Display Accounts
                    for (int i = 0; i < accountCount; i++) {
                        System.out.println("Account " + (i+1) + ": " + balances[i]); // Print account balance
                    }
                    break;

                case "3": // Deposit
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = Double.parseDouble( scanner.nextLine() );

                    // Check if the deposit amount is valid
                    if (depositAmount > 0) {
                        balances[currentAccount] += depositAmount;

                        if (transactionIndices[currentAccount] == 5){
                            // shift the array to the left
                            for (int i = 0; i < 4; i++){
                                transactions[currentAccount][i] = transactions[currentAccount][i+1];
                            }

                            transactionIndices[currentAccount] = 4;
                        }

                        transactions[currentAccount][transactionIndices[currentAccount]] = depositAmount;
                        transactionIndices[currentAccount]++;

                        System.out.println("Updated balance: " + balances[currentAccount]);
                    } else {
                        System.out.println("Invalid deposit amount. Please enter a positive number.");
                    }
                    break;

                case "4": // Withdraw
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = Double.parseDouble( scanner.nextLine() );

                    if (withdrawalAmount > 0 && withdrawalAmount <= balances[currentAccount]) {
                        balances[currentAccount] -= withdrawalAmount;

                        if (transactionIndices[currentAccount] == 5){
                            // shift the array to the left
                            for (int i = 0; i < 4; i++){
                                transactions[currentAccount][i] = transactions[currentAccount][i+1];
                            }

                            transactionIndices[currentAccount] = 4;
                        }

                        transactions[currentAccount][transactionIndices[currentAccount]] = -withdrawalAmount;
                        transactionIndices[currentAccount]++;

                        System.out.println("Updated balance: " + balances[currentAccount]);
                    } else if(withdrawalAmount <= 0){
                        System.out.println("Invalid withdrawal amount. Please enter a positive number.");
                    }
                    else
                    {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case "5":
                    System.out.println("Transaction History");

                    for (int i = 0; i < transactionIndices[currentAccount] ; i++ ){

                        if (transactions[currentAccount][i] > 0) {
                            System.out.println("+" + transactions[currentAccount][i]);
                        } else {
                            System.out.println(transactions[currentAccount][i]);
                        }

                    }

                    break;
                case "6":
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
