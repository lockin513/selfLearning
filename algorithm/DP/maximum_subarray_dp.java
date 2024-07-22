public class maximum_subarray_dp {
    class Solution {
        public int maxSubArray(int[] nums) {
            int[] dp = new int[nums.length];
            dp[0]=nums[0];
            int ans = dp[0];
            for(int i=1;i<nums.length;i++)
            {
                dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
                if(dp[i]>ans)ans=dp[i];
            }
            return ans;
        }
    }
}
