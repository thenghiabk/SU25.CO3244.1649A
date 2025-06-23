package E02_TaskManagement;

/*
Disclaimer: The code below is incomplete and may contain errors.
The code below is a starting point and may require additional work to make it fully functional.
Use it as a reference and be sure to test it thoroughly before using it in production.
*/

import java.util.Scanner;

public class TaskBuddyTestDrive {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner( System.in );

        TaskBuddy taskBuddy = new TaskBuddy();
        boolean running = true;

        while ( running ) {
            System.out.println( "----------------------" );
            System.out.println( "Todo Application" );
            System.out.println( "----------------------" );
            System.out.println( "1. Add a task" );
            System.out.println( "2. Display all tasks" );
            System.out.println( "3. Complete a task" );
            System.out.println( "4. Display all completed tasks" );
            System.out.println( "5. Exit" );

            System.out.print( "Enter your choice: " );
            int choice = Integer.parseInt( scanner.nextLine() );

            switch ( choice ) {
                case 1:
                    // TODO: Prompt the user for task description and priority.
                    // Call taskBuddy.addTask with the collected information.
                    // Print "Task added successfully!".
                    System.out.println("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.println("Enter task priority: ");
                    String priority = scanner.nextLine();

                    taskBuddy.addTask(description, priority);
                    System.out.println("Task added successfully!");

                    break;

                case 2:
                    // TODO: Call taskBuddy.displayTasks().
                    taskBuddy.displayTasks();
                    break;

                case 3:
                    // TODO: Prompt the user for the ID of the task to complete.
                    // Call taskBuddy.completeTask with the collected ID.
                    break;

                case 4:
                    // TODO: Call taskBuddy.displayCompletedTasks().
                    break;

                case 5:
                    // TODO: Set 'running' to false to exit the loop.
                    break;

                default:
                    // TODO: Print "Invalid choice. Please enter your choice again!".
                    break;
            }
        }

        System.out.println( "Exiting ..." );

    }
}