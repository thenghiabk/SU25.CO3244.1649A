package L05_Searching;

public class BinarySearch {
    public static int search(int[] arr, int target) {



        return -1;
    }
}

class BinarySearchTestDrive {
    public static void main ( String[] args ) {
        int[] numbers = { 1, 2, 4, 7, 10, 14, 15, 18, 20 };
        int target = 15;
        int foundIndex = BinarySearch.search( numbers, target );
        if ( foundIndex == -1 ) {
            System.out.println( "Target " + target + " not found" );
        } else {
            System.out.println( "Target " + target + " found at index " + foundIndex );
        }
    }
}