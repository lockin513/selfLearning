public class subtree_of_another_tree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null)return true;
        if((root!=null && subRoot==null) || (root==null && subRoot!=null))return false;
        return isSametree(root,subRoot) || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    public boolean isSametree(TreeNode s, TreeNode t){
        if(s==null && t==null)return true;
        if((s==null && t!=null) || (s!=null && t==null))return false;
        if(s.val!=t.val)return false;
        return isSametree(s.left,t.left) && isSametree(s.right,t.right);
    }
}
