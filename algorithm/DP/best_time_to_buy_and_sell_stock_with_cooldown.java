public class best_time_to_buy_and_sell_stock_with_cooldown {
    class Solution {
        public int maxProfit(int[] prices) {
            int[][] dp = new int[prices.length][3];
            dp[0][1]=-prices[0];
            for(int i=1;i<prices.length;i++)
            {
                dp[i][0]=Math.max(dp[i-1][0],dp[i-1][2]);
                dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
                dp[i][2]=dp[i-1][1]+prices[i];
            }
            return Math.max(dp[prices.length-1][0],dp[prices.length-1][2]);
        }
    }
}
