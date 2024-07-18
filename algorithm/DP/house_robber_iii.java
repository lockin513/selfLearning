public class house_robber_iii {
    class Solution {
        public int rob(TreeNode root) {
            int[] ans = robAction(root);
            return Math.max(ans[0],ans[1]);
        }
        public int[] robAction(TreeNode root){
            int[] value = new int[2];
            if(root==null)return value;
            int[] left = robAction(root.left);
            int[] right = robAction(root.right);
            //不偷：Max(左孩子不偷，左孩子偷) + Max(右孩子不偷，右孩子偷)
            value[0] = Math.max(left[1],left[0])+Math.max(right[1],right[0]); //不rob当前节点
            //偷：左孩子不偷+ 右孩子不偷 + 当前节点偷
            value[1] = left[0]+right[0]+root.val;//rob当前节点
            return value;
        }
    }
}
