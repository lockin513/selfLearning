public class find_bottom_left_tree_value {
    int dep = -1;
    int ans = -99999999;
    public int findBottomLeftValue(TreeNode root) {
        trivel(root,0);
        return ans;
    }
    public void trivel(TreeNode root, int depth){
        if(root.left==null && root.right==null)
            if(depth>dep){
                dep = depth;
                ans = root.val;
            }
        if(root.left!=null)trivel(root.left,depth+1);
        if(root.right!=null)trivel(root.right,depth+1);
    }
}
