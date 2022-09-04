class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int overallProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            int profitToday = prices[i] - buy;
            overallProfit = Math.max(profitToday, overallProfit);
        }
        return overallProfit;
    }
}