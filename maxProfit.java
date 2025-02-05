public class maxProfit {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else if (prices[i] - buy > maxProfit) {
                maxProfit = prices[i] - buy;
            }
        }
        return maxProfit;
    }

    public static int maxProfit2(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] proces = { 1, 2, 3, 4, 5 };
        System.out.println(maxProfit(proces));
    }

}
