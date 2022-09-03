class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int overallProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            int todayProfit = prices[i] - buy;
            if (todayProfit > overallProfit) {
                overallProfit = todayProfit;
            }
        }
        return overallProfit;
    }
}