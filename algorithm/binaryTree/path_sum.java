public class path_sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        return find(root,targetSum,0);
    }
    public boolean find(TreeNode root, int targetSum, int sum){
        if(root.left==null && root.right==null)
            if(sum+root.val==targetSum)
                return true;
        boolean flag1 = false;
        boolean flag2 = false;
        if(root.left!=null)flag1 = find(root.left,targetSum,root.val+sum);
        if(root.right!=null)flag2 = find(root.right,targetSum,root.val+sum);
        return flag1 || flag2;
    }
}
