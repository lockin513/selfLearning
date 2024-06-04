import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class binary_tree_postorder_traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null)return ans;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty())
        {
            TreeNode node = s1.pop();
            s2.push(node);
            if(node.left!=null)s1.push(node.left);
            if(node.right!=null)s1.push(node.right);
        }
        while(!s2.isEmpty())ans.add(s2.pop().val);
        return ans;
    }
}
