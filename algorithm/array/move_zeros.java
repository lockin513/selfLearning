public class move_zeros {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int slow = 0;
        for(int fast=0;fast<len;fast++)
        {
            if(nums[fast]!=0)
            {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        while(slow<nums.length)
        {
            nums[slow] = 0;
            slow++;
        }
    }
}
