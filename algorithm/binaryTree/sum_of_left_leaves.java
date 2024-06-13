public class sum_of_left_leaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null && root.right==null)return 0;
        int leftNum = sumOfLeftLeaves(root.left);
        int rightNum = sumOfLeftLeaves(root.right);
        if(root.left!=null && root.left.left==null && root.left.right==null)
            leftNum=root.left.val;
        return leftNum+rightNum;
    }
}
