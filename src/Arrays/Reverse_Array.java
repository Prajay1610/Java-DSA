package Arrays;

public class Reverse_Array {
    public static void Reverse_array(int arr[]) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 89, 90, 80, 67 };

        // Calling reverse fxn
        Reverse_array(arr);

        // Printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
