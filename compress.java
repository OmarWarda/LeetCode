import java.util.Arrays;

public class compress {

    public static int compress(char[] chars) {
        int index = 0;

        for (int i = 0; i < chars.length;) {
            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }
            chars[index] = current;
            index++;
            if (count > 1) {
                String temp = "" + count;
                for (int j = 0; j < temp.length(); j++) {
                    chars[index] = temp.charAt(j);
                    index++;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(compress(chars));
    }
}
