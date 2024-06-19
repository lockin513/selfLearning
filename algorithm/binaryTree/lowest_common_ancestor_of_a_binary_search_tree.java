public class lowest_common_ancestor_of_a_binary_search_tree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;
        while(node!=null){
            if(root.val>p.val && root.val>q.val)root=root.left;
            else if(root.val<p.val && root.val<q.val)root=root.right;
            else return root;
        }
        return root;
    }
}
