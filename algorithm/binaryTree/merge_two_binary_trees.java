public class merge_two_binary_trees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null)return null;
        if(root1==null && root2!=null)return root2;
        if(root1!=null && root2==null)return root1;
        TreeNode node = new TreeNode(root1.val+root2.val);
        node.left = mergeTrees(root1.left,root2.left);
        node.right = mergeTrees(root1.right,root2.right);
        return node;
    }
}
