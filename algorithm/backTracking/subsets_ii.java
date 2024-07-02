import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets_ii {
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            backTracking(nums,0);
            return ans;
        }
        public void backTracking(int[] nums, int startIndex){
            ans.add(new ArrayList<>(path));
            for(int i=startIndex;i<nums.length;i++)
            {
                if(i>startIndex && nums[i]==nums[i-1])continue;
                path.add(nums[i]);
                backTracking(nums,i+1);
                path.remove(path.size()-1);
            }
        }
    }
}
