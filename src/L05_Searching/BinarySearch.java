package L05_Searching;

public class BinarySearch {
    public static int search(int[] arr, int target) {

        int count = 0;

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if ( target < arr[mid]){
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            count++;

            System.out.println("Count: " + count);
        }



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