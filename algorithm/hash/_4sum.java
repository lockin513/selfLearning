import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4sum {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(nums);
            for(int i=0;i<nums.length-3;i++)
            {
                if(nums[i]>target && nums[i]>0)break;
                if(i!=0 && nums[i]==nums[i-1])continue;
                for(int j=i+1;j<nums.length-2;j++)
                {
                    if(nums[i]+nums[j]>target && nums[j]>0)break;
                    if(j!=i+1 && nums[j]==nums[j-1])continue;
                    int left = j+1;
                    int right = nums.length-1;
                    while(right>left)
                    {
                        int sum = nums[i]+nums[j]+nums[left]+nums[right];
                        if(sum>target)right--;
                        else if(sum<target)left++;
                        else{
                            ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                            right--;
                            left++;
                            while(nums[right]==nums[right+1] && right>left)right--;
                            while(nums[left]==nums[left-1] && right>left)left++;
                        }
                    }
                }
            }
            return ans;
        }
    }
}
