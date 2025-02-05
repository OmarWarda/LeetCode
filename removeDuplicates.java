import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class removeDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> uniqueElements = new HashSet<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (uniqueElements.add(nums[i])) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, j)));

        return j;
    }

    public static int removeDuplicates2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] newArr = new int[nums.length];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) <= 2) {
                newArr[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            nums[i] = newArr[i];
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        int[] array = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        System.out.println(removeDuplicates(array));
    }

}
