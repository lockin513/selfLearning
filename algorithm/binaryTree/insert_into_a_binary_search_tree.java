public class insert_into_a_binary_search_tree {
    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if(root==null)return new TreeNode(val);
            insert(root,val);
            return root;
        }
        public void insert(TreeNode root,int val){
            if(root.val>val)
            {
                if(root.left!=null)insert(root.left,val);
                else root.left = new TreeNode(val);
            }
            else{
                if(root.right!=null)insert(root.right,val);
                else root.right = new TreeNode(val);
            }
        }
    }
}
