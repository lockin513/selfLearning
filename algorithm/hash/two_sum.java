import java.util.HashMap;
import java.util.Map;

public class two_sum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] ans = new int[2];
            Map<Integer,Integer> map = new HashMap<>();
            map.put(nums[0],0);
            for(int i=1;i<nums.length;i++)
            {
                int diff = target-nums[i];
                if(map.containsKey(diff))
                {
                    ans[0]=map.get(diff);
                    ans[1]=i;
                    break;
                }
                else map.put(nums[i],i);
            }
            return ans;
        }
    }
}
