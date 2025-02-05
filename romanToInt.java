import java.util.HashMap;
import java.util.Map;

public class romanToInt {

    // ============================================================================
    public static int romanToInt(String s) {
        Map<Character, Integer> romanNums = new HashMap<>();
        romanNums.put('I', 1);
        romanNums.put('V', 5);
        romanNums.put('X', 10);
        romanNums.put('L', 50);
        romanNums.put('C', 100);
        romanNums.put('D', 500);
        romanNums.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romanNums.get(s.charAt(i)) < romanNums.get(s.charAt(i + 1))) {
                sum -= romanNums.get(s.charAt(i));
            } else {
                sum += romanNums.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "IVV";
        System.out.println(romanToInt(s));
    }

}
