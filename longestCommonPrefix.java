import java.util.Arrays;

public class longestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (String s : strs) {
            // The indexOf() method in Java returns the index of the
            // first occurrence of the specified substring (in this case, prefix)
            // within the string s.
            while (s.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));

        int n = 19;
        String s = Integer.toString(n);
        String[] s1 = s.split("");
        System.out.println(Arrays.toString(s1));
    }

}
