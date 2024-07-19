public class best_time_to_buy_and_sell_stock_iii {
    class Solution {
        public int maxProfit(int[] prices) {
            int[] dp = new int[4];
            dp[0]=-prices[0];
            dp[2]=-prices[0];
            for(int i=1;i<prices.length;i++)
            {
                dp[0]=Math.max(dp[0],-prices[i]);
                dp[1]=Math.max(dp[1],dp[0]+prices[i]);
                dp[2]=Math.max(dp[2],dp[1]-prices[i]);
                dp[3]=Math.max(dp[3],dp[2]+prices[i]);
            }
            return Math.max(dp[1],dp[3]);
        }
    }
}
