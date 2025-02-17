public class increasingTriplet {
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num; // Update smallest element
            } else if (num <= second) {
                second = num; // Update second smallest element
            } else {
                return true; // Found a triplet
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 20, 100, 10, 12, 5, 13 };
        System.out.println(increasingTriplet(nums));
    }
}
