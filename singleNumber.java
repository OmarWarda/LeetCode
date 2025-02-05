import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class singleNumber {

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        HashMap<Integer, Integer> myNums = new HashMap<>();
        for (int num : nums) {
            if (myNums.containsKey(num)) {
                myNums.put(num, 2);
            } else {
                myNums.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : myNums.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums2 = { 4, 2, 1, 2, 1 };
        System.out.println(singleNumber(nums2));

    }
}
