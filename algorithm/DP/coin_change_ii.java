public class coin_change_ii {
    class Solution {
        public int change(int amount, int[] coins) {
            int[] dp = new int[amount+1];
            dp[0]=1;
            for(int i=0;i<coins.length;i++)
                for(int j=coins[i];j<=amount;j++)
                    dp[j]=dp[j]+dp[j-coins[i]];
            //=号右边的dp[i]表示不用coins[i]的时候有多少种方式凑成j
            //dp[j-coins[i]]表示用coins[i]的时候有多少种方式凑成j
            return dp[amount];
        }
    }
}
