public class lowest_common_ancestor_of_a_binary_tree {
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        if(root==p || root==q)return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null)return root;
        if(left!=null && right==null)return left;
        if(left==null && right!=null)return right;
        else return null;
    }
}
