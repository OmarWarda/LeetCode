import java.util.Arrays;

public class productExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = 1;
        }

        int productLeft = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] *= productLeft;
            productLeft *= nums[i];
        }
        int productRight = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= productRight;
            productRight *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4 };
        System.out.println(productExceptSelf(nums));
    }
}
