public class findMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        double sumK = 0;
        for (int i = 0; i < k; i++) {
            sumK += nums[i];
        }

        double maxSum = sumK;

        for (int i = k; i < nums.length; i++) {
            sumK = sumK - nums[i - k];
            sumK = sumK + nums[i];
            maxSum = Math.max(maxSum, sumK);
        }
        return maxSum / k;

    }

    public static void main(String[] args) {
        findMaxAverage f = new findMaxAverage();
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        System.out.println(f.findMaxAverage(nums, k));
    }
}
