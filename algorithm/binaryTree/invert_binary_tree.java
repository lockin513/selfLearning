public class invert_binary_tree {
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            invert(root);
            return root;
        }
        public void invert(TreeNode root){
            if(root==null)return;
            if(root.left!=null)invertTree(root.left);
            if(root.right!=null)invertTree(root.right);
            TreeNode temp = root.left;
            root.left=root.right;
            root.right=temp;
        }
    }
}
