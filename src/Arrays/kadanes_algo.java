package Arrays;
//for max sub array sum --> kadane's algo

public class kadanes_algo {

    public static int max_sum_subarray(int arr[]) {
        int currsum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if (currsum < 0) {
                currsum = 0;
            }
            max_sum = Math.max(currsum, max_sum);

        }
        return max_sum;
    }

    public static void main(String args[]) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(max_sum_subarray(arr));
    }

}
