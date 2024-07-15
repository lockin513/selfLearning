public class target_sum {
    class Solution {
        public int findTargetSumWays(int[] nums, int target) {
            int sum = 0;
            for(int i=0;i<nums.length;i++)sum+=nums[i];
            if((sum-target)%2!=0 || sum-target<0)return 0;
            int neg = (sum-target)/2;
            int[] dp = new int[neg+1];
            dp[0]=1;
            for(int i=1;i<=nums.length;i++)
            {
                int num = nums[i-1];
                for(int j=neg;j>=0;j--)
                    if(j>=num)dp[j]=dp[j]+dp[j-num];
            }
            return dp[neg];
        }
    }
}
