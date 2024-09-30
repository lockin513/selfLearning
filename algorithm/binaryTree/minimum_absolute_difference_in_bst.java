public class minimum_absolute_difference_in_bst {
    class Solution {
        int mini = 999999;
        int pre=0;
        int flag = 1;
        public int getMinimumDifference(TreeNode root) {
            inorder(root);
            return mini;
        }
        public void inorder(TreeNode root){
            if(root==null)return;
            inorder(root.left);
            if(flag==1)flag=0;
            else
            {
                if(root.val-pre<mini)mini=root.val-pre;
            }
            pre=root.val;
            inorder(root.right);
        }
    }
}
