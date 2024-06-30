import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sum_ii {
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            backTracking(candidates,target,0,0);
            return ans;
        }
        public void backTracking(int[] candidates, int target, int sum, int begin){
            if(sum==target)
            {
                ans.add(new ArrayList<>(path));
                return;
            }
            for(int i=begin;i<candidates.length;i++)
            {
                if(sum+candidates[i]>target)break;
                if(i>begin && candidates[i]==candidates[i-1])continue;
                path.add(candidates[i]);
                backTracking(candidates,target,sum+candidates[i],i+1);
                path.remove(path.size()-1);
            }
        }
    }
}
