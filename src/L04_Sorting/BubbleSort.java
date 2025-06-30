package L04_Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if ( arr[ j ] < arr[ j - 1 ] ) {
                    // swap two elements
                    int temp = arr[ j ];
                    arr[ j ] = arr[ j - 1 ];
                    arr[ j - 1 ] = temp;
                }
            }
        }
    }
}

class BubbleSortTestDrive {
    public static void main ( String[] args ) {
        int[] numbers = { 6, 10, 7, 5, 2, 4, 9, 8, 3 };
        BubbleSort.sort(numbers);
        System.out.println( Arrays.toString(numbers)); // [2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}