public class coin_change {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int[] dp = new int[amount+1];
            int max = Integer.MAX_VALUE-1;//防止后续dp[j-coins[i]]+1出现溢出
            dp[0]=0;
            for(int j=1;j<=amount;j++)dp[j]=max;
            for(int i=0;i<coins.length;i++)
                for(int j=coins[i];j<=amount;j++)
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
            if(dp[amount]==max)return -1;
            return dp[amount];
        }
    }
}
