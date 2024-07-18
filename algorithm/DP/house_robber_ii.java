public class house_robber_ii {
    class Solution {
        public int rob(int[] nums) {
            if(nums.length==1)return nums[0];
            if(nums.length==2)return Math.max(nums[0],nums[1]);
            return Math.max(robAction(nums,0,nums.length-2),robAction(nums,1,nums.length-1));
        }
        public int robAction(int[] nums,int begin,int end){
            int[] dp = new int[nums.length];
            dp[begin]=nums[begin];
            dp[begin+1]=Math.max(nums[begin],nums[begin+1]);
            for(int i=begin;i<=end;i++)
                if(i>=2)dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
            return dp[end];
        }
    }
}
