public class maximum_binary_tree {
    int[] num;
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        num = nums;
        return construct(0,nums.length);
    }
    public TreeNode construct(int left, int right){
        if(right==left)return null;
        int max = 0;
        int maxPos = 0;
        for(int i=left;i<right;i++)
            if(num[i]>max){
                max = num[i];
                maxPos = i;
            }
        TreeNode node = new TreeNode(max);
        if(right-left==1)return node;
        node.left = construct(left,maxPos);
        node.right = construct(maxPos+1,right);
        return node;
    }
}
