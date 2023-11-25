package Recursion;

public class Bin_search {
    // recursive code for binary search --
    public static int search(int arr[], int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return search(arr, target, s, mid - 1);
        }
        return search(arr, target, mid + 1, e);

    }

    public static void main(String args[]) {
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println(search(arr, 40, 0, arr.length - 1));
    }
}
