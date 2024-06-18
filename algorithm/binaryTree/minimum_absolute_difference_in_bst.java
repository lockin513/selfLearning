public class minimum_absolute_difference_in_bst {
    int min=100000;
    int pre=-100000;
    public int getMinimumDifference(TreeNode root) {
        findDiff(root);
        return min;
    }
    public void findDiff(TreeNode root){
        if(root==null)return;
        findDiff(root.left);
        if(root.val-pre<min)min=root.val-pre;
        pre=root.val;
        findDiff(root.right);
    }
}
