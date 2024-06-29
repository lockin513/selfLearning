import java.util.ArrayList;
import java.util.List;

public class combinations {
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> con = new ArrayList<>();
        public List<List<Integer>> combine(int n, int k) {
            if(k>n)return ans;
            backTracking(n,k,1);
            return ans;
        }
        public void backTracking(int n,int k,int begin){
            if(con.size()==k){
                ans.add(new ArrayList<>(con));
                return;
            }
            for(int i=begin;i<=n-(k-con.size())+1;i++)
            {
                con.add(i);
                backTracking(n,k,i+1);
                con.remove(con.size()-1);
            }
        }
    }
}
