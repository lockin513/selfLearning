public class count_complete_tree_nodes {
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        int leftLevel=0, rightLevel=0;
        while(left!=null)
        {
            left = left.left;
            leftLevel++;
        }
        while(right!=null)
        {
            right = right.right;
            rightLevel++;
        }
        if(leftLevel==rightLevel)return (2<<leftLevel)-1;
        int rightNum = countNodes(root.right);
        int leftNum = countNodes(root.left);
        return rightNum+leftNum+1;
    }
}
