public class addBinary {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Traverse both strings from the end
        while (i >= 0 || j >= 0) {
            int sum = carry;

            // Add the bits of string a
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // Add the bits of string b
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Append the result bit
            result.append(sum % 2);

            // Update carry
            carry = sum / 2;
        }

        // If there's a carry left, add it
        if (carry != 0) {
            result.append(carry);
        }

        // Reverse the result since we've constructed it backwards
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "10";
        System.out.println(addBinary(a, b));
    }

}
