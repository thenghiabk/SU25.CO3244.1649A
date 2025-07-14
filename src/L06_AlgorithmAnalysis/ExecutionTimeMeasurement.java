package L06_AlgorithmAnalysis;


/**
 * Why do we have to compare complexity?
 *
 * 1. Resources: CPU, memory and storage.
 * 2. Scalability: Can the program handle large input?
 * 3. Performance: How fast does the program run?
 * 4. Code quality: Is the code readable, maintainable and efficient?
 * 5. Problem solving: Can the program solve the problem correctly?
 */

/**
 * This program compares the execution time of two methods to concatenate a string
 * a specified number of times. The first method uses String, the second method
 * uses StringBuilder.
 */



public class ExecutionTimeMeasurement {
    public static void main(String[] args) {

        // Number of iterations for the repeat functions
        int numOfLoop = 13_000_000;

        // Record start time
        long startTime = System.nanoTime();

        // Execute repeat1 function
        repeat2("A", numOfLoop);

        // Record end time
        long endTime = System.nanoTime();

        // Calculate elapsed time in milliseconds
        long elapsedTime = endTime - startTime;

        // Output the execution time
        System.out.println("Execution time: " + elapsedTime + " (ns).");
    }

    // Concatenates the string 'c' 'n' times using String
    public static String repeat1(String c, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += c;
        }
        return answer;
    }

    // Concatenates the string 'c' 'n' times using StringBuilder
    public static String repeat2(String c, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            answer.append(c);
        }
        return answer.toString();
    }
}
