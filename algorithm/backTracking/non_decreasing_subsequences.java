import java.util.ArrayList;
import java.util.List;

public class non_decreasing_subsequences {
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        public List<List<Integer>> findSubsequences(int[] nums) {
            backTracking(nums,0);
            return ans;
        }
        public void backTracking(int[] nums, int startIndex){
            if(path.size()>=2)ans.add(new ArrayList<>(path));
            boolean[] used = new boolean[201];
            for(int i=startIndex;i<nums.length;i++)
            {
                if(used[nums[i]+100]==true || (!path.isEmpty() && nums[i]<path.get(path.size()-1)))continue;
                path.add(nums[i]);
                used[nums[i]+100]=true;
                backTracking(nums,i+1);
                path.remove(path.size()-1);
            }
        }
    }
}
