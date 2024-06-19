public class insert_into_a_binary_search_tree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)return new TreeNode(val);
        TreeNode ans = root;
        while(true)
        {
            if(root.val>val)
                if(root.left!=null)root = root.left;
                else {
                    root.left = new TreeNode(val);
                    break;
                }
            if(root.val<val)
                if(root.right!=null)root = root.right;
                else{
                    root.right = new TreeNode(val);
                    break;
                }
        }
        return ans;
    }
}
