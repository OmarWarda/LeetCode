import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

    // Using a HashMap to store the number and its index in the array.
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (res.containsKey(diff)) {
                // for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
                // System.out.println(entry.getKey() + " : " + entry.getValue());
                // }
                return new int[] { res.get(diff), i };
            }
            res.put(nums[i], i);
        }
        return new int[] {}; // if no pair found returns an empty array
    }
    // ============================================================================

    // ===========================TWO SUM PROBLEM================================
    // Brute force solution
    public static int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] res = twoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

}
