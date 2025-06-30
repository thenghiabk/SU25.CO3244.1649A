package L04_Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            int minIndex = i;

            // find smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // update minIndex if a smaller element is found
                }
            }

            // swap two elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

class SelectionSortTestDrive {
    public static void main ( String[] args ) {
        int[] numbers = { 6, 10, 7, 5, 2, 4, 9, 8, 3 };
        SelectionSort.sort(numbers);
        System.out.println( Arrays.toString(numbers)); // [2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
