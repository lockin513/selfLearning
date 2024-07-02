import java.util.ArrayList;
import java.util.List;

public class permutations {
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        public List<List<Integer>> permute(int[] nums) {
            boolean[] used = new boolean[7];
            backTracking(nums,used);
            return ans;
        }
        public void backTracking(int[] nums, boolean[] used){
            if(path.size()==nums.length)ans.add(new ArrayList<>(path));
            for(int i=0;i<nums.length;i++)
            {
                if(used[i]==false)
                {
                    path.add(nums[i]);
                    used[i]=true;
                    backTracking(nums,used);
                    used[i]=false;
                    path.remove(path.size()-1);
                }
            }
        }
    }
}
