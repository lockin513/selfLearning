import java.util.Arrays;

public class maximize_sum_of_array_after_k_negations {
    class Solution {
        public int largestSumAfterKNegations(int[] nums, int k) {
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]<0)
                {
                    nums[i]=-nums[i];
                    k--;
                    if(k==0)break;
                }
                else break;
            }
            Arrays.sort(nums);
            if(k%2==1)nums[0]=-nums[0];
            int ans = 0;
            for(int i=0;i<nums.length;i++)ans+=nums[i];
            return ans;
        }
    }
}
