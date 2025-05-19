package L01_JavaReview.JavaFundamentals;

public class F04SwitchStatement {
    public static void main ( String[] args ) {
        /*
            Example 4: Switch statement
            Ref: https://www.w3schools.com/java/java_switch.asp
         */

        int day = 4;
        switch (day) {
            // Print "Monday" if the value of day is 1
            case 1:
                System.out.println("Monday");
                break;
            // Print "Tuesday" if the value of day is 2
            case 2:
                System.out.println("Tuesday");
                break;
            // Print "Wednesday" if the value of day is 3
            case 3:
                System.out.println("Wednesday");
                break;
            // Print "Thursday" if the value of day is 4
            case 4:
                System.out.println("Thursday");
                break;
            // Print "Friday" if the value of day is 5
            case 5:
                System.out.println("Friday");
                break;
            // Print "Saturday" if the value of day is 6
            case 6:
                System.out.println("Saturday");
                break;
            // Print "Sunday" if the value of day is 7
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
