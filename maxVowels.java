public class maxVowels {
    public static int maxVowels(String s, int k) {
        int maxVowels = 0;
        int count = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < k; i++) {
            if (isVowel(chars[i])) {
                count++;
            }
        }
        maxVowels = count;

        for (int i = k; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                count++;
            }
            if (isVowel(chars[i - k])) {
                count--;
            }
            maxVowels = Math.max(maxVowels, count);
        }

        return maxVowels;

    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String s = "aeiou";
        int k = 2;
        System.out.println(maxVowels(s, k));
    }
}
