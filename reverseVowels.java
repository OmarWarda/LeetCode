import java.util.ArrayList;

public class reverseVowels {
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        ArrayList<Character> vowelsList = new ArrayList<>();
        StringBuilder res = new StringBuilder();

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                vowelsList.add(arr[i]);
                j++;
            }
        }
        if (vowelsList.size() > 1) {
            j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (isVowel(arr[i])) {
                    arr[i] = vowelsList.get(vowelsList.size() - 1 - j);
                    j++;
                }
            }
            for (char c : arr) {
                res.append(c);
            }
        } else {
            return s;
        }

        return res.toString();
    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
