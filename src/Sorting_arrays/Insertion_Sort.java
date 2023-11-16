package Sorting_arrays;

public class Insertion_Sort {
    public static void insertionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = i;
            int prev = i - 1;

            // finding out the correct position to insert
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // insertion
            arr[prev + 1] = arr[curr];
        }
    }

    public static void main(String args[]) {

    }

}
