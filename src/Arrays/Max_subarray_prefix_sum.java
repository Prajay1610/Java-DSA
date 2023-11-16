package Arrays;

public class Max_subarray_prefix_sum {
    public static void subarrays(int arr[]) {
        int sum = 0;
        int min_sum = Integer.MAX_VALUE;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        // calculate prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                // for (int k = i; k <= j; k++) {
                // sum += arr[k];
                // System.out.print(arr[k] + " ");
                // }
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
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
        int arr[] = { 1, -2, 6, -1, 3 };
        subarrays(arr);

    }
}
