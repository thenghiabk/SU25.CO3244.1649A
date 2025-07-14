package L05_Searching;

public class LinearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}

class LinearSearchTestDrive {
    public static void main ( String[] args ) {
        int[] numbers = {7, 1, 3, 6, 5};
        int target = 8;
        int foundIndex = LinearSearch.search(numbers, target);
        if (foundIndex == -1) {
            System.out.println("Target " + target + " not found");
        } else {
            System.out.println("Target " + target + " found at index " + foundIndex);
        }

    }
}