import java.util.Arrays;
import java.util.HashSet;

public class removeElement {

    public static int removeElement(int[] nums, int val) {
        HashSet<Integer> diffNums = new HashSet<Integer>();
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                diffNums.add(nums[i]);
                nums[counter] = nums[i];
                counter++;
            }
        }
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, counter)));
        return counter;
    }

    public static void main(String[] args) {
        int[] array2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        System.out.println(removeElement(array2, val));
    }

}
