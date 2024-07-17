public class perfect_squares {
    class Solution {
        public int numSquares(int n) {
            int[] dp = new int[n+1];
            for(int i=1;i<=n;i++)dp[i]=Integer.MAX_VALUE-1;
            for(int i=0;i*i<=n;i++)
                for(int j=i*i;j<=n;j++)
                    dp[j]=Math.min(dp[j],dp[j-i*i]+1);
            return dp[n];
        }
    }
}
