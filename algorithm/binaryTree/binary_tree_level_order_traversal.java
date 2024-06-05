import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class binary_tree_level_order_traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> e = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node = q.poll();
                e.add(node.val);
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);
            }
            ans.add(e);
        }
        return ans;
    }
}
