public class climbStairs {

    static int[] memo = new int[46];

    public static int climbStairs(int n) {

        if (n <= 0)
            return 0;
        if (n == 1 || n == 2)
            return n;

        if (memo[n] != 0) {
            return memo[n];
        }

        int ways = climbStairs(n - 1) + climbStairs(n - 2);
        memo[n] = ways;

        return ways;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }
}
