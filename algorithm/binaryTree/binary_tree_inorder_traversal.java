import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class binary_tree_inorder_traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> s = new Stack<>();
        while(root!=null || !s.isEmpty())
        {
            while(root!=null) {
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }
}
