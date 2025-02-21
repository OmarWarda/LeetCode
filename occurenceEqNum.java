import java.util.Arrays;

public class occurenceEqNum {
    public static boolean occurenceEqNum(String s) {
        char[] nums = s.toCharArray();
        // System.out.println("Chars: " + Arrays.toString(nums));
        for (int i = 0; i < nums.length;) {
            char current = nums[i];
            int count = 0;

            while (i < nums.length && nums[i] == current) {
                count++;
                i++;
            }
            System.out.println(count);
            if (count == Character.getNumericValue(current)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "122333";
        System.out.println(occurenceEqNum(s));
    }
}
