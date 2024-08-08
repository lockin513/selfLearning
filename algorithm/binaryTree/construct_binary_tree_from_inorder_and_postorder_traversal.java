import java.util.HashMap;

public class construct_binary_tree_from_inorder_and_postorder_traversal {
    class Solution {
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
        }
        public TreeNode build(int[] inorder,int inBegin,int inEnd,int[] postorder,int postBegin,int postEnd){
            if(inBegin>inEnd || postBegin>postEnd)return null;
            int num = postorder[postEnd];
            TreeNode temp = new TreeNode(num);
            int pos = 0;
            for(int i=inBegin;i<=inEnd;i++)
                if(inorder[i]==num)pos=i;
            temp.left = build(inorder,inBegin,pos-1,postorder,postBegin,postBegin+pos-inBegin-1);
            temp.right = build(inorder,pos+1,inEnd,postorder,postBegin+pos-inBegin,postEnd-1);
            return temp;
        }
    }
}
