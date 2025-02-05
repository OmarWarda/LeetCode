public class maxProduct {

    public static int maxProduct(int[] nums) {
        int productLeft = 1;
        int productRight = 1;
        int n = nums.length;
        int ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            productLeft = productLeft == 0 ? 1 : productLeft;
            productRight = productRight == 0 ? 1 : productRight;

            productLeft *= nums[i];
            productRight *= nums[n - 1 - i];

            ans = Math.max(ans, Math.max(productLeft, productRight));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] testtt = { 2, 3, -2, 4 };
        System.out.println(maxProduct(testtt));
    }

}
