public class binary_tree_cameras {
    class Solution {
        static int ans;
        public int minCameraCover(TreeNode root) {
            ans = 0;
            if (f(root) == 0) ans++;
            return ans;
        }
        public static int f(TreeNode x) {
            if(x == null) return 1;
            int l = f(x.left);
            int r = f(x.right);
            if(l == 0 || r == 0) {
                ans++;
                return 2;
            }
            if(l == 1 && r == 1) return 0;
            return 1;
        }
    }
}
