import java.util.HashMap;

public class construct_binary_tree_from_inorder_and_postorder_traversal {
    HashMap<Integer,Integer> memo = new HashMap<>();
    int[] post;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++)memo.put(inorder[i],i);
        post = postorder;
        return build(0,inorder.length-1,0,postorder.length-1);
    }
    public TreeNode build(int inLeft, int inRight, int postLeft, int postRight){
        if(postLeft>postRight || inLeft>inRight)return null;
        int value = post[postRight];
        TreeNode node = new TreeNode(value);
        if(postRight==postLeft)return node;
        int index=memo.get(value);
        node.left = build(inLeft,index-1,postLeft,postLeft+index-inLeft-1);
        node.right = build(index+1,inRight,postLeft+index-inLeft,postRight-1);
        return node;
    }
}
