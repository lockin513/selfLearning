import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3sum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(nums);
            for(int i=0;i<=nums.length-3;i++)
            {
                if(nums[i]>0)break;
                if(i!=0 && nums[i]==nums[i-1])continue;
                int left = i+1;
                int right = nums.length-1;
                while(right>left)
                {
                    int sum = nums[i]+nums[right]+nums[left];
                    if(sum>0)right--;
                    else if(sum<0)left++;
                    else
                    {
                        ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        right--;
                        left++;
                        while(nums[right]==nums[right+1] && right>left)right--;
                        while(nums[left]==nums[left-1] && right>left)left++;
                    }
                }
            }
            return ans;
        }
    }
}
