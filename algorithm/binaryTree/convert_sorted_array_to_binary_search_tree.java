public class convert_sorted_array_to_binary_search_tree {
    class Solution {
        int[] num;
        public TreeNode sortedArrayToBST(int[] nums) {
            num=nums;
            return build(0,num.length-1);
        }
        public TreeNode build(int left,int right){
            if(left>right)return null;
            int pos = (left+right)/2;
            TreeNode node = new TreeNode(num[pos]);
            node.left = build(left,pos-1);
            node.right = build(pos+1,right);
            return node;
        }
    }
}
