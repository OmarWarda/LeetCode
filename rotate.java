import java.util.Arrays;

public class rotate {

    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }

        // To handle the case where K is greater than the length of the array
        k = k % nums.length;
        reverse.reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        reverse.reverse(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums));
        reverse.reverse(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] testArr = { 1, 2, 3, 4, 5, 6 };
        rotate(testArr, 3);
    }

}
