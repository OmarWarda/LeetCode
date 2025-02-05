public class isPalindrome {

    public static boolean isPalindrome(int x) {
        String res = Integer.toString(x);
        int n = res.length();
        for (int i = 0; i < n / 2; i++) {
            if (res.charAt(i) != res.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
    }

}
