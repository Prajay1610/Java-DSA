package Arrays;

public class Binary_Search {
    public static int Bin_Search(int arr[], int key) {

        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                e = mid + 1;

            } else {
                s = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int nos[] = { 10, 20, 40, 80, 100 };
        int key = 50;
        System.out.println("Index of Key is: " + Bin_Search(nos, key));

    }
}
