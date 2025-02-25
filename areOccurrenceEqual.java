import java.util.HashMap;
import java.util.Hashtable;

public class areOccurrenceEqual {
    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int freq = map.get(s.charAt(0));

        for (int value : map.values()) {
            if (value != freq) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(areOccurrencesEqual(s));
    }
}
