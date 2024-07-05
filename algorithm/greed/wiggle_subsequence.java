public class wiggle_subsequence {
    class Solution {
        public int wiggleMaxLength(int[] nums) {
            if(nums.length==1)return 1;
            int predif = 0;
            int curdif = 0;
            int ans = 1;
            for(int i=0;i<nums.length-1;i++)
            {
                curdif = nums[i+1]-nums[i];
                if((predif>=0 && curdif<0) || (predif<=0 && curdif>0))
                {
                    ans++;
                    predif = curdif;
                }
            }
            return ans;
        }
    }
}
