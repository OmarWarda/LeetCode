public class subStringSearch {

    public static int subStringSearch(String haystack, String needle) {

        if (haystack.length() < needle.length()) {
            return -1;
        }
        int i = 0;
        int m = haystack.length() - needle.length();
        while (i <= haystack.length() - 1) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                return i;
            }
            i++;
        }
        return -1;

        // int firstOccurence = haystack.indexOf(needle);
        // return firstOccurence;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(subStringSearch(haystack, needle));
    }

}
