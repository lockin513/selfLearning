public class minimum_size_subarray_sum {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int sum=0,count=0,ans=100001,left=0,right=0;
            while(right<nums.length)
            {
                sum+=nums[right];
                while(sum>=target)
                {
                    ans=Math.min(ans,right-left+1);
                    sum-=nums[left];
                    left++;
                }
                right++;
            }
            return ans==100001?0:ans;
        }
    }
}
