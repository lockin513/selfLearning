public class symmetric_tree {
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }

    public boolean check(TreeNode p,TreeNode q){
        if((p==null && q!=null) || (p!=null && q==null))return false;
        if(p==null && q==null)return true;
        if(p.val!=q.val)return false;
        boolean flag1 = check(p.left,q.right);
        boolean flag2 = check(p.right,q.left);
        return flag1 && flag2;
    }
}
