import java.util.ArrayList;
import java.util.List;

public class combination_sum {
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            backTracking(candidates,target,0,0);
            return ans;
        }
        public void backTracking(int[] candidates, int target, int sum, int begin){
            if(sum>target)return;
            if(sum==target){
                ans.add(new ArrayList<>(path));
                return;
            }
            for(int i=begin;i<candidates.length;i++)
            {
                path.add(candidates[i]);
                backTracking(candidates,target,sum+candidates[i],i);
                path.remove(path.size()-1);
            }
        }
    }
}
