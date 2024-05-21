public class minimum_size_subarray_sum {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int slow = 0;
        int ans = len+1;
        int rem = 0;
        int fast = 0;
        while(fast<len)
        {
            rem+=nums[fast];
            while(rem>=target)
            {
                ans = Math.min(ans,fast-slow+1);
                rem -= nums[slow];
                slow++;
            }
            fast++;
        }
        return ans==len+1?0:ans;
    }
}
