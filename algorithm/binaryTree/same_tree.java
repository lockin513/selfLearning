public class same_tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)return true;
        if((p==null && q!=null) || (p!=null && q==null))return false;
        if(p.val != q.val)return false;
        boolean flag1 = isSameTree(p.left,q.left);
        boolean flag2 = isSameTree(p.right,q.right);
        return flag1 & flag2;
    }
}
