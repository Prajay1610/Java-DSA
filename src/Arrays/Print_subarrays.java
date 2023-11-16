package Arrays;

/**
 * Print_subarrays with sum of elements of each subarray and find max_sum and
 * min_sum
 */

// BRUTE FORCE
public class Print_subarrays {
    public static void subarrays(int arr[]) {
        int sum = 0;
        int min_sum = Integer.MAX_VALUE;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.print("--sum is---: " + sum);
                if (sum < min_sum) {
                    min_sum = sum;
                } else if (sum > max_sum) {
                    max_sum = sum;
                }

                sum = 0;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("MAX SUBARRAY SUM IS: " + max_sum);
        System.out.println("MIN SUBARRAY SUM IS: " + min_sum);

    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subarrays(arr);

    }
}