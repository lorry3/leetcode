package greedyAlgorithm;

/**
 * #122. Best Time to Buy and Sell Stock II
 */
public class Solution122 {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;

        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] <= prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }

        return profit;
    }
}
