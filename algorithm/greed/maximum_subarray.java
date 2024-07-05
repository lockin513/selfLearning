public class maximum_subarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            int max =nums[0];
            int rem = 0;
            for(int i=0;i<nums.length;i++)
            {
                if(rem<0)rem=0;
                rem+=nums[i];
                if(rem>=max)max=rem;
            }
            return max;
        }
    }
}
