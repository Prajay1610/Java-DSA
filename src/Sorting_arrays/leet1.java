package Sorting_arrays;

public class leet1 {

    public static int[] plusOne(int[] digits) {
        int power = 0;
        int sum = 0;
        int[] narray = new int[digits.length];

        for (int i = digits.length - 1; i >= 0; i--) {
            sum += digits[i] * (Math.pow(10, power));
            power++;
        }
        sum++;

        for (int i = digits.length - 1; i >= 0; i--) {

            int lastDigit = sum % 10;
            narray[i] = lastDigit;
            sum = sum / 10;
        }

        return narray;

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3 };
        int arr3[] = plusOne(arr);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
