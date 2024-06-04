import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class binary_tree_preorder_traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null)return ans;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty())
        {
            TreeNode p = s.pop();
            ans.add(p.val);
            if(p.right!=null)s.push(p.right);
            if(p.left!=null)s.push(p.left);
        }
        return ans;
    }
}
