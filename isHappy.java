import java.util.HashSet;
import java.util.Set;

public class isHappy {
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        String num;
        String[] myNum;
        int res;

        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);

            num = Integer.toString(n);
            myNum = num.split("");
            res = 0;

            for (String digit : myNum) {
                int temp = Integer.parseInt(digit);
                res += (temp * temp);
            }

            n = res;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(isHappy(n));
    }
}
