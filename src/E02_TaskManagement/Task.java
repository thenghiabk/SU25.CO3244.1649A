package E02_TaskManagement;

/*
Disclaimer: The code below is incomplete and may contain errors.
The code below is a starting point and may require additional work to make it fully functional.
Use it as a reference and be sure to test it thoroughly before using it in production.
*/

public class Task {
    // data fields
    private int id;
    private String description;
    private String priority;

    // constructor
    public Task ( int id, String description, String priority ) {
        // Option 1
        //this.id = id;
        //this.description = description;
        //this.priority = priority;

        // Option 2
        setId( id );
        setDescription( description );
        setPriority( priority );
    }

    // methods

    public int getId () {
        return this.id;
    }

    private void setId ( int id ) {
        if (id < 0) {
            throw new IllegalArgumentException("ID must be greater than 0.");
        }

        this.id = id;
    }

    public String getDescription () {
        return this.description;
    }

    private void setDescription ( String description ) {
        this.description = description;
    }

    public String getPriority () {
        return this.priority;
    }

    private void setPriority ( String priority ) {
        this.priority = priority;
    }

    @Override
    public String toString () {
        // TODO: Return a formatted string representation of the task (ID, Priority, Description).
        return "ID: " + this.id + ", Priority: " + this.priority + ", Description: " + this.description;
    }
}

class TaskTestDrive{
    public static void main ( String[] args ) {
        Task task1 = new Task( 1, "Task 1", "A" );
        System.out.println(task1.getId());
        System.out.println(task1.getDescription());
        System.out.println(task1.getPriority());

        //Task task2 = new Task( -2, "Task 2", "B" ); // should throw IllegalArgumentException


    }
}