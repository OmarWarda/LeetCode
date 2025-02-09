public class missingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = 0;
        int expectedSum = n * (n + 1) / 2;
        int missingNumber;
        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }
        missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1 };
        missingNumber(nums);
    }
}
