public class balanced_binary_tree {
    public boolean isBalanced(TreeNode root) {
        return getAns(root)!=-1;

    }
    public int getAns(TreeNode root){
        if(root==null)return 0;
        int leftNum = getAns(root.left);
        if(leftNum==-1)return -1;
        int rightNum = getAns(root.right);
        if(rightNum==-1)return -1;
        int result = Math.abs(rightNum-leftNum);
        if(result>1)return -1;
        return 1+Math.max(leftNum,rightNum);
    }
}
