public class squares_of_a_sorted_array {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int key = 0;
        while(key<len && nums[key]<0)key++;
        int left = key-1, right = key;
        System.out.println(left+" "+right);
        int index = 0;
        while(left>=0 && right<len)
        {
            if((0-nums[left])>=nums[right])
            {
                ans[index++] = nums[right]*nums[right];
                right++;
            }
            else
            {
                ans[index++] = nums[left]*nums[left];
                left--;
            }
        }
        if(left==-1)
        {
            while(right<len)
            {
                ans[index] = nums[right]*nums[right];
                index++;
                right++;
            }
        }
        else
        {
            while(left>=0)
            {
                ans[index] = nums[left]*nums[left];
                index++;
                left--;
            }
        }
        return ans;
    }
}
