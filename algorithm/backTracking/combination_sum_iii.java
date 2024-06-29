import java.util.ArrayList;
import java.util.List;

public class combination_sum_iii {
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        public List<List<Integer>> combinationSum3(int k, int n) {
            backTracking(k,n,1,0);
            return ans;
        }
        public void backTracking(int k, int n, int begin, int sum){
            if(sum==n && path.size()==k)
            {
                ans.add(new ArrayList<>(path));
                return;
            }
            for(int i=begin;i<=9;i++)
            {
                if(sum+i>n)return;
                path.add(i);
                backTracking(k,n,i+1,sum+i);
                path.remove(path.size()-1);
            }
        }
    }
}
