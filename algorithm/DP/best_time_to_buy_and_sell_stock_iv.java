public class best_time_to_buy_and_sell_stock_iv {
    class Solution {
        public int maxProfit(int k, int[] prices) {
            int[] dp = new int[2*k+1];
            for(int i=0;i<2*k+1;i++)
                if(i%2==1)dp[i]=-prices[0];
            for(int i=1;i<prices.length;i++)
            {
                for(int j=1;j<2*k+1;j++)
                {
                    if(j%2==1)dp[j]=Math.max(dp[j],dp[j-1]-prices[i]);
                    else dp[j]=Math.max(dp[j],dp[j-1]+prices[i]);
                }
            }
            int max = 0;
            for(int i=1;i<2*k+1;i++)
                if(dp[i]>max)max=dp[i];
            return max;
        }
    }
}
