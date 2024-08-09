import java.util.HashMap;
import java.util.Map;

public class construct_binary_tree_from_preorder_and_inorder_traversal {
    class Solution {
        int[] pre;
        Map<Integer,Integer> map = new HashMap<>();
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            pre=preorder;
            for(int i=0;i<inorder.length;i++)map.put(inorder[i],i);
            return build(0,preorder.length-1,0,inorder.length-1);
        }
        public TreeNode build(int preLeft,int preRight,int inLeft,int inRight){
            if(preLeft>preRight || inLeft>inRight)return null;
            int pos = map.get(pre[preLeft]);
            TreeNode node = new TreeNode(pre[preLeft]);
            node.left = build(preLeft+1,preLeft+(pos-inLeft),inLeft,pos-1);
            node.right = build(preLeft+(pos-inLeft)+1,preRight,pos+1,inRight);
            return node;
        }
    }
}
