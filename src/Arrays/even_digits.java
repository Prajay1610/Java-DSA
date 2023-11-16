package Arrays;

public class even_digits {
    public static boolean even(int number) {
        int count = 0;
        if (number < 0) {
            number *= -1;
        }
        while (number > 0) {
            count++;
            number = number / 10;
        }
        if (count % 2 == 0) {
            return true;
        }

        return false;
    }

    public static int findNumbers(int[] nums) {
        int cnt = 0;
        for (int element : nums) {
            if (even(element)) {
                cnt++;
            }

        }
        if (cnt == 0) {
            return -1;
        }
        return cnt;
    }

    public static void main(String args[]) {
        int[] nums = { 555, 901, 482, 1771 };
        System.out.println(findNumbers(nums));
    }
}
