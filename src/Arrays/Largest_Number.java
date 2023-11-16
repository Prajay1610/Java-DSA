package Arrays;

import java.util.*;

public class Largest_Number {

    public static int Largest_number(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Value is: " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int nos[] = { 10, 1, 54, 65, 8, 2 };

        System.out.println(Largest_number(nos));
    }
}
