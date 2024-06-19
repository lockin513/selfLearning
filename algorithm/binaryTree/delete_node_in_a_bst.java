public class delete_node_in_a_bst {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        if(root.val==key)
        {
            if(root.left==null && root.right==null)return null;
            if(root.left==null && root.right!=null)return root.right;
            if(root.left!=null && root.right==null)return root.left;
            else
            {
                TreeNode cur = root.right;
                while(cur.left!=null)cur = cur.left;
                cur.left = root.left;
                return root.right;
            }
        }
        if(root.val>key)root.left = deleteNode(root.left,key);
        if(root.val<key)root.right = deleteNode(root.right,key);
        return root;
    }
}
