import java.util.ArrayList;
import java.util.List;

public class permutations_ii {
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        public List<List<Integer>> permuteUnique(int[] nums) {
            boolean[] used = new boolean[8];
            backTracking(nums,used);
            return ans;
        }
        public void backTracking(int[] nums, boolean[] used){
            if(path.size()==nums.length)ans.add(new ArrayList<>(path));
            boolean[] levelUsed = new boolean[21];
            for(int i=0;i<nums.length;i++)
            {
                if(levelUsed[nums[i]+10]==true)continue;
                if(used[i]==false)
                {
                    path.add(nums[i]);
                    used[i]=true;
                    levelUsed[nums[i]+10]=true;
                    backTracking(nums,used);
                    used[i]=false;
                    path.remove(path.size()-1);
                }
            }
        }
    }
}
