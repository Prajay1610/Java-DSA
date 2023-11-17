package Arrays;

public class rotated_binary_search {

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // case 3
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int Bin_Search(int arr[], int key, int s, int e) {

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                e = mid - 1;

            } else {
                s = mid + 1;
            }
        }

        return -1;
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if u did not find a pivot it means array is not rotated

        if (pivot == -1) {
            return Bin_Search(nums, target, 0, nums.length - 1);
        }

        // if we find a pivot then we now have 2 ascending sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target > nums[0]) {
            return Bin_Search(nums, target, 0, pivot - 1);
        }
        return Bin_Search(nums, target, pivot + 1, nums.length - 1);

    }

    public static void main(String args[]) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(arr, 0));
    }
}
