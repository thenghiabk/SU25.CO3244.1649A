package E02_TaskManagement;

/*
Disclaimer: The code below is incomplete and may contain errors.
The code below is a starting point and may require additional work to make it fully functional.
Use it as a reference and be sure to test it thoroughly before using it in production.
*/

import E02_TaskManagement.myUtils.ArrayListADT;

public class TaskBuddy {
    // data fields
    private ArrayListADT<Task> pendingTasks;
    private ArrayListADT<Task> completedTasks;
    private static int taskId;

    // constructor
    public TaskBuddy () {
        this.pendingTasks = new ArrayListADT<Task> ();
        this.completedTasks = new ArrayListADT<Task> ();
        this.taskId = 1;
    }

    // methods
    public void addTask ( String description, String priority ) {
        // TODO: Create a new Task with the current taskId, add it to pendingTasks, sort tasks by priority, and increment taskId.
        Task newTask = new Task(taskId, description, priority);
        pendingTasks.add(newTask);
        taskId++;
    }

    private void sortTasksByPriority () {
        // TODO: Implement a sorting algorithm (e.g., bubble sort) to sort pendingTasks by priority.
        // Compare priorities using the String's compareTo method.
    }

    public void displayTasks () {
        // TODO: Check if pendingTasks is empty. If so, print "No tasks to display.".
        // Otherwise, print "Task List:" and then iterate and print each task in pendingTasks.
        for ( int i = 0; i < pendingTasks.size(); i++ ) {
            System.out.println(pendingTasks.get(i));
        }
    }

    public void completeTask ( int taskId ) {
        // TODO: Iterate through pendingTasks to find the task with the given taskId.
        // If found, remove it from pendingTasks and add it to completedTasks.
        // If not found, print "Invalid task ID.".
    }

    public void displayCompletedTasks () {
        // TODO: Check if completedTasks is empty. If so, print "No completed tasks.".
        // Otherwise, print "Completed Tasks:" and then iterate and print each task in completedTasks.
    }
}