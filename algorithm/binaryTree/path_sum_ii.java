import java.util.ArrayList;
import java.util.List;

public class path_sum_ii {
    class Solution {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            if(root==null)return ans;
            List<Integer> path = new ArrayList<>();
            findPath(root,targetSum,0,path);
            return ans;
        }
        public void findPath(TreeNode root,int targetSum,int sum,List<Integer> path){
            if(root.left==null && root.right==null)
            {
                path.add(root.val);
                if(sum+root.val==targetSum)ans.add(new ArrayList<>(path));
                path.remove(path.size()-1);
                return;
            }
            path.add(root.val);
            if(root.left!=null)findPath(root.left,targetSum,sum+root.val,path);
            if(root.right!=null)findPath(root.right,targetSum,sum+root.val,path);
            path.remove(path.size()-1);
        }
    }
}
