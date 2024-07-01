import java.util.ArrayList;
import java.util.List;

public class subsets {
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> con = new ArrayList<>();
        public List<List<Integer>> subsets(int[] nums) {
            backTracking(nums,0);
            return ans;
        }
        public void backTracking(int[] nums, int startIndex){
            ans.add(new ArrayList<>(con));
            if(startIndex>=nums.length)return;
            for(int i=startIndex;i<nums.length;i++)
            {
                con.add(nums[i]);
                backTracking(nums,i+1);
                con.remove(con.size()-1);
            }
        }
    }
}
