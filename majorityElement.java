import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class majorityElement {

    public static int majorityElement(int[] nums) {
        // Initialize a HashMap to store the frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        // Populate the HashMap with the count of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Iterate through the entries of the HashMap to find the majority element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey(); // Return the majority element
            }
        }
        return -1; // Return -1 if no majority element is found
    }

    public static void main(String[] args) {
        int[] testArr = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(testArr));
    }

}
