public class best_time_to_buy_and_sell_stock_with_transaction_fee {
    class Solution {
        public int maxProfit(int[] prices, int fee) {
            if(prices.length==1)return 0;
            int[] dp = new int[prices.length];
            dp[1]=-prices[0]-fee;
            for(int i=1;i<prices.length;i++)
            {
                dp[0]=Math.max(dp[0],dp[1]+prices[i]);
                dp[1]=Math.max(dp[1],dp[0]-prices[i]-fee);
            }
            return dp[0];
        }
    }
}
