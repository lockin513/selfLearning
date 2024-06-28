public class convert_sorted_array_to_binary_search_tree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)return null;
        else if(nums.length==1)return new TreeNode(nums[0]);
        int index = nums.length/2;
        int[] left = new int[index];
        int[] right = new int[nums.length-index-1];
        for(int i=0;i<index;i++)left[i]=nums[i];
        for(int i=0;i<nums.length-index-1;i++)right[i]=nums[index+i+1];
        TreeNode root = new TreeNode(nums[index]);
        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);
        return root;
    }
}
