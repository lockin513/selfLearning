public class validate_binary_search_tree {
    TreeNode pre=null;
    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;
        boolean left = isValidBST(root.left);
        if(pre==null || pre.val<root.val)pre=root;
        else return false;
        boolean right = isValidBST(root.right);
        return right && left;
    }
}
