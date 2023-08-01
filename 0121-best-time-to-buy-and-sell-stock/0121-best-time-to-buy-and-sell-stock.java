class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int maxSuffix = 0;
        for(int i = prices.length - 1; i >= 0; i--){
            maxSuffix = Math.max(maxSuffix, prices[i]);
            maxProfit = Math.max(maxProfit, maxSuffix-prices[i]);
        }
        return maxProfit;
    }
}