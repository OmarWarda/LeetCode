import java.util.ArrayList;
import java.util.Arrays;

public class reverseWords {
    public static String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        ArrayList<String> reversed = new ArrayList<>();

        for (String word : words) {
            if (!word.equals("")) {
                reversed.add(word);
            }

        }
        System.out.println("1: " + reversed);

        StringBuilder res = new StringBuilder();
        int j = 0;
        for (int i = reversed.size() - 1; i >= 0; i--) {
            res.append(reversed.get(i));
            if (j < reversed.size() - 1) {
                res.append(" ");
            }
            j++;
        }
        // System.out.println(res.toString());
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
