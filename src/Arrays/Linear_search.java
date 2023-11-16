package Arrays;

import java.util.*;

public class Linear_search {

    public static int LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50 };
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int result = LinearSearch(arr, key);
        if (result == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found at index: " + result);
        }

    }

}
