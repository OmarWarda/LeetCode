public class lengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String[] splitted = s.split(" ");
        String lastWord = splitted[splitted.length - 1];
        int count = 0;
        for (int i = 0; i < lastWord.length(); i++) {
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        String str3 = "Hello World";
        System.out.println(lengthOfLastWord(str3));
    }

}
