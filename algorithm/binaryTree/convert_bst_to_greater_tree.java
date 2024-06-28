public class convert_bst_to_greater_tree {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        find(root);
        return root;
    }
    public void find(TreeNode root){
        if(root==null)return;
        find(root.right);
        sum += root.val;
        root.val=sum;
        find(root.left);
    }
}
