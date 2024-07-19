public class best_time_to_buy_and_sell_stock_ii_dp {
    class Solution {
        public int maxProfit(int[] prices) {
            int[] dp = new int[2];
            dp[0]=0;
            dp[1]=-prices[0];
            for(int i=1;i<prices.length;i++)
            {
                dp[0]=Math.max(dp[0],dp[1]+prices[i]);
                dp[1]=Math.max(dp[1],dp[0]-prices[i]);
            }
            return dp[0];
        }
    }
}
