public class maxOperations {
    public static int maxOperations(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length;) {
            for (int j = nums.length - 1; j >= 0;) {
                if (nums[i] + nums[j] == k) {
                    count++;
                    i++;
                    j--;
                } else if (nums[i] + nums[j] > k) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        // System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int k = 5;
        System.out.println(maxOperations(nums, k));

    }
}
