public class longest_continuous_increasing_subsequence {
    class Solution {
        public int findLengthOfLCIS(int[] nums) {
            int dp = 1;
            int ans = 1;
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i]>nums[i-1])
                {
                    dp+=1;
                    if(dp>ans)ans=dp;
                }
                else dp=1;
            }
            return ans;
        }
    }
}
