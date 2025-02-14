public class mergeStrings {

    public static String mergeAlternately(String word1, String word2) {
        String res = "";
        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            if (i < word1.length()) {
                res += word1.charAt(i);
            }
            if (i < word2.length()) {
                res += word2.charAt(i);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        String word1 = "abcx";
        String word2 = "pqryz";
        String mergedStrings = mergeAlternately(word1, word2);
        System.out.println(mergedStrings);
    }
}
